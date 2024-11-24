package com.namseox.st040_mecut.module;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/namseox/st040_mecut/module/ApplicationModeule;", "", "()V", "providerRepository", "Lcom/namseox/st040_mecut/data/repository/VideoRepository;", "context", "Landroid/content/Context;", "providerSharedPreference", "Lcom/namseox/st040_mecut/utils/SharedPreferenceUtils;", "appContext", "st040_mecut1.0.0_11.24.2024_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class ApplicationModeule {
    
    public ApplicationModeule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.utils.SharedPreferenceUtils providerSharedPreference(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context appContext) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.namseox.st040_mecut.data.repository.VideoRepository providerRepository(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}