package com.namseox.st040_mecut.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\'\u00a8\u0006("}, d2 = {"Lcom/namseox/st040_mecut/utils/Const;", "", "()V", "LANGUAGE", "", "getLANGUAGE", "()Ljava/lang/String;", "PERMISON", "getPERMISON", "REQUEST_NOTIFICATION_PERMISSION", "", "getREQUEST_NOTIFICATION_PERMISSION", "()I", "REQUEST_STORAGE_PERMISSION", "getREQUEST_STORAGE_PERMISSION", "SORT", "getSORT", "checkMusic", "", "getCheckMusic", "()Z", "setCheckMusic", "(Z)V", "listLanguage", "Ljava/util/ArrayList;", "Lcom/namseox/st040_mecut/data/model/LanguageModel;", "getListLanguage", "()Ljava/util/ArrayList;", "setListLanguage", "(Ljava/util/ArrayList;)V", "musicPlay", "Lcom/namseox/st040_mecut/utils/Music;", "getMusicPlay", "()Lcom/namseox/st040_mecut/utils/Music;", "setMusicPlay", "(Lcom/namseox/st040_mecut/utils/Music;)V", "positionLanguageOld", "getPositionLanguageOld", "setPositionLanguageOld", "(I)V", "st040_mecut1.0.0_11.24.2024_debug"})
public final class Const {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SORT = "hdgfhe";
    private static final int REQUEST_STORAGE_PERMISSION = 2000;
    private static final int REQUEST_NOTIFICATION_PERMISSION = 4000;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PERMISON = "ahghe3gt";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String LANGUAGE = "hgfehgh";
    private static int positionLanguageOld = 0;
    @org.jetbrains.annotations.NotNull
    private static java.util.ArrayList<com.namseox.st040_mecut.data.model.LanguageModel> listLanguage;
    private static boolean checkMusic = false;
    @org.jetbrains.annotations.NotNull
    private static com.namseox.st040_mecut.utils.Music musicPlay;
    @org.jetbrains.annotations.NotNull
    public static final com.namseox.st040_mecut.utils.Const INSTANCE = null;
    
    private Const() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSORT() {
        return null;
    }
    
    public final int getREQUEST_STORAGE_PERMISSION() {
        return 0;
    }
    
    public final int getREQUEST_NOTIFICATION_PERMISSION() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPERMISON() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLANGUAGE() {
        return null;
    }
    
    public final int getPositionLanguageOld() {
        return 0;
    }
    
    public final void setPositionLanguageOld(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.namseox.st040_mecut.data.model.LanguageModel> getListLanguage() {
        return null;
    }
    
    public final void setListLanguage(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.namseox.st040_mecut.data.model.LanguageModel> p0) {
    }
    
    public final boolean getCheckMusic() {
        return false;
    }
    
    public final void setCheckMusic(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.utils.Music getMusicPlay() {
        return null;
    }
    
    public final void setMusicPlay(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.utils.Music p0) {
    }
}