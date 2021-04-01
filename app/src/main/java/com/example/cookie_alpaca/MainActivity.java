package com.example.cookie_alpaca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public int[] eightG = new int[16];
    public int[] fourG = new int[8];
    public int[] twoG = new int[4];
    public int[] finalMatch = new int[2];
    public int winner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button leftBtn = findViewById(R.id.leftBtn);
        //Button rightBtn = findViewById(R.id.rightBtn);

        /* leftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }); */



    }
}