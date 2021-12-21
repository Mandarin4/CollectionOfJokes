package com.luchshyisbornikanegotov.collectionofjokes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {
    TextView textView, backBTN,nextBTN;
    String[] collectionJokes;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        textView = findViewById(R.id.textLokes);
        i=0;

        String User_choice = getIntent().getStringExtra("User_choice");

        if (User_choice.equals("mainActivityButton1")){
            collectionJokes = CollectionOfJokes.jokes1;
        }else if (User_choice.equals("mainActivityButton2")){
            collectionJokes = CollectionOfJokes.jokes2;
        }else if (User_choice.equals("mainActivityButton3")){
            collectionJokes = CollectionOfJokes.jokes3;
        }else if (User_choice.equals("mainActivityButton4")){
            collectionJokes = CollectionOfJokes.jokes4;
        }else if (User_choice.equals("mainActivityButton5")){
            collectionJokes = CollectionOfJokes.jokes5;
        }
        textView.setText( collectionJokes[i]);

        nextBTN = findViewById(R.id.nextBTN);
        backBTN = findViewById(R.id.backBTN);
        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<collectionJokes.length-1)i++;
                if (i==1) backBTN.setVisibility(View.VISIBLE);
                if (i==collectionJokes.length-1){
                    nextBTN.setVisibility(View.GONE);

                }
                textView.setText(collectionJokes[i]);

            }
        });
        backBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i>0)i--;
                if (i==0) backBTN.setVisibility(View.GONE);
                if (i!=collectionJokes.length-1){
                    nextBTN.setVisibility(View.VISIBLE);
                }
                textView.setText(collectionJokes[i]);
            }
        });

    }


    public void jokesActivityButton3Click(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent); finish();
    }


    // Системная кнопка назад
    @Override
    public void onBackPressed(){
        Intent backintent = new Intent(this, MainActivity.class);
        startActivity(backintent);finish();
    }
}