// Generated by data binding compiler. Do not edit!
package com.namseox.st040_mecut.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.namseox.st040_mecut.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemFuntionEditVideoBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imv;

  @NonNull
  public final AppCompatTextView tv;

  protected ItemFuntionEditVideoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imv, AppCompatTextView tv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imv = imv;
    this.tv = tv;
  }

  @NonNull
  public static ItemFuntionEditVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_funtion_edit_video, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemFuntionEditVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemFuntionEditVideoBinding>inflateInternal(inflater, R.layout.item_funtion_edit_video, root, attachToRoot, component);
  }

  @NonNull
  public static ItemFuntionEditVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_funtion_edit_video, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemFuntionEditVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemFuntionEditVideoBinding>inflateInternal(inflater, R.layout.item_funtion_edit_video, null, false, component);
  }

  public static ItemFuntionEditVideoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemFuntionEditVideoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemFuntionEditVideoBinding)bind(component, view, R.layout.item_funtion_edit_video);
  }
}
