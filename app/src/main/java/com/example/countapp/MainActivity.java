package com.example.countapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2;
    TextView t1;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.toast);
        b2 = (Button)findViewById(R.id.count);
        t1 = (TextView)findViewById(R.id.textcount);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello To Everyone", Toast.LENGTH_SHORT).show();
            }
        });

    }

           
    public void countinc(View view) {
        i++;
        t1.setText(Integer.toString(i));
    }

    public void countdec(View view) {
        if (i<=0){
            Toast.makeText(this, "It doesn't decrease", Toast.LENGTH_SHORT).show();
        }else {
            i--;
            t1.setText(Integer.toString(i));
        }
    }

    public void reset(View view) {
        i=0;
        t1.setText(Integer.toString(i));
    }
}
