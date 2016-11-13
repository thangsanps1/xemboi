package com.example.b.xemboi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgBachduong, imgKimnguu, imgSongtu, imgCugiai, imgSutu, imgXunu, imgThienbinh,
            imgThannong, imgNhanma, imgMaket, imgBaobinh, imgSongngu;
    @Override
       protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // lam tiep di
        imgBachduong  = (ImageView) findViewById(R.id.bachduong);

        imgBachduong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getBaseContext(), Bachduong.class);
                startActivity(intent);
            }
        });



    }
}
