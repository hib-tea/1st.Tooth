package com.h_tea.teeth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button t1, t2,t3,t4,t5,t6,t7,t8,t12, t22,t32,t42,t52,t62,t72,t82;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teeth);

        t1 = (Button)findViewById(R.id.t1);
        t2 = (Button)findViewById(R.id.t2);
        t3 = (Button)findViewById(R.id.t3);
        t4 = (Button)findViewById(R.id.t4);
        t5 = (Button)findViewById(R.id.t5);
        t6 = (Button)findViewById(R.id.t6);
        t7 = (Button)findViewById(R.id.t7);
        t8 = (Button)findViewById(R.id.t8);
        t12 = (Button)findViewById(R.id.t12);
        t22 = (Button)findViewById(R.id.t22);
        t32 = (Button)findViewById(R.id.t32);
        t42 = (Button)findViewById(R.id.t42);
        t52 = (Button)findViewById(R.id.t52);
        t62 = (Button)findViewById(R.id.t62);
        t72 = (Button)findViewById(R.id.t72);
        t82 = (Button)findViewById(R.id.t82);


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t8.class );
                startActivity(intent);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t7.class );
                startActivity(intent);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t6.class );
                startActivity(intent);
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t5.class );
                startActivity(intent);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t4.class );
                startActivity(intent);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t3.class );
                startActivity(intent);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t2.class );
                startActivity(intent);
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t1.class );
                startActivity(intent);
            }
        });


        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t1.class );
                startActivity(intent);
            }
        });

        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t2.class );
                startActivity(intent);
            }
        });

        t32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t3.class );
                startActivity(intent);
            }
        });

        t42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t4.class );
                startActivity(intent);
            }
        });
        t52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t5.class );
                startActivity(intent);
            }
        });
        t62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t6.class );
                startActivity(intent);
            }
        });
        t72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t7.class );
                startActivity(intent);
            }
        });
        t82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,t8.class );
                startActivity(intent);
            }
        });


    }
}
