// Generated by view binder compiler. Do not edit!
package com.hpoly.ergasia_2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hpoly.ergasia_2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityViewAllBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ProgressBar progressbarr;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final RecyclerView viewAllRec;

  private ActivityViewAllBinding(@NonNull ConstraintLayout rootView,
      @NonNull ProgressBar progressbarr, @NonNull Toolbar toolbar,
      @NonNull RecyclerView viewAllRec) {
    this.rootView = rootView;
    this.progressbarr = progressbarr;
    this.toolbar = toolbar;
    this.viewAllRec = viewAllRec;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityViewAllBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityViewAllBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_view_all, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityViewAllBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progressbarr;
      ProgressBar progressbarr = ViewBindings.findChildViewById(rootView, id);
      if (progressbarr == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.view_all_rec;
      RecyclerView viewAllRec = ViewBindings.findChildViewById(rootView, id);
      if (viewAllRec == null) {
        break missingId;
      }

      return new ActivityViewAllBinding((ConstraintLayout) rootView, progressbarr, toolbar,
          viewAllRec);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}