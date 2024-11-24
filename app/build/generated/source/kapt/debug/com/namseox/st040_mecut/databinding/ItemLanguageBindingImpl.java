package com.namseox.st040_mecut.databinding;
import com.namseox.st040_mecut.R;
import com.namseox.st040_mecut.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLanguageBindingImpl extends ItemLanguageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imv_flag, 3);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLanguageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemLanguageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.clLanguage.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvName.setTag(null);
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
        if (BR.languageModel == variableId) {
            setLanguageModel((com.namseox.st040_mecut.data.model.LanguageModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLanguageModel(@Nullable com.namseox.st040_mecut.data.model.LanguageModel LanguageModel) {
        this.mLanguageModel = LanguageModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.languageModel);
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
        boolean languageModelActive = false;
        com.namseox.st040_mecut.data.model.LanguageModel languageModel = mLanguageModel;
        java.lang.String languageModelName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (languageModel != null) {
                    // read languageModel.active
                    languageModelActive = languageModel.getActive();
                    // read languageModel.name
                    languageModelName = languageModel.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.namseox.st040_mecut.utils.BindingAdapterKt.setBGCV(this.clLanguage, languageModel);
            com.namseox.st040_mecut.utils.BindingAdapterKt.setSrcCheckLanguage(this.mboundView2, languageModelActive);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, languageModelName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): languageModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}