package com.namseox.st040_mecut.view.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\b\u00028\u00002\b\u0010\u0007\u001a\u0004\b\u00028\u0000H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ$\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\b\u00028\u00002\b\u0010\u0007\u001a\u0004\b\u00028\u0000H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b9\u00a8\u0006\f"}, d2 = {"Lcom/namseox/st040_mecut/view/base/AbsBaseDiffCallBack;", "MD", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areItemsTheSame", "contentsTheSame", "itemsTheSame", "st040_mecut1.0.0_11.24.2024_debug"})
public abstract class AbsBaseDiffCallBack<MD extends java.lang.Object> extends androidx.recyclerview.widget.DiffUtil.ItemCallback<MD> {
    
    public AbsBaseDiffCallBack() {
        super();
    }
    
    @java.lang.Override
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
    MD oldItem, @org.jetbrains.annotations.NotNull
    MD newItem) {
        return false;
    }
    
    @java.lang.Override
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
    MD oldItem, @org.jetbrains.annotations.NotNull
    MD newItem) {
        return false;
    }
    
    public abstract boolean itemsTheSame(MD oldItem, MD newItem);
    
    public abstract boolean contentsTheSame(MD oldItem, MD newItem);
}