package com.namseox.st040_mecut.databinding;
import com.namseox.st040_mecut.R;
import com.namseox.st040_mecut.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMergeVideoBindingImpl extends ActivityMergeVideoBinding  {

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
        sViewsWithIds.put(R.id.ll1, 6);
        sViewsWithIds.put(R.id.const00raintLayout2, 7);
        sViewsWithIds.put(R.id.ctv, 8);
        sViewsWithIds.put(R.id.cv, 9);
        sViewsWithIds.put(R.id.timeLineView1, 10);
        sViewsWithIds.put(R.id.timeLineView2, 11);
        sViewsWithIds.put(R.id.timeLineView3, 12);
        sViewsWithIds.put(R.id.timeLineView4, 13);
        sViewsWithIds.put(R.id.timeLineView5, 14);
        sViewsWithIds.put(R.id.timeLineView6, 15);
        sViewsWithIds.put(R.id.timeLineView7, 16);
        sViewsWithIds.put(R.id.timeLineView8, 17);
        sViewsWithIds.put(R.id.timeLineView9, 18);
        sViewsWithIds.put(R.id.timeLineView10, 19);
        sViewsWithIds.put(R.id.ll2, 20);
        sViewsWithIds.put(R.id.tvTime, 21);
        sViewsWithIds.put(R.id.rcv, 22);
        sViewsWithIds.put(R.id.tvAdjust, 23);
        sViewsWithIds.put(R.id.imvTick, 24);
        sViewsWithIds.put(R.id.otlmv, 25);
        sViewsWithIds.put(R.id.imvCover, 26);
        sViewsWithIds.put(R.id.pb, 27);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMergeVideoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private ActivityMergeVideoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (com.namseox.st040_mecut.view.customview.CustomHorizontalScrollView) bindings[8]
            , (android.widget.LinearLayout) bindings[9]
            , (androidx.media3.ui.PlayerView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[26]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[24]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[20]
            , (com.namseox.st040_mecut.view.customview.OptiMergeVideo) bindings[25]
            , (android.widget.ProgressBar) bindings[27]
            , (androidx.recyclerview.widget.RecyclerView) bindings[22]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[10]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[19]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[11]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[12]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[13]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[14]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[15]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[16]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[17]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[23]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[21]
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