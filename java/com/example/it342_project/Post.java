package com.example.it342_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Post extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.blog);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()) {
                   /* case R.id.home:
                        startActivity(new Intent(getApplicationContext(), home.class));
                        overridePendingTransition(0, 0);
                        return true;*/
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), BottomNavigationView.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.blog:

                        return true;
                }
                return false;
            }
        });

        Button buttonP = (Button) findViewById(R.id.btnPost);
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPost();
            }
        });
    }
    public void openPost(){
        Intent intent = new Intent(this,Post2.class);
        startActivity(intent);
    }}