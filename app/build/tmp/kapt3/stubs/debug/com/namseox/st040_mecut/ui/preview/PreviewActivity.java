package com.namseox.st040_mecut.ui.preview;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020,H\u0014J\b\u0010.\u001a\u00020,H\u0014J\b\u0010/\u001a\u00020,H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00060"}, d2 = {"Lcom/namseox/st040_mecut/ui/preview/PreviewActivity;", "Lcom/namseox/st040_mecut/view/base/AbsBaseActivity;", "Lcom/namseox/st040_mecut/databinding/ActivityPreviewBinding;", "()V", "check", "", "getCheck", "()Z", "setCheck", "(Z)V", "checkPlay", "getCheckPlay", "setCheckPlay", "checkPlaying", "getCheckPlaying", "setCheckPlaying", "duration", "", "getDuration", "()J", "setDuration", "(J)V", "exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "getExoPlayer", "()Landroidx/media3/exoplayer/ExoPlayer;", "setExoPlayer", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "handel", "Landroid/os/Handler;", "getHandel", "()Landroid/os/Handler;", "setHandel", "(Landroid/os/Handler;)V", "runnable", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "getFragmentID", "", "getLayoutId", "init", "", "onDestroy", "onRestart", "onStop", "st040_mecut1.0.0_11.24.2024_debug"})
public final class PreviewActivity extends com.namseox.st040_mecut.view.base.AbsBaseActivity<com.namseox.st040_mecut.databinding.ActivityPreviewBinding> {
    public androidx.media3.exoplayer.ExoPlayer exoPlayer;
    private boolean check = false;
    @org.jetbrains.annotations.NotNull
    private android.os.Handler handel;
    private long duration = 0L;
    private boolean checkPlay = false;
    public java.lang.Runnable runnable;
    private boolean checkPlaying = false;
    
    public PreviewActivity() {
        super(false);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.media3.exoplayer.ExoPlayer getExoPlayer() {
        return null;
    }
    
    public final void setExoPlayer(@org.jetbrains.annotations.NotNull
    androidx.media3.exoplayer.ExoPlayer p0) {
    }
    
    public final boolean getCheck() {
        return false;
    }
    
    public final void setCheck(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.Handler getHandel() {
        return null;
    }
    
    public final void setHandel(@org.jetbrains.annotations.NotNull
    android.os.Handler p0) {
    }
    
    public final long getDuration() {
        return 0L;
    }
    
    public final void setDuration(long p0) {
    }
    
    public final boolean getCheckPlay() {
        return false;
    }
    
    public final void setCheckPlay(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Runnable getRunnable() {
        return null;
    }
    
    public final void setRunnable(@org.jetbrains.annotations.NotNull
    java.lang.Runnable p0) {
    }
    
    @java.lang.Override
    public int getFragmentID() {
        return 0;
    }
    
    @java.lang.Override
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override
    public void init() {
    }
    
    @java.lang.Override
    protected void onRestart() {
    }
    
    public final boolean getCheckPlaying() {
        return false;
    }
    
    public final void setCheckPlaying(boolean p0) {
    }
    
    @java.lang.Override
    protected void onStop() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}