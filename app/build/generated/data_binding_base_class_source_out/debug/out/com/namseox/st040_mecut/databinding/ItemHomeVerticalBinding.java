// Generated by data binding compiler. Do not edit!
package com.namseox.st040_mecut.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.namseox.st040_mecut.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemHomeVerticalBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imv;

  @NonNull
  public final AppCompatImageView imvTick;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final AppCompatTextView tvDate;

  @NonNull
  public final AppCompatTextView tvName;

  @NonNull
  public final AppCompatTextView tvSize;

  protected ItemHomeVerticalBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imv, AppCompatImageView imvTick, LinearLayout linearLayout,
      AppCompatTextView tvDate, AppCompatTextView tvName, AppCompatTextView tvSize) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imv = imv;
    this.imvTick = imvTick;
    this.linearLayout = linearLayout;
    this.tvDate = tvDate;
    this.tvName = tvName;
    this.tvSize = tvSize;
  }

  @NonNull
  public static ItemHomeVerticalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_home_vertical, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemHomeVerticalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemHomeVerticalBinding>inflateInternal(inflater, R.layout.item_home_vertical, root, attachToRoot, component);
  }

  @NonNull
  public static ItemHomeVerticalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_home_vertical, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemHomeVerticalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemHomeVerticalBinding>inflateInternal(inflater, R.layout.item_home_vertical, null, false, component);
  }

  public static ItemHomeVerticalBinding bind(@NonNull View view) {
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
  public static ItemHomeVerticalBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemHomeVerticalBinding)bind(component, view, R.layout.item_home_vertical);
  }
}