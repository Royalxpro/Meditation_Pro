package com.busyduniadevs.meditation;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.busyduniadevs.meditation.Fragments.AddBlogFragment;
import com.busyduniadevs.meditation.Fragments.HomeFragment;
import com.busyduniadevs.meditation.Fragments.PlansFragment;
import com.busyduniadevs.meditation.Fragments.PublicFeedFragment;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {


    private FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    String myuid;
    ActionBar actionBar;

    TextView Createachallanmgetxt;
    private long backPressedTime;


    //***********************************
    //X-FLOW BOTTOM NAVIGATION
    private MeowBottomNavigation bottomNavigation;
    private HomeFragment currentFragment;
   // private HomeFragment currentFragment;

    // Constants for bottom navigation IDs
    private final int ID_HOME = 1;
    private final int ID_COMMUNITY = 2;
    private final int ID_POST = 3;
    private final int ID_PUBLICFEED = 4;
    private final int ID_PROFILE = 5;

    // Fragment instances
    private HomeFragment homeFragment;
    private PlansFragment plansFragment;
    private AddBlogFragment postFragment;
    private PublicFeedFragment publicFeedFragment;
   // private ProfileFragment profileFragment;
   // private CreateChallengesFragment createchallengeFragment;
    //***********************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        //FIREBASE
        FirebaseApp.initializeApp(this);
        FirebaseFirestore firestore = FirebaseFirestore.getInstance();
        FirebaseDatabase database = FirebaseDatabase.getInstance();


        // Initialize fragments
        homeFragment = new HomeFragment();
        plansFragment = new PlansFragment();
        postFragment = new AddBlogFragment();
        publicFeedFragment = new PublicFeedFragment();
//        profileFragment = new ProfileFragment();

       // createchallengeFragment = new CreateChallengesFragment();

        bottomNavigation = findViewById(R.id.bottomNavigation);





        // Set the default fragment
        currentFragment = homeFragment;
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, currentFragment).commit();




        // Set up bottom navigation
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_HOME, R.drawable.ic_baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_COMMUNITY, R.drawable.ic_baseline_community_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_POST, R.drawable.ic_baseline_add_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_PUBLICFEED, R.drawable.ic_baseline_feed_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_PROFILE, R.drawable.ic_baseline_account_circle_24));

        bottomNavigation.setOnClickMenuListener(item -> {
            switch (item.getId()) {
                case ID_HOME:
                    showFragment(homeFragment);
                    break;
                case ID_COMMUNITY:
                    showFragment(plansFragment);
                    break;
                case ID_POST:
                    showFragment(postFragment);
                    break;
                case ID_PUBLICFEED:
                   showFragment(publicFeedFragment);
                    break;
                case ID_PROFILE:
                   // showFragment(profileFragment);
                    break;
            }
            return null;
        });
    }
    public void ShowCrateChallenges() {
        //showFragment(createchallengeFragment);

    }
    public void BacktoHomeFragment() {
        showFragment(homeFragment);

    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            // If the last back press was within 2 seconds, exit the app.
            super.onBackPressed();
        } else {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        backPressedTime = System.currentTimeMillis();
    }

    private void showFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Set custom animations for fragment transitions
        fragmentTransaction.setCustomAnimations(R.anim.fragment_enter, R.anim.fragment_exit);

        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        fragmentTransaction.commit();

    }


    @Override
    protected void onResume() {
        super.onResume();
        showFragment(homeFragment);
    }


}














