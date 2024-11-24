package com.namseox.st040_mecut.dialog;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/namseox/st040_mecut/dialog/DialogRate;", "Lcom/namseox/st040_mecut/view/base/BaseDialog;", "Lcom/namseox/st040_mecut/databinding/DialogRateBinding;", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "i", "", "getI", "()I", "setI", "(I)V", "onPress", "Lcom/namseox/st040_mecut/dialog/DialogRate$OnPress;", "bindView", "", "getContentView", "init", "initView", "setView", "tv1", "tv2", "img", "OnPress", "st040_mecut1.0.0_11.24.2024_debug"})
public final class DialogRate extends com.namseox.st040_mecut.view.base.BaseDialog<com.namseox.st040_mecut.databinding.DialogRateBinding> {
    private int i = 0;
    private com.namseox.st040_mecut.dialog.DialogRate.OnPress onPress;
    
    public DialogRate(@org.jetbrains.annotations.NotNull
    android.app.Activity context) {
        super(null, false);
    }
    
    public final int getI() {
        return 0;
    }
    
    public final void setI(int p0) {
    }
    
    @java.lang.Override
    public int getContentView() {
        return 0;
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    public final void init(@org.jetbrains.annotations.Nullable
    com.namseox.st040_mecut.dialog.DialogRate.OnPress onPress) {
    }
    
    @java.lang.Override
    public void bindView() {
    }
    
    public final void setView(int tv1, int tv2, int img) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/namseox/st040_mecut/dialog/DialogRate$OnPress;", "", "cancel", "", "later", "rating", "send", "rate", "", "st040_mecut1.0.0_11.24.2024_debug"})
    public static abstract interface OnPress {
        
        public abstract void send(float rate);
        
        public abstract void rating();
        
        public abstract void cancel();
        
        public abstract void later();
    }
}