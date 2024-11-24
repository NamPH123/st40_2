package com.namseox.st040_mecut.view.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001dH&J\b\u0010\u001f\u001a\u00020 H&J\u0012\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020 H\u0014J\b\u0010%\u001a\u00020 H\u0014R\u001c\u0010\u0007\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006&"}, d2 = {"Lcom/namseox/st040_mecut/view/base/AbsBaseActivity;", "V", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "fragment", "", "(Z)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "getFragment", "()Z", "setFragment", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "getNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "setNavHostFragment", "(Landroidx/navigation/fragment/NavHostFragment;)V", "getFragmentID", "", "getLayoutId", "init", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRestart", "onResume", "st040_mecut1.0.0_11.24.2024_debug"})
public abstract class AbsBaseActivity<V extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity {
    private boolean fragment;
    public V binding;
    public androidx.navigation.fragment.NavHostFragment navHostFragment;
    public androidx.navigation.NavController navController;
    
    public AbsBaseActivity(boolean fragment) {
        super();
    }
    
    public final boolean getFragment() {
        return false;
    }
    
    public final void setFragment(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final V getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    V p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.navigation.fragment.NavHostFragment getNavHostFragment() {
        return null;
    }
    
    public final void setNavHostFragment(@org.jetbrains.annotations.NotNull
    androidx.navigation.fragment.NavHostFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onRestart() {
    }
    
    public abstract int getFragmentID();
    
    public abstract int getLayoutId();
    
    public abstract void init();
}