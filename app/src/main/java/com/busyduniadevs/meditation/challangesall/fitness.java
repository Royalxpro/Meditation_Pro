package com.busyduniadevs.meditation.challangesall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.busyduniadevs.meditation.R;

public class fitness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);

        // Find the CardViews by ID
        Button pose1CardView = findViewById(R.id.Pose1);
        Button pose2CardView = findViewById(R.id.Pose2);
        Button pose3CardView = findViewById(R.id.Pose3);
        Button pose4CardView = findViewById(R.id.Pose4);
        Button pose5CardView = findViewById(R.id.Pose5);
        Button pose6CardView = findViewById(R.id.Pose6);
        Button pose7CardView = findViewById(R.id.Pose7);
        LinearLayout topbarm = findViewById(R.id.topbar);
        LinearLayout yogaallm = findViewById(R.id.allyogasl);

        //X-FLOW TECH BY ROYALX CORP
        startSlideFadeInAnimation(topbarm);
        startSlideFadeInAnimation2(yogaallm);

        ImageView Backbtn = findViewById(R.id.backbtn);
        Backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle click for the back button
                onBackPressed();
            }
        });


        // Add OnClickListener to each CardView
        pose1CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start FinalActivity
                Intent intent = new Intent(fitness.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Squats");
                intent.putExtra("InstructionText", "Stand with feet shoulder-width apart.\n" +
                        "Bend knees and hips, lowering your body down.\n" +
                        "Keep your back straight and chest up.\n" +
                        "Return to the starting position.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.fitness1);

                // Start FinalActivity with the intent
                startActivity(intent);

            }
        });

        pose2CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start FinalActivity
                Intent intent = new Intent(fitness.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Push-Ups");
                intent.putExtra("InstructionText", "Start in a plank position with hands slightly wider than shoulder-width apart.\n" +
                        "Lower your body by bending your elbows while keeping your body straight.\n" +
                        "Push back up to the starting position.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.fitness2);

                // Start FinalActivity with the intent
                startActivity(intent);
            }
        });

        pose3CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start FinalActivity
                Intent intent = new Intent(fitness.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Plank");
                intent.putExtra("InstructionText", "Start in a plank position with your forearms on the ground.\n" +
                        "Keep your body in a straight line from head to heels.\n" +
                        "Hold the position, engaging your core muscles.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.fitness3);

                // Start FinalActivity with the intent
                startActivity(intent);
            }
        });

        pose4CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start FinalActivity
                Intent intent = new Intent(fitness.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Jumping Jacks");
                intent.putExtra("InstructionText", "Stand with feet together and arms at your sides.\n" +
                        "Jump while spreading your legs and raising your arms overhead.\n" +
                        "Jump back to the starting position.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.fitness4);

                // Start FinalActivity with the intent
                startActivity(intent);
            }
        });

        pose5CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create an intent to start FinalActivity
                Intent intent = new Intent(fitness.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Skipping Rope");
                intent.putExtra("InstructionText", "Grasp the jump rope handles at hip level, ensuring a comfortable grip.\n" +
                        "Initiate a smooth circular motion overhead with controlled arm movements.\n" +
                        "Time your jumps to clear the rope as it passes beneath your feet, landing softly.\n" +
                        "Maintain a steady rhythm, combining efficiency with fluid and controlled motions.\n" +
                        "Focus on a controlled breathing pattern to enhance endurance during the workout.\n" +
                        "Enjoy the benefits of an effective cardiovascular exercise with this simple yet versatile skipping rope routine.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.fitness5);

                // Start FinalActivity with the intent
                startActivity(intent);

            }
        });

        pose6CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                // Create an intent to start FinalActivity
                Intent intent = new Intent(fitness.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Cardio");
                intent.putExtra("InstructionText", "start with a warm-up at a comfortable pace, gradually increase intensity to your desired level, maintain good posture and form, engage core muscles, and cool down with a slower pace before ending the session; adjust duration and intensity based on fitness goals and preferences.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.fitness6);

                // Start FinalActivity with the intent
                startActivity(intent);

            }
        });

        pose7CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create an intent to start FinalActivity
                Intent intent = new Intent(fitness.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Running");
                intent.putExtra("InstructionText", "Put on comfortable running shoes, start with a brisk walk to warm up, gradually increase speed to a comfortable running pace, maintain good posture, breathe rhythmically, and cool down with a slower walk to prevent injury.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.poseseven);

                // Start FinalActivity with the intent
                startActivity(intent);




            }
        });










    }

    //X-FLOW TECH BY ROYALX CORP
    private void startSlideFadeInAnimation(LinearLayout layout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_layout);
        layout.startAnimation(slideFadeInAnimation);
    }
    private void startSlideFadeInAnimation2(LinearLayout layout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_leftright_layout);
        layout.startAnimation(slideFadeInAnimation);

    }
}