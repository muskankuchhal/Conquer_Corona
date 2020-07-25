package com.example.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class level_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_page);

        TextView textView = findViewById(R.id.Level_Des);
        textView.setText(Global.level_des[Global.level]);
    }

    public void start(View view) {
        Intent nxt;
        Global.score=0;
        if(Global.level == 0){
            Global.q_index = 0;
            nxt = new Intent(this, question.class);
        }
        else if(Global.level == 1){
            nxt = new Intent(this, symptoms.class);
        }
        else if(Global.level==2){
            nxt = new Intent(this, do_n_dons.class);
        }
        else
        {
            Global.level=0;
            nxt= new Intent (this,homeActivity.class);

        }

        startActivity(nxt);
    }

    public void back(View view) {
      Intent i=new Intent(this,peopleActivity.class);
      startActivity(i);
    }


}
