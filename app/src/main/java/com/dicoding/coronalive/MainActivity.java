package com.dicoding.coronalive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dicoding.coronalive.Activities.HospitalActivity;
import com.dicoding.coronalive.Activities.InfoActivity;
import com.dicoding.coronalive.Activities.ListPrevention;
import com.dicoding.coronalive.Activities.LiveCoronaData;
import com.dicoding.coronalive.Activities.NewsActivity;
import com.dicoding.coronalive.Activities.SimpstompsActivity;

public class MainActivity extends AppCompatActivity {

    CardView cardPrevention, cardNews, cardHost, carSimpstomp, cardInfo;

    Button btnLive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardPrevention = findViewById(R.id.cardPrevention);
        cardPrevention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPreven = new Intent(MainActivity.this, ListPrevention.class);
                startActivity(iPreven);
            }
        });

        cardNews = findViewById(R.id.cardNews);
        cardNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNews = new Intent(MainActivity.this, NewsActivity.class);
                startActivity(iNews);
            }
        });

        cardHost = findViewById(R.id.cardHost);
        cardHost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iHost = new Intent(MainActivity.this, HospitalActivity.class);
                startActivity(iHost);
            }
        });

        btnLive = findViewById(R.id.btnLive);
        btnLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLive = new Intent(MainActivity.this, LiveCoronaData.class);
                startActivity(iLive);
            }
        });

        carSimpstomp = findViewById(R.id.cardView5);
        carSimpstomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSimp = new Intent(MainActivity.this, SimpstompsActivity.class);
                startActivity(iSimp);
            }
        });

        cardInfo = findViewById(R.id.cardInfo);
        cardInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(info);
            }
        });


    }
}
