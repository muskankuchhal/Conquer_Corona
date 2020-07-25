package com.example.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.widget.CheckBox;

public class symptoms extends AppCompatActivity {

    CheckBox[] cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);

        cb = new CheckBox[9];
        cb[0]=(CheckBox)findViewById(R.id.check1);
        cb[1]=(CheckBox)findViewById(R.id.check2);
        cb[2]=(CheckBox)findViewById(R.id.check3);
        cb[3]=(CheckBox)findViewById(R.id.check4);
        cb[4]=(CheckBox)findViewById(R.id.check5);
        cb[5]=(CheckBox)findViewById(R.id.check6);
        cb[6]=(CheckBox)findViewById(R.id.check7);
        cb[7]=(CheckBox)findViewById(R.id.check8);
        cb[8]=(CheckBox)findViewById(R.id.check9);
    }

    public void ch1(View view)
    {
        cb[0].toggle();
    }
    public void ch2(View view)
    {
        cb[1].toggle();
    }
    public void ch3(View view)
    {
        cb[2].toggle();
    }
    public void ch4(View view)
    {
        cb[3].toggle();
    }
    public void ch5(View view)
    {
        cb[4].toggle();
    }
    public void ch6(View view)
    {
        cb[5].toggle();
    }
    public void ch7(View view)
    {
        cb[6].toggle();
    }
    public void ch8(View view)
    {
        cb[7].toggle();
    }
    public void ch9(View view)
    {
        cb[8].toggle();
    }

    public void submit(View view)
    {
        for(int i=0;i<9;i++){
            if(cb[i].isChecked()){
                if(i==0||i==2||i==4||i==5||i==8)
                    Global.score++;
                else
                    Global.score--;
            }
        }
        Intent i = new Intent(getBaseContext(), dispscore.class);
        startActivity(i);
    }
}
