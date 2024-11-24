package com.namseox.st040_mecut.databinding;
import com.namseox.st040_mecut.R;
import com.namseox.st040_mecut.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutTextBindingImpl extends LayoutTextBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rcv, 1);
        sViewsWithIds.put(R.id.rcvFont, 2);
        sViewsWithIds.put(R.id.rcvStiker, 3);
        sViewsWithIds.put(R.id.svTextSetting, 4);
        sViewsWithIds.put(R.id.sbTextSize, 5);
        sViewsWithIds.put(R.id.sbApha, 6);
        sViewsWithIds.put(R.id.sbMargin, 7);
        sViewsWithIds.put(R.id.tvMargin, 8);
        sViewsWithIds.put(R.id.ctlGradient, 9);
        sViewsWithIds.put(R.id.imv, 10);
        sViewsWithIds.put(R.id.ll, 11);
        sViewsWithIds.put(R.id.tv1, 12);
        sViewsWithIds.put(R.id.tv2, 13);
        sViewsWithIds.put(R.id.view1, 14);
        sViewsWithIds.put(R.id.view2, 15);
        sViewsWithIds.put(R.id.colorPickerView, 16);
        sViewsWithIds.put(R.id.hueSlider, 17);
        sViewsWithIds.put(R.id.colorAlphaSlider, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutTextBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private LayoutTextBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (ir.kotlin.kavehcolorpicker.KavehColorAlphaSlider) bindings[18]
            , (ir.kotlin.kavehcolorpicker.KavehColorPicker) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (ir.kotlin.kavehcolorpicker.KavehHueSlider) bindings[17]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.appcompat.widget.AppCompatSeekBar) bindings[6]
            , (androidx.appcompat.widget.AppCompatSeekBar) bindings[7]
            , (androidx.appcompat.widget.AppCompatSeekBar) bindings[5]
            , (android.widget.ScrollView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[15]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
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