package com.example.cookie_alpaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        ImageView winnerImg = (ImageView)findViewById(R.id.winImg);
        TextView winTxt = (TextView)findViewById(R.id.winTxt);
        winnerImg.setImageResource(intent.getExtras().getInt("imgSrc"));
        winTxt.setText(intent.getExtras().getString("name"));



        Button goback = (Button)findViewById(R.id.goback);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}