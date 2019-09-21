package com.lastname.labexerno2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityTwo extends AppCompatActivity {

    EditText univ1, univ2, univ3, univ4, univ5, univ6, univ7, univ8, et_VUniv;
    SharedPreferences sp;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintwo);
        et_VUniv = findViewById(R.id.VUniv);
    }

    public void verify(View v) {

        sp = getSharedPreferences("data2", MODE_PRIVATE);
        String univSP1 = sp.getString("u1", null);
        String univSP2 = sp.getString("u2", null);
        String univSP3 = sp.getString("u3", null);
        String univSP4 = sp.getString("u4", null);
        String univSP5 = sp.getString("u5", null);
        String univSP6 = sp.getString("u6", null);
        String univSP7 = sp.getString("u7", null);
        String univSP8 = sp.getString("u8", null);

        String u1 = et_VUniv.getText().toString();


        if (univSP1.equals(u1) || univSP2.equals(u1) || univSP3.equals(u1) || univSP4.equals(u1)
                || univSP5.equals(u1) || univSP6.equals(u1) || univSP7.equals(u1) || univSP8.equals(u1)){
            Toast.makeText(this, "User Valid", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Invalid User", Toast.LENGTH_LONG).show();
        }
    }
}
