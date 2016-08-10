package com.h_tea.teeth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by h_tea on 2016-06-20.
 */
public class EndQuiz extends Activity{

    Button king;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.endquiz);
        king = (Button)findViewById(R.id.king);

        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EndQuiz.this,mainmain.class );
                startActivity(intent);
            }
        });
    }



}
