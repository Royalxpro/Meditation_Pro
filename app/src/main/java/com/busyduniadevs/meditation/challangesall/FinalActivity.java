package com.busyduniadevs.meditation.challangesall;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.busyduniadevs.meditation.R;

import pl.droidsonroids.gif.GifImageView;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        // Retrieve data from the intent
        Intent intent = getIntent();
        String titleText = intent.getStringExtra("TitleText");
        String instructionText = intent.getStringExtra("InstructionText");
        String focusArea1 = intent.getStringExtra("FocusArea1");
        String focusArea2 = intent.getStringExtra("FocusArea2");
        String focusArea3 = intent.getStringExtra("FocusArea3");
        String focusArea4 = intent.getStringExtra("FocusArea4");
        String focusArea5 = intent.getStringExtra("FocusArea5");
        int imageResource = intent.getIntExtra("ImageResource", R.drawable.testyoga);


        // Set data to respective TextViews and ImageView
        TextView titleTextView = findViewById(R.id.Titleex);
        TextView instructionTextView = findViewById(R.id.instructiontext);
        TextView focusArea1TextView = findViewById(R.id.focusarea1);
        TextView focusArea2TextView = findViewById(R.id.focusarea2);
        TextView focusArea3TextView = findViewById(R.id.focusarea3);
        TextView focusArea4TextView = findViewById(R.id.focusarea4);
        TextView focusArea5TextView = findViewById(R.id.focusarea5);
        GifImageView imageView = findViewById(R.id.exercisesvideo);

        ImageView Backbtn = findViewById(R.id.backbtn);
        Backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle click for the back button
                onBackPressed();
            }
        });

        LinearLayout yogaallm = findViewById(R.id.topbar);
        ScrollView topbarm = findViewById(R.id.body);

        //X-FLOW TECH BY ROYALX CORP
        startSlideFadeInAnimation(topbarm);
        startSlideFadeInAnimation2(yogaallm);


        titleTextView.setText(titleText);
        instructionTextView.setText(instructionText);
        // Set data to respective TextViews and handle visibility
        setFocusAreaTextAndVisibility(focusArea1TextView, focusArea1);
        setFocusAreaTextAndVisibility(focusArea2TextView, focusArea2);
        setFocusAreaTextAndVisibility(focusArea3TextView, focusArea3);
        setFocusAreaTextAndVisibility(focusArea4TextView, focusArea4);
        setFocusAreaTextAndVisibility(focusArea5TextView, focusArea5);
        imageView.setImageResource(imageResource);
    }

    // Helper method to set text and visibility for a TextView
    private void setFocusAreaTextAndVisibility(TextView textView, String text) {
        if (text != null && !text.isEmpty()) {
            textView.setText(text);
        } else {
            // If text is blank or null, make the TextView invisible
            textView.setVisibility(View.GONE);
        }
    }
    @Override
    protected void onResume() {
        super.onResume();

        // Set up a callback for onBackPressed
        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                // Handle the back button press
                // If you want to navigate back to the previous activity, call finish()
                finish();
            }
        };

        getOnBackPressedDispatcher().addCallback(this, callback);
    }

    //X-FLOW TECH BY ROYALX CORP
    private void startSlideFadeInAnimation(ScrollView layout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_layout);
        layout.startAnimation(slideFadeInAnimation);
    }
    private void startSlideFadeInAnimation2(LinearLayout layout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_leftright_layout);
        layout.startAnimation(slideFadeInAnimation);

    }
}