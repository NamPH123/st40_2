// Generated by data binding compiler. Do not edit!
package com.namseox.st040_mecut.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.namseox.st040_mecut.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityNewProjectBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout btnApply;

  @NonNull
  public final LinearLayout btnClearAll;

  @NonNull
  public final ConstraintLayout ctl;

  @NonNull
  public final AppCompatImageView imvArrow;

  @NonNull
  public final AppCompatImageView imvBack;

  @NonNull
  public final View imvFalse;

  @NonNull
  public final View imvTrue;

  @NonNull
  public final LinearLayout ll1;

  @NonNull
  public final LinearLayout ll2;

  @NonNull
  public final LinearLayout llChooseData;

  @NonNull
  public final LinearLayout llSelectFolder;

  @NonNull
  public final RecyclerView rcvImage;

  @NonNull
  public final RecyclerView rcvSelect;

  @NonNull
  public final RecyclerView rcvSelectFolder;

  @NonNull
  public final RecyclerView rcvVideo;

  @NonNull
  public final AppCompatTextView tvNoVideo;

  @NonNull
  public final AppCompatTextView tvPhotos;

  @NonNull
  public final AppCompatTextView tvSelect;

  @NonNull
  public final AppCompatTextView tvTitle;

  @NonNull
  public final AppCompatTextView tvVideos;

  protected ActivityNewProjectBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout btnApply, LinearLayout btnClearAll, ConstraintLayout ctl,
      AppCompatImageView imvArrow, AppCompatImageView imvBack, View imvFalse, View imvTrue,
      LinearLayout ll1, LinearLayout ll2, LinearLayout llChooseData, LinearLayout llSelectFolder,
      RecyclerView rcvImage, RecyclerView rcvSelect, RecyclerView rcvSelectFolder,
      RecyclerView rcvVideo, AppCompatTextView tvNoVideo, AppCompatTextView tvPhotos,
      AppCompatTextView tvSelect, AppCompatTextView tvTitle, AppCompatTextView tvVideos) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnApply = btnApply;
    this.btnClearAll = btnClearAll;
    this.ctl = ctl;
    this.imvArrow = imvArrow;
    this.imvBack = imvBack;
    this.imvFalse = imvFalse;
    this.imvTrue = imvTrue;
    this.ll1 = ll1;
    this.ll2 = ll2;
    this.llChooseData = llChooseData;
    this.llSelectFolder = llSelectFolder;
    this.rcvImage = rcvImage;
    this.rcvSelect = rcvSelect;
    this.rcvSelectFolder = rcvSelectFolder;
    this.rcvVideo = rcvVideo;
    this.tvNoVideo = tvNoVideo;
    this.tvPhotos = tvPhotos;
    this.tvSelect = tvSelect;
    this.tvTitle = tvTitle;
    this.tvVideos = tvVideos;
  }

  @NonNull
  public static ActivityNewProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_new_project, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNewProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityNewProjectBinding>inflateInternal(inflater, R.layout.activity_new_project, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityNewProjectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_new_project, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNewProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityNewProjectBinding>inflateInternal(inflater, R.layout.activity_new_project, null, false, component);
  }

  public static ActivityNewProjectBinding bind(@NonNull View view) {
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
  public static ActivityNewProjectBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityNewProjectBinding)bind(component, view, R.layout.activity_new_project);
  }
}
