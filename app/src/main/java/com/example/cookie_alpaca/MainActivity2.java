package com.example.cookie_alpaca;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    /* public List<Integer> imgSrc32G = new ArrayList<>(Arrays.asList(R.drawable.alpaca, R.drawable.bat, R.drawable.bear, R.drawable.bird, R.drawable.brother, R.drawable.cat, R.drawable.chick,
            R.drawable.chicken, R.drawable.deer, R.drawable.dog, R.drawable.elephant, R.drawable.fox, R.drawable.giraffe, R.drawable.goldfish,
            R.drawable.hamster, R.drawable.hedgehog, R.drawable.horse, R.drawable.iguana, R.drawable.lion, R.drawable.meerkat, R.drawable.mouse,
            R.drawable.parrot, R.drawable.penguin, R.drawable.pig, R.drawable.rabbit, R.drawable.snake, R.drawable.squirrel, R.drawable.tiger,
            R.drawable.unicorn, R.drawable.wolf, R.drawable.worm, R.drawable.zebra));
    public List<String> animalName32G = new ArrayList<>(Arrays.asList("알파카","박쥐","곰","직박구리","동생","고양이","병아리",
            "치킨","사슴","강아지","코끼리","여우","기린","금붕어",
            "햄스터","고슴도치","말","이구아나","사자","미어캣","생쥐",
            "앵무새","펭귄","한돈","토끼","뱀","다람쥐","호랑이",
            "유니콘","늑대","애벌레","얼룩말"));

    public List<Integer> imgSrc16G= new ArrayList<>();
    public List<String> animalName16G = new ArrayList<>();

    public List<Integer> imgSrc8G = new ArrayList<>();
    public List<String> animalName8G = new ArrayList<>();

    public List<Integer> imgSrc4G = new ArrayList<>();
    public List<String> animalName4G = new ArrayList<>();

    public List<Integer> imgSrc2G = new ArrayList<>();
    public List<String> animalName2G = new ArrayList<>();

    public int imgSrcWin;
    public String animalNameWin;

    ImageButton leftImgView = (ImageButton)findViewById(R.id.leftBtn);
    ImageButton rightImgView = (ImageButton)findViewById(R.id.rightBtn);

    TextView topText = (TextView)findViewById(R.id.name1);
    TextView bottomText = (TextView)findViewById(R.id.name2);

    public int round = 16;
    public int cnt = 0; */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        /* leftImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        rightImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }); */



    }
    /*
    protected void changeImgAndText(int index, int rand, int rand1) {
        if(round == 16) {
            if (cnt == 15) {
                round = round / 2;
            }
            imgSrc16G.add(imgSrc32G.get(index));
            animalName16G.add(animalName32G.get(index));
            leftImgView.setImageResource(imgSrc32G.get(rand));
            topText.setText(animalName32G.get(rand));
            rightImgView.setImageResource(imgSrc32G.get(rand1));
            bottomText.setText(animalName32G.get(rand1));
            cnt++;
        } else if (round == 8) {
            if (cnt == 7) {
                round = round / 2;
            }
            imgSrc8G.add(imgSrc16G.get(index));
            animalName8G.add(animalName16G.get(index));
            leftImgView.setImageResource(imgSrc16G.get(rand));
            topText.setText(animalName16G.get(rand));
            rightImgView.setImageResource(imgSrc16G.get(rand1));
            bottomText.setText(animalName16G.get(rand1));
            cnt++;
        } else if(round ==4) {
            if (cnt == 3) {
                round = round / 2;
            }
            imgSrc4G.add(imgSrc8G.get(index));
            animalName4G.add(animalName8G.get(index));
            leftImgView.setImageResource(imgSrc8G.get(rand));
            topText.setText(animalName8G.get(rand));
            rightImgView.setImageResource(imgSrc8G.get(rand1));
            bottomText.setText(animalName8G.get(rand1));
            cnt++;
        } else if(round == 2) {
            if (cnt == 3) {
                round = round / 2;
            }
            imgSrc2G.add(imgSrc4G.get(index));
            animalName2G.add(animalName4G.get(index));
            leftImgView.setImageResource(imgSrc4G.get(rand));
            topText.setText(animalName4G.get(rand));
            rightImgView.setImageResource(imgSrc4G.get(rand1));
            bottomText.setText(animalName4G.get(rand1));
            cnt++;
        } else if(round == 1) {
            imgSrcWin = imgSrc2G.get(index);
            animalNameWin = animalName2G.get(index);
            //테스트용 메시지
            Toast.makeText(getApplicationContext(),animalNameWin,Toast.LENGTH_LONG).show();
        }
    } */











}