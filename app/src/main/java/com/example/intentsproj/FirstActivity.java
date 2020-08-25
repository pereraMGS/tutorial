package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    String num1, num2;

    public static final String EXTRA_MESSAGE = "com.example.intentsproj";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ok_Button(View view){
        Intent intent = new Intent(this, SecondActivity.class);

        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber2);
        num1 = editText.getText().toString();
        num2 = editText2.getText().toString();

        intent.putExtra("value1", num1);
        intent.putExtra("value2", num2);

        startActivity(intent);
    }
}