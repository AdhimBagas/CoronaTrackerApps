package com.dicoding.coronalive.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.dicoding.coronalive.R;

public class InfoActivity extends AppCompatActivity {
    TextView tvInstagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        //Clickle Instagram
        tvInstagram = findViewById(R.id.tvInstagram);
        tvInstagram.setClickable(true);
        String text =  "Visit me on <a href='http://instagram.com/singgasana_'>Instagram</a>";
        tvInstagram.setText(Html.fromHtml(text));

        tvInstagram.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
