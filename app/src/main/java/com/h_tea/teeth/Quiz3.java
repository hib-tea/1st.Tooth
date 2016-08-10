package com.h_tea.teeth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by h_tea on 2016-06-20.
 */
public class Quiz3 extends Activity {

    Button Submit1;
    RadioButton option1, option2, option3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz3);
        option3 = (RadioButton)findViewById(R.id.option3);
        option2 = (RadioButton)findViewById(R.id.option2);
        option1 = (RadioButton)findViewById(R.id.option1);

        Submit1 = (Button) findViewById(R.id.submit1);

        Submit1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(option1.isChecked())
                {
                    Intent intent = new Intent(Quiz3.this,Quiz4.class );
                    startActivity(intent);}
                else if(option1.isChecked()){
                    Toast.makeText(getApplicationContext(), "정답이 아닙니다.",  Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Quiz3.this,mainmain.class );
                    startActivity(intent);
                }
                else if(option3.isChecked()){
                    Toast.makeText(getApplicationContext(), "정답이 아닙니다.",  Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Quiz3.this,mainmain.class );
                    startActivity(intent);
                }



            }
        });

    }}