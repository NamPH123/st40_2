package com.namseox.st040_mecut.view.customview.customimage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/namseox/st040_mecut/view/customview/customimage/StickerEvent;", "", "onActionDown", "", "stickerView", "Lcom/namseox/st040_mecut/view/customview/customimage/StickerView;", "event", "Landroid/view/MotionEvent;", "onActionMove", "onActionUp", "st040_mecut1.0.0_11.24.2024_debug"})
public abstract interface StickerEvent {
    
    public abstract void onActionDown(@org.jetbrains.annotations.Nullable
    com.namseox.st040_mecut.view.customview.customimage.StickerView stickerView, @org.jetbrains.annotations.Nullable
    android.view.MotionEvent event);
    
    public abstract void onActionMove(@org.jetbrains.annotations.Nullable
    com.namseox.st040_mecut.view.customview.customimage.StickerView stickerView, @org.jetbrains.annotations.Nullable
    android.view.MotionEvent event);
    
    public abstract void onActionUp(@org.jetbrains.annotations.Nullable
    com.namseox.st040_mecut.view.customview.customimage.StickerView stickerView, @org.jetbrains.annotations.Nullable
    android.view.MotionEvent event);
}