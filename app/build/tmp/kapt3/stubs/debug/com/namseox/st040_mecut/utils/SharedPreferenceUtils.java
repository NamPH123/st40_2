package com.namseox.st040_mecut.utils;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0006J\u0018\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\u0006\b\u0000\u0010\u0012\u0018\u0001H\u0086\b\u00a2\u0006\u0002\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\nJ\u0016\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000eJ\u001a\u0010\u0019\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J&\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00062\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fJ \u0010\u001c\u001a\u00020\u0016\"\u0006\b\u0000\u0010\u0012\u0018\u00012\b\u0010\u0017\u001a\u0004\u0018\u0001H\u0012H\u0086\b\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "MYAPPLICATION", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "getBooleanValue", "", "key", "getIntArray", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getNumber", "getObjModel", "T", "()Ljava/lang/Object;", "getStringValue", "putBooleanValue", "", "value", "putNumber", "putStringValue", "saveIntArray", "array", "setObjModel", "(Ljava/lang/Object;)V", "Companion", "st040_mecut1.0.0_11.24.2024_debug"})
public final class SharedPreferenceUtils {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String MYAPPLICATION = "MY_APPLICATION";
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull
    public static final com.namseox.st040_mecut.utils.SharedPreferenceUtils.Companion Companion = null;
    
    @javax.inject.Inject
    public SharedPreferenceUtils(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final void putStringValue(@org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStringValue(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return null;
    }
    
    public final void putNumber(@org.jetbrains.annotations.NotNull
    java.lang.String key, int value) {
    }
    
    public final int getNumber(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return 0;
    }
    
    public final boolean getBooleanValue(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return false;
    }
    
    public final void putBooleanValue(@org.jetbrains.annotations.NotNull
    java.lang.String key, boolean value) {
    }
    
    public final void saveIntArray(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Integer> array) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.Integer> getIntArray(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils$Companion;", "Lcom/namseox/st040_mecut/utils/SingletonHolder;", "Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;", "Landroid/content/Context;", "()V", "st040_mecut1.0.0_11.24.2024_debug"})
    public static final class Companion extends com.namseox.st040_mecut.utils.SingletonHolder<com.namseox.st040_mecut.utils.SharedPreferenceUtils, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}