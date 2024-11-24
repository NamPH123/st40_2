package com.namseox.st040_mecut.ui.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\'(B\u0005\u00a2\u0006\u0002\u0010\u0004J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u000e\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0006J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0018\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\rH\u0016J\u000e\u0010&\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR.\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006)"}, d2 = {"Lcom/namseox/st040_mecut/ui/main/MainAdapter;", "Lcom/namseox/st040_mecut/view/base/AbsBaseAdapter;", "Lcom/namseox/st040_mecut/data/model/VideoModel;", "Lcom/namseox/st040_mecut/databinding/ItemHomeRectangleBinding;", "()V", "checkTick", "", "getCheckTick", "()Z", "setCheckTick", "(Z)V", "onClickItem", "Lkotlin/Function2;", "", "", "", "getOnClickItem", "()Lkotlin/jvm/functions/Function2;", "setOnClickItem", "(Lkotlin/jvm/functions/Function2;)V", "typeInt", "getTypeInt", "()I", "setTypeInt", "(I)V", "bind", "binding", "position", "data", "i", "getItemViewType", "onBindViewHolder", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setType", "RectangleDiff", "ViewHolder2", "st040_mecut1.0.0_11.24.2024_debug"})
public final class MainAdapter extends com.namseox.st040_mecut.view.base.AbsBaseAdapter<com.namseox.st040_mecut.data.model.VideoModel, com.namseox.st040_mecut.databinding.ItemHomeRectangleBinding> {
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> onClickItem;
    private int typeInt = 0;
    private boolean checkTick = false;
    
    public MainAdapter() {
        super(0, null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.String, kotlin.Unit> getOnClickItem() {
        return null;
    }
    
    public final void setOnClickItem(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> p0) {
    }
    
    public final int getTypeInt() {
        return 0;
    }
    
    public final void setTypeInt(int p0) {
    }
    
    public final boolean getCheckTick() {
        return false;
    }
    
    public final void setCheckTick(boolean p0) {
    }
    
    public final void checkTick(boolean i) {
    }
    
    public final void setType(int i) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void bind(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.databinding.ItemHomeRectangleBinding binding, int position, @org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.data.model.VideoModel data) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/namseox/st040_mecut/ui/main/MainAdapter$RectangleDiff;", "Lcom/namseox/st040_mecut/view/base/AbsBaseDiffCallBack;", "Lcom/namseox/st040_mecut/data/model/VideoModel;", "()V", "contentsTheSame", "", "oldItem", "newItem", "itemsTheSame", "st040_mecut1.0.0_11.24.2024_debug"})
    public static final class RectangleDiff extends com.namseox.st040_mecut.view.base.AbsBaseDiffCallBack<com.namseox.st040_mecut.data.model.VideoModel> {
        
        public RectangleDiff() {
            super();
        }
        
        @java.lang.Override
        public boolean itemsTheSame(@org.jetbrains.annotations.NotNull
        com.namseox.st040_mecut.data.model.VideoModel oldItem, @org.jetbrains.annotations.NotNull
        com.namseox.st040_mecut.data.model.VideoModel newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean contentsTheSame(@org.jetbrains.annotations.NotNull
        com.namseox.st040_mecut.data.model.VideoModel oldItem, @org.jetbrains.annotations.NotNull
        com.namseox.st040_mecut.data.model.VideoModel newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/namseox/st040_mecut/ui/main/MainAdapter$ViewHolder2;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/namseox/st040_mecut/databinding/ItemHomeVerticalBinding;", "(Lcom/namseox/st040_mecut/ui/main/MainAdapter;Lcom/namseox/st040_mecut/databinding/ItemHomeVerticalBinding;)V", "getBinding", "()Lcom/namseox/st040_mecut/databinding/ItemHomeVerticalBinding;", "bind", "", "data", "Lcom/namseox/st040_mecut/data/model/VideoModel;", "position", "", "st040_mecut1.0.0_11.24.2024_debug"})
    public final class ViewHolder2 extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.namseox.st040_mecut.databinding.ItemHomeVerticalBinding binding = null;
        
        public ViewHolder2(@org.jetbrains.annotations.NotNull
        com.namseox.st040_mecut.databinding.ItemHomeVerticalBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.namseox.st040_mecut.databinding.ItemHomeVerticalBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.namseox.st040_mecut.data.model.VideoModel data, int position) {
        }
    }
}