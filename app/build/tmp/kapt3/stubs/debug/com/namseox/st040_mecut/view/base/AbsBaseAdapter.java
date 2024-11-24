package com.namseox.st040_mecut.view.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00050\u0004:\u0001!B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\u0002\u0010\nJ%\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0018\u0010\u001e\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 H\u0016R\u001c\u0010\u000b\u001a\u00028\u0001X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/namseox/st040_mecut/view/base/AbsBaseAdapter;", "ModelData", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/recyclerview/widget/ListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "layout", "", "itemCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(ILandroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "getLayout", "()I", "bind", "", "position", "data", "(Landroidx/viewbinding/ViewBinding;ILjava/lang/Object;)V", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "list", "", "ViewHolder", "st040_mecut1.0.0_11.24.2024_debug"})
public abstract class AbsBaseAdapter<ModelData extends java.lang.Object, VB extends androidx.viewbinding.ViewBinding> extends androidx.recyclerview.widget.ListAdapter<ModelData, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final int layout = 0;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<ModelData> itemCallback = null;
    public VB binding;
    
    public AbsBaseAdapter(int layout, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.DiffUtil.ItemCallback<ModelData> itemCallback) {
        super(null);
    }
    
    public final int getLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final VB getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    VB p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public void submitList(@org.jetbrains.annotations.Nullable
    java.util.List<ModelData> list) {
    }
    
    public abstract void bind(@org.jetbrains.annotations.NotNull
    VB binding, int position, ModelData data);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0003R\u0013\u0010\u0002\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0007"}, d2 = {"Lcom/namseox/st040_mecut/view/base/AbsBaseAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "(Lcom/namseox/st040_mecut/view/base/AbsBaseAdapter;Landroidx/viewbinding/ViewBinding;)V", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "Landroidx/viewbinding/ViewBinding;", "st040_mecut1.0.0_11.24.2024_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final VB binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        VB binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final VB getBinding() {
            return null;
        }
    }
}