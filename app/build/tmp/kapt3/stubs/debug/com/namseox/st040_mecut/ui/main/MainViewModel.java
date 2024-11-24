package com.namseox.st040_mecut.ui.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nJ\u0006\u0010\u001a\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nJ\u0006\u0010\u001c\u001a\u00020\u0018R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/namseox/st040_mecut/ui/main/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "providerRepository", "Lcom/namseox/st040_mecut/data/repository/VideoRepository;", "(Landroid/app/Application;Lcom/namseox/st040_mecut/data/repository/VideoRepository;)V", "listArrVideo", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/namseox/st040_mecut/data/model/VideoModel;", "getListArrVideo", "()Landroidx/lifecycle/MutableLiveData;", "setListArrVideo", "(Landroidx/lifecycle/MutableLiveData;)V", "getProviderRepository", "()Lcom/namseox/st040_mecut/data/repository/VideoRepository;", "setProviderRepository", "(Lcom/namseox/st040_mecut/data/repository/VideoRepository;)V", "x", "", "getX", "setX", "addVideo", "", "video", "deleteAll", "deleteVideo", "getAllVideo", "st040_mecut1.0.0_11.24.2024_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private com.namseox.st040_mecut.data.repository.VideoRepository providerRepository;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel>> listArrVideo;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> x;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application app, @org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.data.repository.VideoRepository providerRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.data.repository.VideoRepository getProviderRepository() {
        return null;
    }
    
    public final void setProviderRepository(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.data.repository.VideoRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel>> getListArrVideo() {
        return null;
    }
    
    public final void setListArrVideo(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getX() {
        return null;
    }
    
    public final void setX(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    public final void getAllVideo() {
    }
    
    public final void deleteVideo(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.data.model.VideoModel video) {
    }
    
    public final void deleteAll() {
    }
    
    public final void addVideo(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.data.model.VideoModel video) {
    }
}