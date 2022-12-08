package com.example.resistor3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private static final String TAG = "Activity2";
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "TEXT";
    public static final String TEXT2 = "TEXT2";
    public static final String TEXT3 = "TEXT3";
    public static final String TEXT4 = "TEXT4";
    public static final String TEXT5 = "TEXT5";
    private String savedText1, savedText2, savedText3, savedText4, savedText5;
    private TextView textView1, textView2, textView3, textView4, textView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        Intent intent2 = getIntent();
        String text2 = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        //   int Number = intent.getIntExtra(MainActivity.EXTRA_NUM, 0);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        //     TextView textView2 = (TextView) findViewById(R.id.textView2);
        Button button1 = (Button) findViewById(R.id.buttonCalc);
        Button button2 = (Button) findViewById(R.id.clear);
        Button button3 = (Button) findViewById(R.id.save);
        Button button4 = (Button) findViewById(R.id.load);
        textView1.setText(text);//pulling crap from frist class
        //savedata will crash if thisisnt here
        // saveData();
        methodA();
        try {
            loadData();
            Toast.makeText(getApplicationContext(), "load", Toast.LENGTH_SHORT).show();
            updateViews();
            Toast.makeText(getApplicationContext(), "update", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }



        button1.setOnClickListener(new View.OnClickListener() {//will go back to main screen and save data
            public void onClick(View v) {
                methodA();
                Toast.makeText(getApplicationContext(), "method A", Toast.LENGTH_SHORT).show();
                saveData();
                Toast.makeText(getApplicationContext(), "save", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    clear();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {//back to mainScreen
            @Override
            public void onClick(View v) {
                saveData();
                Toast.makeText(getApplicationContext(), "save", Toast.LENGTH_SHORT).show();
                updateViews();
                Toast.makeText(getApplicationContext(), "update", Toast.LENGTH_SHORT).show();
                Intent returnBtn = new Intent(getApplicationContext(),
                        MainActivity.class);

                startActivity(returnBtn);
            }});

        button4.setOnClickListener(new View.OnClickListener() {/////LOAD
            @Override
            public void onClick(View v) {
                loadData();
                Toast.makeText(getApplicationContext(), "loadbUTTON", Toast.LENGTH_SHORT).show();
                saveData();
                Toast.makeText(getApplicationContext(), "saveLOAD", Toast.LENGTH_SHORT).show();
                updateViews();
                Toast.makeText(getApplicationContext(), "update", Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void methodA() {
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        String one =  textView1.getText().toString();
        String two = textView2.getText().toString();
        String three = textView3.getText().toString();
        String four = textView4.getText().toString();
        String five = textView5.getText().toString();


        if (textView2.getText().toString().equals(one)) {//do no
        } else {
            one = textView1.getText().toString();
            textView2.setText(one);
        }

        if (textView3.getText().toString().equals(two)) {//do no
        } else {
            two = textView1.getText().toString();
            textView3.setText(two);
        }

        if (textView4.getText().toString().equals(three)) {//do no
        } else {
            three = textView1.getText().toString();
            textView4.setText(three);
        }

        if (textView5.getText().toString().equals(four)) {//do no
        } else {
            four = textView1.getText().toString();
            textView5.setText(four);
        }

    }


    public void saveData() {

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE); //MODE PRIVATE MEANS NO OTHER APP CAN GET THE SHARED PREFERANCE
        SharedPreferences.Editor editor = sharedPreferences.edit();


        // editor.putString(TEXT, textView1.getText().toString());
        editor.putString(TEXT2, textView2.getText().toString());
        editor.putString(TEXT3, textView3.getText().toString());
        editor.putString(TEXT4, textView4.getText().toString());
        editor.putString(TEXT5, textView5.getText().toString());
        editor.apply();
    }
    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE); //MODE PRIVATE MEANS NO OTHER APP CAN GET THE SHARED PREFERANCE
        // savedText1 = sharedPreferences.getString(TEXT, "");// defalut is empty string
        savedText2 = sharedPreferences.getString(TEXT2, "");// defalut is empty string
        savedText3 = sharedPreferences.getString(TEXT3, "");// defalut is empty string
        savedText4 = sharedPreferences.getString(TEXT4, "");// defalut is empty string
        savedText5 = sharedPreferences.getString(TEXT5, "");// defalut is empty string

    }
    public void updateViews(){
        // textView1.setText(savedText1);//text not TEXT
        textView2.setText(savedText2);//text not TEXT
        textView3.setText(savedText3);//text not TEXT
        textView4.setText(savedText4);//text not TEXT
        textView5.setText(savedText5);//text not TEXT


    }

    public void clear(){
        //textView1.setText("");//text not TEXT
        textView2.setText("");//text not TEXT
        textView3.setText("");//text not TEXT
        textView4.setText("");//text not TEXT
        textView5.setText("");//text not TEXT


    }

}












