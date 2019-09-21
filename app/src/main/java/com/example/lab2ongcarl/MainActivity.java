package com.example.lab2ongcarl;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4,e5 ,e6 ,e7 , e8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static final String prefName = "MyPrefsFile";
    public void uSave(View V){
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
        e3 = findViewById(R.id.editText3);
        e4 = findViewById(R.id.editText4);
        e5 = findViewById(R.id.editText5);
        e6 = findViewById(R.id.editText6);
        e7 = findViewById(R.id.editText7);
        e8 = findViewById(R.id.editText8);


        String c1 = e1.getText().toString();
        String c2 =  e2.getText().toString();
        String c3 = e3.getText().toString();
        String c4=  e4.getText().toString();
        String c5 = e5.getText().toString();
        String c6 =  e6.getText().toString();
        String c7 = e7.getText().toString();
        String c8 =  e8.getText().toString();

        SharedPreferences.Editor editor = getSharedPreferences(prefName, MODE_PRIVATE).edit();
        editor.putString(c1, c1);
        editor.putString(c2, c2);
        editor.putString(c3, c3);
        editor.putString(c4, c4);
        editor.putString(c5, c5);
        editor.putString(c6, c6);
        editor.putString(c7, c7);
        editor.putString(c8, c8);

        editor.apply();
        Toast.makeText(this, "Course Saved", Toast.LENGTH_LONG).show();
    }
    public void nextScreen(View V){
        Intent intent1 = new Intent(this, Main2Activity.class);
        startActivity(intent1);
    }
}
