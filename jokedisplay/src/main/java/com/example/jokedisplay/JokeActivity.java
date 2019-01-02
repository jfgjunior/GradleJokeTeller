package com.example.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String JOKE_EXTRA = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent extra = getIntent();
        if (extra.hasExtra(JOKE_EXTRA)) {
            TextView jokeTextView = findViewById(R.id.joke);
            jokeTextView.setText(extra.getStringExtra(JOKE_EXTRA));
        }
    }
}
