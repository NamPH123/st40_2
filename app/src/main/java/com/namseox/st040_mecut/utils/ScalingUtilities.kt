package com.namseox.st040_mecut.utils

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.BlurMaskFilter
import android.graphics.BlurMaskFilter.Blur
import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.Matrix.ScaleToFit
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import android.graphics.Rect
import android.graphics.RectF
import android.media.ExifInterface
import android.renderscript.Allocation
import android.renderscript.Element
import android.renderscript.RenderScript
import android.renderscript.ScriptIntrinsicBlur
import java.io.IOException
import kotlin.math.max

object ScalingUtilities {

    enum class ScalingLogic {
        CROP,
        FIT
    }

    fun decodeResource(
        res: Resources?,
        resId: Int,
        dstWidth: Int,
        dstHeight: Int,
        scalingLogic: ScalingLogic
    ): Bitmap {
        val options = BitmapFactory.Options()
        options.inJustDecodeBounds = true
        BitmapFactory.decodeResource(res, resId, options)
        options.inJustDecodeBounds = false
        options.inSampleSize = calculateSampleSize(
            options.outWidth,
            options.outHeight,
            dstWidth,
            dstHeight,
            scalingLogic
        )
        return BitmapFactory.decodeResource(res, resId, options)
    }

    fun createScaledBitmap(
        unscaledBitmap: Bitmap,
        dstWidth: Int,
        dstHeight: Int,
        scalingLogic: ScalingLogic
    ): Bitmap {
        val srcRect = calculateSrcRect(
            unscaledBitmap.width,
            unscaledBitmap.height,
            dstWidth,
            dstHeight,
            scalingLogic
        )
        val dstRect = calculateDstRect(
            unscaledBitmap.width,
            unscaledBitmap.height,
            dstWidth,
            dstHeight,
            scalingLogic
        )
        val scaledBitmap =
            Bitmap.createBitmap(dstRect.width(), dstRect.height(), Bitmap.Config.ARGB_8888)
        Canvas(scaledBitmap).drawBitmap(unscaledBitmap, srcRect, dstRect, Paint(2))
        return scaledBitmap
    }

    fun calculateSampleSize(
        srcWidth: Int,
        srcHeight: Int,
        dstWidth: Int,
        dstHeight: Int,
        scalingLogic: ScalingLogic
    ): Int {
        if (scalingLogic == ScalingLogic.FIT) {
            if ((srcWidth.toFloat()) / (srcHeight.toFloat()) > (dstWidth.toFloat()) / (dstHeight.toFloat())) {
                return srcWidth / dstWidth
            }
            return srcHeight / dstHeight
        } else if ((srcWidth.toFloat()) / (srcHeight.toFloat()) > (dstWidth.toFloat()) / (dstHeight.toFloat())) {
            return srcHeight / dstHeight
        } else {
            return srcWidth / dstWidth
        }
    }

    fun calculateSrcRect(
        srcWidth: Int,
        srcHeight: Int,
        dstWidth: Int,
        dstHeight: Int,
        scalingLogic: ScalingLogic
    ): Rect {
        if (scalingLogic != ScalingLogic.CROP) {
            return Rect(0, 0, srcWidth, srcHeight)
        }
        val dstAspect = (dstWidth.toFloat()) / (dstHeight.toFloat())
        if ((srcWidth.toFloat()) / (srcHeight.toFloat()) > dstAspect) {
            val srcRectWidth = ((srcHeight.toFloat()) * dstAspect).toInt()
            val srcRectLeft = (srcWidth - srcRectWidth) / 2
            return Rect(srcRectLeft, 0, srcRectLeft + srcRectWidth, srcHeight)
        }
        val srcRectHeight = ((srcWidth.toFloat()) / dstAspect).toInt()
        val scrRectTop = (srcHeight - srcRectHeight) / 2
        return Rect(0, scrRectTop, srcWidth, scrRectTop + srcRectHeight)
    }

