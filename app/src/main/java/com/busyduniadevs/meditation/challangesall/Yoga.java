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

public class Yoga extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);


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
                Intent intent = new Intent(Yoga.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Downward-Facing");
                intent.putExtra("InstructionText", "Start on your hands and knees with wrists under shoulders and knees under hips.\n" +
                        "Lift your hips toward the ceiling, straightening your legs.\n" +
                        "Hands should be shoulder-width apart, fingers spread, and press palms into the mat.\n" +
                        "Keep a slight bend in the knees if needed and aim for heels to reach or touch the floor.\n" +
                        "Engage your core, draw shoulder blades together, and gaze towards your toes.\n" +
                        "Hold the pose, breathing deeply, and relax your head and neck.\n" +
                        "To release, bend your knees and return to the starting position on hands and knees.");
                intent.putExtra("FocusArea1", "Back");
                intent.putExtra("FocusArea2", "Hamstrings");
                intent.putExtra("FocusArea3", "Shoulders");
                intent.putExtra("FocusArea4", "Legs");
                intent.putExtra("FocusArea5", "Neck");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.yogafirst);

                // Start FinalActivity with the intent
                startActivity(intent);

            }
        });

        pose2CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start FinalActivity
                Intent intent = new Intent(Yoga.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Warrior I");
                intent.putExtra("InstructionText", "Start in a standing position with your feet hip-width apart.\n" +
                        "Step one foot back, keeping it at a 45-degree angle.\n" +
                        "Bend your front knee, ensuring it is directly above your ankle.\n" +
                        "Square your hips toward the front of the mat.\n" +
                        "Extend your arms overhead, palms facing each other or bringing your palms together.\n" +
                        "Keep your shoulders relaxed, and gaze forward or up.\n" +
                        "Hold the pose, breathing deeply.\n" +
                        "To exit, straighten your front leg and bring the back foot forward.\n" +
                        "Repeat on the other side.");
                    intent.putExtra("FocusArea1", "Legs");
                intent.putExtra("FocusArea2", "Hips");
                intent.putExtra("FocusArea3", "Torso");
                intent.putExtra("FocusArea4", "Shoulders");
                intent.putExtra("FocusArea5", "Chest");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.posetwo);

                // Start FinalActivity with the intent
                startActivity(intent);
            }
        });

        pose3CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start FinalActivity
                Intent intent = new Intent(Yoga.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Upward-Facing");
                intent.putExtra("InstructionText", "Start in a prone position on your mat, lying on your stomach.\n" +
                        "Place your palms on the mat under your shoulders, fingers pointing forward.\n" +
                        "Press the tops of your feet into the mat, engaging your leg muscles.\n" +
                        "Inhale as you straighten your arms, lifting your chest off the mat.\n" +
                        "Roll your shoulders back and down, opening your chest.\n" +
                        "Keep your thighs and pelvis on the mat, with only your hands and the tops of your feet touching.\n" +
                        "Look straight ahead or slightly upward, keeping your neck in line with your spine.\n" +
                        "Hold the pose for a few breaths, then exhale as you lower back down to the mat.");
                intent.putExtra("FocusArea1", "Chest");
                intent.putExtra("FocusArea2", "Shoulders");
                intent.putExtra("FocusArea3", "Abdominals");
                intent.putExtra("FocusArea4", "Hip Flexors");
                intent.putExtra("FocusArea5", "Back Extension");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.posethree);

                // Start FinalActivity with the intent
                startActivity(intent);
            }
        });

        pose4CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start FinalActivity
                Intent intent = new Intent(Yoga.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Dancer's Pose");
                intent.putExtra("InstructionText", "Begin by standing in Tadasana (Mountain Pose) with your feet together.\n" +
                        "\n" +
                        "Shift your weight onto your right foot and bend your left knee, bringing the heel towards your left buttock.\n" +
                        "\n" +
                        "Reach your left hand back and grasp the inner ankle of your left foot. You can use a yoga strap looped around the ankle if reaching the foot is challenging.\n" +
                        "\n" +
                        "Inhale and lift your right arm straight up, reaching towards the ceiling.\n" +
                        "\n" +
                        "As you exhale, begin to hinge forward at your hips, simultaneously kicking your left foot into your hand.\n" +
                        "\n" +
                        "Extend your right arm forward, keeping it parallel to the floor, and focus your gaze on a fixed point to help with balance.\n" +
                        "\n" +
                        "Continue to lift and kick, creating a gentle backbend in your spine.\n" +
                        "\n" +
                        "Hold the pose for several breaths, maintaining a steady balance and breathing deeply.\n" +
                        "\n" +
                        "To release, slowly lower your left foot to the floor, returning to Tadasana.\n" +
                        "\n" +
                        "Repeat on the other side by shifting your weight onto your left foot and bending your right knee.");
                intent.putExtra("FocusArea1", "Legs");
                intent.putExtra("FocusArea2", "Feet");
                intent.putExtra("FocusArea3", "Hips");
                intent.putExtra("FocusArea4", "Gaze");
                intent.putExtra("FocusArea5", "Arms ");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.posefour);

                // Start FinalActivity with the intent
                startActivity(intent);
            }
        });

        pose5CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create an intent to start FinalActivity
                Intent intent = new Intent(Yoga.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Surya Namaskar");
                intent.putExtra("InstructionText", "Pranamasana (Prayer Pose):\n" +
                        "\n" +
                        "Stand at the front of your mat with feet together.\n" +
                        "Join your palms together in a prayer position at your chest.\n" +
                        "Hasta Uttanasana (Raised Arms Pose):\n" +
                        "\n" +
                        "Inhale, lift your arms upward, and arch back slightly.\n" +
                        "Keep your biceps close to your ears, lengthening the entire body.\n" +
                        "Padahastasana (Hand to Foot Pose):\n" +
                        "\n" +
                        "Exhale and bend forward at the hips.\n" +
                        "Bring your hands down to the floor beside your feet.");
                intent.putExtra("FocusArea1", "Abdominal");
                intent.putExtra("FocusArea2", "Backbend");
                intent.putExtra("FocusArea3", "Hamstring stretch ");
                intent.putExtra("FocusArea4", "Foot");
                intent.putExtra("FocusArea5", "Hand");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.posefive);

                // Start FinalActivity with the intent
                startActivity(intent);

            }
        });

        pose6CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                // Create an intent to start FinalActivity
                Intent intent = new Intent(Yoga.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Bird Dog Plank");
                intent.putExtra("InstructionText", "Starting Position:\n" +
                        "\n" +
                        "Begin on your hands and knees in a tabletop position. Your wrists should be directly under your shoulders, and your knees under your hips.\n" +
                        "Alignment:\n" +
                        "\n" +
                        "Keep your spine in a neutral position, and engage your core muscles.\n" +
                        "Static Plank:\n" +
                        "\n" +
                        "Instead of extending your right arm forward, keep both hands firmly planted on the ground.\n" +
                        "Maintain a straight line from your head to your heels, forming a plank position.\n" +
                        "Leg Extension:\n" +
                        "\n" +
                        "Lift your left leg straight back, aligning it with your hip.\n" +
                        "Keep your toes pointed toward the floor.\n" +
                        "Balance and Hold:\n" +
                        "\n" +
                        "Hold the position briefly, ensuring your hips and shoulders remain parallel to the floor.\n" +
                        "Focus on maintaining a stable and balanced plank position.\n" +
                        "Return to Starting Position:\n" +
                        "\n" +
                        "Slowly lower your left leg back to the starting tabletop position.\n" +
                        "Switch Sides:\n" +
                        "\n" +
                        "Repeat the exercise by lifting your right leg straight back.\n" +
                        "Repeat:\n" +
                        "\n" +
                        "Continue alternating between legs, maintaining the plank position.");
                intent.putExtra("FocusArea1", "Lower Back");
                intent.putExtra("FocusArea2", "Shoulders");
                intent.putExtra("FocusArea3", "Leg Muscles");
                intent.putExtra("FocusArea4", "Postural Muscles");
                intent.putExtra("FocusArea5", "Arms ");

                // You need to provide the actual image resource ID here
                intent.putExtra("ImageResource", R.drawable.posesix);

                // Start FinalActivity with the intent
                startActivity(intent);

            }
        });

        pose7CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create an intent to start FinalActivity
                Intent intent = new Intent(Yoga.this, FinalActivity.class);

                // Add data to the intent
                intent.putExtra("TitleText", "Head to Knee I");
                intent.putExtra("InstructionText", "Starting Position:\n" +
                        "\n" +
                        "Begin seated on the mat with your legs extended straight in front of you.\n" +
                        "Keep your spine tall and straight.\n" +
                        "Bend One Knee:\n" +
                        "\n" +
                        "Bend your right knee and bring the sole of your right foot to the inner thigh of your left leg.\n" +
                        "Allow the right knee to open to the side.\n" +
                        "Foot Placement:\n" +
                        "\n" +
                        "Place the sole of your right foot against your inner left thigh, ensuring the right heel is close to the perineum.\n" +
                        "Alignment:\n" +
                        "\n" +
                        "Square your hips as much as possible with the extended left leg.\n" +
                        "Keep your left foot flexed with toes pointing towards the ceiling.\n" +
                        "Inhale and Lengthen:\n" +
                        "\n" +
                        "Inhale, lengthen your spine, and lift your arms overhead.\n" +
                        "Exhale and Forward Bend:\n" +
                        "\n" +
                        "Exhale, hinge at your hips, and reach forward toward your left foot.\n" +
                        "Hold onto your left foot, shin, or reach for the toes with your hands.\n" +
                        "Keep the Back Straight:\n" +
                        "\n" +
                        "Maintain a long spine throughout the forward bend.\n" +
                        "Focus on leading with your chest and lengthening through the crown of your head.\n" +
                        "Breathing:\n" +
                        "\n" +
                        "Breathe deeply and steadily in the pose, allowing each exhale to deepen the stretch.\n" +
                        "Hold and Release:\n" +
                        "\n" +
                        "Hold the position for 30 seconds to a minute, breathing consistently.\n" +
                        "To release, inhale as you lift your torso back to an upright position.\n" +
                        "Switch Sides:\n" +
                        "\n" +
                        "Straighten the right leg and repeat the pose on the other side.");
                intent.putExtra("FocusArea1", "Hamstrings");
                intent.putExtra("FocusArea2", "Inner Thighs");
                intent.putExtra("FocusArea3", "Hips");
                intent.putExtra("FocusArea4", "Spine");
                intent.putExtra("FocusArea5", "Shoulders and Arms");

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