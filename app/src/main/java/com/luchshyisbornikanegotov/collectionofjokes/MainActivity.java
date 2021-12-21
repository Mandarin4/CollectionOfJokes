package com.luchshyisbornikanegotov.collectionofjokes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private long backPressedtimer;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void mainActivityButton1Click(View view){
        Intent intent = new Intent(this, JokesActivity.class);
        intent.putExtra("User_choice", "mainActivityButton1");
        startActivity(intent); finish();
    }
    public void mainActivityButton2Click(View view){
        Intent intent = new Intent(this, JokesActivity.class);
        intent.putExtra("User_choice", "mainActivityButton2");
        startActivity(intent); finish();
    }
    public void mainActivityButton3Click(View view){
        Intent intent = new Intent(this, JokesActivity.class);
        intent.putExtra("User_choice", "mainActivityButton3");
        startActivity(intent); finish();
    }
    public void mainActivityButton4Click(View view){
        Intent intent = new Intent(this, JokesActivity.class);
        intent.putExtra("User_choice", "mainActivityButton4");
        startActivity(intent); finish();
    }
    public void mainActivityButton5Click(View view){
        Intent intent = new Intent(this, JokesActivity.class);
        intent.putExtra("User_choice", "mainActivityButton5");
        startActivity(intent); finish();
    }

    // Системная кнопка назад
    @Override
    public void onBackPressed(){
        if (backPressedtimer + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else{
            backToast = Toast.makeText(getBaseContext(), "Нажмите еще раз, чтобы выйти!", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedtimer = System.currentTimeMillis();
    }
}