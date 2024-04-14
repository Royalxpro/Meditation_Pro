// Generated by view binder compiler. Do not edit!
package com.busyduniadevs.meditation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.busyduniadevs.meditation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText Email;

  @NonNull
  public final EditText Password;

  @NonNull
  public final TextView Regn;

  @NonNull
  public final TextView forgetpasswordbtnlgn;

  @NonNull
  public final Button logindbtn;

  @NonNull
  public final LinearLayout passwordbox;

  @NonNull
  public final LinearLayout signinandgooglebox;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final LinearLayout usernamebox;

  private ActivityLoginBinding(@NonNull LinearLayout rootView, @NonNull EditText Email,
      @NonNull EditText Password, @NonNull TextView Regn, @NonNull TextView forgetpasswordbtnlgn,
      @NonNull Button logindbtn, @NonNull LinearLayout passwordbox,
      @NonNull LinearLayout signinandgooglebox, @NonNull TextView textView,
      @NonNull TextView textView2, @NonNull LinearLayout usernamebox) {
    this.rootView = rootView;
    this.Email = Email;
    this.Password = Password;
    this.Regn = Regn;
    this.forgetpasswordbtnlgn = forgetpasswordbtnlgn;
    this.logindbtn = logindbtn;
    this.passwordbox = passwordbox;
    this.signinandgooglebox = signinandgooglebox;
    this.textView = textView;
    this.textView2 = textView2;
    this.usernamebox = usernamebox;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Email;
      EditText Email = ViewBindings.findChildViewById(rootView, id);
      if (Email == null) {
        break missingId;
      }

      id = R.id.Password;
      EditText Password = ViewBindings.findChildViewById(rootView, id);
      if (Password == null) {
        break missingId;
      }

      id = R.id.Regn;
      TextView Regn = ViewBindings.findChildViewById(rootView, id);
      if (Regn == null) {
        break missingId;
      }

      id = R.id.forgetpasswordbtnlgn;
      TextView forgetpasswordbtnlgn = ViewBindings.findChildViewById(rootView, id);
      if (forgetpasswordbtnlgn == null) {
        break missingId;
      }

      id = R.id.logindbtn;
      Button logindbtn = ViewBindings.findChildViewById(rootView, id);
      if (logindbtn == null) {
        break missingId;
      }

      id = R.id.passwordbox;
      LinearLayout passwordbox = ViewBindings.findChildViewById(rootView, id);
      if (passwordbox == null) {
        break missingId;
      }

      id = R.id.signinandgooglebox;
      LinearLayout signinandgooglebox = ViewBindings.findChildViewById(rootView, id);
      if (signinandgooglebox == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.usernamebox;
      LinearLayout usernamebox = ViewBindings.findChildViewById(rootView, id);
      if (usernamebox == null) {
        break missingId;
      }

      return new ActivityLoginBinding((LinearLayout) rootView, Email, Password, Regn,
          forgetpasswordbtnlgn, logindbtn, passwordbox, signinandgooglebox, textView, textView2,
          usernamebox);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