    fun calculateDstRect(
        srcWidth: Int,
        srcHeight: Int,
        dstWidth: Int,
        dstHeight: Int,
        scalingLogic: ScalingLogic
    ): Rect {
        if (scalingLogic != ScalingLogic.FIT) {
            return Rect(0, 0, dstWidth, dstHeight)
        }
        val srcAspect = (srcWidth.toFloat()) / (srcHeight.toFloat())
        if (srcAspect > (dstWidth.toFloat()) / (dstHeight.toFloat())) {
            return Rect(0, 0, dstWidth, ((dstWidth.toFloat()) / srcAspect).toInt())
        }
        return Rect(0, 0, ((dstHeight.toFloat()) * srcAspect).toInt(), dstHeight)
    }

    fun convetrSameSize(originalImage: Bitmap, mDisplayWidth: Int, mDisplayHeight: Int): Bitmap {
        val bitmap = originalImage
        val cs = Bitmap.createBitmap(mDisplayWidth, mDisplayHeight, Bitmap.Config.ARGB_8888)
        val comboImage = Canvas(cs)
        val paint = Paint()
        val rect = Rect(0, 0, mDisplayWidth, mDisplayHeight)
        paint.isAntiAlias = true
        comboImage.drawARGB(0, 0, 0, 0)
        paint.color = -12434878
        comboImage.drawRect(rect, paint)
        paint.setXfermode(PorterDuffXfermode(PorterDuff.Mode.SRC_IN))
        comboImage.drawBitmap(
            newscaleBitmap(bitmap, mDisplayWidth, mDisplayHeight),
            0.0f,
            0.0f,
            paint
        )
        return cs
    }

    fun convetrSameSizeTransBg(
        originalImage: Bitmap,
        mDisplayWidth: Int,
        mDisplayHeight: Int
    ): Bitmap {
        val bitmap = originalImage
        val cs = Bitmap.createBitmap(mDisplayWidth, mDisplayHeight, Bitmap.Config.ARGB_8888)
        val comboImage = Canvas(cs)
        val paint = Paint()
        comboImage.drawBitmap(
            newscaleBitmap(bitmap, mDisplayWidth, mDisplayHeight),
            0.0f,
            0.0f,
            paint
        )
        return cs
    }

    fun convetrSameSize(
        originalImage: Bitmap,
        bgBitmap: Bitmap,
        mDisplayWidth: Int,
        mDisplayHeight: Int
    ): Bitmap {
        val bitmap = originalImage
        val cs = bgBitmap
        val comboImage = Canvas(cs)
        val paint = Paint()
        comboImage.drawBitmap(
            newscaleBitmap(bitmap, mDisplayWidth, mDisplayHeight),
            0.0f,
            0.0f,
            paint
        )
        return cs
    }

    fun convetrSameSize(
        originalImage: Bitmap,
        bgBitmap: Bitmap,
        mDisplayWidth: Int,
        mDisplayHeight: Int,
        x: Float,
        y: Float
    ): Bitmap {
        val bitmap = originalImage
        var cs = bgBitmap.copy(bgBitmap.config, true)
        cs = FastBlur().doBlur(cs, 10, true)
        Canvas(cs).drawBitmap(
            newscaleBitmap(bitmap, mDisplayWidth, mDisplayHeight, x, y),
            0.0f,
            0.0f,
            Paint()
        )
        return cs
    }

    fun convetrSameSizeNew(
        originalImage: Bitmap,
        bgBitmap: Bitmap,
        mDisplayWidth: Int,
        mDisplayHeight: Int
    ): Bitmap {
        val cs: Bitmap = FastBlur().doBlur(bgBitmap, 25, true)
        val comboImage = Canvas(cs)
        val paint = Paint()
        val originalWidth = originalImage.width.toFloat()
        val originalHeight = originalImage.height.toFloat()
        var scale = (mDisplayWidth.toFloat()) / originalWidth
        val scaleY = (mDisplayHeight.toFloat()) / originalHeight
        var xTranslation = 0.0f
        var yTranslation = ((mDisplayHeight.toFloat()) - (originalHeight * scale)) / 2.0f
        if (yTranslation < 0.0f) {
            yTranslation = 0.0f
            scale = (mDisplayHeight.toFloat()) / originalHeight
            xTranslation = ((mDisplayWidth.toFloat()) - (originalWidth * scaleY)) / 2.0f
        }
        val transformation = Matrix()
        transformation.postTranslate(xTranslation, yTranslation)
        transformation.preScale(scale, scale)
        comboImage.drawBitmap(originalImage, transformation, paint)
        return cs
    }

