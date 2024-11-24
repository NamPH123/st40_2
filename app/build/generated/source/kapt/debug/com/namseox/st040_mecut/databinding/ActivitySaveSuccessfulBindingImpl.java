package com.namseox.st040_mecut.databinding;
import com.namseox.st040_mecut.R;
import com.namseox.st040_mecut.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySaveSuccessfulBindingImpl extends ActivitySaveSuccessfulBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imvBack, 1);
        sViewsWithIds.put(R.id.appCompatTextView8, 2);
        sViewsWithIds.put(R.id.appCompatTextView9, 3);
        sViewsWithIds.put(R.id.imv, 4);
        sViewsWithIds.put(R.id.pb, 5);
        sViewsWithIds.put(R.id.llHome, 6);
        sViewsWithIds.put(R.id.llTele, 7);
        sViewsWithIds.put(R.id.tv1, 8);
        sViewsWithIds.put(R.id.llTiktok, 9);
        sViewsWithIds.put(R.id.tv2, 10);
        sViewsWithIds.put(R.id.llWhatsApp, 11);
        sViewsWithIds.put(R.id.tv3, 12);
        sViewsWithIds.put(R.id.llFacebook, 13);
        sViewsWithIds.put(R.id.tv4, 14);
        sViewsWithIds.put(R.id.llMore, 15);
        sViewsWithIds.put(R.id.tv5, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySaveSuccessfulBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivitySaveSuccessfulBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
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