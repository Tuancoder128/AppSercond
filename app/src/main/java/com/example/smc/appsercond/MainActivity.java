package com.example.smc.appsercond;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout mh;
    MediaPlayer song;
    ImageView hinhMiuLe;

    public void AnhXa(){
        mh= (RelativeLayout) findViewById(R.id.manHinh);
        hinhMiuLe= (ImageView) findViewById(R.id.imageViewMiuLe);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        // background
        mh.setBackgroundResource(R.drawable.bg1);

        //nhacnen
        song = MediaPlayer.create(getApplicationContext(),R.raw.wewishyouamerrychristmas);
        song.start();

        //hieuunghinh
        Animation f  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        hinhMiuLe.clearAnimation();
        hinhMiuLe.startAnimation(f);
        hinhMiuLe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhMusic =  new Intent(getApplicationContext(),Music.class);
                startActivity(mhMusic);
                song.stop();
            }
        });









    }
}
