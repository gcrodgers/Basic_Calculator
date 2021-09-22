package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view) {
        int x = 0;
        int y =0;
        EditText firstNumberText = (EditText) findViewById(R.id.firstNumberText);
        String num1 = firstNumberText.getText().toString();

        EditText secondNumberText = (EditText) findViewById(R.id.secondNumberText);
        String num2 = secondNumberText.getText().toString();

        try {
            x = Integer.parseInt(num1);
            y = Integer.parseInt(num2);
        }
        catch(NumberFormatException e) {
            System.out.println("Error parsing " + e);
        }

        int result = x + y;
        String answer = String.valueOf(result);

        goToActivity2(answer);
    }

    public void subtractFunction(View view) {
        int x = 0;
        int y =0;
        EditText firstNumberText = (EditText) findViewById(R.id.firstNumberText);
        String num1 = firstNumberText.getText().toString();

        EditText secondNumberText = (EditText) findViewById(R.id.secondNumberText);
        String num2 = secondNumberText.getText().toString();

        try {
            x = Integer.parseInt(num1);
            y = Integer.parseInt(num2);
        }
        catch(NumberFormatException e) {
            System.out.println("Error parsing " + e);
        }

        int result = x - y;
        String answer = String.valueOf(result);

        goToActivity2(answer);
    }

    public void multFunction(View view) {
        int x = 0;
        int y =0;
        EditText firstNumberText = (EditText) findViewById(R.id.firstNumberText);
        String num1 = firstNumberText.getText().toString();

        EditText secondNumberText = (EditText) findViewById(R.id.secondNumberText);
        String num2 = secondNumberText.getText().toString();

        try {
            x = Integer.parseInt(num1);
            y = Integer.parseInt(num2);
        }
        catch(NumberFormatException e) {
            System.out.println("Error parsing " + e);
        }

        int result = x * y;
        String answer = String.valueOf(result);

        goToActivity2(answer);
    }

    public void divFunction(View view) {
        int x = 0;
        int y =0;
        EditText firstNumberText = (EditText) findViewById(R.id.firstNumberText);
        String num1 = firstNumberText.getText().toString();

        EditText secondNumberText = (EditText) findViewById(R.id.secondNumberText);
        String num2 = secondNumberText.getText().toString();

        try {
            x = Integer.parseInt(num1);
            y = Integer.parseInt(num2);
        }
        catch(NumberFormatException e) {
            System.out.println("Error parsing " + e);
        }

        int result = x / y;
        String answer = String.valueOf(result);

        goToActivity2(answer);
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}