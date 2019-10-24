package com.example.annimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade(View view) {
        ImageView bart= (ImageView)findViewById(R.id.bart);

        ImageView homer= (ImageView)findViewById(R.id.homer);

        bart.animate().alpha(0f).setDuration(2000);

        homer.animate().alpha(1f).setDuration(2000);}

}
