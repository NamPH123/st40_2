package com.namseox.st040_mecut.dialog;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\b\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/namseox/st040_mecut/dialog/DialogDelete;", "Lcom/namseox/st040_mecut/view/base/BaseDialog;", "Lcom/namseox/st040_mecut/databinding/DialogDeleteBinding;", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "onPress", "Lcom/namseox/st040_mecut/dialog/DialogDelete$OnPress;", "bindView", "", "getContentView", "", "init", "initView", "OnPress", "st040_mecut1.0.0_11.24.2024_debug"})
public final class DialogDelete extends com.namseox.st040_mecut.view.base.BaseDialog<com.namseox.st040_mecut.databinding.DialogDeleteBinding> {
    private com.namseox.st040_mecut.dialog.DialogDelete.OnPress onPress;
    
    public DialogDelete(@org.jetbrains.annotations.NotNull
    android.app.Activity context) {
        super(null, false);
    }
    
    public final void init(@org.jetbrains.annotations.Nullable
    com.namseox.st040_mecut.dialog.DialogDelete.OnPress onPress) {
    }
    
    @java.lang.Override
    public int getContentView() {
        return 0;
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    @java.lang.Override
    public void bindView() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/namseox/st040_mecut/dialog/DialogDelete$OnPress;", "", "cancel", "", "delete", "st040_mecut1.0.0_11.24.2024_debug"})
    public static abstract interface OnPress {
        
        public abstract void cancel();
        
        public abstract void delete();
    }
}