package com.example.cookie_alpaca;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {




    public DataSet[] data32Arr = {new DataSet(R.drawable.dog,"강아지"),new DataSet(R.drawable.cat,"고양이"),new DataSet(R.drawable.giraffe,"기린"),new DataSet(R.drawable.hamster,"햄스터")
            ,new DataSet(R.drawable.alpaca,"알파카"),new DataSet(R.drawable.tiger,"호랑이"),new DataSet(R.drawable.fox,"여우"),new DataSet(R.drawable.bat,"박쥐")
            ,new DataSet(R.drawable.goldfish,"금붕어"),new DataSet(R.drawable.chick,"병아리"),new DataSet(R.drawable.chicken,"치킨"),new DataSet(R.drawable.wolf,"늑대")
            ,new DataSet(R.drawable.snake,"뱀"),new DataSet(R.drawable.iguana,"이구아나"),new DataSet(R.drawable.bird,"새"),new DataSet(R.drawable.mouse,"생쥐")
            ,new DataSet(R.drawable.bear,"곰"),new DataSet(R.drawable.meerkat,"미어캣"),new DataSet(R.drawable.lion,"사자"),new DataSet(R.drawable.hedgehog,"고슴도치")
            ,new DataSet(R.drawable.rabbit,"토끼"),new DataSet(R.drawable.brother,"동생"),new DataSet(R.drawable.parrot,"앵무새"),new DataSet(R.drawable.zebra,"얼룩말")
            ,new DataSet(R.drawable.deer,"사슴"),new DataSet(R.drawable.penguin,"펭귄"),new DataSet(R.drawable.pig,"돼지"),new DataSet(R.drawable.horse,"말")
            ,new DataSet(R.drawable.squirrel,"다람쥐"),new DataSet(R.drawable.unicorn,"유니콘"),new DataSet(R.drawable.worm,"애벌레"),new DataSet(R.drawable.elephant,"코끼리")};

    public List<DataSet> dt32 = new ArrayList<>(Arrays.asList(data32Arr));

    public List<DataSet> dt16 = new ArrayList<>();
    public List<DataSet> dt8 = new ArrayList<>();
    public List<DataSet> dt4 = new ArrayList<>();
    public List<DataSet> dt2 = new ArrayList<>();

    public DataSet winner;

    public int round = 16;
    public int cnt = 0;


    public int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Collections.shuffle(dt32);

        ImageButton leftImgView_a = (ImageButton)findViewById(R.id.leftBtn);
        ImageButton rightImgView_a = (ImageButton)findViewById(R.id.rightBtn);

        TextView topText_a = (TextView)findViewById(R.id.name1);
        TextView bottomText_a = (TextView)findViewById(R.id.name2);

        TextView roundText = (TextView)findViewById(R.id.round);

        //초기 설정
        leftImgView_a.setImageResource(dt32.get(i).getId());
        rightImgView_a.setImageResource(dt32.get(i+1).getId());

        topText_a.setText(dt32.get(i).getName());
        bottomText_a.setText(dt32.get(i+1).getName());

        roundText.setText("16강");
        leftImgView_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = i + 2;
                //버튼 눌리면 이미지 텍스트 변경하기
                changeImgAndText(leftImgView_a,rightImgView_a,topText_a,bottomText_a,roundText,0);

            }
        });
        rightImgView_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i += 2;
                changeImgAndText(leftImgView_a,rightImgView_a,topText_a,bottomText_a,roundText,1);
            }
        });



    }
    public void changeImgAndText(ImageButton leftImgView, ImageButton rightImgView, TextView topText, TextView bottomText, TextView rnd, int leftOrRight) {
        if(round == 16) { //16강이면!
            if(leftOrRight == 0) { //왼쪽 버튼이 눌렸다면
                dt16.add(dt32.get(i-2));
            } else dt16.add(dt32.get(i-1));

            if(cnt == 15) { //그 라운드의 마지막 단계라면!
                i = 0;
                cnt = 0;
                round /= 2;
                Collections.shuffle(dt16);
                rnd.setText("8강");
                leftImgView.setImageResource(dt16.get(i).getId());
                rightImgView.setImageResource(dt16.get(i+1).getId());
                topText.setText(dt16.get(i).getName());
                bottomText.setText(dt16.get(i+1).getName());

            } else {
                cnt++;
                leftImgView.setImageResource(dt32.get(i).getId());
                rightImgView.setImageResource(dt32.get(i+1).getId());
                topText.setText(dt32.get(i).getName());
                bottomText.setText(dt32.get(i+1).getName());
            }




        }
        else if(round == 8) {
            if(leftOrRight == 0) { //왼쪽 버튼이 눌렸다면
                dt8.add(dt16.get(i-2));
            } else dt8.add(dt16.get(i-1));

            if(cnt == 7) {
                i = 0;
                cnt = 0;
                round /= 2;
                Collections.shuffle(dt8);
                rnd.setText("4강");
                leftImgView.setImageResource(dt8.get(i).getId());
                rightImgView.setImageResource(dt8.get(i+1).getId());
                topText.setText(dt8.get(i).getName());
                bottomText.setText(dt8.get(i+1).getName());
            } else {
                cnt++;
                leftImgView.setImageResource(dt16.get(i).getId());
                rightImgView.setImageResource(dt16.get(i+1).getId());
                topText.setText(dt16.get(i).getName());
                bottomText.setText(dt16.get(i+1).getName());
            }


        } else if(round == 4) {
            if(leftOrRight == 0) { //왼쪽 버튼이 눌렸다면
                dt4.add(dt8.get(i-2));
            } else dt4.add(dt8.get(i-1));

            if(cnt == 3) {
                i = 0;
                cnt = 0;
                round /= 2;
                Collections.shuffle(dt4);
                rnd.setText("준결승");
                leftImgView.setImageResource(dt4.get(i).getId());
                rightImgView.setImageResource(dt4.get(i+1).getId());
                topText.setText(dt4.get(i).getName());
                bottomText.setText(dt4.get(i+1).getName());
            } else {
                cnt++;
                leftImgView.setImageResource(dt8.get(i).getId());
                rightImgView.setImageResource(dt8.get(i+1).getId());
                topText.setText(dt8.get(i).getName());
                bottomText.setText(dt8.get(i+1).getName());
            }





        } else if(round == 2) {

            if(leftOrRight == 0) { //왼쪽 버튼이 눌렸다면
                dt2.add(dt4.get(i-2));
            } else dt2.add(dt4.get(i-1));


            if(cnt == 1) {
                i = 0;
                cnt = 0;
                round /= 2;
                rnd.setText("결승");
                leftImgView.setImageResource(dt2.get(i).getId());
                rightImgView.setImageResource(dt2.get(i+1).getId());
                topText.setText(dt2.get(i).getName());
                bottomText.setText(dt2.get(i+1).getName());
            } else {
                cnt++;
                leftImgView.setImageResource(dt4.get(i).getId());
                rightImgView.setImageResource(dt4.get(i+1).getId());
                topText.setText(dt4.get(i).getName());
                bottomText.setText(dt4.get(i+1).getName());
            }




        } else if(round == 1) {
            if(leftOrRight == 0) winner = dt2.get(0);
            else winner = dt2.get(1);


            //다음 액티비티에 winner 를 넘겨주기!! 아래 작성된 토스트는 임시임!
            Toast.makeText(getApplicationContext(),winner.getName(), Toast.LENGTH_SHORT).show();
        }
    }











}