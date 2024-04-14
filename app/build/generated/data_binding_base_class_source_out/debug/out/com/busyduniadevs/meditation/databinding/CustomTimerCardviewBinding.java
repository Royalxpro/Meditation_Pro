// Generated by view binder compiler. Do not edit!
package com.busyduniadevs.meditation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class CustomTimerCardviewBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView caloriesTextView;

  @NonNull
  public final Button minusBtn;

  @NonNull
  public final Button pauseBtn;

  @NonNull
  public final Button plusBtn;

  @NonNull
  public final Button startBtn;

  @NonNull
  public final Button stopBtn;

  @NonNull
  public final EditText timerEditText;

  private CustomTimerCardviewBinding(@NonNull CardView rootView, @NonNull TextView caloriesTextView,
      @NonNull Button minusBtn, @NonNull Button pauseBtn, @NonNull Button plusBtn,
      @NonNull Button startBtn, @NonNull Button stopBtn, @NonNull EditText timerEditText) {
    this.rootView = rootView;
    this.caloriesTextView = caloriesTextView;
    this.minusBtn = minusBtn;
    this.pauseBtn = pauseBtn;
    this.plusBtn = plusBtn;
    this.startBtn = startBtn;
    this.stopBtn = stopBtn;
    this.timerEditText = timerEditText;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomTimerCardviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomTimerCardviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_timer_cardview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomTimerCardviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.caloriesTextView;
      TextView caloriesTextView = ViewBindings.findChildViewById(rootView, id);
      if (caloriesTextView == null) {
        break missingId;
      }

      id = R.id.minusBtn;
      Button minusBtn = ViewBindings.findChildViewById(rootView, id);
      if (minusBtn == null) {
        break missingId;
      }

      id = R.id.pauseBtn;
      Button pauseBtn = ViewBindings.findChildViewById(rootView, id);
      if (pauseBtn == null) {
        break missingId;
      }

      id = R.id.plusBtn;
      Button plusBtn = ViewBindings.findChildViewById(rootView, id);
      if (plusBtn == null) {
        break missingId;
      }

      id = R.id.startBtn;
      Button startBtn = ViewBindings.findChildViewById(rootView, id);
      if (startBtn == null) {
        break missingId;
      }

      id = R.id.stopBtn;
      Button stopBtn = ViewBindings.findChildViewById(rootView, id);
      if (stopBtn == null) {
        break missingId;
      }

      id = R.id.timerEditText;
      EditText timerEditText = ViewBindings.findChildViewById(rootView, id);
      if (timerEditText == null) {
        break missingId;
      }

      return new CustomTimerCardviewBinding((CardView) rootView, caloriesTextView, minusBtn,
          pauseBtn, plusBtn, startBtn, stopBtn, timerEditText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}