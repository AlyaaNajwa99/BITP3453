package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    TextView txt2;
    EditText editText1, editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        txt2 = findViewById(R.id.textView2);
        editText1 = findViewById(R.id.et1);
        editText2 = findViewById(R.id.et2);
        button = findViewById(R.id.button2);
    }


    public void fnGreet(View view) {

        String strName = editText1.getText().toString();
        String strAge = editText2.getText().toString();

        int present = 2022;
        int i=Integer.parseInt(strAge);
        int yourAge = present - i;

        txt2.setText("Helloo and welcome " + strName + "You are " + yourAge + " years old");
    }


    public void fnThreadActivity(View view) {
        Intent intent = new Intent(this, ThreadedActivity.class);
        String strMsg = ((Button) findViewById(R.id.button3)).getText().toString();
        intent.putExtra("varStr1", strMsg);
        startActivity(intent);
    }
}