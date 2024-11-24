package com.namseox.st040_mecut.view.customview.customimage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0018\u0010\u0013\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0011H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0015"}, d2 = {"Lcom/namseox/st040_mecut/view/customview/customimage/OnStickerListener;", "", "onAdded", "", "sticker", "Lcom/namseox/st040_mecut/view/customview/customimage/Sticker;", "onClicked", "onDeleted", "onDoubleTapped", "onDragFinished", "onFlipped", "onHideOptionIcon", "onRedoAll", "onReplace", "onTouchedDown", "onUndoDelete", "stickers", "", "onUndoDeleteAll", "onUndoUpdate", "onZoomFinished", "st040_mecut1.0.0_11.24.2024_debug"})
public abstract interface OnStickerListener {
    
    public abstract void onAdded(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.view.customview.customimage.Sticker sticker);
    
    public abstract void onClicked(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.view.customview.customimage.Sticker sticker);
    
    public abstract void onDeleted(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.view.customview.customimage.Sticker sticker);
    
    public abstract void onDragFinished(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.view.customview.customimage.Sticker sticker);
    
    public abstract void onTouchedDown(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.view.customview.customimage.Sticker sticker);
    
    public abstract void onZoomFinished(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.view.customview.customimage.Sticker sticker);
    
    public abstract void onFlipped(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.view.customview.customimage.Sticker sticker);
    
    public abstract void onDoubleTapped(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.view.customview.customimage.Sticker sticker);
    
    public abstract void onHideOptionIcon();
    
    public abstract void onUndoDelete(@org.jetbrains.annotations.NotNull
    java.util.List<? extends com.namseox.st040_mecut.view.customview.customimage.Sticker> stickers);
    
    public abstract void onUndoUpdate(@org.jetbrains.annotations.NotNull
    java.util.List<? extends com.namseox.st040_mecut.view.customview.customimage.Sticker> stickers);
    
    public abstract void onUndoDeleteAll();
    
    public abstract void onRedoAll();
    
    public abstract void onReplace(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.view.customview.customimage.Sticker sticker);
}