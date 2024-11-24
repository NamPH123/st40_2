// Generated by Dagger (https://dagger.dev).
package com.namseox.st040_mecut.ui.permission;

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
public final class PermissionActivity_MembersInjector implements MembersInjector<PermissionActivity> {
  private final Provider<SharedPreferenceUtils> sharedPreferenceUtilsProvider;

  public PermissionActivity_MembersInjector(
      Provider<SharedPreferenceUtils> sharedPreferenceUtilsProvider) {
    this.sharedPreferenceUtilsProvider = sharedPreferenceUtilsProvider;
  }

  public static MembersInjector<PermissionActivity> create(
      Provider<SharedPreferenceUtils> sharedPreferenceUtilsProvider) {
    return new PermissionActivity_MembersInjector(sharedPreferenceUtilsProvider);
  }

  @Override
  public void injectMembers(PermissionActivity instance) {
    injectSharedPreferenceUtils(instance, sharedPreferenceUtilsProvider.get());
  }

  @InjectedFieldSignature("com.namseox.st040_mecut.ui.permission.PermissionActivity.sharedPreferenceUtils")
  public static void injectSharedPreferenceUtils(PermissionActivity instance,
      SharedPreferenceUtils sharedPreferenceUtils) {
    instance.sharedPreferenceUtils = sharedPreferenceUtils;
  }
}