package com.example.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class yes extends AppCompatActivity {

    private long backpressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes);

        TextView textView = findViewById(R.id.text_block);
        textView.setText(Global.yes[Global.q_index - 1]);
    }

    public void cont(View view){
        Intent nxt;
        if(Global.q_index != 10) {
            nxt = new Intent(getBaseContext(), question.class);
        }
        else {
            nxt = new Intent(getBaseContext(), dispscore.class);
        }
        startActivity(nxt);
    }

    @Override
    public void onBackPressed() {
        if(backpressedTime+2000>System.currentTimeMillis())
        {
            Intent i=new Intent(this,level_page.class);
            startActivity(i);

        }
        else
        Toast.makeText(yes.this,"question can not be revisited. Press again to restart level.",Toast.LENGTH_LONG).show();

        backpressedTime=System.currentTimeMillis();
    }
}
