package com.example.opilane.nightstalkers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



class PildidActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pildid);
        Button back= findViewById(R.id.tagasi);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view) {finish(); }

       });
    }
}