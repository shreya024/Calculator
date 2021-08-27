package com.sgshreya.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView answer;
    EditText num1;
    EditText num2;
    Button equal;
    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    double res=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=findViewById(R.id.plus);
        subtract=findViewById(R.id.minus);
        multiply=findViewById(R.id.into);
        divide=findViewById(R.id.divide);
        answer=findViewById(R.id.result);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        equal=findViewById(R.id.equals);
        add.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        equal.setOnClickListener(this);

    }

    @Override
    public void onClick(View src){
        double n1=Double.parseDouble(num1.getText().toString());
        double n2=Double.parseDouble(num2.getText().toString());
        switch (src.getId()){
            case R.id.equals:
                answer.setText(String.valueOf(res));
                break;
            case R.id.plus:
                res=n1+n2;
                break;
            case R.id.minus:
                res=n1-n2;
                break;
            case R.id.into:
                res=n1*n2;
                break;
            case R.id.divide:
                res=n1/n2;
                break;
        }
    }


}