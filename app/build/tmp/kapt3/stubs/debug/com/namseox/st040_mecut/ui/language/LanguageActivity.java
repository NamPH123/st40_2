package com.namseox.st040_mecut.ui.language;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lcom/namseox/st040_mecut/ui/language/LanguageActivity;", "Lcom/namseox/st040_mecut/view/base/AbsBaseActivity;", "Lcom/namseox/st040_mecut/databinding/ActivityLanguageBinding;", "()V", "adapter", "Lcom/namseox/st040_mecut/ui/language/LanguageAdapter;", "getAdapter", "()Lcom/namseox/st040_mecut/ui/language/LanguageAdapter;", "setAdapter", "(Lcom/namseox/st040_mecut/ui/language/LanguageAdapter;)V", "codeLang", "", "getCodeLang", "()Ljava/lang/String;", "setCodeLang", "(Ljava/lang/String;)V", "sharedPreferenceUtils", "Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;", "getSharedPreferenceUtils", "()Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;", "setSharedPreferenceUtils", "(Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;)V", "getFragmentID", "", "getLayoutId", "init", "", "onBackPressed", "onResume", "setClick", "setRecycleView", "st040_mecut1.0.0_11.24.2024_debug"})
public final class LanguageActivity extends com.namseox.st040_mecut.view.base.AbsBaseActivity<com.namseox.st040_mecut.databinding.ActivityLanguageBinding> {
    public com.namseox.st040_mecut.ui.language.LanguageAdapter adapter;
    @org.jetbrains.annotations.Nullable
    private java.lang.String codeLang;
    @javax.inject.Inject
    public com.namseox.st040_mecut.utils.SharedPreferenceUtils sharedPreferenceUtils;
    
    public LanguageActivity() {
        super(false);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.ui.language.LanguageAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.ui.language.LanguageAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCodeLang() {
        return null;
    }
    
    public final void setCodeLang(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.utils.SharedPreferenceUtils getSharedPreferenceUtils() {
        return null;
    }
    
    public final void setSharedPreferenceUtils(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.utils.SharedPreferenceUtils p0) {
    }
    
    @java.lang.Override
    public int getFragmentID() {
        return 0;
    }
    
    @java.lang.Override
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override
    public void init() {
    }
    
    private final void setClick() {
    }
    
    private final void setRecycleView() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
}