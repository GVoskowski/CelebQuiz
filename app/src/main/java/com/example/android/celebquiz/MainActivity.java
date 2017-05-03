package com.example.android.celebquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Starts quizMain activity when user hits the Start Quiz button.

    public void startQuiz(View view) {
        Intent intent = new Intent(MainActivity.this, quizMain.class);
        startActivity(intent);
    }
}
