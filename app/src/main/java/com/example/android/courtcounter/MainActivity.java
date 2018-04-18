package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
    }

    public void displayForTeamA() {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void addOneForTeamA(View view){
        scoreTeamA = scoreTeamA+1;
        displayForTeamA();
    }

    public void addTwoForTeamA(View view){
        scoreTeamA = scoreTeamA+2;
        displayForTeamA();
    }

    public void addThreeForTeamA(View view){
        scoreTeamA = scoreTeamA+3;
        displayForTeamA();
    }

    public void displayForTeamB() {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void addOneForTeamB(View view){
        scoreTeamB = scoreTeamB+1;
        displayForTeamB();
    }

    public void addTwoForTeamB(View view){
        scoreTeamB = scoreTeamB+2;
        displayForTeamB();
    }

    public void addThreeForTeamB(View view){
        scoreTeamB = scoreTeamB+3;
        displayForTeamB();
    }

    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA();
        displayForTeamB();
    }

}
