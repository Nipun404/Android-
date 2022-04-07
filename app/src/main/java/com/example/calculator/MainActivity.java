package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.mariuszgromada.math.mxparser.*;

import org.xml.sax.InputSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

import javax.xml.namespace.QName;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3 , b4 ,b5, b6, b7, b8, b9, b0, dot, div, mul, add ,sub, equal,c,cl;
    TextView e;
    String x ;
    EditText t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button28);
        b2 = findViewById(R.id.button29);
        b3 = findViewById(R.id.button2);
        b4 = findViewById(R.id.button);
        b5 = findViewById(R.id.button32);
        b6 = findViewById(R.id.button33);
        b7 = findViewById(R.id.button34);
        b8 = findViewById(R.id.button35);
        b9 = findViewById(R.id.button36);
        b0 = findViewById(R.id.button37);
        dot = findViewById(R.id.button42);
        div = findViewById(R.id.button41);
        mul = findViewById(R.id.button40);
        add = findViewById(R.id.button38);
        sub = findViewById(R.id.button39);
        equal = findViewById(R.id.button43);
        cl = findViewById(R.id.button4);
        t = findViewById(R.id.editTextTextPersonName);

        c = findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                update("1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                update("2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                update("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                update("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                update("5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                update("6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                update("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                update("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                update("9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                update("0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                update(".");
            }
        });
        add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                update("+");
            }
        });
        mul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                update("x");
            }
        });
        div.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                update("÷");
            }
        });
        c.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                t.setText("");
            }
        });
        sub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                update("-");
            }
        });
        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = t.getText().toString();
                if (c.length()!=0) {
                    StringBuilder a = new StringBuilder(c);
                    a.deleteCharAt(c.length() - 1);
                    t.setText(a);
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                x = t.getText().toString();
                x = x.replaceAll("x", "*");
                x = x.replaceAll("÷", "/");
                Expression exp = new Expression(x);
                String res = String.valueOf(exp.calculate());
                t.setText(res);

            }
        });
    }

    public void update (String add)
    {
        String old = t.getText().toString();
        t.setText(old + add);
    }
}