package com.example.activitylifecycle12102022;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNavigateScreen1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB", "onCreate");
        Log.d("BBB", "Main: onCreate");

//        btnNavigateScreen1 = findViewById(R.id.button_navigate_screen1);
////
//        btnNavigateScreen1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, MainActivity1.class);
//                startActivity(intent);
//            }
//        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB", "onStart");
        Log.d("BBB", "Main: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB", "onResume");
        Log.d("BBB", "Main: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB", "onPause");
        Log.d("BBB", "Main: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB", "onStop");
        Log.d("BBB", "Main: onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB", "onRestart");
        Log.d("BBB", "Main: onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB", "onDestroy");
        Log.d("BBB", "Main: onDestroy");
    }

    public void sendMessage(View view) {
        Log.d("BBB", "Main: sendMessage");
    }
}