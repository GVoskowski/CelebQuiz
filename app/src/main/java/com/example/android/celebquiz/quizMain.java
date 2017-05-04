package com.example.android.celebquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class quizMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_main);
        correctAnswer = (RadioButton) findViewById(R.id.radioButton7);
        correctAnswer2 = (RadioButton) findViewById(R.id.bradA1);
        correctAnswer3 = (RadioButton) findViewById(R.id.biebA1);
        rltnStatus1 = (CheckBox) findViewById(R.id.mileyCB);
        rltnStatus2 = (CheckBox) findViewById(R.id.mileyCB2);
        rltnStatus3 = (CheckBox) findViewById(R.id.mileyCB3);
        rltnStatus4 = (CheckBox) findViewById(R.id.mileyCB4);
    }

    private RadioButton correctAnswer, correctAnswer2, correctAnswer3;
    private CheckBox rltnStatus1, rltnStatus2, rltnStatus3, rltnStatus4;


    public void scoreSets(View v) {
        EditText nameField = (EditText) findViewById(R.id.editText);
        Editable nameEditable = nameField.getText();
        int myNum = Integer.valueOf(nameEditable.toString());
        int score = 0;

        //Check Rihanna Answer, Add Points if Correct
        if (correctAnswer.isChecked()) {
            score += 1;
        }

        //Check Brad Pitt Answer, Add Points if Correct
        if (correctAnswer2.isChecked()) {
            score += 1;
        }

        //Check Bieber Answer,Add Points if Correct
        if (correctAnswer3.isChecked()) {
            score += 1;
        }

        //Check Miley Cyrus Answer, Add Points if Correct
        if (rltnStatus1.isChecked() && rltnStatus3.isChecked() && !rltnStatus2.isChecked() && !rltnStatus4.isChecked()) {
            score += 1;
        } else if (rltnStatus1.isChecked() && rltnStatus2.isChecked() && rltnStatus3.isChecked() && rltnStatus4.isChecked())

        {
            Toast.makeText(this, "Please select only the right Answers", Toast.LENGTH_SHORT).show();
        }


        //Checks Editable answer, Add Points if Correct
        if (myNum == 2) {
            score += 1;
        }

        //Displays The Score user Achieved
        Toast.makeText(quizMain.this,
                getString(R.string.you_scored) + score + "/5", Toast.LENGTH_LONG).show();
    }

    // Show the correct answers when button is clicked
    public void showCorrect(View v) {
        TextView correctAnswer1 = (TextView) findViewById(R.id.CorrectAnswer1);
        correctAnswer1.setText(getString(R.string.correctAnswer_string) + getString(R.string.rhnA4));

        TextView correctAnswer2 = (TextView) findViewById(R.id.CorrectAnswer2);
        correctAnswer2.setText(getString(R.string.correctAnswer_string) + getString(R.string.bradA1));

        TextView correctAnswer3 = (TextView) findViewById(R.id.CorrectAnswer3);
        correctAnswer3.setText(getString(R.string.correctAnswer_string) + getString(R.string.just_gast) + getString(R.string.stella_maxwell));

        TextView correctAnswer4 = (TextView) findViewById(R.id.CorrectAnswer4);
        correctAnswer4.setText(getString(R.string.correctAnswer_string) + getString(R.string.two));

        TextView correctAnswer5 = (TextView) findViewById(R.id.CorrectAnswer5);
        correctAnswer5.setText(getString(R.string.correctAnswer_string) + getString(R.string.biebA1));
    }

    //When reset button is clicked reopens activity
    //finish() kills the already running activity
    public void reset(View v) {
        Intent intent = new Intent(quizMain.this, quizMain.class);
        finish();
        startActivity(intent);
    }
}



