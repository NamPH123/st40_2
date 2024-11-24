package com.namseox.st040_mecut.utils

import android.content.Context
import android.graphics.Bitmap
import android.os.Build
import android.os.Build.VERSION
import android.renderscript.Allocation
import android.renderscript.Element
import android.renderscript.RenderScript
import android.renderscript.ScriptIntrinsicBlur
import androidx.core.view.MotionEventCompat
import com.namseox.st040_mecut.App
import com.namseox.st040_mecut.utils.Constant.app
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class FastBlur {

    private fun FastBlur() {
        //dosomething
    }

    fun blurBitmap(bitmap: Bitmap, n: Int, context: Context): Bitmap {
        val bitmap2 = Bitmap.createBitmap(bitmap.width, bitmap.height, Bitmap.Config.ARGB_8888)
        val create = RenderScript.create(context)
        var create2: ScriptIntrinsicBlur? = null
        if (VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create))
        }
        val fromBitmap = Allocation.createFromBitmap(create, bitmap)
        val fromBitmap2 = Allocation.createFromBitmap(create, bitmap2)
        if (VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            create2!!.setRadius(n.toFloat())
            create2!!.setInput(fromBitmap)
            create2!!.forEach(fromBitmap2)
        }
        fromBitmap2.copyTo(bitmap2)
        create.destroy()
        return bitmap2
    }


    fun doBlur(copy2: Bitmap, n: Int, b: Boolean): Bitmap {
        var copy = copy2
        val bitmap = copy2
        if (VERSION.SDK_INT >= 17) {
            return blurBitmap(bitmap, n, app)
        }
        copy = if (b) {
            bitmap
        } else {
            bitmap.copy(copy2.config, true)
        }
//        if (n < 1) {
//            return null
//        }
        val width = copy.width
        val height = copy.height
        val n2 = width * height
        val array = IntArray(n2)
        copy.getPixels(array, 0, width, 0, 0, width, height)
        val n3 = width - 1
        val n4 = height - 1
        val n5 = (n + n) + 1
        val array2 = IntArray(n2)
        val array3 = IntArray(n2)
        val array4 = IntArray(n2)
        val array5 = IntArray(max(width.toDouble(), height.toDouble()).toInt())
        val n6 = (n5 + 1) shr 1
        val n7 = n6 * n6
        val n8 = n7 * 256
        val array6 = IntArray(n8)
        for (i in 0 until n8) {
            array6[i] = i / n7
        }
        val array7 =
            java.lang.reflect.Array.newInstance(Integer.TYPE, *intArrayOf(n5, 3)) as Array<IntArray>
        val n9 = n + 1
        var n10 = 0
        var n11 = 0
        val n12 = n4
        val bitmap2 = copy
        for (j in 0 until height) {
            var n13 = 0
            var n14 = 0
            var n15 = 0
            var n16 = 0
            var n17 = 0
            var n18 = 0
            var n19 = 0
            var n20 = 0
            var n21 = 0
            for (k in -n..n) {
                val n22 = array[(min(n3.toDouble(), max(k.toDouble(), 0.0)) + n10).toInt()]
                val array8 = array7[k + n]
                array8[0] = (16711680 and n22) shr 16
                array8[1] = (MotionEventCompat.ACTION_POINTER_INDEX_MASK and n22) shr 8
                array8[2] = n22 and 255
                val n23 = (n9 - abs(k.toDouble())).toInt()
                n13 += array8[0] * n23
                n14 += array8[1] * n23
                n15 += array8[2] * n23
                if (k > 0) {
                    n16 += array8[0]
                    n17 += array8[1]
                    n18 += array8[2]
                } else {
                    n19 += array8[0]
                    n20 += array8[1]
                    n21 += array8[2]
                }
            }
            var n25 = n17
            var n26 = n16
            var n27 = n
            for (l in 0 until width) {
                array2[n10] = array6[n13]
                array3[n10] = array6[n14]
                array4[n10] = array6[n15]
                val array9 = array7[((n27 - n) + n5) % n5]
                val n28 = array9[0]
                val n29 = array9[1]
                val n30 = array9[2]
                if (j == 0) {
                    array5[l] =
                        min(((l + n) + 1).toDouble(), n3.toDouble()).toInt()
                }
                val n31 = array[array5[l] + n11]
                array9[0] = (16711680 and n31) shr 16
                array9[1] = (MotionEventCompat.ACTION_POINTER_INDEX_MASK and n31) shr 8
                array9[2] = n31 and 255
                val n32 = n26 + array9[0]
                val n33 = n25 + array9[1]
                val n34 = n18 + array9[2]
                n13 = (n13 - n19) + n32
                n14 = (n14 - n20) + n33
                n15 = (n15 - n21) + n34
                n27 = (n27 + 1) % n5
                val array10 = array7[n27 % n5]
                n19 = (n19 - n28) + array10[0]
                n20 = (n20 - n29) + array10[1]
                n21 = (n21 - n30) + array10[2]
                n26 = n32 - array10[0]
                n25 = n33 - array10[1]
                n18 = n34 - array10[2]
                n10++
            }
            n11 += width
        }
        val n35 = height
        val n37 = n12
        val array11 = array5
        for (n38 in 0 until width) {
            var n39 = -n
            var n40 = n39 * width
            var n41 = 0
            var n42 = 0
            var n43 = 0
            var n44 = 0
            var n45 = 0
            var n46 = 0
            var n47 = 0
            var n48 = 0
            var n49 = 0
            while (n39 <= n) {
                val n50 = (max(0.0, n40.toDouble()) + n38).toInt()
                val array12 = array7[n39 + n]
                array12[0] = array2[n50]
                array12[1] = array3[n50]
                array12[2] = array4[n50]
                val n51 = (n9 - abs(n39.toDouble())).toInt()
                val n52 = n41 + (array2[n50] * n51)
                n42 += array3[n50] * n51
                n43 += array4[n50] * n51
                if (n39 > 0) {
                    n44 += array12[0]
                    n45 += array12[1]
                    n46 += array12[2]
                } else {
                    n47 += array12[0]
                    n48 += array12[1]
                    n49 += array12[2]
                }
                var n53 = n40
                if (n39 < n37) {
                    n53 = n40 + width
                }
                n39++
                n40 = n53
                n41 = n52
            }
            var n55 = n45
            var n58 = n
            var n59 = n44
            var n60 = n43
            var n61 = n42
            var n62 = n46
            var n63 = n41
            var n64 = n38
            for (n65 in 0 until n35) {
                array[n64] =
                    (((array[n64] and -16777216) or (array6[n63] shl 16)) or (array6[n61] shl 8)) or array6[n60]
                val array13 = array7[((n58 - n) + n5) % n5]
                val n66 = array13[0]
                val n67 = array13[1]
                val n68 = array13[2]
                if (n38 == 0) {
                    array11[n65] = (min((n65 + n9).toDouble(), n37.toDouble()) * width).toInt()
                }
                val n69 = array11[n65] + n38
                array13[0] = array2[n69]
                array13[1] = array3[n69]
                array13[2] = array4[n69]
                val n70 = n59 + array13[0]
                val n71 = n55 + array13[1]
                val n72 = n62 + array13[2]
                n63 = (n63 - n47) + n70
                n61 = (n61 - n48) + n71
                n60 = (n60 - n49) + n72
                n58 = (n58 + 1) % n5
                val array14 = array7[n58]
                n47 = (n47 - n66) + array14[0]
                n48 = (n48 - n67) + array14[1]
                n49 = (n49 - n68) + array14[2]
                n59 = n70 - array14[0]
                n55 = n71 - array14[1]
                n62 = n72 - array14[2]
                n64 += width
            }
        }
        bitmap2.setPixels(array, 0, width, 0, 0, width, n35)
        return bitmap2
    }
}