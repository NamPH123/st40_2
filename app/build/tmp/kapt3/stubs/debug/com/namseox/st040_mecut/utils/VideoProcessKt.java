package com.namseox.st040_mecut.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a`\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012\u001a:\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012\u001a8\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001a\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012\u00a8\u0006\u001b"}, d2 = {"createFileList", "Ljava/io/File;", "context", "Landroid/content/Context;", "videoPaths", "", "", "createVideoFromImages", "", "bitmaps", "Landroid/graphics/Bitmap;", "durations", "", "outputFilePath", "audioPath", "audioStartTime", "audioEndTime", "callback", "Lkotlin/Function1;", "", "cutVideo", "inputPath", "outputPath", "startTime", "endTime", "mergeVideos", "outputVideoPath", "st040_mecut1.0.0_11.24.2024_debug"})
public final class VideoProcessKt {
    
    public static final void cutVideo(@org.jetbrains.annotations.NotNull
    java.lang.String inputPath, @org.jetbrains.annotations.NotNull
    java.lang.String outputPath, @org.jetbrains.annotations.NotNull
    java.lang.String startTime, @org.jetbrains.annotations.NotNull
    java.lang.String endTime, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.io.File createFileList(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> videoPaths) {
        return null;
    }
    
    public static final void mergeVideos(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> videoPaths, @org.jetbrains.annotations.NotNull
    java.lang.String outputVideoPath, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    public static final void createVideoFromImages(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<android.graphics.Bitmap> bitmaps, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Float> durations, @org.jetbrains.annotations.NotNull
    java.lang.String outputFilePath, @org.jetbrains.annotations.NotNull
    java.lang.String audioPath, float audioStartTime, float audioEndTime, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
}