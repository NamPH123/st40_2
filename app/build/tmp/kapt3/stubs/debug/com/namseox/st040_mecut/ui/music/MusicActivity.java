package com.namseox.st040_mecut.ui.music;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00107\u001a\u00020&H\u0016J\b\u00108\u001a\u00020&H\u0016J\b\u00109\u001a\u00020:H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R\u001a\u00104\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*\u00a8\u0006;"}, d2 = {"Lcom/namseox/st040_mecut/ui/music/MusicActivity;", "Lcom/namseox/st040_mecut/view/base/AbsBaseActivity;", "Lcom/namseox/st040_mecut/databinding/ActivityMusicBinding;", "()V", "adapter", "Lcom/namseox/st040_mecut/ui/music/MusicAdapter;", "getAdapter", "()Lcom/namseox/st040_mecut/ui/music/MusicAdapter;", "setAdapter", "(Lcom/namseox/st040_mecut/ui/music/MusicAdapter;)V", "arrMusic", "Ljava/util/ArrayList;", "Lcom/namseox/st040_mecut/data/model/MusicModel;", "getArrMusic", "()Ljava/util/ArrayList;", "setArrMusic", "(Ljava/util/ArrayList;)V", "arrPath", "", "getArrPath", "setArrPath", "checkPlaying", "", "getCheckPlaying", "()Z", "setCheckPlaying", "(Z)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "setMediaPlayer", "(Landroid/media/MediaPlayer;)V", "posittion", "", "getPosittion", "()I", "setPosittion", "(I)V", "runnable", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "timeEnd", "getTimeEnd", "setTimeEnd", "timeStart", "getTimeStart", "setTimeStart", "getFragmentID", "getLayoutId", "init", "", "st040_mecut1.0.0_11.24.2024_debug"})
public final class MusicActivity extends com.namseox.st040_mecut.view.base.AbsBaseActivity<com.namseox.st040_mecut.databinding.ActivityMusicBinding> {
    public com.namseox.st040_mecut.ui.music.MusicAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<java.lang.String> arrPath;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.namseox.st040_mecut.data.model.MusicModel> arrMusic;
    public android.media.MediaPlayer mediaPlayer;
    private int posittion = -1;
    private boolean checkPlaying = false;
    @org.jetbrains.annotations.NotNull
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.Runnable runnable;
    private int timeStart = 0;
    private int timeEnd = 0;
    
    public MusicActivity() {
        super(false);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.ui.music.MusicAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.ui.music.MusicAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.String> getArrPath() {
        return null;
    }
    
    public final void setArrPath(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.namseox.st040_mecut.data.model.MusicModel> getArrMusic() {
        return null;
    }
    
    public final void setArrMusic(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.namseox.st040_mecut.data.model.MusicModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.media.MediaPlayer getMediaPlayer() {
        return null;
    }
    
    public final void setMediaPlayer(@org.jetbrains.annotations.NotNull
    android.media.MediaPlayer p0) {
    }
    
    public final int getPosittion() {
        return 0;
    }
    
    public final void setPosittion(int p0) {
    }
    
    public final boolean getCheckPlaying() {
        return false;
    }
    
    public final void setCheckPlaying(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.Handler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Runnable getRunnable() {
        return null;
    }
    
    public final void setRunnable(@org.jetbrains.annotations.NotNull
    java.lang.Runnable p0) {
    }
    
    public final int getTimeStart() {
        return 0;
    }
    
    public final void setTimeStart(int p0) {
    }
    
    public final int getTimeEnd() {
        return 0;
    }
    
    public final void setTimeEnd(int p0) {
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
}