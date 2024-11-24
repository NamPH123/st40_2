package com.namseox.st040_mecut.databinding;
import com.namseox.st040_mecut.R;
import com.namseox.st040_mecut.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditVideoBindingImpl extends ActivityEditVideoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(58);
        sIncludes.setIncludes(1, 
            new String[] {"layout_speed"},
            new int[] {5},
            new int[] {com.namseox.st040_mecut.R.layout.layout_speed});
        sIncludes.setIncludes(2, 
            new String[] {"layout_stiker"},
            new int[] {6},
            new int[] {com.namseox.st040_mecut.R.layout.layout_stiker});
        sIncludes.setIncludes(3, 
            new String[] {"layout_text"},
            new int[] {7},
            new int[] {com.namseox.st040_mecut.R.layout.layout_text});
        sIncludes.setIncludes(4, 
            new String[] {"layout_frame"},
            new int[] {8},
            new int[] {com.namseox.st040_mecut.R.layout.layout_frame});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvEdit, 9);
        sViewsWithIds.put(R.id.ctl, 10);
        sViewsWithIds.put(R.id.pv10, 11);
        sViewsWithIds.put(R.id.imv10, 12);
        sViewsWithIds.put(R.id.pv9, 13);
        sViewsWithIds.put(R.id.imv9, 14);
        sViewsWithIds.put(R.id.pv8, 15);
        sViewsWithIds.put(R.id.imv8, 16);
        sViewsWithIds.put(R.id.pv7, 17);
        sViewsWithIds.put(R.id.imv7, 18);
        sViewsWithIds.put(R.id.pv6, 19);
        sViewsWithIds.put(R.id.imv6, 20);
        sViewsWithIds.put(R.id.pv5, 21);
        sViewsWithIds.put(R.id.imv5, 22);
        sViewsWithIds.put(R.id.pv4, 23);
        sViewsWithIds.put(R.id.imv4, 24);
        sViewsWithIds.put(R.id.pv3, 25);
        sViewsWithIds.put(R.id.imv3, 26);
        sViewsWithIds.put(R.id.pv2, 27);
        sViewsWithIds.put(R.id.imv2, 28);
        sViewsWithIds.put(R.id.pv1, 29);
        sViewsWithIds.put(R.id.imv1, 30);
        sViewsWithIds.put(R.id.imvBack, 31);
        sViewsWithIds.put(R.id.appCompatTextView7, 32);
        sViewsWithIds.put(R.id.imvSave, 33);
        sViewsWithIds.put(R.id.rcv, 34);
        sViewsWithIds.put(R.id.ctv, 35);
        sViewsWithIds.put(R.id.constraintLayout, 36);
        sViewsWithIds.put(R.id.llMute, 37);
        sViewsWithIds.put(R.id.cv, 38);
        sViewsWithIds.put(R.id.timeLineView1, 39);
        sViewsWithIds.put(R.id.timeLineView2, 40);
        sViewsWithIds.put(R.id.timeLineView3, 41);
        sViewsWithIds.put(R.id.timeLineView4, 42);
        sViewsWithIds.put(R.id.timeLineView5, 43);
        sViewsWithIds.put(R.id.timeLineView6, 44);
        sViewsWithIds.put(R.id.timeLineView7, 45);
        sViewsWithIds.put(R.id.timeLineView8, 46);
        sViewsWithIds.put(R.id.timeLineView9, 47);
        sViewsWithIds.put(R.id.timeLineView10, 48);
        sViewsWithIds.put(R.id.tvMusic, 49);
        sViewsWithIds.put(R.id.imvVisualizer, 50);
        sViewsWithIds.put(R.id.animationView, 51);
        sViewsWithIds.put(R.id.tvZoom, 52);
        sViewsWithIds.put(R.id.imvPlay, 53);
        sViewsWithIds.put(R.id.tvDuration, 54);
        sViewsWithIds.put(R.id.tvTime, 55);
        sViewsWithIds.put(R.id.imvCover, 56);
        sViewsWithIds.put(R.id.pb, 57);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.namseox.st040_mecut.databinding.LayoutSpeedBinding mboundView1;
    @Nullable
    private final com.namseox.st040_mecut.databinding.LayoutStikerBinding mboundView2;
    @Nullable
    private final com.namseox.st040_mecut.databinding.LayoutTextBinding mboundView3;
    @Nullable
    private final com.namseox.st040_mecut.databinding.LayoutFrameBinding mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEditVideoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 58, sIncludes, sViewsWithIds));
    }
    private ActivityEditVideoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.airbnb.lottie.LottieAnimationView) bindings[51]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[32]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[36]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (com.namseox.st040_mecut.view.customview.CustomHorizontalScrollView) bindings[35]
            , (android.widget.LinearLayout) bindings[38]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[30]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[28]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[26]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[24]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[22]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[31]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[56]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[53]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[33]
            , (com.namseox.st040_mecut.view.customview.HomePlayerVisualizerView) bindings[50]
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.FrameLayout) bindings[1]
            , (android.widget.FrameLayout) bindings[2]
            , (android.widget.FrameLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.ProgressBar) bindings[57]
            , (com.namseox.st040_mecut.view.customview.customimage.StickerView) bindings[29]
            , (com.namseox.st040_mecut.view.customview.customimage.StickerView) bindings[11]
            , (com.namseox.st040_mecut.view.customview.customimage.StickerView) bindings[27]
            , (com.namseox.st040_mecut.view.customview.customimage.StickerView) bindings[25]
            , (com.namseox.st040_mecut.view.customview.customimage.StickerView) bindings[23]
            , (com.namseox.st040_mecut.view.customview.customimage.StickerView) bindings[21]
            , (com.namseox.st040_mecut.view.customview.customimage.StickerView) bindings[19]
            , (com.namseox.st040_mecut.view.customview.customimage.StickerView) bindings[17]
            , (com.namseox.st040_mecut.view.customview.customimage.StickerView) bindings[15]
            , (com.namseox.st040_mecut.view.customview.customimage.StickerView) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[34]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[39]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[48]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[40]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[41]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[42]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[43]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[44]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[45]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[46]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[47]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[54]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[49]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[55]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[52]
            );
        this.layoutFrame.setTag(null);
        this.layoutSpeed.setTag(null);
        this.layoutStiker.setTag(null);
        this.layoutText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.namseox.st040_mecut.databinding.LayoutSpeedBinding) bindings[5];
        setContainedBinding(this.mboundView1);
        this.mboundView2 = (com.namseox.st040_mecut.databinding.LayoutStikerBinding) bindings[6];
        setContainedBinding(this.mboundView2);
        this.mboundView3 = (com.namseox.st040_mecut.databinding.LayoutTextBinding) bindings[7];
        setContainedBinding(this.mboundView3);
        this.mboundView4 = (com.namseox.st040_mecut.databinding.LayoutFrameBinding) bindings[8];
        setContainedBinding(this.mboundView4);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        mboundView1.invalidateAll();
        mboundView2.invalidateAll();
        mboundView3.invalidateAll();
        mboundView4.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView1.hasPendingBindings()) {
            return true;
        }
        if (mboundView2.hasPendingBindings()) {
            return true;
        }
        if (mboundView3.hasPendingBindings()) {
            return true;
        }
        if (mboundView4.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView1.setLifecycleOwner(lifecycleOwner);
        mboundView2.setLifecycleOwner(lifecycleOwner);
        mboundView3.setLifecycleOwner(lifecycleOwner);
        mboundView4.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        executeBindingsOn(mboundView1);
        executeBindingsOn(mboundView2);
        executeBindingsOn(mboundView3);
        executeBindingsOn(mboundView4);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}