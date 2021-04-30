package com.example.carromtournament;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.carromtournament.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    int scoreTeamC=0;
    int scoreTeamD=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayForTeamC(0);
        displayForTeamD(0);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamC(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_c_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamD(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_d_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addwTeamA(View v){
        scoreTeamA=scoreTeamA+20;
        displayForTeamA(scoreTeamA);
    }
    public void addbTeamA(View v){
        scoreTeamA=scoreTeamA+10;
        displayForTeamA(scoreTeamA);
    }
    public void addqTeamA(View v){
        scoreTeamA=scoreTeamA+50;
        displayForTeamA(scoreTeamA);
    }
    public void foulTeamA(View v){
        scoreTeamA=scoreTeamA-10;
        displayForTeamA(scoreTeamA);
    }


    public void addwTeamB(View v){
        scoreTeamB=scoreTeamB+20;
        displayForTeamB(scoreTeamB);
    }
    public void addbTeamB(View v){
        scoreTeamB=scoreTeamB+10;
        displayForTeamB(scoreTeamB);
    }
    public void addqTeamB(View v){
        scoreTeamB=scoreTeamB+50;
        displayForTeamB(scoreTeamB);
    }
    public void foulTeamB(View v){
        scoreTeamB=scoreTeamB-10;
        displayForTeamB(scoreTeamB);
    }


    public void addwTeamC(View v){
        scoreTeamC=scoreTeamC+20;
        displayForTeamC(scoreTeamC);
    }
    public void addbTeamC(View v){
        scoreTeamC=scoreTeamC+10;
        displayForTeamC(scoreTeamC);
    }
    public void addqTeamC(View v){
        scoreTeamC=scoreTeamC+50;
        displayForTeamC(scoreTeamC);
    }
    public void foulTeamC(View v){
        scoreTeamC=scoreTeamC-10;
        displayForTeamC(scoreTeamC);
    }


    public void addwTeamD(View v){
        scoreTeamD=scoreTeamD+20;
        displayForTeamD(scoreTeamD);
    }
    public void addbTeamD(View v){
        scoreTeamD=scoreTeamD+10;
        displayForTeamD(scoreTeamD);
    }
    public void addqTeamD(View v){
        scoreTeamD=scoreTeamD+50;
        displayForTeamD(scoreTeamD);
    }
    public void foulTeamD(View v){
        scoreTeamD=scoreTeamD-10;
        displayForTeamD(scoreTeamD);
    }


    public void reset(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        scoreTeamC=0;
        scoreTeamD=0;
        displayForTeamA(0);
        displayForTeamB(0);
        displayForTeamC(0);
        displayForTeamD(0);
    }
}
