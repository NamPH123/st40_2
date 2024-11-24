package com.namseox.st040_mecut.databinding;
import com.namseox.st040_mecut.R;
import com.namseox.st040_mecut.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutSpeedBindingImpl extends LayoutSpeedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ctv, 1);
        sViewsWithIds.put(R.id.constraintLayout, 2);
        sViewsWithIds.put(R.id.ll, 3);
        sViewsWithIds.put(R.id.timeLineView1, 4);
        sViewsWithIds.put(R.id.timeLineView2, 5);
        sViewsWithIds.put(R.id.timeLineView3, 6);
        sViewsWithIds.put(R.id.timeLineView4, 7);
        sViewsWithIds.put(R.id.timeLineView5, 8);
        sViewsWithIds.put(R.id.timeLineView6, 9);
        sViewsWithIds.put(R.id.timeLineView7, 10);
        sViewsWithIds.put(R.id.timeLineView8, 11);
        sViewsWithIds.put(R.id.timeLineView9, 12);
        sViewsWithIds.put(R.id.timeLineView10, 13);
        sViewsWithIds.put(R.id.speed, 14);
        sViewsWithIds.put(R.id.sb, 15);
        sViewsWithIds.put(R.id.tv1x, 16);
        sViewsWithIds.put(R.id.tv1_5x, 17);
        sViewsWithIds.put(R.id.tv2x, 18);
        sViewsWithIds.put(R.id.tv2_5x, 19);
        sViewsWithIds.put(R.id.tv3x, 20);
        sViewsWithIds.put(R.id.rcv, 21);
        sViewsWithIds.put(R.id.rcvTransition, 22);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutSpeedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private LayoutSpeedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (com.namseox.st040_mecut.view.customview.CustomHorizontalScrollView) bindings[1]
            , (android.widget.LinearLayout) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[21]
            , (androidx.recyclerview.widget.RecyclerView) bindings[22]
            , (androidx.appcompat.widget.AppCompatSeekBar) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[4]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[13]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[5]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[6]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[7]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[8]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[9]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[10]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[11]
            , (com.namseox.st040_mecut.view.customview.OptiTimeLineView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[19]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
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