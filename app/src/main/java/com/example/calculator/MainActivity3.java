package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button c = findViewById(R.id.button8);
        Button s = findViewById(R.id.button10);
        EditText e = findViewById(R.id.editTextTextPersonName3);
        TextView t = findViewById(R.id.textView);
        TextView t1 = findViewById(R.id.textView5);
        TextView t2 = findViewById(R.id.textView7);


        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = t1.getText().toString();
                t1.setText(t2.getText().toString());
                t2.setText(temp);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().toString().equals("Binary")) {
                    String a;
                    String s = e.getText().toString();
                    Binary b = new Binary(s);
                    if (b.getDec() != -1) {
                        a = "Value is " + b.getDec();
                    } else {
                        a = "Invalid Input!!!";
                    }

                    t.setText(a);
                }
                else {
                    String a;
                    String s = e.getText().toString();
                    if (s.length() > 15) {
                        Toast.makeText(MainActivity3.this, "Number is too large.", Toast.LENGTH_SHORT).show();
                    } else {
                        Binary b = new Binary(s);
                        a = "Value is " + b.getBin();
                        t.setText(a);
                    }
                }
            }

        });
    }
}