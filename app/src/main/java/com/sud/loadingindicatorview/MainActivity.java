package com.sud.loadingindicatorview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sud.lodinglibrary.AVLoadingIndicatorView;

public class MainActivity extends AppCompatActivity {

    AVLoadingIndicatorView avLoadingIndicatorView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        avLoadingIndicatorView= findViewById(R.id.indicator);
        avLoadingIndicatorView.setIndicator("BallPulseIndicator");
        avLoadingIndicatorView.show();
    }
}
