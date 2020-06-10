package com.example.magic8ball;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView eight_ballImageView;
    private TextView answerTextView;
    private ImageView answerImageView;

    private String[] answersArray = {"As I see it, yes", "Ask again later.", "Better not tell you now.", "Without a doubt", "You may rely on it",
            "It is decidedly so",  "Cannot predict now.",  };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        eight_ballImageView = findViewById(R.id.ball_btn);

        answerTextView = findViewById(R.id.answer);

        answerImageView = (ImageView) findViewById(R.id.ans1);


        eight_ballImageView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    int randomIndex = new Random().nextInt(answersArray.length);
    answerTextView.setText(answersArray[randomIndex]);

           if (randomIndex == 0) {
               answerImageView.setVisibility(View.INVISIBLE);
               answerImageView = (ImageView) findViewById(R.id.ans1);
               answerImageView.setVisibility(View.VISIBLE);
           }

           else if (randomIndex == 1) {
               answerImageView.setVisibility(View.INVISIBLE);
               answerImageView = (ImageView) findViewById(R.id.ans2);
               answerImageView.setVisibility(View.VISIBLE);
           }

           else if (randomIndex == 2) {
               answerImageView.setVisibility(View.INVISIBLE);
               answerImageView = (ImageView) findViewById(R.id.ans3);
               answerImageView.setVisibility(View.VISIBLE);
           }

           else if (randomIndex == 3) {
               answerImageView.setVisibility(View.INVISIBLE);
               answerImageView = (ImageView) findViewById(R.id.ans4);
               answerImageView.setVisibility(View.VISIBLE);
           }

           else if (randomIndex == 4) {
               answerImageView.setVisibility(View.INVISIBLE);
               answerImageView = (ImageView) findViewById(R.id.ans5);
               answerImageView.setVisibility(View.VISIBLE);
           }

           else if (randomIndex == 5) {
               answerImageView.setVisibility(View.INVISIBLE);
               answerImageView = (ImageView) findViewById(R.id.ans6);
               answerImageView.setVisibility(View.VISIBLE);
           }

           else if (randomIndex == 6) {
               answerImageView.setVisibility(View.INVISIBLE);
               answerImageView = (ImageView) findViewById(R.id.ans7);
               answerImageView.setVisibility(View.VISIBLE);
           }


        }
    }


