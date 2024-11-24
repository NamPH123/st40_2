package com.namseox.st040_mecut.ui.newproject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0004J \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R7\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/namseox/st040_mecut/ui/newproject/NewProjectAdapter;", "Lcom/namseox/st040_mecut/view/base/AbsBaseAdapter;", "Lcom/namseox/st040_mecut/data/model/VideoModel;", "Lcom/namseox/st040_mecut/databinding/ItemNewProjectBinding;", "()V", "onCLick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "pos", "", "getOnCLick", "()Lkotlin/jvm/functions/Function1;", "setOnCLick", "(Lkotlin/jvm/functions/Function1;)V", "bind", "binding", "position", "data", "NewProjectDiff", "st040_mecut1.0.0_11.24.2024_debug"})
public final class NewProjectAdapter extends com.namseox.st040_mecut.view.base.AbsBaseAdapter<com.namseox.st040_mecut.data.model.VideoModel, com.namseox.st040_mecut.databinding.ItemNewProjectBinding> {
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onCLick;
    
    public NewProjectAdapter() {
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
    com.namseox.st040_mecut.databinding.ItemNewProjectBinding binding, int position, @org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.data.model.VideoModel data) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/namseox/st040_mecut/ui/newproject/NewProjectAdapter$NewProjectDiff;", "Lcom/namseox/st040_mecut/view/base/AbsBaseDiffCallBack;", "Lcom/namseox/st040_mecut/data/model/VideoModel;", "()V", "contentsTheSame", "", "oldItem", "newItem", "itemsTheSame", "st040_mecut1.0.0_11.24.2024_debug"})
    public static final class NewProjectDiff extends com.namseox.st040_mecut.view.base.AbsBaseDiffCallBack<com.namseox.st040_mecut.data.model.VideoModel> {
        
        public NewProjectDiff() {
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
}