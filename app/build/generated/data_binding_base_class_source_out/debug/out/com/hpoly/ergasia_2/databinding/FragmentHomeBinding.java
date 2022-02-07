// Generated by view binder compiler. Do not edit!
package com.hpoly.ergasia_2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hpoly.ergasia_2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView exploreRec;

  @NonNull
  public final RecyclerView popRec;

  @NonNull
  public final ProgressBar progressbar;

  @NonNull
  public final RecyclerView recommendedRec;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final EditText searchBox;

  @NonNull
  public final RecyclerView searchRec;

  @NonNull
  public final TextView viewAllExplore;

  @NonNull
  public final TextView viewAllPopular;

  @NonNull
  public final TextView viewAllRecommended;

  private FragmentHomeBinding(@NonNull RelativeLayout rootView, @NonNull RecyclerView exploreRec,
      @NonNull RecyclerView popRec, @NonNull ProgressBar progressbar,
      @NonNull RecyclerView recommendedRec, @NonNull ScrollView scrollView,
      @NonNull EditText searchBox, @NonNull RecyclerView searchRec,
      @NonNull TextView viewAllExplore, @NonNull TextView viewAllPopular,
      @NonNull TextView viewAllRecommended) {
    this.rootView = rootView;
    this.exploreRec = exploreRec;
    this.popRec = popRec;
    this.progressbar = progressbar;
    this.recommendedRec = recommendedRec;
    this.scrollView = scrollView;
    this.searchBox = searchBox;
    this.searchRec = searchRec;
    this.viewAllExplore = viewAllExplore;
    this.viewAllPopular = viewAllPopular;
    this.viewAllRecommended = viewAllRecommended;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.explore_rec;
      RecyclerView exploreRec = ViewBindings.findChildViewById(rootView, id);
      if (exploreRec == null) {
        break missingId;
      }

      id = R.id.pop_rec;
      RecyclerView popRec = ViewBindings.findChildViewById(rootView, id);
      if (popRec == null) {
        break missingId;
      }

      id = R.id.progressbar;
      ProgressBar progressbar = ViewBindings.findChildViewById(rootView, id);
      if (progressbar == null) {
        break missingId;
      }

      id = R.id.recommended_rec;
      RecyclerView recommendedRec = ViewBindings.findChildViewById(rootView, id);
      if (recommendedRec == null) {
        break missingId;
      }

      id = R.id.scroll_view;
      ScrollView scrollView = ViewBindings.findChildViewById(rootView, id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.search_box;
      EditText searchBox = ViewBindings.findChildViewById(rootView, id);
      if (searchBox == null) {
        break missingId;
      }

      id = R.id.search_rec;
      RecyclerView searchRec = ViewBindings.findChildViewById(rootView, id);
      if (searchRec == null) {
        break missingId;
      }

      id = R.id.view_all_explore;
      TextView viewAllExplore = ViewBindings.findChildViewById(rootView, id);
      if (viewAllExplore == null) {
        break missingId;
      }

      id = R.id.view_all_popular;
      TextView viewAllPopular = ViewBindings.findChildViewById(rootView, id);
      if (viewAllPopular == null) {
        break missingId;
      }

      id = R.id.view_all_recommended;
      TextView viewAllRecommended = ViewBindings.findChildViewById(rootView, id);
      if (viewAllRecommended == null) {
        break missingId;
      }

      return new FragmentHomeBinding((RelativeLayout) rootView, exploreRec, popRec, progressbar,
          recommendedRec, scrollView, searchBox, searchRec, viewAllExplore, viewAllPopular,
          viewAllRecommended);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
