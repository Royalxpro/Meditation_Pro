package com.busyduniadevs.meditation.plans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.busyduniadevs.meditation.R;

public class ShowNewsContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_news_content);

        // Get data from the intent
        String headline = getIntent().getStringExtra("headline");
        String content = getIntent().getStringExtra("content");

        // Find TextViews in the layout
        TextView headlineTextView = findViewById(R.id.headlineTextView);
        TextView contentTextView = findViewById(R.id.contentTextView);

        // Set text to TextViews
        headlineTextView.setText(headline);
        contentTextView.setText(content);
    }
}