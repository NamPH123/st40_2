package com.namseox.st040_mecut.ui.permission;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014J+\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0014H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Lcom/namseox/st040_mecut/ui/permission/PermissionActivity;", "Lcom/namseox/st040_mecut/view/base/AbsBaseActivity;", "Lcom/namseox/st040_mecut/databinding/ActivityPermisionBinding;", "()V", "check", "", "getCheck", "()Z", "setCheck", "(Z)V", "sharedPreferenceUtils", "Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;", "getSharedPreferenceUtils", "()Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;", "setSharedPreferenceUtils", "(Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;)V", "getFragmentID", "", "getLayoutId", "init", "", "onClick", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "st040_mecut1.0.0_11.24.2024_debug"})
public final class PermissionActivity extends com.namseox.st040_mecut.view.base.AbsBaseActivity<com.namseox.st040_mecut.databinding.ActivityPermisionBinding> {
    private boolean check = false;
    @javax.inject.Inject
    public com.namseox.st040_mecut.utils.SharedPreferenceUtils sharedPreferenceUtils;
    
    public PermissionActivity() {
        super(false);
    }
    
    public final boolean getCheck() {
        return false;
    }
    
    public final void setCheck(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.utils.SharedPreferenceUtils getSharedPreferenceUtils() {
        return null;
    }
    
    public final void setSharedPreferenceUtils(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.utils.SharedPreferenceUtils p0) {
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
    
    public final void onClick() {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
}