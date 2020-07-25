package com.example.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class do_n_dons extends AppCompatActivity {
    int count=0;
    private long backpressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_n_dons);


        RadioButton c1=(RadioButton) findViewById(R.id.ch1);
        RadioButton c2=(RadioButton) findViewById(R.id.ch2);
        RadioButton c3=(RadioButton) findViewById(R.id.ch3);
        RadioButton c4=(RadioButton) findViewById(R.id.ch4);
        TextView question=(TextView) findViewById(R.id.question);

        question.setText("For how many days, you should follow strict self-isolation?");
        c1.setText("7-14 days");
        c2.setText("1-2 days");
        c3.setText("No isolation required");
        c4.setText("5 months");

    }
    public void next(View view)
    {
        count++;
        RadioButton c1=(RadioButton) findViewById(R.id.ch1);
        RadioButton c2=(RadioButton) findViewById(R.id.ch2);
        RadioButton c3=(RadioButton) findViewById(R.id.ch3);
        RadioButton c4=(RadioButton) findViewById(R.id.ch4);
        TextView question=(TextView) findViewById(R.id.question);



        switch(count)
        {
            case 1:
                if(c1.isChecked())
                    Global.score++;
                else
                    Global.score--;
                question.setText("In case of symptoms, what to do?");
                c1.setText("Keep following your normal routine");
                c2.setText("Go to a private hospital");
                c3.setText("Get tested by calling at Government of India's 24x7 helpline 011-2397 8046");
                c1.setText("Go to the chemist and ask for medicine");
                break;

            case 2:
                if(c3.isChecked())
                    Global.score++;
                else
                    Global.score--;
                question.setText("If you live with an infected person, what should you not  do?");
                c1.setText("Clean a shared bathroom each time you use it, for example by wiping the surfaces you have touched");
                c2.setText("Keep 2 metres (3 steps) away from each other");
                c3.setText("Avoid using shared spaces, such as kitchens or bathrooms, at the same time as each other");
                c4.setText("Share bed and other belongings");
                break;

            case 3:
                if(c4.isChecked())
                    Global.score++;
                else
                    Global.score--;
                question.setText("Who among them is not at high risk?");
                c1.setText("Physically disabled people");
                c2.setText("Senior citizens");
                c3.setText("People taking medicine that weakens your immune system");
                c4.setText("Pregnant women");
                break;

            case 4:
                if(c1.isChecked())
                    Global.score++;
                else
                    Global.score--;
                question.setText("When to discontinue home isolation?");
                c1.setText("You have had no fever while you took fever reducing medicine");
                c2.setText("You have had no fever for at least 72 hours(without the use of fever reducing medicines ");
                c3.setText("It has been 3 days since the symptoms started");
                c4.setText("You feel depressed");
                Button b=(Button)findViewById(R.id.button);
                b.setText("submit");
                break;

            case 5:
                if(c2.isChecked())
                    Global.score++;
                else
                    Global.score--;
                Intent i=new Intent(getBaseContext(),dispscore.class);
                startActivity(i);

                break;
        }
        c1.setChecked(false);
        c2.setChecked(false);
        c3.setChecked(false);
        c4.setChecked(false);
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
