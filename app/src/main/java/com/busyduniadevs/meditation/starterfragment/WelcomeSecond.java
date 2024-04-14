package com.busyduniadevs.meditation.starterfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.busyduniadevs.meditation.MainActivity;
import com.busyduniadevs.meditation.R;
import com.busyduniadevs.meditation.authentication.Login;
import com.busyduniadevs.meditation.authentication.Register;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class WelcomeSecond extends AppCompatActivity {

    //-------------------------------------------------------------------------------------------------


    //Binding Names
    Button mloginbtn;
    Button mregbutton;
    ImageView melustrate;
    TextView mtextbox;
    //Firebase
    FirebaseFirestore fstore;
    String userID;
    FirebaseAuth fAuth;
//-------------------------------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_welcome_second);



        //Firebase Instance
        fAuth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();


        // Id Calling
        mregbutton = findViewById(R.id.registerwbtn);
        mloginbtn = findViewById(R.id.loginwbtn);
        melustrate = findViewById(R.id.elustrate);
        mtextbox = findViewById(R.id.mtextbox);






        //All Click Listeners
        mregbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Register.class));
            }
        });
        mloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Login.class));
            }
        });
        //X-FLOW TECH BY ROYALX CORP
        startSlideFadeInAnimation(melustrate);
        startSlideFadeInAnimation2(mtextbox);

        //Auto Divert
        if (fAuth.getCurrentUser()!=null){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }
    }






    //X-FLOW TECH BY ROYALX CORP
    private void startSlideFadeInAnimation(ImageView layout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_layout);
        layout.startAnimation(slideFadeInAnimation);
    }
    private void startSlideFadeInAnimation2(TextView layout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_leftright_layout);
        layout.startAnimation(slideFadeInAnimation);

    }
}