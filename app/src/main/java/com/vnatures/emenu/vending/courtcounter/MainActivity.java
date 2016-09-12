package com.vnatures.emenu.vending.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayA(int value){
        TextView textView = (TextView)findViewById(R.id.team_a_score);
        textView.setText(String.valueOf(value));

    }

    public void displayB(int value){
        TextView textView = (TextView)findViewById(R.id.team_b_score);
        textView.setText(String.valueOf(value));

    }


    public void onTwoTeammAClicked(View view) {
        scoreTeamA = scoreTeamA+2;
        displayA(scoreTeamA);
    }

    public void onThreeTeamAClicked(View view) {
        scoreTeamA = scoreTeamA +3;
        displayA(scoreTeamA);
    }



    public void onFreeTeamAClicked(View view) {
        scoreTeamA = scoreTeamA+1;
        displayA(scoreTeamA);
    }



    public void onFreeTeamBClicked(View view) {
        scoreTeamB = scoreTeamB+1;
        displayB(scoreTeamB);
    }



    public void onTwoTeamBClicked(View view) {
        scoreTeamB = scoreTeamB+1;
        displayB(scoreTeamB);
    }

    public void onThreeTeamBClicked(View view) {
        scoreTeamB = scoreTeamB+3;
        displayB(scoreTeamB);
    }

    public void onResetClicked(View view) {
        scoreTeamA =0;
        scoreTeamB = 0;
        displayA(scoreTeamA);
        displayB(scoreTeamB);

    }
}
