package com.mdaftabalam.ccna.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.mdaftabalam.ccna.R;

public class ScoreActivity extends AppCompatActivity {

    int pStatus = 0;
    private Handler handler = new Handler();
    ProgressBar mProgress;
    TextView txtScore, txtHighScore, grade, percentage;
    float res;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);

        txtScore = findViewById(R.id.textScore);
        txtHighScore = findViewById(R.id.textHighScore);
        grade = findViewById(R.id.grade);
        percentage = findViewById(R.id.percent);
        mProgress = findViewById(R.id.circularProgressbar);

        // receive the score from last activity by Intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        txtScore.setText(Integer.toString(score));

        // use Shared preferences to save the best score
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore", 0);
        if (highscore >= score)
            txtHighScore.setText(Integer.toString(highscore));
        else {
            txtHighScore.setText(Integer.toString(score));
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.apply();
        }

        try {
            //int result = Integer.parseInt(txtScore.getText().toString());
            res = (score * 100 / 21);
            if (res >= 75) {
                percentage.setText(String.valueOf(res) + "%");
                grade.setText("A");
            } else if ((res >= 60) && (res < 75)) {
                percentage.setText(String.valueOf(res) + "%");
                grade.setText("B");
            } else if ((res >= 50) && (res < 60)) {
                percentage.setText(String.valueOf(res) + "%");
                grade.setText("C");
            } else if ((res >= 40) && (res < 50)) {
                percentage.setText(String.valueOf(res) + "%");
                grade.setText("D");
            } else if (res < 40) {
                percentage.setText(String.valueOf(res) + "%");
                grade.setText("FAILED");
            }
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }

        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                while (pStatus < res) {
                    pStatus += 1;
                    handler.post(new Runnable() {

                        @Override
                        public void run() {
                            // TODO Auto-generated method stub
                            mProgress.setProgress(pStatus);
                        }
                    });
                    try {
                        // Sleep for 200 milliseconds.
                        // Just to display the progress slowly
                        Thread.sleep(16); //thread will take approx 3 seconds to finish
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public void onClick(View view) {
        Intent intent = new Intent(ScoreActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

