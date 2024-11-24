package com.namseox.st040_mecut.view.customview;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/namseox/st040_mecut/view/customview/CustomHorizontalScrollView;", "Landroid/widget/HorizontalScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isScrollEnabled", "", "()Z", "setScrollEnabled", "(Z)V", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "setScrollingEnabled", "", "enabled", "st040_mecut1.0.0_11.24.2024_debug"})
public final class CustomHorizontalScrollView extends android.widget.HorizontalScrollView {
    private boolean isScrollEnabled = true;
    
    @kotlin.jvm.JvmOverloads
    public CustomHorizontalScrollView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final boolean isScrollEnabled() {
        return false;
    }
    
    public final void setScrollEnabled(boolean p0) {
    }
    
    @java.lang.Override
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable
    android.view.MotionEvent ev) {
        return false;
    }
    
    @java.lang.Override
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.Nullable
    android.view.MotionEvent ev) {
        return false;
    }
    
    public final void setScrollingEnabled(boolean enabled) {
    }
    
    @kotlin.jvm.JvmOverloads
    public CustomHorizontalScrollView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public CustomHorizontalScrollView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
}