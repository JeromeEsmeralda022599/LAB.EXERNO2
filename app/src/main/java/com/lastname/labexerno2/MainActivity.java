package com.lastname.labexerno2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText univ1, univ2, univ3, univ4, univ5, univ6, univ7, univ8;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        univ1 = findViewById(R.id.et_Univ1);
        univ2 = findViewById(R.id.et_Univ2);
        univ3 = findViewById(R.id.et_Univ3);
        univ4 = findViewById(R.id.et_Univ4);
        univ5 = findViewById(R.id.et_Univ5);
        univ6 = findViewById(R.id.et_Univ6);
        univ7 = findViewById(R.id.et_Univ7);
        univ8 = findViewById(R.id.et_Univ8);
    }

    public void save(View v) {
        sp = getSharedPreferences("data2", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String u1 = univ1.getText().toString();
        String u2 = univ2.getText().toString();
        String u3 = univ3.getText().toString();
        String u4 = univ4.getText().toString();
        String u5 = univ5.getText().toString();
        String u6 = univ6.getText().toString();
        String u7 = univ7.getText().toString();
        String u8 = univ8.getText().toString();

        editor.putString("u1", u1);
        editor.putString("u2", u2);
        editor.putString("u3", u3);
        editor.putString("u4", u4);
        editor.putString("u5", u5);
        editor.putString("u6", u6);
        editor.putString("u7", u7);
        editor.putString("u8", u8);
        editor.commit();

        Toast.makeText(this, "Data saved in University Storage", Toast.LENGTH_LONG).show();

    }

    public void next(View v) {
        Intent i = new Intent(MainActivity.this, MainActivityTwo.class);
        startActivity(i);
    }
}