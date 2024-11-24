// Generated by data binding compiler. Do not edit!
package com.namseox.st040_mecut.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.namseox.st040_mecut.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemTextBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imv;

  protected ItemTextBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imv = imv;
  }

  @NonNull
  public static ItemTextBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_text, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemTextBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemTextBinding>inflateInternal(inflater, R.layout.item_text, root, attachToRoot, component);
  }

  @NonNull
  public static ItemTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_text, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemTextBinding>inflateInternal(inflater, R.layout.item_text, null, false, component);
  }

  public static ItemTextBinding bind(@NonNull View view) {
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
  public static ItemTextBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemTextBinding)bind(component, view, R.layout.item_text);
  }
}