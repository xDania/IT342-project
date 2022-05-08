package com.example.it342_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button buttonR2 = (Button) findViewById(R.id.buttonR2);
        buttonR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile2();
            }
        });
    }

    public void openProfile2(){
        Intent intent = new Intent(this,Profile.class);
        startActivity(intent);
    }}