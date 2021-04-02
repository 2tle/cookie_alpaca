package com.example.cookie_alpaca;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    public int[] imgSrc32G = {R.drawable.alpaca,R.drawable.bat,R.drawable.bear,R.drawable.bird,R.drawable.brother,R.drawable.cat,R.drawable.chick,
            R.drawable.chicken,R.drawable.deer,R.drawable.dog,R.drawable.elephant,R.drawable.fox,R.drawable.giraffe,R.drawable.goldfish,
            R.drawable.hamster,R.drawable.hedgehog,R.drawable.horse,R.drawable.iguana,R.drawable.lion,R.drawable.meerkat,R.drawable.mouse,
            R.drawable.parrot,R.drawable.penguin,R.drawable.pig,R.drawable.rabbit,R.drawable.snake,R.drawable.squirrel,R.drawable.tiger,
            R.drawable.unicorn,R.drawable.wolf,R.drawable.worm,R.drawable.zebra};
    public String[] animalName32G = {"알파카","박쥐","곰","직박구리","동생","고양이","병아리", 
            "치킨","사슴","강아지","코끼리","여우","기린","금붕어",
            "햄스터","고슴도치","말","이구아나","사자","미어캣","생쥐",
            "앵무새","펭귄","한돈","토끼","뱀","다람쥐","호랑이",
            "유니콘","늑대","애벌레","얼룩말"};
    public int[] imgSrc16G = new int[16];
    public String[] animalName16G = new String[16];

    public int[] imgSrc8G = new int[8];
    public String[] animalName8G = new String[8];

    public int[] imgSrc4G = new int[4];
    public String[] animalName4G = new String[4];

    public int[] imgSrc2G = new int[2];
    public String[] animalName2G = new String[2];

    public int imgSrcWin;
    public String animalNameWin;

    public int round = 16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView leftImgView = (ImageView)findViewById(R.id.leftBtn);
        ImageView rightImgView = (ImageView)findViewById(R.id.rightBtn);


        //16강 진행

    }

    protected void changeImageAndText(ImageView targetImg, int index, String text) {
        switch (round) {
            //case 16:
        }
    }







}