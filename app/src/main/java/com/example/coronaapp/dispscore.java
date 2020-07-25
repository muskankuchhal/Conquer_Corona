package com.example.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class dispscore extends AppCompatActivity {

    private long backpressedTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispscore);


        ImageView img=(ImageView)findViewById(R.id.imageView10);

        TextView text=(TextView) findViewById(R.id.disp);
        TextView s=(TextView)findViewById(R.id.text);
        String string=Integer.toString(Global.score);

        if(Global.level==0)
            string ="Your score: "+string+"\n Best score: 10";
        else
            string ="Your score: "+string+"\n Best score: 5";

        SpannableString ss=new SpannableString(string);
        ForegroundColorSpan fcs;

        if(Global.score<=0)
             fcs =new ForegroundColorSpan(Color.RED);
        else
            fcs =new ForegroundColorSpan(Color.GREEN);

        ss.setSpan(fcs,12,14, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);


       s.setText(ss);
        if(Global.score<=0)
        {
            text.setText("AWFUL!!");
        }
        else if(Global.score<=3) {
            text.setText("WELL DONE!!");
            img.setImageResource(R.drawable.trophy);
        }
        else {
            text.setText("SUPERB!!");
            img.setImageResource(R.drawable.trophy);
        }
        if(Global.level>=3)
        {
            Button n=(Button)findViewById(R.id.next);
            n.setText("FINISH GAME");
        }

        Global.score=0;
    }
    public void next(View view)
    {
        Global.level++;
        Intent i;
        if(Global.level>=3)
        {
            i=new Intent(this,homeActivity.class);
        }
        else
         i=new Intent(this,level_page.class);
        startActivity(i);
    }
    public void change(View view)
    {
        Intent i=new Intent(getBaseContext(),peopleActivity.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        if(backpressedTime+2000>System.currentTimeMillis())
        {
            Intent i=new Intent(this,level_page.class);
            startActivity(i);

        }
        else
            Toast.makeText(this,"question can not be revisited. Press again to restart level.",Toast.LENGTH_LONG).show();

        backpressedTime=System.currentTimeMillis();
    }
}
