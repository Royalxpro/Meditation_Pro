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

public class Musclegain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musclegain);


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
                Intent intent = new Intent(Musclegain.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Pull-ups");
                intent.putExtra("InstructionText", "Grip:\n" +
                        "\n" +
                        "Stand in front of the pull-up bar and reach up to grip it with your palms facing away from you (overhand grip).\n" +
                        "Place your hands slightly wider than shoulder-width apart.\n" +
                        "Hang:\n" +
                        "\n" +
                        "Hang from the bar with your arms fully extended.\n" +
                        "Engage your core muscles to maintain a straight body position.\n" +
                        "Initiate the Pull:\n" +
                        "\n" +
                        "Pull your shoulder blades down and back to engage your back muscles.\n" +
                        "Start pulling your body up by bending your elbows.\n" +
                        "Focus on leading with your chest and keeping your elbows pointing down.\n" +
                        "Pull-Up Phase:\n" +
                        "\n" +
                        "Continue pulling yourself up until your chin is above the bar.\n" +
                        "Keep your core tight to prevent excessive swinging.\n" +
                        "Top Position:\n" +
                        "\n" +
                        "Once you reach the top, briefly pause and squeeze your back muscles.\n" +
                        "Your elbows should be fully bent, and your chest should be close to the bar.\n" +
                        "Lowering Phase:\n" +
                        "\n" +
                        "Slowly lower yourself down with control, extending your arms fully.\n" +
                        "Resist the temptation to drop quickly; this eccentric phase is essential for muscle development.\n" +
                        "Full Range of Motion:\n" +
                        "\n" +
                        "Ensure that you perform each repetition through a full range of motion, both on the way up and on the way down.\n" +
                        "Breathing:\n" +
                        "\n" +
                        "Exhale as you pull your body up.\n" +
                        "Inhale as you lower your body down.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.muscle1);

                // Start FinalActivity with the intent
                startActivity(intent);

            }
        });

        pose2CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start FinalActivity
                Intent intent = new Intent(Musclegain.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Dumbbell Bicep Curl");
                intent.putExtra("InstructionText", "Stand with a dumbbell in each hand, palms facing forward.\n" +
                        "Keep your elbows close to your torso and curl the weights toward your shoulders.\n" +
                        "Lower the weights back down with control.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.muscle2);

                // Start FinalActivity with the intent
                startActivity(intent);
            }
        });

        pose3CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start FinalActivity
                Intent intent = new Intent(Musclegain.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Clap push-ups");
                intent.putExtra("InstructionText", "1. Starting Position:\n" +
                        "\n" +
                        "Begin in a standard push-up position with your hands placed slightly wider than shoulder-width apart.\n" +
                        "Your body should form a straight line from your head to your heels, with your core engaged.\n" +
                        "2. Downward Phase:\n" +
                        "\n" +
                        "Lower your body toward the ground by bending your elbows.\n" +
                        "Keep your body in a straight line and lower yourself until your chest is just above the floor.\n" +
                        "3. Explosive Phase:\n" +
                        "\n" +
                        "Instead of just pushing back up, explode off the ground with enough force to lift your hands off the floor.\n" +
                        "Perform a powerful push-up, propelling your body upward.\n" +
                        "4. Clap:\n" +
                        "\n" +
                        "While in mid-air, quickly clap your hands together in front of your chest.\n" +
                        "5. Landing:\n" +
                        "\n" +
                        "Land with your hands in the starting position, ready for the next repetition.\n" +
                        "Focus on maintaining good form and immediately transitioning into the next repetition.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.muscle3);

                // Start FinalActivity with the intent
                startActivity(intent);
            }
        });

        pose4CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start FinalActivity
                Intent intent = new Intent(Musclegain.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Barbell Squats");
                intent.putExtra("InstructionText", "Setup:\n" +
                        "\n" +
                        "Position the barbell on a squat rack.\n" +
                        "Adjust the bar to chest height.\n" +
                        "Load weights onto the bar.\n" +
                        "Approach:\n" +
                        "\n" +
                        "Stand facing the bar with feet shoulder-width apart.\n" +
                        "Grip:\n" +
                        "\n" +
                        "Grab the bar with hands slightly wider than shoulder-width.\n" +
                        "Rest the bar on your upper back.\n" +
                        "Squat:\n" +
                        "\n" +
                        "Unrack the bar and step back.\n" +
                        "Feet shoulder-width apart, toes slightly outward.\n" +
                        "Bend hips and knees, keeping back straight.\n" +
                        "Lower until thighs are parallel to the ground.\n" +
                        "Ascend:\n" +
                        "\n" +
                        "Push through heels, engaging quads and glutes.\n" +
                        "Stand back up.\n" +
                        "Repeat:\n" +
                        "\n" +
                        "Perform desired reps.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.muscle4);

                // Start FinalActivity with the intent
                startActivity(intent);
            }
        });

        pose5CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create an intent to start FinalActivity
                Intent intent = new Intent(Musclegain.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Chest Bench Press");
                intent.putExtra("InstructionText", "Adjust the Seat:\n" +
                        "\n" +
                        "Set the seat height to align the handles with your chest.\n" +
                        "Seat Position:\n" +
                        "\n" +
                        "Sit on the machine with your back flat against the pad.\n" +
                        "Grip:\n" +
                        "\n" +
                        "Grab the handles with an overhand grip, palms facing forward.\n" +
                        "Ensure your hands are slightly wider than shoulder-width apart.\n" +
                        "Position:\n" +
                        "\n" +
                        "Plant your feet firmly on the ground.\n" +
                        "Maintain a natural arch in your lower back.\n" +
                        "Press:\n" +
                        "\n" +
                        "Push the handles forward until your arms are fully extended, but avoid locking your elbows.\n" +
                        "Keep your chest up and shoulders back.\n" +
                        "Lower:\n" +
                        "\n" +
                        "Control the handles as you bring them back toward your chest.\n" +
                        "Lower until your elbows form a 90-degree angle.\n" +
                        "Repeat:\n" +
                        "\n" +
                        "Perform the desired number of repetitions.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.muscle5);

                // Start FinalActivity with the intent
                startActivity(intent);

            }
        });

        pose6CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                // Create an intent to start FinalActivity
                Intent intent = new Intent(Musclegain.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Cable Bicep Curl");
                intent.putExtra("InstructionText", "Setup:\n" +
                        "\n" +
                        "Stand facing a cable machine with a cable handle attached to the lower pulley.\n" +
                        "Adjust the weight stack to an appropriate level.\n" +
                        "Grip:\n" +
                        "\n" +
                        "Grab the cable handle with an underhand grip (palms facing up).\n" +
                        "Stand with feet shoulder-width apart.\n" +
                        "Position:\n" +
                        "\n" +
                        "Stand tall with your chest up and shoulders back.\n" +
                        "Keep your elbows close to your torso.\n" +
                        "Curl:\n" +
                        "\n" +
                        "Exhale and curl the handle toward your shoulders by bending your elbows.\n" +
                        "Keep your upper arms stationary.\n" +
                        "Squeeze:\n" +
                        "\n" +
                        "At the top of the movement, squeeze your biceps.\n" +
                        "Ensure a full contraction.\n" +
                        "Lower:\n" +
                        "\n" +
                        "Inhale and slowly lower the handle back to the starting position.\n" +
                        "Repeat:\n" +
                        "\n" +
                        "Perform the desired number of repetitions.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.muscle6);

                // Start FinalActivity with the intent
                startActivity(intent);

            }
        });

        pose7CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create an intent to start FinalActivity
                Intent intent = new Intent(Musclegain.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Chest Pec-Deck");
                intent.putExtra("InstructionText", "Adjust the Seat:\n" +
                        "\n" +
                        "Set the seat height to align the handles with your chest.\n" +
                        "Seat Position:\n" +
                        "\n" +
                        "Sit on the machine with your back flat against the pad.\n" +
                        "Grip:\n" +
                        "\n" +
                        "Grab the handles with an overhand grip (palms facing in).\n" +
                        "Keep your elbows slightly bent.\n" +
                        "Position:\n" +
                        "\n" +
                        "Keep your chest up, shoulders back, and maintain a natural arch in your lower back.\n" +
                        "Feet should be planted firmly on the ground.\n" +
                        "Bring Handles Together:\n" +
                        "\n" +
                        "Exhale and bring the handles together in front of you.\n" +
                        "Imagine hugging a tree with both arms.\n" +
                        "Squeeze:\n" +
                        "\n" +
                        "At the fully contracted position, squeeze your chest muscles.\n" +
                        "Return to Starting Position:\n" +
                        "\n" +
                        "Inhale and slowly return the handles to the starting position, opening your arms wide.\n" +
                        "Repeat:\n" +
                        "\n" +
                        "Perform the desired number of repetitions.");
                intent.putExtra("FocusArea1", "");
                intent.putExtra("FocusArea2", "");
                intent.putExtra("FocusArea3", "");
                intent.putExtra("FocusArea4", "");
                intent.putExtra("FocusArea5", "");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.muscle7);

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
