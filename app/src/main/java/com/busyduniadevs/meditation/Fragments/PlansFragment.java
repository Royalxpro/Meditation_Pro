package com.busyduniadevs.meditation.Fragments;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.busyduniadevs.meditation.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;
import com.squareup.picasso.Picasso;

import jp.wasabeef.picasso.transformations.RoundedCornersTransformation;

public class PlansFragment extends Fragment {

    private FirebaseFirestore firestore;
    private LinearLayout imageContainer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_plans, container, false);

        firestore = FirebaseFirestore.getInstance();
        imageContainer = view.findViewById(R.id.imageContainerPlans);

        loadProductAds();

        return view;
    }

    private void loadProductAds() {
        firestore.collection("2ProductAds")
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

    private void openLink(String url) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            // Handle the case where no activity is found to handle the intent
            Toast.makeText(requireContext(), "Error: No app found to handle the link", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}
