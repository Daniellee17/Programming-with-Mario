package com.example.daniellemarie.androidproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class start extends AppCompatActivity {
    static MediaPlayer gameOnsound;

    SharedPreferences myprefs;

private int counter=1;

    Button answer1, answer2, answer3, answer4;

    TextView score, question, countertxt, ans, exit, hscoretxt;

    private questions mQuestions = new questions();

    private String mAnswer;
    private int mScore = 0, p = 0;
    private int mQuestionLength = mQuestions.mQuestions.length;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        myprefs = getPreferences(MODE_PRIVATE);
        gameOnsound = MediaPlayer.create(start.this,R.raw.gameon);
        hscoretxt = (TextView) findViewById(R.id.hscore);



         p = myprefs.getInt("high", 0);
        hscoretxt.setText(String.valueOf(p));







        gameOnsound.start();
        r = new Random();


        countertxt = (TextView) findViewById(R.id.counter);

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        exit = (Button) findViewById(R.id.exit);

        score = (TextView) findViewById(R.id.scoreTxt);
        question = (TextView) findViewById(R.id.questionTxt);
        ans = (TextView) findViewById(R.id.anss);

        countertxt.setText("QUESTION " + counter + " OF " + mQuestionLength);
        score.setText("SCORE: " + mScore);
        updateQuestion(r.nextInt(mQuestionLength));
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(start.this, MainActivity.class);
                    gameOnsound.stop();
                    startActivity(intent);

            }
        });
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(answer1.getText().toString()==mAnswer){
                mScore++;
                score.setText("SCORE: " + mScore);

            }

                if(mScore>p)
                {
                    SharedPreferences.Editor editor = myprefs.edit();
                    editor.putInt("high", mScore);
                    editor.commit();
                }
                ans.setText("Q" + counter + " Ans. = " + mAnswer);
                counter++;
                countertxt.setText("QUESTION " + counter + " OF " + mQuestionLength);

            if (counter>mQuestionLength)
            {
                Toast.makeText(start.this, "Q"+mQuestionLength+ " Answer = " + mAnswer, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(start.this, end.class);
                gameOnsound.stop();

                startActivity(intent);
            }
            updateQuestion(r.nextInt(mQuestionLength));
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText().toString()==mAnswer){
                    mScore++;
                    score.setText("SCORE: " + mScore);
                }

                if(mScore>p)
                {
                    SharedPreferences.Editor editor = myprefs.edit();
                    editor.putInt("high", mScore);
                    editor.commit();
                }

                ans.setText("Q" + counter + " Ans. = " + mAnswer);
                counter++;
                countertxt.setText("QUESTION " + counter + " OF " + mQuestionLength);
                if (counter>mQuestionLength)
                {
                    Toast.makeText(start.this, "Q"+mQuestionLength+ " Answer = " + mAnswer, Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(start.this, end.class);
                    gameOnsound.stop();
                    startActivity(intent);
                }

                updateQuestion(r.nextInt(mQuestionLength));
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText().toString()==mAnswer){
                    mScore++;
                    score.setText("SCORE: " + mScore);
                }
                if(mScore>p)
                {
                    SharedPreferences.Editor editor = myprefs.edit();
                    editor.putInt("high", mScore);
                    editor.commit();
                }
                ans.setText("Q" + counter + " Ans. = " + mAnswer);
                counter++;
                countertxt.setText("QUESTION " + counter + " OF " + mQuestionLength);
                if (counter>mQuestionLength)
                {
                    Toast.makeText(start.this, "Q"+mQuestionLength+ " Answer = " + mAnswer, Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(start.this, end.class);
                    gameOnsound.stop();

                    startActivity(intent);
                }

                updateQuestion(r.nextInt(mQuestionLength));
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer4.getText().toString()==mAnswer){
                    mScore++;
                    gameOnsound.stop();

                    score.setText("SCORE: " + mScore);
                }
                if(mScore>p)
                {
                    SharedPreferences.Editor editor = myprefs.edit();
                    editor.putInt("high", mScore);
                    editor.commit();
                }
                ans.setText("Q" + counter + " Ans. = " + mAnswer);
                counter++;
                countertxt.setText("QUESTION " + counter + " OF " + mQuestionLength);

                if (counter>mQuestionLength)
                {
                    Toast.makeText(start.this, "Q"+mQuestionLength+ " Answer = " + mAnswer, Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(start.this, end.class);
                    gameOnsound.stop();
                }

                updateQuestion(r.nextInt(mQuestionLength));
            }
        });
    }

    private void updateQuestion(int num)
    {
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }




}
