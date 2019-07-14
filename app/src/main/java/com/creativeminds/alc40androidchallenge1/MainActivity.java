package com.creativeminds.alc40androidchallenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
getSupportActionBar().setTitle("ALC 4 Phase 1");
        Button btnShowAboutAlc = findViewById(R.id.show_about_alc);

        btnShowAboutAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showAboutIntent = new Intent(MainActivity.this, AboutALC.class);
                startActivity(showAboutIntent);
            }
        });




        Button btnShowMyProfile = findViewById(R.id.show_my_profile);

        btnShowMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showAboutIntent = new Intent(MainActivity.this, MyProfile.class);
                startActivity(showAboutIntent);
            }
        });


    }
}
