package com.namseox.st040_mecut.ui.tutorial;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0014R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/namseox/st040_mecut/ui/tutorial/TutorialActivity;", "Lcom/namseox/st040_mecut/view/base/AbsBaseActivity;", "Lcom/namseox/st040_mecut/databinding/ActivityTutorialBinding;", "()V", "dots", "", "Landroid/widget/ImageView;", "[Landroid/widget/ImageView;", "listFragment", "", "getListFragment", "()I", "setListFragment", "(I)V", "sharedPreferenceUtils", "Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;", "getSharedPreferenceUtils", "()Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;", "setSharedPreferenceUtils", "(Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;)V", "viewPagerAdapter", "Lcom/namseox/st040_mecut/ui/tutorial/ViewPagerAdapter;", "addBottomDots", "", "currentPage", "bindViewModel", "getFragmentID", "getLayoutId", "init", "onDestroy", "st040_mecut1.0.0_11.24.2024_debug"})
public final class TutorialActivity extends com.namseox.st040_mecut.view.base.AbsBaseActivity<com.namseox.st040_mecut.databinding.ActivityTutorialBinding> {
    @javax.inject.Inject
    public com.namseox.st040_mecut.utils.SharedPreferenceUtils sharedPreferenceUtils;
    private int listFragment = 3;
    @org.jetbrains.annotations.Nullable
    private com.namseox.st040_mecut.ui.tutorial.ViewPagerAdapter viewPagerAdapter;
    private android.widget.ImageView[] dots;
    
    public TutorialActivity() {
        super(false);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.utils.SharedPreferenceUtils getSharedPreferenceUtils() {
        return null;
    }
    
    public final void setSharedPreferenceUtils(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.utils.SharedPreferenceUtils p0) {
    }
    
    public final int getListFragment() {
        return 0;
    }
    
    public final void setListFragment(int p0) {
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
    
    private final void bindViewModel() {
    }
    
    private final void addBottomDots(int currentPage) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}