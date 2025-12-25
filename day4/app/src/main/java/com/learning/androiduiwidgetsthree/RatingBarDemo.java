package com.learning.androiduiwidgetsthree;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RatingBarDemo extends AppCompatActivity {
    RatingBar my_ratings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rating_bar_demo);
        my_ratings =(RatingBar) findViewById(R.id.my_ratings);

    }

    public void getRatings(View view){
        float f=my_ratings.getRating();
        Toast.makeText(this, "Your Rating is:"+f, Toast.LENGTH_LONG).show();
    }
}