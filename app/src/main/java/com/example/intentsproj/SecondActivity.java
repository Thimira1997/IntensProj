package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText number1,number2;
    TextView resu;
    float res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TextView txtVMsg= findViewById(R.id.num1);
        txtVMsg.setText(R.string.num1);

        TextView txtVMsg1= findViewById(R.id.num2);
        txtVMsg1.setText(R.string.num2);

        Button btnplus=(Button) findViewById(R.id.btnplus);
        Button btnminus=(Button)findViewById(R.id.btnminus);
        Button btndivide=(Button)findViewById(R.id.btndivide);
        Button btnmulti=(Button)findViewById(R.id.btnmulti);

        number1=(EditText) findViewById(R.id.editTextNumber3);
        number2=(EditText) findViewById(R.id.editTextNumber4);


        resu=(TextView) findViewById(R.id.Answer);


        btnplus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String mynum1=number1.getText().toString();
                float mnum1=Float.parseFloat(mynum1);

                String mynum2=number2.getText().toString();
                float mnum2=Float.parseFloat(mynum2);

                res=mnum1+mnum2;
                resu.setText(Float.toString(res));
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String mynum1=number1.getText().toString();
                float mnum1=Float.parseFloat(mynum1);

                String mynum2=number2.getText().toString();
                float mnum2=Float.parseFloat(mynum2);

                res=mnum1-mnum2;
                resu.setText(Float.toString(res));
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String mynum1=number1.getText().toString();
                float mnum1=Float.parseFloat(mynum1);

                String mynum2=number2.getText().toString();
                float mnum2=Float.parseFloat(mynum2);

                res=mnum1*mnum2;
                resu.setText(Float.toString(res));
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String mynum1=number1.getText().toString();
                float mnum1=Float.parseFloat(mynum1);

                String mynum2=number2.getText().toString();
                float mnum2=Float.parseFloat(mynum2);

                res=mnum1/mnum2;
                resu.setText(Float.toString(res));
            }
        });



    }
}