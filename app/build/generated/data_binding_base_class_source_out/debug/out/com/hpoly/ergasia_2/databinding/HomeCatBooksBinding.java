// Generated by view binder compiler. Do not edit!
package com.hpoly.ergasia_2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hpoly.ergasia_2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomeCatBooksBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView catHomeName;

  @NonNull
  public final ImageView homeCatImg;

  private HomeCatBooksBinding(@NonNull CardView rootView, @NonNull TextView catHomeName,
      @NonNull ImageView homeCatImg) {
    this.rootView = rootView;
    this.catHomeName = catHomeName;
    this.homeCatImg = homeCatImg;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeCatBooksBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeCatBooksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_cat_books, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeCatBooksBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cat_home_name;
      TextView catHomeName = ViewBindings.findChildViewById(rootView, id);
      if (catHomeName == null) {
        break missingId;
      }

      id = R.id.home_cat_img;
      ImageView homeCatImg = ViewBindings.findChildViewById(rootView, id);
      if (homeCatImg == null) {
        break missingId;
      }

      return new HomeCatBooksBinding((CardView) rootView, catHomeName, homeCatImg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
