package com.namseox.st040_mecut.ui.main;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u000203H\u0016J\b\u00105\u001a\u000201H\u0016J\b\u00106\u001a\u000201H\u0002J+\u00107\u001a\u0002012\u0006\u00108\u001a\u0002032\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010<\u001a\u00020=H\u0016\u00a2\u0006\u0002\u0010>J\b\u0010?\u001a\u000201H\u0014J\b\u0010@\u001a\u000201H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001b\u0010*\u001a\u00020+8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-\u00a8\u0006A"}, d2 = {"Lcom/namseox/st040_mecut/ui/main/MainActivity;", "Lcom/namseox/st040_mecut/view/base/AbsBaseActivity;", "Lcom/namseox/st040_mecut/databinding/ActivityMainBinding;", "()V", "adapter", "Lcom/namseox/st040_mecut/ui/main/MainAdapter;", "getAdapter", "()Lcom/namseox/st040_mecut/ui/main/MainAdapter;", "setAdapter", "(Lcom/namseox/st040_mecut/ui/main/MainAdapter;)V", "checkSort", "", "getCheckSort", "()Z", "setCheckSort", "(Z)V", "checkSortGrid", "getCheckSortGrid", "setCheckSortGrid", "checkTickAll", "getCheckTickAll", "setCheckTickAll", "deleteResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "getDeleteResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setDeleteResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "listVideo", "Ljava/util/ArrayList;", "Lcom/namseox/st040_mecut/data/model/VideoModel;", "getListVideo", "()Ljava/util/ArrayList;", "setListVideo", "(Ljava/util/ArrayList;)V", "sharedPreferenceUtils", "Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;", "getSharedPreferenceUtils", "()Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;", "setSharedPreferenceUtils", "(Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;)V", "viewModel", "Lcom/namseox/st040_mecut/ui/main/MainViewModel;", "getViewModel", "()Lcom/namseox/st040_mecut/ui/main/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getData", "", "getFragmentID", "", "getLayoutId", "init", "initView", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStart", "setClick", "st040_mecut1.0.0_11.24.2024_debug"})
public final class MainActivity extends com.namseox.st040_mecut.view.base.AbsBaseActivity<com.namseox.st040_mecut.databinding.ActivityMainBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean checkSortGrid = false;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel> listVideo;
    private boolean checkSort = true;
    private boolean checkTickAll = false;
    @javax.inject.Inject
    public com.namseox.st040_mecut.utils.SharedPreferenceUtils sharedPreferenceUtils;
    public com.namseox.st040_mecut.ui.main.MainAdapter adapter;
    public androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> deleteResultLauncher;
    
    public MainActivity() {
        super(false);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.ui.main.MainViewModel getViewModel() {
        return null;
    }
    
    public final boolean getCheckSortGrid() {
        return false;
    }
    
    public final void setCheckSortGrid(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel> getListVideo() {
        return null;
    }
    
    public final void setListVideo(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.namseox.st040_mecut.data.model.VideoModel> p0) {
    }
    
    public final boolean getCheckSort() {
        return false;
    }
    
    public final void setCheckSort(boolean p0) {
    }
    
    public final boolean getCheckTickAll() {
        return false;
    }
    
    public final void setCheckTickAll(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.utils.SharedPreferenceUtils getSharedPreferenceUtils() {
        return null;
    }
    
    public final void setSharedPreferenceUtils(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.utils.SharedPreferenceUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.ui.main.MainAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.ui.main.MainAdapter p0) {
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
    
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> getDeleteResultLauncher() {
        return null;
    }
    
    public final void setDeleteResultLauncher(@org.jetbrains.annotations.NotNull
    androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> p0) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    private final void getData() {
    }
    
    private final void initView() {
    }
}