package com.busyduniadevs.meditation.authentication;



import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.busyduniadevs.meditation.MainActivity;
import com.busyduniadevs.meditation.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {
    //-------------------------------------------------------------------------------------------------
    //Binding Names
    EditText mFullName,mEmail,mPassword,mPhone,mrefercode;
    LinearLayout mtermcbox;
    TextView mLoginbtn,mtermc,mpprivacypolicy,mcreateaccounttext,minfotext;
    ProgressBar progressBar;
    Button mRegister;
    CheckBox mcheckbox;


    //Code Usage
    public  static  long points;
    long pointss  = 1000;
    String user;
    public static final String TAG = "TAG";


    //Firebase
    FirebaseFirestore fstore;
    String userID;
    FirebaseAuth fAuth;
    DatabaseReference databaseReference;
//-------------------------------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Id Calling
        mFullName = findViewById(R.id.FullName);
        mEmail = findViewById(R.id.Email);
        mPassword = findViewById(R.id.Password);
        mPhone = findViewById(R.id.Phone);
        mRegister = findViewById(R.id.Register);
       // mLoginbtn = findViewById(R.id.Loginbtn);
        progressBar = findViewById(R.id.progressBar);
        mcheckbox = findViewById(R.id.checkbox);
        mtermc = findViewById(R.id.termsandcondition);
       // mrefercode = findViewById(R.id.refercode);
        mpprivacypolicy = findViewById(R.id.pprivacypolicy);
        mtermcbox = findViewById(R.id.termcbox);


//-------------------------------------------------------------------------------------------------

        //Firebase Instance
        fAuth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference("user");


        //Auto Divert
        if (fAuth.getCurrentUser()!=null){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }

        //All Click Listeners
      /*  mLoginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Login.class));
            }
        });*/

        mtermc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getApplicationContext(),Privacypolicies.class));
            }
        });

        mpprivacypolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getApplicationContext(),TermsandConditions.class));
            }
        });

//-------------------------------------------------------------------------------------------------

        //X-FLOW TECH BY ROYALX CORP

        startSlideFadeInAnimation(mFullName);
        startSlideFadeInAnimation2(mEmail);
        startSlideFadeInAnimation(mPassword);
        startSlideFadeInAnimation2(mPhone);
        //startSlideFadeInAnimation(mrefercode);
        startSlideFadeInAnimation3(mRegister);
        startSlideFadeInAnimation5(mtermcbox);
       // startSlideFadeInAnimation7(mLoginbtn);

//-------------------------------------------------------------------------------------------------



        //Register Logics & Entire Code Include FCB TECH
        mcheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {


                    mRegister.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {




                            final String Email = mEmail.getText().toString().trim();
                            String Password = mPassword.getText().toString().trim();
                            final String FullName = mFullName.getText().toString();
                            final String Phone = mPhone.getText().toString();
//                            String useridtemp = mrefercode.getText().toString();


                          //  String userid = useridtemp.replaceAll("\\s+", "");


                            if (TextUtils.isEmpty(Email)) {
                                mEmail.setError("Email is Required");
                                return;
                            }
                            if (TextUtils.isEmpty(Password)) {
                                mPassword.setError("Password is Required");
                                return;
                            }

                            if (Password.length() < 6) {
                                mPassword.setError("Password Must Be Less Then 6 Character");
                            }




                            progressBar.setVisibility(VISIBLE);






                            fAuth.createUserWithEmailAndPassword(Email, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {




                                        FirebaseUser fuser = fAuth.getCurrentUser();
                                        fuser.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                                            @Override
                                            public void onSuccess(Void unused) {
                                                Toast.makeText(getApplicationContext(), "Register Succesful", Toast.LENGTH_SHORT).show();
                                            }
                                        }).addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                Log.d(TAG, "Onfailure: Email Not Sent" + e.getMessage());
                                            }
                                        });


                                        Toast.makeText(getApplicationContext(), "User Created", Toast.LENGTH_SHORT).show();
                                        userID = fAuth.getCurrentUser().getUid();


                                        DocumentReference documentReference = fstore.collection("user").document(userID);
                                        Map<String, Object> user = new HashMap<>();
                                        user.put("name", FullName);
                                        user.put("uid",userID);
                                        user.put("email", Email);
                                        user.put("onlineStatus","online");
                                        user.put("Phone", Phone);
                                        user.put("password", Password);
                                        user.put("typingTo", "noOne");
                                        user.put("image","");
                                        user.put("cover","");
                                        user.put("earningsRecord", 2500);
                                       // user.put("referralid",userid);
                                        //realtime
                                        HashMap<Object, String> hashMap = new HashMap<>();
                                        hashMap.put("name", FullName);
                                        hashMap.put("uid",userID);
                                        hashMap.put("email", Email);
                                        hashMap.put("onlineStatus","online");
                                        hashMap.put("Phone", Phone);
                                        hashMap.put("password", Password);
                                        hashMap.put("typingTo", "noOne");
                                        hashMap.put("image","");
                                        hashMap.put("cover","");
                                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                                        DatabaseReference reference = database.getReference("User");
                                        reference.child(userID).setValue(hashMap);


                                        documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                            @Override
                                            public void onSuccess(Void unused) {



                                            }
                                        }).addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                Log.d(TAG, "onfailure : " + e.toString());
                                            }
                                        });

                                        startActivity(new Intent(getApplicationContext(), MainActivity.class));


                                    } else {
                                        Toast.makeText(Register.this, "Error Please Try Again", Toast.LENGTH_SHORT).show();
                                        progressBar.setVisibility(GONE);
                                    }
                                }
                            });


                        }
                    });

                } else {
                    mRegister.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(Register.this, "AGREE TERMS AND CONDITIONS TO CONTINUE", Toast.LENGTH_SHORT).show();
                        }
                    });


                }
            }
        });


    }




    //-------------------------------------------------------------------------------------------------

    //X-FLOW TECH BY ROYALX CORP

    //X-FLOW TECH BY ROYALX CORP

    private void startSlideFadeInAnimation(EditText editText) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_layout);
        editText.startAnimation(slideFadeInAnimation);
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
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_layout);
        imageView.startAnimation(slideFadeInAnimation);

    }
    private void startSlideFadeInAnimation5(LinearLayout linearLayout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_leftright_layout);
        linearLayout.startAnimation(slideFadeInAnimation);

    }
    private void startSlideFadeInAnimation7(TextView textView) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_layout);
        textView.startAnimation(slideFadeInAnimation);
    }


//-------------------------------------------------------------------------------------------------

//-------------------------------------------------------------------------------------------------

    //Refer Program Code
    public boolean submit(String userid){

        //getting the user id current earnings report


        DocumentReference documentReferenceEarningCheck = fstore.collection("user").document(String.valueOf(userid));
        documentReferenceEarningCheck.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {

                long currentEarning  = value.getLong("earningsRecord");

                updateReward(currentEarning,userid);
            }
        });

        return true;

    }


    public void updateReward(long currentEarning,String userid){




        long referralreward = 1500;

        //updating and giving him credits
        DocumentReference documentReference2 = fstore.collection("user").document(String.valueOf(userid));
        Map<String,Object> edited = new HashMap<>();

        edited.put("earningsRecord",currentEarning + referralreward );
        documentReference2.update(edited);




    }

//-------------------------------------------------------------------------------------------------
}