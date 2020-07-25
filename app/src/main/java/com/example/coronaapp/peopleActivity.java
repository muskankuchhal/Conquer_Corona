package com.example.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class peopleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
    }
    public void LEVEL1(View view) { //NORMAL PEOPLE
        Global.level = 0;
        Global.score=0;
        Intent i = new Intent(this, level_page.class);
        startActivity(i);
    }

    public void LEVEL2(View view) {  //PEOPLE SEEKING HELP
        Global.level = 1;
        Global.score=0;
        Intent i = new Intent(this, level_page.class);
        startActivity(i);
    }

    public void LEVEL3(View view) {  //PEOPLE RECOGNISING SYMPTOMS
        Global.level = 2;
        Global.score=0;
        Intent i = new Intent(this, level_page.class);
        startActivity(i);
    }
    public void home(View view)
    {
        Intent i=new Intent(this,homeActivity.class);
        startActivity(i);
    }
}
