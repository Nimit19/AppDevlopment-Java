package com.example.quizapp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView Question,opt1,opt2,opt3,opt4;
    static int index = 0;

    private String Quiz;

    String[] Que = {"1 + 2 = _____", "5 * 4 = _____","8 / 2 = _____"};
    String[][] Option = {
            {"3", "4", "5", "6"},
            {"18", "22", "21", "20"},
            {"16", "8", "4", "2"},
    };



    int[] Answer = {0,3,2};
    int[] checkAnswer = new int[Answer.length];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Question = findViewById(R.id.Question);

        opt1 = findViewById(R.id.opt1);
        opt2 = findViewById(R.id.opt2);
        opt3 = findViewById(R.id.opt3);
        opt4 = findViewById(R.id.opt4);

        for (int i = 0; i < Answer.length; i++) {
            checkAnswer[i] = -1;
        }
        setQuestion(index);


    }
    public void clickA(View v){
        checkAnswer[index] = 0;
        String p = "Que " + (index+1) + ": " + Que[index].replace("_____",Option[index][checkAnswer[index]]);
        Question.setText(p);
    }
    public void clickB(View v){
        checkAnswer[index] = 1;
        String p = "Que " + (index+1) + ": " + Que[index].replace("_____",Option[index][checkAnswer[index]]);
        Question.setText(p);
    }
    public void clickC(View v){
        checkAnswer[index] = 2;
        String p = "Que " + (index+1) + ": " + Que[index].replace("_____",Option[index][checkAnswer[index]]);
        Question.setText(p);
    }
    public void clickD(View v){
        checkAnswer[index] = 3;
        String p = "Que " + (index+1) + ": " + Que[index].replace("_____",Option[index][checkAnswer[index]]);
        Question.setText(p);
    }

    public void setQuestion(int n){

        if (checkAnswer[n] == -1) {
            String q = "Que " + (n+1) + ": " + Que[n];
            Question.setText(q);
        }else{
            String p = "Que " + (n+1) + ": " + Que[n].replace("_____",Option[n][checkAnswer[n]]);
            Question.setText(p);
        }

        opt1.setText(Option[n][0]);
        opt2.setText(Option[n][1]);
        opt3.setText(Option[n][2]);
        opt4.setText(Option[n][3]);
    }

    public void clickNext(View v){

        if(index == Que.length - 1){
            Toast.makeText(this, "All Question is over", Toast.LENGTH_SHORT).show();
        }else{
            index += 1;
            setQuestion(index);
        }

    }

    public void clickPrevious(View v){
        if (index > 0) {
            index -= 1;
        }
        setQuestion(index);
    }

    public void clickSubmit(View v){
        int score = 0;

        if(score >= Que.length){
            Toast.makeText(this, "Your Score is: " + score + "/" + Que.length, Toast.LENGTH_SHORT).show();
            return;
        }

        for (int i = 0; i < Answer.length; i++) {
            if(Answer[i] == checkAnswer[i]){
                score = score + 1;
            }

        }
        Toast.makeText(this, "Your Score is: " + score + "/" + Que.length, Toast.LENGTH_SHORT).show();

    }

}