package com.h_tea.teeth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by h_tea on 2016-06-20.
 */


public class Upteeth extends Activity {

    Button ut1, ut2,ut3,ut4,ut5,ut6,ut7,ut8,ut12, ut22,ut32,ut42,ut52,ut62,ut72,ut82;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upteeth);

        ut1 = (Button)findViewById(R.id.ut1);
        ut2 = (Button)findViewById(R.id.ut2);
        ut3 = (Button)findViewById(R.id.ut3);
        ut4 = (Button)findViewById(R.id.ut4);
        ut5 = (Button)findViewById(R.id.ut5);
        ut6 = (Button)findViewById(R.id.ut6);
        ut7 = (Button)findViewById(R.id.ut7);
        ut8 = (Button)findViewById(R.id.ut8);
        ut12 = (Button)findViewById(R.id.ut12);
        ut22 = (Button)findViewById(R.id.ut22);
        ut32 = (Button)findViewById(R.id.ut32);
        ut42 = (Button)findViewById(R.id.ut42);
        ut52 = (Button)findViewById(R.id.ut52);
        ut62 = (Button)findViewById(R.id.ut62);
        ut72 = (Button)findViewById(R.id.ut72);
        ut82 = (Button)findViewById(R.id.ut82);

        ut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut1.class );
                startActivity(intent);
            }
        });

        ut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut2.class );
                startActivity(intent);
            }
        });
        ut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut3.class );
                startActivity(intent);
            }
        });
        ut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut4.class );
                startActivity(intent);
            }
        });
        ut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut5.class );
                startActivity(intent);
            }
        });
        ut6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut6.class );
                startActivity(intent);
            }
        });
        ut7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut7.class );
                startActivity(intent);
            }
        });
        ut8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut8.class );
                startActivity(intent);
            }
        });

        ut12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut1.class );
                startActivity(intent);
            }
        });

        ut22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut2.class );
                startActivity(intent);
            }
        });
        ut32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut3.class );
                startActivity(intent);
            }
        });
        ut42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut4.class );
                startActivity(intent);
            }
        });
        ut52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut5.class );
                startActivity(intent);
            }
        });
        ut62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut6.class );
                startActivity(intent);
            }
        });
        ut72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut7.class );
                startActivity(intent);
            }
        });
        ut82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upteeth.this, ut8.class );
                startActivity(intent);
            }
        });


    }
}
