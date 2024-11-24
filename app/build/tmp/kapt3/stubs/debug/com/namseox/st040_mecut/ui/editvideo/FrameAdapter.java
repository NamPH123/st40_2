package com.namseox.st040_mecut.ui.editvideo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0004J \u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/namseox/st040_mecut/ui/editvideo/FrameAdapter;", "Lcom/namseox/st040_mecut/view/base/AbsBaseAdapter;", "Lcom/namseox/st040_mecut/data/model/FuntionModel;", "Lcom/namseox/st040_mecut/databinding/ItemFrameBinding;", "()V", "onClick", "Lkotlin/Function2;", "", "Landroid/graphics/Bitmap;", "", "getOnClick", "()Lkotlin/jvm/functions/Function2;", "setOnClick", "(Lkotlin/jvm/functions/Function2;)V", "bind", "binding", "position", "data", "FrameDiff", "st040_mecut1.0.0_11.24.2024_debug"})
public final class FrameAdapter extends com.namseox.st040_mecut.view.base.AbsBaseAdapter<com.namseox.st040_mecut.data.model.FuntionModel, com.namseox.st040_mecut.databinding.ItemFrameBinding> {
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.graphics.Bitmap, kotlin.Unit> onClick;
    
    public FrameAdapter() {
        super(0, null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function2<java.lang.Integer, android.graphics.Bitmap, kotlin.Unit> getOnClick() {
        return null;
    }
    
    public final void setOnClick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.graphics.Bitmap, kotlin.Unit> p0) {
    }
    
    @java.lang.Override
    public void bind(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.databinding.ItemFrameBinding binding, int position, @org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.data.model.FuntionModel data) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/namseox/st040_mecut/ui/editvideo/FrameAdapter$FrameDiff;", "Lcom/namseox/st040_mecut/view/base/AbsBaseDiffCallBack;", "Lcom/namseox/st040_mecut/data/model/FuntionModel;", "()V", "contentsTheSame", "", "oldItem", "newItem", "itemsTheSame", "st040_mecut1.0.0_11.24.2024_debug"})
    public static final class FrameDiff extends com.namseox.st040_mecut.view.base.AbsBaseDiffCallBack<com.namseox.st040_mecut.data.model.FuntionModel> {
        
        public FrameDiff() {
            super();
        }
        
        @java.lang.Override
        public boolean itemsTheSame(@org.jetbrains.annotations.NotNull
        com.namseox.st040_mecut.data.model.FuntionModel oldItem, @org.jetbrains.annotations.NotNull
        com.namseox.st040_mecut.data.model.FuntionModel newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean contentsTheSame(@org.jetbrains.annotations.NotNull
        com.namseox.st040_mecut.data.model.FuntionModel oldItem, @org.jetbrains.annotations.NotNull
        com.namseox.st040_mecut.data.model.FuntionModel newItem) {
            return false;
        }
    }
}