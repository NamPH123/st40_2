package com.namseox.st040_mecut.databinding;
import com.namseox.st040_mecut.R;
import com.namseox.st040_mecut.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTutorialBindingImpl extends ItemTutorialBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTutorialBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemTutorialBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.imv.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tv1.setTag(null);
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
        if (BR.mTutorialModel == variableId) {
            setMTutorialModel((com.namseox.st040_mecut.data.model.TutorialModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMTutorialModel(@Nullable com.namseox.st040_mecut.data.model.TutorialModel MTutorialModel) {
        this.mMTutorialModel = MTutorialModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mTutorialModel);
        super.requestRebind();
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
        int mTutorialModelBg = 0;
        java.lang.String mTutorialModelTitle = null;
        com.namseox.st040_mecut.data.model.TutorialModel mTutorialModel = mMTutorialModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (mTutorialModel != null) {
                    // read mTutorialModel.bg
                    mTutorialModelBg = mTutorialModel.getBg();
                    // read mTutorialModel.title
                    mTutorialModelTitle = mTutorialModel.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.namseox.st040_mecut.utils.BindingAdapterKt.setBG(this.imv, mTutorialModelBg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tv1, mTutorialModelTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mTutorialModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}