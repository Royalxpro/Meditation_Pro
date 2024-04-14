    package com.busyduniadevs.meditation.Fragments;

    import android.content.Context;
    import android.content.Intent;
    import android.content.SharedPreferences;
    import android.net.Uri;
    import android.os.Bundle;
    import android.os.SystemClock;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.view.animation.Animation;
    import android.view.animation.AnimationUtils;
    import android.widget.Button;
    import android.widget.Chronometer;
    import android.widget.HorizontalScrollView;
    import android.widget.ImageView;
    import android.widget.LinearLayout;
    import android.widget.TextView;
    import android.widget.Toast;

    import androidx.annotation.NonNull;
    import androidx.cardview.widget.CardView;
    import androidx.fragment.app.Fragment;

    import com.busyduniadevs.meditation.R;
    import com.busyduniadevs.meditation.challangesall.Musclegain;
    import com.busyduniadevs.meditation.challangesall.Yoga;
    import com.busyduniadevs.meditation.challangesall.fitness;
    import com.google.android.gms.tasks.OnCompleteListener;
    import com.google.android.gms.tasks.Task;
    import com.google.firebase.firestore.DocumentSnapshot;
    import com.google.firebase.firestore.FirebaseFirestore;
    import com.google.firebase.firestore.QuerySnapshot;
    import com.squareup.picasso.Picasso;

    import pl.droidsonroids.gif.GifImageView;

    public class HomeFragment extends Fragment {

        private FirebaseFirestore firestore;
        private LinearLayout imageContainer,challangestext,secondchallnges,firstchallnges;
        GifImageView myoga,mmusclegain,mfitness;
        CardView topbar;
        HorizontalScrollView adssection;
        CardView dayschallanges,fitshop;


        //--------------------------cycle

        private Chronometer chronometer;
        private Button btnStartPause, btnReset, btnPlus, btnMinus;
        private TextView tvSelectedTime;
        private long points = 0;
        private long selectedTime = 300000; // Default: 5 minutes
        private long calories = 50;
        private SharedPreferences sharedPreferences;
        private static final String PREFS_NAME = "MyPrefsFile";
        private TextView tvPoints;

        //running**********
        private Chronometer chronometer2;
        private Button btnStartPause2, btnReset2, btnPlus2, btnMinus2;
        private TextView tvSelectedTime2;
        private long points2 = 0;
        private long selectedTime2 = 300000; // Default: 5 minutes
        private long calories2 = 50;
        private TextView tvPoints2;


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_home, container, false);

            firestore = FirebaseFirestore.getInstance();
            imageContainer = view.findViewById(R.id.imageContainer);


            // Load points from SharedPreferences
            points = loadPointsFromLocal();





            //cycle/*****************
            chronometer = view.findViewById(R.id.chronometer);
            btnStartPause = view.findViewById(R.id.btnStartPause);
            btnReset = view.findViewById(R.id.btnReset);
            btnPlus = view.findViewById(R.id.btnPlus);
            btnMinus = view.findViewById(R.id.btnMinus);
            tvSelectedTime = view.findViewById(R.id.tvSelectedTime);
            tvPoints = view.findViewById(R.id.tvPoints);

            //running ***************************
            chronometer2 = view.findViewById(R.id.chronometer2);
            btnStartPause2 = view.findViewById(R.id.btnStartPause2);
            btnReset2 = view.findViewById(R.id.btnReset2);
            btnPlus2 = view.findViewById(R.id.btnPlus2);
            btnMinus2 = view.findViewById(R.id.btnMinus2);
            tvSelectedTime2 = view.findViewById(R.id.tvSelectedTime2);
            tvPoints2 = view.findViewById(R.id.tvPoints2);


            updateSelectedTimeText();
            updateCaloriesText();

