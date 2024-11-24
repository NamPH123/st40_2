package com.namseox.st040_mecut.databinding;
import com.namseox.st040_mecut.R;
import com.namseox.st040_mecut.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNewProjectBindingImpl extends ActivityNewProjectBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imvBack, 1);
        sViewsWithIds.put(R.id.llChooseData, 2);
        sViewsWithIds.put(R.id.tvTitle, 3);
        sViewsWithIds.put(R.id.imvArrow, 4);
        sViewsWithIds.put(R.id.btnApply, 5);
        sViewsWithIds.put(R.id.ll1, 6);
        sViewsWithIds.put(R.id.tvVideos, 7);
        sViewsWithIds.put(R.id.tvPhotos, 8);
        sViewsWithIds.put(R.id.ll2, 9);
        sViewsWithIds.put(R.id.imvTrue, 10);
        sViewsWithIds.put(R.id.imvFalse, 11);
        sViewsWithIds.put(R.id.rcvVideo, 12);
        sViewsWithIds.put(R.id.rcvImage, 13);
        sViewsWithIds.put(R.id.ctl, 14);
        sViewsWithIds.put(R.id.tvSelect, 15);
        sViewsWithIds.put(R.id.btnClearAll, 16);
        sViewsWithIds.put(R.id.rcvSelect, 17);
        sViewsWithIds.put(R.id.tvNoVideo, 18);
        sViewsWithIds.put(R.id.llSelectFolder, 19);
        sViewsWithIds.put(R.id.rcvSelectFolder, 20);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNewProjectBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ActivityNewProjectBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[10]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[19]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (androidx.recyclerview.widget.RecyclerView) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
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