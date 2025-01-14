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
import com.google.android.material.imageview.ShapeableImageView;
import com.namseox.st040_mecut.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemNewProjectBinding extends ViewDataBinding {
  @NonNull
  public final ShapeableImageView imv;

  @NonNull
  public final AppCompatImageView imvTick;

  @NonNull
  public final AppCompatTextView tvTime;

  protected ItemNewProjectBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ShapeableImageView imv, AppCompatImageView imvTick, AppCompatTextView tvTime) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imv = imv;
    this.imvTick = imvTick;
    this.tvTime = tvTime;
  }

  @NonNull
  public static ItemNewProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_new_project, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemNewProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemNewProjectBinding>inflateInternal(inflater, R.layout.item_new_project, root, attachToRoot, component);
  }

  @NonNull
  public static ItemNewProjectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_new_project, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemNewProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemNewProjectBinding>inflateInternal(inflater, R.layout.item_new_project, null, false, component);
  }

  public static ItemNewProjectBinding bind(@NonNull View view) {
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
  public static ItemNewProjectBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemNewProjectBinding)bind(component, view, R.layout.item_new_project);
  }
}
