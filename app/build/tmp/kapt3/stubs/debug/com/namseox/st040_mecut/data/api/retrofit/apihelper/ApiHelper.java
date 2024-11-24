package com.namseox.st040_mecut.data.api.retrofit.apihelper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/namseox/st040_mecut/data/api/retrofit/apihelper/ApiHelper;", "Lcom/namseox/st040_mecut/data/api/base/BaseRetrofitHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "callApi", "Lcom/namseox/st040_mecut/data/api/retrofit/apicall/APICall;", "getCallApi", "()Lcom/namseox/st040_mecut/data/api/retrofit/apicall/APICall;", "setCallApi", "(Lcom/namseox/st040_mecut/data/api/retrofit/apicall/APICall;)V", "videoApi", "Lcom/namseox/st040_mecut/data/api/retrofit/apivideo/ApiVideo;", "getVideoApi", "()Lcom/namseox/st040_mecut/data/api/retrofit/apivideo/ApiVideo;", "setVideoApi", "(Lcom/namseox/st040_mecut/data/api/retrofit/apivideo/ApiVideo;)V", "Companion", "st040_mecut1.0.0_11.24.2024_debug"})
public final class ApiHelper extends com.namseox.st040_mecut.data.api.base.BaseRetrofitHelper {
    @org.jetbrains.annotations.NotNull
    private static java.lang.String BASE_URL = "https://www.google.com/";
    @org.jetbrains.annotations.NotNull
    private com.namseox.st040_mecut.data.api.retrofit.apivideo.ApiVideo videoApi;
    @org.jetbrains.annotations.NotNull
    private com.namseox.st040_mecut.data.api.retrofit.apicall.APICall callApi;
    @org.jetbrains.annotations.NotNull
    public static final com.namseox.st040_mecut.data.api.retrofit.apihelper.ApiHelper.Companion Companion = null;
    
    public ApiHelper(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.data.api.retrofit.apivideo.ApiVideo getVideoApi() {
        return null;
    }
    
    public final void setVideoApi(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.data.api.retrofit.apivideo.ApiVideo p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.data.api.retrofit.apicall.APICall getCallApi() {
        return null;
    }
    
    public final void setCallApi(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.data.api.retrofit.apicall.APICall p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/namseox/st040_mecut/data/api/retrofit/apihelper/ApiHelper$Companion;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "setBASE_URL", "(Ljava/lang/String;)V", "st040_mecut1.0.0_11.24.2024_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getBASE_URL() {
            return null;
        }
        
        public final void setBASE_URL(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
    }
}