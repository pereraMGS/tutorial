package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static java.lang.Double.parseDouble;

public class SecondActivity extends AppCompatActivity {

    String num1,num2,cal;
    double tot;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        TextView textView1 = findViewById(R.id.editTextNumber4);
        TextView textView2 = findViewById(R.id.editTextNumber3);

        num1 = intent.getExtras().getString("value1");
        num2 = intent.getExtras().getString("value2");

        textView1.setText(num1);
        textView2.setText(num2);

        answer = findViewById(R.id.calculation);
    }

    public void addcal(View view){
        tot = parseDouble(num1) + parseDouble(num2);
        cal = num1+" - "+num2+" = "+this.tot;
        answer.setText(cal);
    }

    public void subcal(View view){
        tot = parseDouble(num1) - parseDouble(num2);
        cal = num1+" - "+num2+" = "+this.tot;
        answer.setText(cal);
    }

    public void mulcal(View view){
        tot = parseDouble(num1) * parseDouble(num2);
        cal = num1+" - "+num2+" = "+this.tot;
        answer.setText(cal);
    }

    public void divcal(View view){
        tot = parseDouble(num1) / parseDouble(num2);
        cal = num1+" - "+num2+" = "+this.tot;
        answer.setText(cal);
    }



}