package com.namseox.st040_mecut.data.api.reponse;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/namseox/st040_mecut/data/api/reponse/DataResponse;", "T", "", "loadingStatus", "Lcom/namseox/st040_mecut/data/api/reponse/LoadingStatus;", "(Lcom/namseox/st040_mecut/data/api/reponse/LoadingStatus;)V", "getLoadingStatus", "()Lcom/namseox/st040_mecut/data/api/reponse/LoadingStatus;", "DataError", "DataErrorResponse", "DataIdle", "DataLoading", "DataLoadingProgress", "DataSuccess", "Lcom/namseox/st040_mecut/data/api/reponse/DataResponse$DataError;", "Lcom/namseox/st040_mecut/data/api/reponse/DataResponse$DataErrorResponse;", "Lcom/namseox/st040_mecut/data/api/reponse/DataResponse$DataIdle;", "Lcom/namseox/st040_mecut/data/api/reponse/DataResponse$DataLoading;", "Lcom/namseox/st040_mecut/data/api/reponse/DataResponse$DataLoadingProgress;", "Lcom/namseox/st040_mecut/data/api/reponse/DataResponse$DataSuccess;", "st040_mecut1.0.0_11.24.2024_debug"})
public abstract class DataResponse<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull
    private final com.namseox.st040_mecut.data.api.reponse.LoadingStatus loadingStatus = null;
    
    private DataResponse(com.namseox.st040_mecut.data.api.reponse.LoadingStatus loadingStatus) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.data.api.reponse.LoadingStatus getLoadingStatus() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/namseox/st040_mecut/data/api/reponse/DataResponse$DataError;", "T", "Lcom/namseox/st040_mecut/data/api/reponse/DataResponse;", "()V", "st040_mecut1.0.0_11.24.2024_debug"})
    public static final class DataError<T extends java.lang.Object> extends com.namseox.st040_mecut.data.api.reponse.DataResponse<T> {
        
        public DataError() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u00a2\u0006\u0002\u0010\u0006R\u0019\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/namseox/st040_mecut/data/api/reponse/DataResponse$DataErrorResponse;", "T", "Lcom/namseox/st040_mecut/data/api/reponse/DataResponse;", "throwable", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getThrowable", "()Ljava/lang/Exception;", "st040_mecut1.0.0_11.24.2024_debug"})
    public static final class DataErrorResponse<T extends java.lang.Object> extends com.namseox.st040_mecut.data.api.reponse.DataResponse<T> {
        @org.jetbrains.annotations.Nullable
        private final java.lang.Exception throwable = null;
        
        public DataErrorResponse(@org.jetbrains.annotations.Nullable
        java.lang.Exception throwable) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Exception getThrowable() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/namseox/st040_mecut/data/api/reponse/DataResponse$DataIdle;", "T", "Lcom/namseox/st040_mecut/data/api/reponse/DataResponse;", "()V", "st040_mecut1.0.0_11.24.2024_debug"})
    public static final class DataIdle<T extends java.lang.Object> extends com.namseox.st040_mecut.data.api.reponse.DataResponse<T> {
        
        public DataIdle() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/namseox/st040_mecut/data/api/reponse/DataResponse$DataLoading;", "T", "Lcom/namseox/st040_mecut/data/api/reponse/DataResponse;", "loadingType", "Lcom/namseox/st040_mecut/data/api/reponse/LoadingStatus;", "(Lcom/namseox/st040_mecut/data/api/reponse/LoadingStatus;)V", "st040_mecut1.0.0_11.24.2024_debug"})
    public static final class DataLoading<T extends java.lang.Object> extends com.namseox.st040_mecut.data.api.reponse.DataResponse<T> {
        @org.jetbrains.annotations.NotNull
        private final com.namseox.st040_mecut.data.api.reponse.LoadingStatus loadingType = null;
        
        public DataLoading(@org.jetbrains.annotations.NotNull
        com.namseox.st040_mecut.data.api.reponse.LoadingStatus loadingType) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/namseox/st040_mecut/data/api/reponse/DataResponse$DataLoadingProgress;", "T", "Lcom/namseox/st040_mecut/data/api/reponse/DataResponse;", "progress", "", "(I)V", "getProgress", "()I", "st040_mecut1.0.0_11.24.2024_debug"})
    public static final class DataLoadingProgress<T extends java.lang.Object> extends com.namseox.st040_mecut.data.api.reponse.DataResponse<T> {
        private final int progress = 0;
        
        public DataLoadingProgress(int progress) {
        }
        
        public final int getProgress() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/namseox/st040_mecut/data/api/reponse/DataResponse$DataSuccess;", "T", "Lcom/namseox/st040_mecut/data/api/reponse/DataResponse;", "body", "(Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/namseox/st040_mecut/data/api/reponse/DataResponse$DataSuccess;", "equals", "", "other", "", "hashCode", "", "toString", "", "st040_mecut1.0.0_11.24.2024_debug"})
    public static final class DataSuccess<T extends java.lang.Object> extends com.namseox.st040_mecut.data.api.reponse.DataResponse<T> {
        private final T body = null;
        
        public DataSuccess(T body) {
        }
        
        public final T getBody() {
            return null;
        }
        
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.namseox.st040_mecut.data.api.reponse.DataResponse.DataSuccess<T> copy(T body) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}