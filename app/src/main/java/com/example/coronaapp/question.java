package com.example.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class question extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        TextView textView = findViewById(R.id.Q_text);
        textView.setText(Global.questions[Global.q_index]);

        String image_path = "@drawable/ques" + (char)(Global.q_index + '0');
        int imageResource = getResources().getIdentifier(image_path, null, getPackageName());
        Drawable res = getResources().getDrawable(imageResource);

        ImageView imageView = findViewById(R.id.question_icon);
        imageView.setImageDrawable(res);


    }

    public void yes(View view){
        Global.q_index++;
        Intent nxt;
        if(Global.truth[Global.q_index-1] == 1){
            Global.score++;
            nxt = new Intent(getBaseContext(), yes.class);
        }
        else{
            Global.score--;
            nxt = new Intent(getBaseContext(), no.class);
        }

        startActivity(nxt);
    }

    public void no(View view) {
        Global.q_index++;
        Intent nxt;
        if(Global.truth[Global.q_index-1] == 0){
            Global.score++;
            nxt = new Intent(getBaseContext(), yes.class);
        }
        else{
            Global.score--;
            nxt = new Intent(getBaseContext(), no.class);
        }
        startActivity(nxt);
    }
}