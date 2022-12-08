package com.example.activitylifecycle12102022;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity {

    Button btnNavigateScreen2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Log.d("BBB", "Main1: onCreate");
        btnNavigateScreen2 = findViewById(R.id.button_navigate_screen2);

        btnNavigateScreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity1.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB", "Main1: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB", "Main1: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB", "Main1: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB", "Main1: onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB", "Main1: onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB", "Main1: onDestroy");
    }

    public void sendMessage(View view) {
        Log.d("BBB", "Main: sendMessage1");
    }
}
