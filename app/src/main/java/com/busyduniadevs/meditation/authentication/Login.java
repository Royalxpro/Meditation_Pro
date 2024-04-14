package com.busyduniadevs.meditation.authentication;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.busyduniadevs.meditation.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class Login extends AppCompatActivity {

    //Binding Names
    EditText mEmail, mPassword;
    Button mlogindbtn;
    TextView mRegn, mtextView, mtextView2,mforgetpasswordbtnlgn;
    ProgressBar progressBar;


    //Firebase
    FirebaseFirestore fstore;
    String userID;
    FirebaseAuth fAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        // Id Calling- include XFLOW IDS
        mEmail = findViewById(R.id.Email);
        mPassword = findViewById(R.id.Password);
        mRegn = findViewById(R.id.Regn);
        mlogindbtn = findViewById(R.id.logindbtn);
        mtextView = findViewById(R.id.textView);
        mtextView2 = findViewById(R.id.textView2);
        mforgetpasswordbtnlgn = findViewById(R.id.forgetpasswordbtnlgn);

        //Firebase Instance
        fAuth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();


//-------------------------------------------------------------------------------------------------

        //X-FLOW TECH BY ROYALX CORP

        startSlideFadeInAnimation(mtextView);
        startSlideFadeInAnimation(mtextView2);
        startSlideFadeInAnimation2(mEmail);
        startSlideFadeInAnimation2(mPassword);
        startSlideFadeInAnimation(mforgetpasswordbtnlgn);
        startSlideFadeInAnimation3(mlogindbtn);
        startSlideFadeInAnimation(mRegn);


//-------------------------------------------------------------------------------------------------


        //All Click Listeners
        mRegn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // startActivity(new Intent(getApplicationContext(), Register.class));
            }

        });


        mlogindbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Email = mEmail.getText().toString().trim();
                String Password = mPassword.getText().toString().trim();


                if (TextUtils.isEmpty(Email)) {
                    mEmail.setError("Email is Required");
                    return;
                }

                if (TextUtils.isEmpty(Password)) {
                    mPassword.setError("Password is Required");
                }

                if (Password.length() < 6) {
                    mPassword.setError("Password must be > = 6 character");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);


                fAuth.signInWithEmailAndPassword(Email, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                            //startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        } else {

                            Toast.makeText(getApplicationContext(), "Please Enter Valid Email & Password", Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }


                });


            }

        });


    }

    //X-FLOW TECH BY ROYALX CORP

    private void startSlideFadeInAnimation(TextView textView) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_layout);
        textView.startAnimation(slideFadeInAnimation);
    }
    private void startSlideFadeInAnimation2(EditText editText) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_leftright_layout);
        editText.startAnimation(slideFadeInAnimation);

    }

    private void startSlideFadeInAnimationright(LinearLayout layout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_layout);
        layout.startAnimation(slideFadeInAnimation);

    }

    private void startSlideFadeInAnimation3(Button imageView) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_leftright_layout);
        imageView.startAnimation(slideFadeInAnimation);

    }

    private void startSlideFadeInAnimationright4(LinearLayout layout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_layout);
        layout.startAnimation(slideFadeInAnimation);

    }


//-------------------------------------------------------------------------------------------------
}
