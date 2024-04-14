package com.busyduniadevs.meditation.starterfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.busyduniadevs.meditation.MainActivity;
import com.busyduniadevs.meditation.R;
import com.busyduniadevs.meditation.authentication.Register;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class WelcomeFirst extends AppCompatActivity {



    //-------------------------------------------------------------------------------------------------


    //Binding Names
    RelativeLayout mloginbtn;
    RelativeLayout mregbutton;
    LinearLayout melustrate, mtextbox;
    //Firebase
    FirebaseFirestore fstore;
    String userID;
    FirebaseAuth fAuth;
//-------------------------------------------------------------------------------------------------


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_welcome_first);
//Firebase Instance
        fAuth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();


        //Auto Divert
        if (fAuth.getCurrentUser()!=null){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }
        // Find the button in the layout
        Button startBtn = findViewById(R.id.Startbtn);

        // Set an OnClickListener for the button
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), WelcomeSecond.class));
            }
        });
    }
}