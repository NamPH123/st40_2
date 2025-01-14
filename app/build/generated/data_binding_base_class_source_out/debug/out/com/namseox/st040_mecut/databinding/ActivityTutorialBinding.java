// Generated by data binding compiler. Do not edit!
package com.namseox.st040_mecut.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.namseox.st040_mecut.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityTutorialBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView btnNext;

  @NonNull
  public final LinearLayout linearDots;

  @NonNull
  public final LinearLayout ll;

  @NonNull
  public final ConstraintLayout relativeLayout;

  @NonNull
  public final ViewPager2 viewPager;

  protected ActivityTutorialBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView btnNext, LinearLayout linearDots, LinearLayout ll,
      ConstraintLayout relativeLayout, ViewPager2 viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnNext = btnNext;
    this.linearDots = linearDots;
    this.ll = ll;
    this.relativeLayout = relativeLayout;
    this.viewPager = viewPager;
  }

  @NonNull
  public static ActivityTutorialBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_tutorial, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTutorialBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityTutorialBinding>inflateInternal(inflater, R.layout.activity_tutorial, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityTutorialBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_tutorial, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTutorialBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityTutorialBinding>inflateInternal(inflater, R.layout.activity_tutorial, null, false, component);
  }

  public static ActivityTutorialBinding bind(@NonNull View view) {
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
  public static ActivityTutorialBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityTutorialBinding)bind(component, view, R.layout.activity_tutorial);
  }
}
