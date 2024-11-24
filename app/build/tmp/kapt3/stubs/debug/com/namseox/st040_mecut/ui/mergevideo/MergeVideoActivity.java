package com.namseox.st040_mecut.ui.mergevideo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00104\u001a\u00020)H\u0016J\b\u00105\u001a\u00020)H\u0016J\b\u00106\u001a\u000207H\u0017J\b\u00108\u001a\u000207H\u0014J\b\u00109\u001a\u000207H\u0003J\u0010\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020)H\u0007J\u000e\u0010<\u001a\u0002072\u0006\u0010=\u001a\u00020>J\b\u0010?\u001a\u000207H\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u00a8\u0006@"}, d2 = {"Lcom/namseox/st040_mecut/ui/mergevideo/MergeVideoActivity;", "Lcom/namseox/st040_mecut/view/base/AbsBaseActivity;", "Lcom/namseox/st040_mecut/databinding/ActivityMergeVideoBinding;", "()V", "adapter", "Lcom/namseox/st040_mecut/ui/mergevideo/MergeAdapter;", "getAdapter", "()Lcom/namseox/st040_mecut/ui/mergevideo/MergeAdapter;", "setAdapter", "(Lcom/namseox/st040_mecut/ui/mergevideo/MergeAdapter;)V", "arrSellect", "Ljava/util/ArrayList;", "Lcom/namseox/st040_mecut/data/model/VideoModel;", "getArrSellect", "()Ljava/util/ArrayList;", "setArrSellect", "(Ljava/util/ArrayList;)V", "arrTime", "", "", "getArrTime", "setArrTime", "checkDefault", "", "getCheckDefault", "()Z", "setCheckDefault", "(Z)V", "exo", "Landroidx/media3/exoplayer/ExoPlayer;", "getExo", "()Landroidx/media3/exoplayer/ExoPlayer;", "setExo", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "handle", "Landroid/os/Handler;", "getHandle", "()Landroid/os/Handler;", "setHandle", "(Landroid/os/Handler;)V", "pos", "", "getPos", "()I", "setPos", "(I)V", "runable", "Ljava/lang/Runnable;", "getRunable", "()Ljava/lang/Runnable;", "setRunable", "(Ljava/lang/Runnable;)V", "getFragmentID", "getLayoutId", "init", "", "onDestroy", "setClick", "updateExo", "it", "updateSelect", "view", "Lcom/namseox/st040_mecut/view/customview/OptiTimeLineView;", "updateTimeVideo", "st040_mecut1.0.0_11.24.2024_debug"})
public final class MergeVideoActivity extends com.namseox.st040_mecut.view.base.AbsBaseActivity<com.namseox.st040_mecut.databinding.ActivityMergeVideoBinding> {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel> arrSellect;
    @org.jetbrains.annotations.NotNull
    private com.namseox.st040_mecut.ui.mergevideo.MergeAdapter adapter;
    private boolean checkDefault = true;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<java.lang.Long[]> arrTime;
    @org.jetbrains.annotations.NotNull
    private android.os.Handler handle;
    public java.lang.Runnable runable;
    public androidx.media3.exoplayer.ExoPlayer exo;
    private int pos = 0;
    
    public MergeVideoActivity() {
        super(false);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel> getArrSellect() {
        return null;
    }
    
    public final void setArrSellect(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.ui.mergevideo.MergeAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.ui.mergevideo.MergeAdapter p0) {
    }
    
    public final boolean getCheckDefault() {
        return false;
    }
    
    public final void setCheckDefault(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.Long[]> getArrTime() {
        return null;
    }
    
    public final void setArrTime(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Long[]> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.Handler getHandle() {
        return null;
    }
    
    public final void setHandle(@org.jetbrains.annotations.NotNull
    android.os.Handler p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Runnable getRunable() {
        return null;
    }
    
    public final void setRunable(@org.jetbrains.annotations.NotNull
    java.lang.Runnable p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.media3.exoplayer.ExoPlayer getExo() {
        return null;
    }
    
    public final void setExo(@org.jetbrains.annotations.NotNull
    androidx.media3.exoplayer.ExoPlayer p0) {
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
    @androidx.media3.common.util.UnstableApi
    public void init() {
    }
    
    public final int getPos() {
        return 0;
    }
    
    public final void setPos(int p0) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @androidx.media3.common.util.UnstableApi
    private final void setClick() {
    }
    
    @androidx.media3.common.util.UnstableApi
    public final void updateExo(int it) {
    }
    
    public final void updateSelect(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.view.customview.OptiTimeLineView view) {
    }
    
    @androidx.media3.common.util.UnstableApi
    public final void updateTimeVideo() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}