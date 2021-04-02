package com.example.cookie_alpaca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    public int[] imgSrc32G = {R.drawable.alpaca,R.drawable.bat,R.drawable.bear,R.drawable.bird,R.drawable.brother,R.drawable.cat,R.drawable.chick,
            R.drawable.chicken,R.drawable.deer,R.drawable.dog,R.drawable.elephant,R.drawable.fox,R.drawable.giraffe,R.drawable.goldfish,
            R.drawable.hamster,R.drawable.hedgehog,R.drawable.horse,R.drawable.iguana,R.drawable.lion,R.drawable.meerkat,R.drawable.mouse,
            R.drawable.parrot,R.drawable.penguin,R.drawable.pig,R.drawable.rabbit,R.drawable.snake,R.drawable.squirrel,R.drawable.tiger,
            R.drawable.unicorn,R.drawable.wolf,R.drawable.worm,R.drawable.zebra};
    public String[] animalName32G = {"알파카","박쥐","곰","직박구리","동생","고양이"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    int round = 16;






}