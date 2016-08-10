package com.h_tea.teeth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by h_tea on 2016-06-19.
 */
public class mainmain extends Activity {

    Button upper, under, help, quiz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quiz = (Button)findViewById(R.id.quiz);
        upper = (Button)findViewById(R.id.upper);
        under = (Button)findViewById(R.id.under);
        help = (Button)findViewById(R.id.help);

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainmain.this,Quiz1.class );
                startActivity(intent);
            }
        });
        upper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainmain.this,Upteeth.class );
                startActivity(intent);
            }
        });
        under.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainmain.this,MainActivity.class );
                startActivity(intent);
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainmain.this,help.class );
                startActivity(intent);
            }
        });


    }

}