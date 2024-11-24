// Generated by Dagger (https://dagger.dev).
package com.namseox.st040_mecut.ui.splash;

import com.namseox.st040_mecut.utils.SharedPreferenceUtils;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SplashActivity_MembersInjector implements MembersInjector<SplashActivity> {
  private final Provider<SharedPreferenceUtils> sharedPreferenceUtilsProvider;

  public SplashActivity_MembersInjector(
      Provider<SharedPreferenceUtils> sharedPreferenceUtilsProvider) {
    this.sharedPreferenceUtilsProvider = sharedPreferenceUtilsProvider;
  }

  public static MembersInjector<SplashActivity> create(
      Provider<SharedPreferenceUtils> sharedPreferenceUtilsProvider) {
    return new SplashActivity_MembersInjector(sharedPreferenceUtilsProvider);
  }

  @Override
  public void injectMembers(SplashActivity instance) {
    injectSharedPreferenceUtils(instance, sharedPreferenceUtilsProvider.get());
  }

  @InjectedFieldSignature("com.namseox.st040_mecut.ui.splash.SplashActivity.sharedPreferenceUtils")
  public static void injectSharedPreferenceUtils(SplashActivity instance,
      SharedPreferenceUtils sharedPreferenceUtils) {
    instance.sharedPreferenceUtils = sharedPreferenceUtils;
  }
}
