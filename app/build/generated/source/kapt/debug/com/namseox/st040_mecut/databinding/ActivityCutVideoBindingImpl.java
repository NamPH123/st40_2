package com.namseox.st040_mecut.databinding;
import com.namseox.st040_mecut.R;
import com.namseox.st040_mecut.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCutVideoBindingImpl extends ActivityCutVideoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.epVideo, 1);
        sViewsWithIds.put(R.id.imvBack, 2);
        sViewsWithIds.put(R.id.appCompatTextView7, 3);
        sViewsWithIds.put(R.id.imvSave, 4);
        sViewsWithIds.put(R.id.imvPlay, 5);
        sViewsWithIds.put(R.id.const00raintLayout2, 6);
        sViewsWithIds.put(R.id.ll1, 7);
        sViewsWithIds.put(R.id.tvTrim, 8);
        sViewsWithIds.put(R.id.tvCut, 9);
        sViewsWithIds.put(R.id.ll2, 10);
        sViewsWithIds.put(R.id.imvTrue, 11);
        sViewsWithIds.put(R.id.imvFalse, 12);
        sViewsWithIds.put(R.id.ll3, 13);
        sViewsWithIds.put(R.id.tvTime, 14);
        sViewsWithIds.put(R.id.otltrim, 15);
        sViewsWithIds.put(R.id.otlCut, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCutVideoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityCutVideoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.media3.ui.PlayerView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (android.view.View) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (android.view.View) bindings[11]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[13]
            , (com.namseox.st040_mecut.view.customview.customimage.OptiCutVideo) bindings[16]
            , (com.namseox.st040_mecut.view.customview.OptiMergeVideo) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
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
                mDirtyFlags = 0x2L;
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
            case 0 :
                return onChangeOtlCut((androidx.databinding.ViewDataBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOtlCut(androidx.databinding.ViewDataBinding OtlCut, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        flag 0 (0x1L): otlCut
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}