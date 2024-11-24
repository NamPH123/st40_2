package com.namseox.st040_mecut.ui.splash;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0017J\b\u0010\u001c\u001a\u00020\u001aH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lcom/namseox/st040_mecut/ui/splash/SplashActivity;", "Lcom/namseox/st040_mecut/view/base/AbsBaseActivity;", "Lcom/namseox/st040_mecut/databinding/ActivitySplashBinding;", "()V", "handle", "Landroid/os/Handler;", "getHandle", "()Landroid/os/Handler;", "setHandle", "(Landroid/os/Handler;)V", "runnable", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "sharedPreferenceUtils", "Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;", "getSharedPreferenceUtils", "()Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;", "setSharedPreferenceUtils", "(Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;)V", "getFragmentID", "", "getLayoutId", "init", "", "onBackPressed", "onStart", "onStop", "st040_mecut1.0.0_11.24.2024_debug"})
public final class SplashActivity extends com.namseox.st040_mecut.view.base.AbsBaseActivity<com.namseox.st040_mecut.databinding.ActivitySplashBinding> {
    @javax.inject.Inject
    public com.namseox.st040_mecut.utils.SharedPreferenceUtils sharedPreferenceUtils;
    @org.jetbrains.annotations.NotNull
    private android.os.Handler handle;
    @org.jetbrains.annotations.NotNull
    private java.lang.Runnable runnable;
    
    public SplashActivity() {
        super(false);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.utils.SharedPreferenceUtils getSharedPreferenceUtils() {
        return null;
    }
    
    public final void setSharedPreferenceUtils(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.utils.SharedPreferenceUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.Handler getHandle() {
        return null;
    }
    
    public final void setHandle(@org.jetbrains.annotations.NotNull
    android.os.Handler p0) {
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
    protected void onStart() {
    }
    
    @java.lang.Override
    protected void onStop() {
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"MissingSuperCall"})
    public void onBackPressed() {
    }
}