    fun scaleCenterCrop(source: Bitmap, newWidth: Int, newHeight: Int): Bitmap {
        val sourceWidth = source.width
        val sourceHeight = source.height
        if (sourceWidth == newWidth && sourceHeight == newHeight) {
            return source
        }
        val scale = max(
            ((newWidth.toFloat()) / (sourceWidth.toFloat())).toDouble(),
            ((newHeight.toFloat()) / (sourceHeight.toFloat())).toDouble()
        )
            .toFloat()
        val scaledWidth = scale * (sourceWidth.toFloat())
        val scaledHeight = scale * (sourceHeight.toFloat())
        val left = ((newWidth.toFloat()) - scaledWidth) / 2.0f
        val top = ((newHeight.toFloat()) - scaledHeight) / 2.0f
        val targetRect = RectF(left, top, left + scaledWidth, top + scaledHeight)
        val dest = Bitmap.createBitmap(newWidth, newHeight, source.config)
        Canvas(dest).drawBitmap(source, null, targetRect, null)
        return dest
    }

    private fun newscaleBitmap(
        originalImage: Bitmap,
        width: Int,
        height: Int,
        x: Float,
        y: Float
    ): Bitmap {
        val background = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val originalWidth = originalImage.width.toFloat()
        val originalHeight = originalImage.height.toFloat()
        val canvas = Canvas(background)
        var scale = (width.toFloat()) / originalWidth
        val scaleY = (height.toFloat()) / originalHeight
        var xTranslation = 0.0f
        var yTranslation = ((height.toFloat()) - (originalHeight * scale)) / 2.0f
        if (yTranslation < 0.0f) {
            yTranslation = 0.0f
            scale = (height.toFloat()) / originalHeight
            xTranslation = ((width.toFloat()) - (originalWidth * scaleY)) / 2.0f
        }
        val transformation = Matrix()
        transformation.postTranslate(xTranslation * x, yTranslation + y)
        transformation.preScale(scale, scale)
        canvas.drawBitmap(originalImage, transformation, Paint())
        return background
    }

    fun addShadow(bm: Bitmap, color: Int, size: Int, dx: Float, dy: Float): Bitmap {
        val mask = Bitmap.createBitmap(bm.width + (size * 2), bm.height, Bitmap.Config.ALPHA_8)
        val scaleToFit = Matrix()
        scaleToFit.setRectToRect(
            RectF(0.0f, 0.0f, bm.width.toFloat(), bm.height.toFloat()), RectF(
                0.0f, 0.0f,
                ((bm.width.toFloat()) - dx) - (size.toFloat()),
                (bm.height.toFloat()) - dy
            ), ScaleToFit.CENTER
        )
        val dropShadow = Matrix(scaleToFit)
        dropShadow.postTranslate(dx, dy)
        val maskCanvas = Canvas(mask)
        val paint = Paint(1)
        maskCanvas.drawBitmap(bm, scaleToFit, paint)
        paint.setXfermode(PorterDuffXfermode(PorterDuff.Mode.SRC_OUT))
        maskCanvas.drawBitmap(bm, dropShadow, paint)
        val filter = BlurMaskFilter(size.toFloat(), Blur.NORMAL)
        paint.reset()
        paint.isAntiAlias = true
        paint.color = color
        paint.setMaskFilter(filter)
        paint.isFilterBitmap = true
        val ret = Bitmap.createBitmap(bm.width, bm.height, Bitmap.Config.ARGB_8888)
        val retCanvas = Canvas(ret)
        retCanvas.drawBitmap(mask, 0.0f, 0.0f, paint)
        retCanvas.drawBitmap(bm, scaleToFit, null)
        mask.recycle()
        return ret
    }

