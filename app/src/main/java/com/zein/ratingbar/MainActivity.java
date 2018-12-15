package com.zein.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar= findViewById(R.id.ratingBar);

    }

    public void onBtnClick(View view) {
        float ratingValue=ratingBar.getRating();
        Toast.makeText(getApplicationContext(),"Rating is "+ratingValue, Toast.LENGTH_SHORT).show();
    }
}
