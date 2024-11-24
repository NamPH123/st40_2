package com.namseox.st040_mecut;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.namseox.st040_mecut.databinding.ActivityCutVideoBindingImpl;
import com.namseox.st040_mecut.databinding.ActivityEditVideoBindingImpl;
import com.namseox.st040_mecut.databinding.ActivityExportingVideoBindingImpl;
import com.namseox.st040_mecut.databinding.ActivityLanguageBindingImpl;
import com.namseox.st040_mecut.databinding.ActivityMainBindingImpl;
import com.namseox.st040_mecut.databinding.ActivityMergeVideoBindingImpl;
import com.namseox.st040_mecut.databinding.ActivityMusicBindingImpl;
import com.namseox.st040_mecut.databinding.ActivityNewProjectBindingImpl;
import com.namseox.st040_mecut.databinding.ActivityPermisionBindingImpl;
import com.namseox.st040_mecut.databinding.ActivityPreviewBindingImpl;
import com.namseox.st040_mecut.databinding.ActivitySaveSuccessfulBindingImpl;
import com.namseox.st040_mecut.databinding.ActivitySettingBindingImpl;
import com.namseox.st040_mecut.databinding.ActivitySplashBindingImpl;
import com.namseox.st040_mecut.databinding.ActivityTutorialBindingImpl;
import com.namseox.st040_mecut.databinding.DialogCreatNameBindingImpl;
import com.namseox.st040_mecut.databinding.DialogDeleteBindingImpl;
import com.namseox.st040_mecut.databinding.DialogRateBindingImpl;
import com.namseox.st040_mecut.databinding.ItemFilterBindingImpl;
import com.namseox.st040_mecut.databinding.ItemFrameBindingImpl;
import com.namseox.st040_mecut.databinding.ItemFuntionEditVideoBindingImpl;
import com.namseox.st040_mecut.databinding.ItemHomeRectangleBindingImpl;
import com.namseox.st040_mecut.databinding.ItemHomeVerticalBindingImpl;
import com.namseox.st040_mecut.databinding.ItemLanguageBindingImpl;
import com.namseox.st040_mecut.databinding.ItemMergeVideoBindingImpl;
import com.namseox.st040_mecut.databinding.ItemMusicBindingImpl;
import com.namseox.st040_mecut.databinding.ItemNewProjectBindingImpl;
import com.namseox.st040_mecut.databinding.ItemSelectBindingImpl;
import com.namseox.st040_mecut.databinding.ItemSelectEditVideoBindingImpl;
import com.namseox.st040_mecut.databinding.ItemSelectFolderBindingImpl;
import com.namseox.st040_mecut.databinding.ItemSettingBindingImpl;
import com.namseox.st040_mecut.databinding.ItemStikerBindingImpl;
import com.namseox.st040_mecut.databinding.ItemTextBindingImpl;
import com.namseox.st040_mecut.databinding.ItemTextFontBindingImpl;
import com.namseox.st040_mecut.databinding.ItemTextFuntionBindingImpl;
import com.namseox.st040_mecut.databinding.ItemTextStyleBindingImpl;
import com.namseox.st040_mecut.databinding.ItemTitleFrameBindingImpl;
import com.namseox.st040_mecut.databinding.ItemTransitionBindingImpl;
import com.namseox.st040_mecut.databinding.ItemTutorialBindingImpl;
import com.namseox.st040_mecut.databinding.LayoutFrameBindingImpl;
import com.namseox.st040_mecut.databinding.LayoutSpeedBindingImpl;
import com.namseox.st040_mecut.databinding.LayoutStikerBindingImpl;
import com.namseox.st040_mecut.databinding.LayoutTextBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCUTVIDEO = 1;

  private static final int LAYOUT_ACTIVITYEDITVIDEO = 2;

  private static final int LAYOUT_ACTIVITYEXPORTINGVIDEO = 3;

  private static final int LAYOUT_ACTIVITYLANGUAGE = 4;

  private static final int LAYOUT_ACTIVITYMAIN = 5;

  private static final int LAYOUT_ACTIVITYMERGEVIDEO = 6;

  private static final int LAYOUT_ACTIVITYMUSIC = 7;

  private static final int LAYOUT_ACTIVITYNEWPROJECT = 8;

  private static final int LAYOUT_ACTIVITYPERMISION = 9;

  private static final int LAYOUT_ACTIVITYPREVIEW = 10;

  private static final int LAYOUT_ACTIVITYSAVESUCCESSFUL = 11;

  private static final int LAYOUT_ACTIVITYSETTING = 12;

  private static final int LAYOUT_ACTIVITYSPLASH = 13;

  private static final int LAYOUT_ACTIVITYTUTORIAL = 14;

  private static final int LAYOUT_DIALOGCREATNAME = 15;

  private static final int LAYOUT_DIALOGDELETE = 16;

  private static final int LAYOUT_DIALOGRATE = 17;

  private static final int LAYOUT_ITEMFILTER = 18;

  private static final int LAYOUT_ITEMFRAME = 19;

  private static final int LAYOUT_ITEMFUNTIONEDITVIDEO = 20;

  private static final int LAYOUT_ITEMHOMERECTANGLE = 21;

  private static final int LAYOUT_ITEMHOMEVERTICAL = 22;

  private static final int LAYOUT_ITEMLANGUAGE = 23;

  private static final int LAYOUT_ITEMMERGEVIDEO = 24;

  private static final int LAYOUT_ITEMMUSIC = 25;

  private static final int LAYOUT_ITEMNEWPROJECT = 26;

  private static final int LAYOUT_ITEMSELECT = 27;

  private static final int LAYOUT_ITEMSELECTEDITVIDEO = 28;

  private static final int LAYOUT_ITEMSELECTFOLDER = 29;

  private static final int LAYOUT_ITEMSETTING = 30;

  private static final int LAYOUT_ITEMSTIKER = 31;

  private static final int LAYOUT_ITEMTEXT = 32;

  private static final int LAYOUT_ITEMTEXTFONT = 33;

  private static final int LAYOUT_ITEMTEXTFUNTION = 34;

  private static final int LAYOUT_ITEMTEXTSTYLE = 35;

  private static final int LAYOUT_ITEMTITLEFRAME = 36;

  private static final int LAYOUT_ITEMTRANSITION = 37;

  private static final int LAYOUT_ITEMTUTORIAL = 38;

  private static final int LAYOUT_LAYOUTFRAME = 39;

  private static final int LAYOUT_LAYOUTSPEED = 40;

  private static final int LAYOUT_LAYOUTSTIKER = 41;

  private static final int LAYOUT_LAYOUTTEXT = 42;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(42);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_cut_video, LAYOUT_ACTIVITYCUTVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_edit_video, LAYOUT_ACTIVITYEDITVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_exporting_video, LAYOUT_ACTIVITYEXPORTINGVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_language, LAYOUT_ACTIVITYLANGUAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_merge_video, LAYOUT_ACTIVITYMERGEVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_music, LAYOUT_ACTIVITYMUSIC);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_new_project, LAYOUT_ACTIVITYNEWPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_permision, LAYOUT_ACTIVITYPERMISION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_preview, LAYOUT_ACTIVITYPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_save_successful, LAYOUT_ACTIVITYSAVESUCCESSFUL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_setting, LAYOUT_ACTIVITYSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.activity_tutorial, LAYOUT_ACTIVITYTUTORIAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.dialog_creat_name, LAYOUT_DIALOGCREATNAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.dialog_delete, LAYOUT_DIALOGDELETE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.dialog_rate, LAYOUT_DIALOGRATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_filter, LAYOUT_ITEMFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_frame, LAYOUT_ITEMFRAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_funtion_edit_video, LAYOUT_ITEMFUNTIONEDITVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_home_rectangle, LAYOUT_ITEMHOMERECTANGLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_home_vertical, LAYOUT_ITEMHOMEVERTICAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_language, LAYOUT_ITEMLANGUAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_merge_video, LAYOUT_ITEMMERGEVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_music, LAYOUT_ITEMMUSIC);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_new_project, LAYOUT_ITEMNEWPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_select, LAYOUT_ITEMSELECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_select_edit_video, LAYOUT_ITEMSELECTEDITVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_select_folder, LAYOUT_ITEMSELECTFOLDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_setting, LAYOUT_ITEMSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_stiker, LAYOUT_ITEMSTIKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_text, LAYOUT_ITEMTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_text_font, LAYOUT_ITEMTEXTFONT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_text_funtion, LAYOUT_ITEMTEXTFUNTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_text_style, LAYOUT_ITEMTEXTSTYLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_title_frame, LAYOUT_ITEMTITLEFRAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_transition, LAYOUT_ITEMTRANSITION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.item_tutorial, LAYOUT_ITEMTUTORIAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.layout_frame, LAYOUT_LAYOUTFRAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.layout_speed, LAYOUT_LAYOUTSPEED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.layout_stiker, LAYOUT_LAYOUTSTIKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.namseox.st040_mecut.R.layout.layout_text, LAYOUT_LAYOUTTEXT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCUTVIDEO: {
          if ("layout/activity_cut_video_0".equals(tag)) {
            return new ActivityCutVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_cut_video is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEDITVIDEO: {
          if ("layout/activity_edit_video_0".equals(tag)) {
            return new ActivityEditVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_edit_video is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEXPORTINGVIDEO: {
          if ("layout/activity_exporting_video_0".equals(tag)) {
            return new ActivityExportingVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_exporting_video is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLANGUAGE: {
          if ("layout/activity_language_0".equals(tag)) {
            return new ActivityLanguageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_language is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMERGEVIDEO: {
          if ("layout/activity_merge_video_0".equals(tag)) {
            return new ActivityMergeVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_merge_video is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMUSIC: {
          if ("layout/activity_music_0".equals(tag)) {
            return new ActivityMusicBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_music is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNEWPROJECT: {
          if ("layout/activity_new_project_0".equals(tag)) {
            return new ActivityNewProjectBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_new_project is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPERMISION: {
          if ("layout/activity_permision_0".equals(tag)) {
            return new ActivityPermisionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_permision is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPREVIEW: {
          if ("layout/activity_preview_0".equals(tag)) {
            return new ActivityPreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSAVESUCCESSFUL: {
          if ("layout/activity_save_successful_0".equals(tag)) {
            return new ActivitySaveSuccessfulBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_save_successful is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSETTING: {
          if ("layout/activity_setting_0".equals(tag)) {
            return new ActivitySettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTUTORIAL: {
          if ("layout/activity_tutorial_0".equals(tag)) {
            return new ActivityTutorialBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tutorial is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGCREATNAME: {
          if ("layout/dialog_creat_name_0".equals(tag)) {
            return new DialogCreatNameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_creat_name is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGDELETE: {
          if ("layout/dialog_delete_0".equals(tag)) {
            return new DialogDeleteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_delete is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGRATE: {
          if ("layout/dialog_rate_0".equals(tag)) {
            return new DialogRateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_rate is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFILTER: {
          if ("layout/item_filter_0".equals(tag)) {
            return new ItemFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_filter is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFRAME: {
          if ("layout/item_frame_0".equals(tag)) {
            return new ItemFrameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_frame is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFUNTIONEDITVIDEO: {
          if ("layout/item_funtion_edit_video_0".equals(tag)) {
            return new ItemFuntionEditVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_funtion_edit_video is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHOMERECTANGLE: {
          if ("layout/item_home_rectangle_0".equals(tag)) {
            return new ItemHomeRectangleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home_rectangle is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHOMEVERTICAL: {
          if ("layout/item_home_vertical_0".equals(tag)) {
            return new ItemHomeVerticalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home_vertical is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLANGUAGE: {
          if ("layout/item_language_0".equals(tag)) {
            return new ItemLanguageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_language is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMERGEVIDEO: {
          if ("layout/item_merge_video_0".equals(tag)) {
            return new ItemMergeVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_merge_video is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMUSIC: {
          if ("layout/item_music_0".equals(tag)) {
            return new ItemMusicBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_music is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNEWPROJECT: {
          if ("layout/item_new_project_0".equals(tag)) {
            return new ItemNewProjectBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_new_project is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSELECT: {
          if ("layout/item_select_0".equals(tag)) {
            return new ItemSelectBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_select is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSELECTEDITVIDEO: {
          if ("layout/item_select_edit_video_0".equals(tag)) {
            return new ItemSelectEditVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_select_edit_video is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSELECTFOLDER: {
          if ("layout/item_select_folder_0".equals(tag)) {
            return new ItemSelectFolderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_select_folder is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSETTING: {
          if ("layout/item_setting_0".equals(tag)) {
            return new ItemSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSTIKER: {
          if ("layout/item_stiker_0".equals(tag)) {
            return new ItemStikerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_stiker is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTEXT: {
          if ("layout/item_text_0".equals(tag)) {
            return new ItemTextBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_text is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTEXTFONT: {
          if ("layout/item_text_font_0".equals(tag)) {
            return new ItemTextFontBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_text_font is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTEXTFUNTION: {
          if ("layout/item_text_funtion_0".equals(tag)) {
            return new ItemTextFuntionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_text_funtion is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTEXTSTYLE: {
          if ("layout/item_text_style_0".equals(tag)) {
            return new ItemTextStyleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_text_style is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTITLEFRAME: {
          if ("layout/item_title_frame_0".equals(tag)) {
            return new ItemTitleFrameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_title_frame is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTRANSITION: {
          if ("layout/item_transition_0".equals(tag)) {
            return new ItemTransitionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_transition is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTUTORIAL: {
          if ("layout/item_tutorial_0".equals(tag)) {
            return new ItemTutorialBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_tutorial is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFRAME: {
          if ("layout/layout_frame_0".equals(tag)) {
            return new LayoutFrameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_frame is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSPEED: {
          if ("layout/layout_speed_0".equals(tag)) {
            return new LayoutSpeedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_speed is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSTIKER: {
          if ("layout/layout_stiker_0".equals(tag)) {
            return new LayoutStikerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_stiker is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTTEXT: {
          if ("layout/layout_text_0".equals(tag)) {
            return new LayoutTextBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_text is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "languageModel");
      sKeys.put(2, "mTutorialModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(42);

    static {
      sKeys.put("layout/activity_cut_video_0", com.namseox.st040_mecut.R.layout.activity_cut_video);
      sKeys.put("layout/activity_edit_video_0", com.namseox.st040_mecut.R.layout.activity_edit_video);
      sKeys.put("layout/activity_exporting_video_0", com.namseox.st040_mecut.R.layout.activity_exporting_video);
      sKeys.put("layout/activity_language_0", com.namseox.st040_mecut.R.layout.activity_language);
      sKeys.put("layout/activity_main_0", com.namseox.st040_mecut.R.layout.activity_main);
      sKeys.put("layout/activity_merge_video_0", com.namseox.st040_mecut.R.layout.activity_merge_video);
      sKeys.put("layout/activity_music_0", com.namseox.st040_mecut.R.layout.activity_music);
      sKeys.put("layout/activity_new_project_0", com.namseox.st040_mecut.R.layout.activity_new_project);
      sKeys.put("layout/activity_permision_0", com.namseox.st040_mecut.R.layout.activity_permision);
      sKeys.put("layout/activity_preview_0", com.namseox.st040_mecut.R.layout.activity_preview);
      sKeys.put("layout/activity_save_successful_0", com.namseox.st040_mecut.R.layout.activity_save_successful);
      sKeys.put("layout/activity_setting_0", com.namseox.st040_mecut.R.layout.activity_setting);
      sKeys.put("layout/activity_splash_0", com.namseox.st040_mecut.R.layout.activity_splash);
      sKeys.put("layout/activity_tutorial_0", com.namseox.st040_mecut.R.layout.activity_tutorial);
      sKeys.put("layout/dialog_creat_name_0", com.namseox.st040_mecut.R.layout.dialog_creat_name);
      sKeys.put("layout/dialog_delete_0", com.namseox.st040_mecut.R.layout.dialog_delete);
      sKeys.put("layout/dialog_rate_0", com.namseox.st040_mecut.R.layout.dialog_rate);
      sKeys.put("layout/item_filter_0", com.namseox.st040_mecut.R.layout.item_filter);
      sKeys.put("layout/item_frame_0", com.namseox.st040_mecut.R.layout.item_frame);
      sKeys.put("layout/item_funtion_edit_video_0", com.namseox.st040_mecut.R.layout.item_funtion_edit_video);
      sKeys.put("layout/item_home_rectangle_0", com.namseox.st040_mecut.R.layout.item_home_rectangle);
      sKeys.put("layout/item_home_vertical_0", com.namseox.st040_mecut.R.layout.item_home_vertical);
      sKeys.put("layout/item_language_0", com.namseox.st040_mecut.R.layout.item_language);
      sKeys.put("layout/item_merge_video_0", com.namseox.st040_mecut.R.layout.item_merge_video);
      sKeys.put("layout/item_music_0", com.namseox.st040_mecut.R.layout.item_music);
      sKeys.put("layout/item_new_project_0", com.namseox.st040_mecut.R.layout.item_new_project);
      sKeys.put("layout/item_select_0", com.namseox.st040_mecut.R.layout.item_select);
      sKeys.put("layout/item_select_edit_video_0", com.namseox.st040_mecut.R.layout.item_select_edit_video);
      sKeys.put("layout/item_select_folder_0", com.namseox.st040_mecut.R.layout.item_select_folder);
      sKeys.put("layout/item_setting_0", com.namseox.st040_mecut.R.layout.item_setting);
      sKeys.put("layout/item_stiker_0", com.namseox.st040_mecut.R.layout.item_stiker);
      sKeys.put("layout/item_text_0", com.namseox.st040_mecut.R.layout.item_text);
      sKeys.put("layout/item_text_font_0", com.namseox.st040_mecut.R.layout.item_text_font);
      sKeys.put("layout/item_text_funtion_0", com.namseox.st040_mecut.R.layout.item_text_funtion);
      sKeys.put("layout/item_text_style_0", com.namseox.st040_mecut.R.layout.item_text_style);
      sKeys.put("layout/item_title_frame_0", com.namseox.st040_mecut.R.layout.item_title_frame);
      sKeys.put("layout/item_transition_0", com.namseox.st040_mecut.R.layout.item_transition);
      sKeys.put("layout/item_tutorial_0", com.namseox.st040_mecut.R.layout.item_tutorial);
      sKeys.put("layout/layout_frame_0", com.namseox.st040_mecut.R.layout.layout_frame);
      sKeys.put("layout/layout_speed_0", com.namseox.st040_mecut.R.layout.layout_speed);
      sKeys.put("layout/layout_stiker_0", com.namseox.st040_mecut.R.layout.layout_stiker);
      sKeys.put("layout/layout_text_0", com.namseox.st040_mecut.R.layout.layout_text);
    }
  }
}