    @SuppressLint("NewApi")
    fun blurBitmap(bitmap: Bitmap, context: Context?): Bitmap {
        val outBitmap = Bitmap.createBitmap(bitmap.width, bitmap.height, Bitmap.Config.ARGB_8888)
        val rs = RenderScript.create(context)
        val blurScript = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs))
        val allIn = Allocation.createFromBitmap(rs, bitmap)
        val allOut = Allocation.createFromBitmap(rs, outBitmap)
        blurScript.setRadius(25.0f)
        blurScript.setInput(allIn)
        blurScript.forEach(allOut)
        allOut.copyTo(outBitmap)
        bitmap.recycle()
        rs.destroy()
        return outBitmap
    }

    fun overlay(bitmap1: Bitmap, bitmapOverlay: Bitmap?, opacity: Int): Bitmap {
        val resultBitmap =
            Bitmap.createBitmap(bitmap1.width, bitmap1.height, Bitmap.Config.ARGB_8888)
        val c = Canvas(resultBitmap)
        c.drawBitmap(bitmap1, 0.0f, 0.0f, null)
        val p = Paint()
        p.alpha = opacity
        c.drawBitmap(bitmapOverlay!!, 0.0f, 0.0f, p)
        return resultBitmap
    }

    private fun newscaleBitmap(originalImage: Bitmap, width: Int, height: Int): Bitmap {
        val background = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val originalWidth = originalImage.width.toFloat()
        val originalHeight = originalImage.height.toFloat()
        val canvas = Canvas(background)
        var scale = (width.toFloat()) / originalWidth
        var xTranslation = 0.0f
        var yTranslation = ((height.toFloat()) - (originalHeight * scale)) / 2.0f
        if (yTranslation < 0.0f) {
            yTranslation = 0.0f
            scale = (height.toFloat()) / originalHeight
            xTranslation = ((width.toFloat()) - (originalWidth * scale)) / 2.0f
        }
        val transformation = Matrix()
        transformation.postTranslate(xTranslation, yTranslation)
        transformation.preScale(scale, scale)
        val paint = Paint()
        paint.isFilterBitmap = true
        canvas.drawBitmap(originalImage, transformation, paint)
        return background
    }

    fun checkBitmap(path: String?, context: Context): Bitmap? {
        var orientation = 1

        var bm: Bitmap
        var options: BitmapFactory.Options

        try {
            options = BitmapFactory.Options()
            options.inSampleSize = 1
            BitmapFactory.decodeFile(path, options)
            bm = BitmapFactory.decodeFile(path, options)
        } catch (e: Exception) {
            options = BitmapFactory.Options()
            options.inSampleSize = 2
            BitmapFactory.decodeFile(path, options)
            bm = BitmapFactory.decodeFile(path, options)
        }


        try {
            val orientString = ExifInterface(path!!).getAttribute("Orientation")
            if (orientString != null) {
                orientation = orientString.toInt()
            }
            var rotationAngle = 0
            if (orientation == 6) {
                rotationAngle = 90
            }
            if (orientation == 3) {
                rotationAngle = 180
            }
            if (orientation == 8) {
                rotationAngle = 270
            }
            val matrix = Matrix()
            matrix.setRotate(
                rotationAngle.toFloat(),
                (bm.width.toFloat()) / 2.0f,
                (bm.height.toFloat()) / 2.0f
            )
            bm = resizeImageToNewSize(
                bm,
                context.resources.displayMetrics.widthPixels,
                context.resources.displayMetrics.heightPixels - ((context.resources.displayMetrics.density * 50.0f).toInt())
            )
            return rotate(bm, rotationAngle)
        } catch (em: IOException) {
            em.printStackTrace()
            return null
        }
    }

    fun rotate(bitmap: Bitmap, degree: Int): Bitmap {
        val w = bitmap.width
        val h = bitmap.height

        val mtx = Matrix()
        mtx.setRotate(degree.toFloat())

        return Bitmap.createBitmap(bitmap, 0, 0, w, h, mtx, true)
    }

    fun resizeImageToNewSize(bitmap: Bitmap, i: Int, i2: Int): Bitmap {
        val width = bitmap.width
        val height = bitmap.height
        var f = i.toFloat()
        var f2 = i2.toFloat()
        if (!(height == i2 && width == i)) {
            f2 = (i.toFloat()) / (width.toFloat())
            f = (i2.toFloat()) / (height.toFloat())
            if (f2 >= f) {
                f2 = f
            }
            f = (width.toFloat()) * f2
            f2 *= height.toFloat()
        }
        return Bitmap.createScaledBitmap(bitmap, f.toInt(), f2.toInt(), true)
    }
}