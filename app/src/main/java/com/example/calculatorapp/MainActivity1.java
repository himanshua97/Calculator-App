package com.example.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity1 extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    float a=0,b=0,c=0,flag=0;
    float n;
    boolean add,sub,mul;
    String result="";
    TextView textView;
    String temp="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lineardemo1);
        textView=(TextView) findViewById(R.id.textview);



        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        b10=(Button) findViewById(R.id.b10);
        b11=(Button) findViewById(R.id.b11);
        b12=(Button) findViewById(R.id.b12);
        b13=(Button) findViewById(R.id.b13);
        b14=(Button) findViewById(R.id.b14);
        b15=(Button) findViewById(R.id.b15);
        b16=(Button) findViewById(R.id.b16);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        //switch (v.getId())
        int e = v.getId();
        //{

        if (e == R.id.b1) {
            //String text=textView.getText().toString();
            //a=Integer.parseInt(text);
            result = (result + "1");
            textView.setText(result);
        }


        if (e == R.id.b2) {
            //String text=textView.getText().toString();
            //a=Integer.parseInt(text);
            result = (result + "2");
            textView.setText(result);
        }

        if (e == R.id.b3) {
            //String text=textView.getText().toString();
            //a=Integer.parseInt(text);
            result = (result + "3");
            textView.setText(result);
        }

        if (e == R.id.b5) {
            //String text=textView.getText().toString();
            //a=Integer.parseInt(text);
            result = (result + "4");
            textView.setText(result);
        }

        if (e == R.id.b6) {
            //String text=textView.getText().toString();
            //a=Integer.parseInt(text);
            result = (result + "5");
            textView.setText(result);
        }


        if (e == R.id.b7) {
            //String text=textView.getText().toString();
            //a=Integer.parseInt(text);
            result = (result + "6");
            textView.setText(result);
        }


        if (e == R.id.b9) {
            //String text=textView.getText().toString();
            //a=Integer.parseInt(text);
            result = (result + "7");
            textView.setText(result);
        }


        if (e == R.id.b10) {
            //String text=textView.getText().toString();
            //a=Integer.parseInt(text);
            result = (result + "8");
            textView.setText(result);
        }


        if (e == R.id.b11) {
            //String text=textView.getText().toString();
            //a=Integer.parseInt(text);
            result = (result + "9");
            textView.setText(result);
        }

        if (e == R.id.b14) {

            result = (result + ".");
            textView.setText(result);

        }

        if (e == R.id.b13) {
            result=(result+"0");
            textView.setText(result);
        }


        if (e == R.id.b4)
        {
            String text = textView.getText().toString();
            a=Float.parseFloat(text);

            if(a==0)
            {
                Toast.makeText(getApplicationContext(),"enter any number",Toast.LENGTH_LONG).show();
            }
            else {
                textView.setText("");
                temp = "+";
                flag = 1;
                add=true;
                result="";
            }
        }


        if (e == R.id.b8) {
            String text = textView.getText().toString();
            a=Float.parseFloat(text);
            textView.setText("");
            result="";
            temp = "-";
            flag=1;
            sub=true;
        }


        if (e == R.id.b12) {
            String text = textView.getText().toString();
            a=Float.parseFloat(text);
            textView.setText("");
            temp = "*";
            result = "";
            flag=1;
            mul=true;
        }

        if (e == R.id.b15)
        {
            String text = (String) textView.getText().toString();
//            if(text.length()!=0)
//            {
//                textView.setText("");
//                result="";
//            }
           if(text.length()!=0) {
                textView.setText(text.substring(0,text.length()));
                result= textView.getText().toString();
            }
            else if(text.length()==0)
           {
                Toast.makeText(getApplicationContext(),"cannot delete more",Toast.LENGTH_LONG).show();

            }
        }

        if (e == R.id.b16) {
            if (a!=0) {


                String var2 = (String) textView.getText().toString();
                b = Float.parseFloat(var2);

                if (temp.equals("+")) {
                    c = a + b;
                    add = false;
                }

                if (temp.equals("-")) {
                    c = a - b;
                    sub = false;
                }

                if (mul == true) {
                    c = a * b;
                    mul = false;
                }

                textView.setText(c +"");
            }
                else
                {

                    Toast.makeText(getApplicationContext(),"enter a number",Toast.LENGTH_SHORT).show();


                }

            }
        }


    }




