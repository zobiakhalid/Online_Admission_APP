package com.zobiakhalid.ui_chatting_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class IntroScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_screen);
        getSupportActionBar().hide();
        Thread thread= new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent =new Intent(IntroScreen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };thread.start();
    }
}