//cycle////////******************************************************
            btnPlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectedTime += 300000; // Add 5 minutes in milliseconds
                    calories += 50;

                    updateSelectedTimeText();
                    updateCaloriesText();

                }
            });
            btnMinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (selectedTime > 300000 && calories > 50)  { // Ensure minimum time is 5 minutes
                        selectedTime -= 300000; // Subtract 5 minutes in milliseconds
                        calories -=50; // Subtract 5 minutes in milliseconds
                        updateCaloriesText();
                        updateSelectedTimeText();
                    }

                }
            });
            btnStartPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startPauseTimer();
                }
            });
            btnReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    resetTimer();
                }
            });
            chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                @Override
                public void onChronometerTick(Chronometer chronometer) {
                    if (SystemClock.elapsedRealtime() - chronometer.getBase() >= selectedTime) {
                        points += 10;
                        savePointsToLocal();
                        chronometer.stop();
                        showToast("Congratulations for completing! Points: " + points);
                    }
                }
            });

//run********************************************************************************
            btnPlus2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectedTime2 += 300000; // Add 5 minutes in milliseconds
                    calories2 += 50;

                    updateSelectedTimeText2();
                    updateCaloriesText2();

                }
            });
            btnMinus2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (selectedTime2 > 300000 && calories2 > 50)  { // Ensure minimum time is 5 minutes
                        selectedTime2 -= 300000; // Subtract 5 minutes in milliseconds
                        calories2 -=50; // Subtract 5 minutes in milliseconds
                        updateCaloriesText();
                        updateSelectedTimeText();
                    }

                }
            });
            btnStartPause2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startPauseTimer2();
                }
            });
            btnReset2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    resetTimer2();
                }
            });
            chronometer2.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                @Override
                public void onChronometerTick(Chronometer chronometer) {
                    if (SystemClock.elapsedRealtime() - chronometer.getBase() >= selectedTime2) {
                        points2 += 10;
                        savePointsToLocal2();
                        chronometer.stop();
                        showToast2("Congratulations for completing! Points: " + points2);
                    }
                }
            });




















            //Xflow************************************
            topbar = view.findViewById(R.id.topbar);
            adssection = view.findViewById(R.id.horizontalScrollView);
            dayschallanges = view.findViewById(R.id.dayschallanges);
            fitshop = view.findViewById(R.id.fitshop);
            challangestext = view.findViewById(R.id.challangestext);
            firstchallnges = view.findViewById(R.id.firstchallnges);
            secondchallnges = view.findViewById(R.id.secondchallnges);
            //X-FLOW TECH BY ROYALX CORP
            startSlideFadeInAnimation1(topbar);
            startSlideFadeInAnimation2(adssection);
            startSlideFadeInAnimation11(dayschallanges);
            startSlideFadeInAnimation22(fitshop);
            startSlideFadeInAnimation111(challangestext);
            startSlideFadeInAnimation1111(firstchallnges);
            startSlideFadeInAnimation11111(secondchallnges);


            myoga = view.findViewById(R.id.yoga);
            mmusclegain = view.findViewById(R.id.musclegain);
            mfitness = view.findViewById(R.id.fitness);

            myoga.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), Yoga.class);
                    startActivity(intent);
                }
            });
            mmusclegain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), Musclegain.class);
                    startActivity(intent);
                }
            });
            mfitness.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), fitness.class);
                    startActivity(intent);
                }
            });



            loadProductAds();

            return view;
        }

        //Image Loader
        private void loadProductAds() {
            firestore.collection("ProductAds")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (DocumentSnapshot document : task.getResult()) {
                                    String imageUrl = document.getString("Image");
                                    String redirectLink = document.getString("RedirectLink");
                                    addCardView(imageUrl, redirectLink);
                                }
                            }
                        }
                    });
        }

        //ImageLoader
        private void addCardView(String imageUrl, final String redirectLink) {
            CardView cardView = new CardView(requireContext());
            LinearLayout.LayoutParams cardLayoutParams = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            cardLayoutParams.setMargins(10, 0, 10, 0);
            cardView.setLayoutParams(cardLayoutParams);
            // Set card background to transparent or your desired color
            // Set corner radius programmatically
            cardView.setRadius(getResources().getDimension(R.dimen.CornerR));
            // Set card elevation programmatically
            cardView.setCardElevation(getResources().getDimension(R.dimen.cardElevation));
            // Create an ImageView inside the CardView
            ImageView imageView = new ImageView(requireContext());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, // Set width to match_parent
                    ViewGroup.LayoutParams.MATCH_PARENT));
            // Set scaleType to centerCrop to scale the image within the ImageView
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            cardView.addView(imageView);

            // Use Picasso to load the image and set rounded corners
            Picasso.get()
                    .load(imageUrl)
                    .into(imageView);

            // Set click listener to open the link
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openLink(redirectLink);
                }
            });

            // Add CardView to the container
            imageContainer.addView(cardView);
        }

        //ImageLoader
        private void openLink(String url) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        }


        //X-FLOW TECH BY ROYALX CORP
        private void startSlideFadeInAnimation1(CardView layout) {
            Animation slideFadeInAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.slide_in_layout);
            layout.startAnimation(slideFadeInAnimation);
        }

        private void startSlideFadeInAnimation2(HorizontalScrollView layout) {
            Animation slideFadeInAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.slide_leftright_layout);
            layout.startAnimation(slideFadeInAnimation);
        }

        private void startSlideFadeInAnimation11(CardView layout) {
            Animation slideFadeInAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.slide_in_layout);
            layout.startAnimation(slideFadeInAnimation);
        }
        private void startSlideFadeInAnimation22(CardView layout) {
            Animation slideFadeInAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.slide_leftright_layout);
            layout.startAnimation(slideFadeInAnimation);
        }
        private void startSlideFadeInAnimation111(LinearLayout layout) {
            Animation slideFadeInAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.slide_in_layout);
            layout.startAnimation(slideFadeInAnimation);
        }
        private void startSlideFadeInAnimation1111(LinearLayout layout) {
            Animation slideFadeInAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.slide_in_layout);
            layout.startAnimation(slideFadeInAnimation);
        }
        private void startSlideFadeInAnimation11111(LinearLayout layout) {
            Animation slideFadeInAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.slide_in_layout);
            layout.startAnimation(slideFadeInAnimation);
        }








