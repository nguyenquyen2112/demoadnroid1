package com.example.activitylifecycle12102022;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

   Button btnNavigateScreen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("BBB", "Main3: onCreate");

        btnNavigateScreen3 = findViewById(R.id.button_navigate_screen3);

        btnNavigateScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB", "Main2: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB", "Main2: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB", "Main2: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB", "Main2: onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB", "Main2: onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB", "Main2: onDestroy");
    }

    public void sendMessage(View view) {
        Log.d("BBB", "Main: sendMessage2");
    }
}
