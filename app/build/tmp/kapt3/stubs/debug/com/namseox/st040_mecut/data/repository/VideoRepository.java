package com.namseox.st040_mecut.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r\u00a8\u0006\u000e"}, d2 = {"Lcom/namseox/st040_mecut/data/repository/VideoRepository;", "Lcom/namseox/st040_mecut/data/api/base/BaseRoomDBHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "addVideo", "", "idol", "Lcom/namseox/st040_mecut/data/model/VideoModel;", "deleteAll", "deleteVideo", "video", "getAllVideo", "", "st040_mecut1.0.0_11.24.2024_debug"})
public final class VideoRepository extends com.namseox.st040_mecut.data.api.base.BaseRoomDBHelper {
    
    public VideoRepository(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.namseox.st040_mecut.data.model.VideoModel> getAllVideo() {
        return null;
    }
    
    public final int addVideo(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.data.model.VideoModel idol) {
        return 0;
    }
    
    public final int deleteVideo(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.data.model.VideoModel video) {
        return 0;
    }
    
    public final int deleteAll() {
        return 0;
    }
}