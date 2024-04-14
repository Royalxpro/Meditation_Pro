package com.busyduniadevs.meditation.plans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.busyduniadevs.meditation.R;

public class Meal extends AppCompatActivity {
    CardView text1m,text2m,text3m,text4m,text5m,text6m,text7m,text8m,text9m,text10m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);

       /* // Find CardViews by their IDs
        text1m = findViewById(R.id.text1);
        text2m = findViewById(R.id.text2);
        text3m = findViewById(R.id.text3);
        text4m = findViewById(R.id.text4);
        text5m = findViewById(R.id.text5);
        text6m = findViewById(R.id.text6);
        text7m = findViewById(R.id.text7);
        text8m = findViewById(R.id.text8);
        text9m = findViewById(R.id.text9);
        text10m = findViewById(R.id.text10);




        // Set click listeners for TextViews
        text1m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Assuming you have news headline and content
                String headline = "Sample Headline";
                String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

                // Create an Intent to start ShowNewsContentActivity
                Intent intent = new Intent(Meal.this, ShowNewsContentActivity.class);

                // Pass data to the intent
                intent.putExtra("headline", headline);
                intent.putExtra("content", content);

                // Start the activity
                startActivity(intent);
            }
        });

        text2m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Assuming you have news headline and content
                String headline = "Sample Headline";
                String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

                // Create an Intent to start ShowNewsContentActivity
                Intent intent = new Intent(Meal.this, ShowNewsContentActivity.class);

                // Pass data to the intent
                intent.putExtra("headline", headline);
                intent.putExtra("content", content);

                // Start the activity
                startActivity(intent);
            }
        });

        text3m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Assuming you have news headline and content
                String headline = "Sample Headline";
                String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

                // Create an Intent to start ShowNewsContentActivity
                Intent intent = new Intent(Meal.this, ShowNewsContentActivity.class);

                // Pass data to the intent
                intent.putExtra("headline", headline);
                intent.putExtra("content", content);

                // Start the activity
                startActivity(intent);
            }
        });

        text4m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Assuming you have news headline and content
                String headline = "Sample Headline";
                String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

                // Create an Intent to start ShowNewsContentActivity
                Intent intent = new Intent(Meal.this, ShowNewsContentActivity.class);

                // Pass data to the intent
                intent.putExtra("headline", headline);
                intent.putExtra("content", content);

                // Start the activity
                startActivity(intent);
            }
        });

        text5m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Assuming you have news headline and content
                String headline = "Sample Headline";
                String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

                // Create an Intent to start ShowNewsContentActivity
                Intent intent = new Intent(Meal.this, ShowNewsContentActivity.class);

                // Pass data to the intent
                intent.putExtra("headline", headline);
                intent.putExtra("content", content);

                // Start the activity
                startActivity(intent);
            }
        });

        text6m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Assuming you have news headline and content
                String headline = "Sample Headline";
                String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

                // Create an Intent to start ShowNewsContentActivity
                Intent intent = new Intent(Meal.this, ShowNewsContentActivity.class);

                // Pass data to the intent
                intent.putExtra("headline", headline);
                intent.putExtra("content", content);

                // Start the activity
                startActivity(intent);
            }
        });

        text7m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Assuming you have news headline and content
                String headline = "Sample Headline";
                String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

                // Create an Intent to start ShowNewsContentActivity
                Intent intent = new Intent(Meal.this, ShowNewsContentActivity.class);

                // Pass data to the intent
                intent.putExtra("headline", headline);
                intent.putExtra("content", content);

                // Start the activity
                startActivity(intent);
            }
        });

        text8m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Assuming you have news headline and content
                String headline = "Sample Headline";
                String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

                // Create an Intent to start ShowNewsContentActivity
                Intent intent = new Intent(Meal.this, ShowNewsContentActivity.class);

                // Pass data to the intent
                intent.putExtra("headline", headline);
                intent.putExtra("content", content);

                // Start the activity
                startActivity(intent);
            }
        });

        text9m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Assuming you have news headline and content
                String headline = "Sample Headline";
                String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

                // Create an Intent to start ShowNewsContentActivity
                Intent intent = new Intent(Meal.this, ShowNewsContentActivity.class);

                // Pass data to the intent
                intent.putExtra("headline", headline);
                intent.putExtra("content", content);

                // Start the activity
                startActivity(intent);
            }
        });

        text10m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Assuming you have news headline and content
                String headline = "Sample Headline";
                String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

                // Create an Intent to start ShowNewsContentActivity
                Intent intent = new Intent(Meal.this, ShowNewsContentActivity.class);

                // Pass data to the intent
                intent.putExtra("headline", headline);
                intent.putExtra("content", content);

                // Start the activity
                startActivity(intent);
            }
        });*/




    }
}