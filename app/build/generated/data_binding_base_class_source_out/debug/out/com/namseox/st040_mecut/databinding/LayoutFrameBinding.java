// Generated by data binding compiler. Do not edit!
package com.namseox.st040_mecut.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.namseox.st040_mecut.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutFrameBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rcvFrame;

  @NonNull
  public final RecyclerView rcvTitle;

  protected LayoutFrameBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView rcvFrame, RecyclerView rcvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rcvFrame = rcvFrame;
    this.rcvTitle = rcvTitle;
  }

  @NonNull
  public static LayoutFrameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_frame, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutFrameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutFrameBinding>inflateInternal(inflater, R.layout.layout_frame, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFrameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_frame, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutFrameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutFrameBinding>inflateInternal(inflater, R.layout.layout_frame, null, false, component);
  }

  public static LayoutFrameBinding bind(@NonNull View view) {
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
  public static LayoutFrameBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutFrameBinding)bind(component, view, R.layout.layout_frame);
  }
}
