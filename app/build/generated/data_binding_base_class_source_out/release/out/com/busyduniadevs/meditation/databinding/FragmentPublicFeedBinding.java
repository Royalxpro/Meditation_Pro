// Generated by view binder compiler. Do not edit!
package com.busyduniadevs.meditation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.busyduniadevs.meditation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPublicFeedBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView backbtnimg;

  @NonNull
  public final ImageView newfeedbtnimg;

  @NonNull
  public final RecyclerView postrecyclerview;

  @NonNull
  public final TextView textView3;

  private FragmentPublicFeedBinding(@NonNull LinearLayout rootView, @NonNull ImageView backbtnimg,
      @NonNull ImageView newfeedbtnimg, @NonNull RecyclerView postrecyclerview,
      @NonNull TextView textView3) {
    this.rootView = rootView;
    this.backbtnimg = backbtnimg;
    this.newfeedbtnimg = newfeedbtnimg;
    this.postrecyclerview = postrecyclerview;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPublicFeedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPublicFeedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_public_feed, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPublicFeedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backbtnimg;
      ImageView backbtnimg = ViewBindings.findChildViewById(rootView, id);
      if (backbtnimg == null) {
        break missingId;
      }

      id = R.id.newfeedbtnimg;
      ImageView newfeedbtnimg = ViewBindings.findChildViewById(rootView, id);
      if (newfeedbtnimg == null) {
        break missingId;
      }

      id = R.id.postrecyclerview;
      RecyclerView postrecyclerview = ViewBindings.findChildViewById(rootView, id);
      if (postrecyclerview == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new FragmentPublicFeedBinding((LinearLayout) rootView, backbtnimg, newfeedbtnimg,
          postrecyclerview, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
