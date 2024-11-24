package com.namseox.st040_mecut.view.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u0018H&J\u0012\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014R\u001c\u0010\t\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001f"}, d2 = {"Lcom/namseox/st040_mecut/view/base/BaseDialog;", "DB", "Landroidx/databinding/ViewDataBinding;", "Landroid/app/Dialog;", "context", "Landroid/app/Activity;", "canAble", "", "(Landroid/app/Activity;Z)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "getCanAble", "()Z", "setCanAble", "(Z)V", "getContext", "()Landroid/app/Activity;", "setContext", "(Landroid/app/Activity;)V", "bindView", "", "getContentView", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "st040_mecut1.0.0_11.24.2024_debug"})
public abstract class BaseDialog<DB extends androidx.databinding.ViewDataBinding> extends android.app.Dialog {
    @org.jetbrains.annotations.NotNull
    private android.app.Activity context;
    private boolean canAble;
    public DB binding;
    
    public BaseDialog(@org.jetbrains.annotations.NotNull
    android.app.Activity context, boolean canAble) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.Activity getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull
    android.app.Activity p0) {
    }
    
    public final boolean getCanAble() {
        return false;
    }
    
    public final void setCanAble(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final DB getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    DB p0) {
    }
    
    public abstract int getContentView();
    
    public abstract void initView();
    
    public abstract void bindView();
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}