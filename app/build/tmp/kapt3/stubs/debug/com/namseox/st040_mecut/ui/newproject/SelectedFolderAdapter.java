package com.namseox.st040_mecut.ui.newproject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0006J0\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\t2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016R7\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lcom/namseox/st040_mecut/ui/newproject/SelectedFolderAdapter;", "Lcom/namseox/st040_mecut/view/base/AbsBaseAdapter;", "Ljava/util/ArrayList;", "Lcom/namseox/st040_mecut/data/model/VideoModel;", "Lkotlin/collections/ArrayList;", "Lcom/namseox/st040_mecut/databinding/ItemSelectFolderBinding;", "()V", "onCLick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "pos", "", "getOnCLick", "()Lkotlin/jvm/functions/Function1;", "setOnCLick", "(Lkotlin/jvm/functions/Function1;)V", "bind", "binding", "position", "data", "SelectedFolderDiffUtil", "st040_mecut1.0.0_11.24.2024_debug"})
public final class SelectedFolderAdapter extends com.namseox.st040_mecut.view.base.AbsBaseAdapter<java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel>, com.namseox.st040_mecut.databinding.ItemSelectFolderBinding> {
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onCLick;
    
    public SelectedFolderAdapter() {
        super(0, null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnCLick() {
        return null;
    }
    
    public final void setOnCLick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @java.lang.Override
    public void bind(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.databinding.ItemSelectFolderBinding binding, int position, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel> data) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J8\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016J8\u0010\n\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/namseox/st040_mecut/ui/newproject/SelectedFolderAdapter$SelectedFolderDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Ljava/util/ArrayList;", "Lcom/namseox/st040_mecut/data/model/VideoModel;", "Lkotlin/collections/ArrayList;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "st040_mecut1.0.0_11.24.2024_debug"})
    public static final class SelectedFolderDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel>> {
        
        public SelectedFolderDiffUtil() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel> oldItem, @org.jetbrains.annotations.NotNull
        java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel> newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel> oldItem, @org.jetbrains.annotations.NotNull
        java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel> newItem) {
            return false;
        }
    }
}