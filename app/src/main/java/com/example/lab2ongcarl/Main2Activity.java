package com.example.lab2ongcarl;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void nextScreen(View V){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
    public static final String prefName = "MyPrefsFile";
    EditText e1;
    public void check(View V){
        e1 = findViewById(R.id.editText9);
        String c1 = e1.getText().toString();
        SharedPreferences prefs = getSharedPreferences(prefName, MODE_PRIVATE);
        String name = prefs.getString(c1, "No name defined");//"No name defined" is the default value.

        boolean var =  prefs.contains(name);
        if(var==true) {
            Toast.makeText(this, "Course Offered", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Course Not Offered", Toast.LENGTH_LONG).show();
        }

    }
}



