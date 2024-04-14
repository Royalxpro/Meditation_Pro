// Generated by view binder compiler. Do not edit!
package com.busyduniadevs.meditation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.busyduniadevs.meditation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityShowNewsContentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView contentTextView;

  @NonNull
  public final TextView headlineTextView;

  @NonNull
  public final CardView text5;

  private ActivityShowNewsContentBinding(@NonNull LinearLayout rootView,
      @NonNull TextView contentTextView, @NonNull TextView headlineTextView,
      @NonNull CardView text5) {
    this.rootView = rootView;
    this.contentTextView = contentTextView;
    this.headlineTextView = headlineTextView;
    this.text5 = text5;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityShowNewsContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityShowNewsContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_show_news_content, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityShowNewsContentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contentTextView;
      TextView contentTextView = ViewBindings.findChildViewById(rootView, id);
      if (contentTextView == null) {
        break missingId;
      }

      id = R.id.headlineTextView;
      TextView headlineTextView = ViewBindings.findChildViewById(rootView, id);
      if (headlineTextView == null) {
        break missingId;
      }

      id = R.id.text5;
      CardView text5 = ViewBindings.findChildViewById(rootView, id);
      if (text5 == null) {
        break missingId;
      }

      return new ActivityShowNewsContentBinding((LinearLayout) rootView, contentTextView,
          headlineTextView, text5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