//cycle**************************************************
        private void startPauseTimer() {
            if (btnStartPause.getText().toString().equalsIgnoreCase("Start")) {
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
                btnStartPause.setText("Pause");
            } else {
                chronometer.stop();
                btnStartPause.setText("Resume");
            }
        }

        private void resetTimer() {
            chronometer.stop();
            chronometer.setBase(SystemClock.elapsedRealtime());
            btnStartPause.setText("Start");
            showToast("Timer reset");
        }

        private void showToast(String message) {
            Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
        }
        private void updateSelectedTimeText() {
            long minutes = selectedTime / 60000;
            tvSelectedTime.setText(getString(R.string.selected_time, minutes));
        }
        private void updateCaloriesText() {
            long caloriescount = calories / 50;
            tvSelectedTime.setText(getString(R.string.selected_cal, caloriescount));
        }


        private void savePointsToLocal() {
            SharedPreferences.Editor editor = getActivity().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE).edit();
            editor.putLong("points", points);
            editor.apply();
        }

        private long loadPointsFromLocal() {
            SharedPreferences prefs = getActivity().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
            return prefs.getLong("points", 0);
        }

 //running********************************************************
 private void startPauseTimer2() {
     if (btnStartPause2.getText().toString().equalsIgnoreCase("Start")) {
         chronometer2.setBase(SystemClock.elapsedRealtime());
         chronometer2.start();
         btnStartPause2.setText("Pause");
     } else {
         chronometer2.stop();
         btnStartPause2.setText("Resume");
     }
 }

        private void resetTimer2() {
            chronometer2.stop();
            chronometer2.setBase(SystemClock.elapsedRealtime());
            btnStartPause2.setText("Start");
            showToast("Timer reset");
        }

        private void showToast2(String message) {
            Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
        }
        private void updateSelectedTimeText2() {
            long minutes = selectedTime2 / 60000;
            tvSelectedTime2.setText(getString(R.string.selected_time, minutes));
        }
        private void updateCaloriesText2() {
            long caloriescount = calories2 / 50;
            tvSelectedTime.setText(getString(R.string.selected_cal, caloriescount));
        }


        private void savePointsToLocal2() {
            SharedPreferences.Editor editor = getActivity().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE).edit();
            editor.putLong("points2", points2);
            editor.apply();
        }

        private long loadPointsFromLocal2() {
            SharedPreferences prefs = getActivity().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
            return prefs.getLong("points2", 0);
        }


    }






















