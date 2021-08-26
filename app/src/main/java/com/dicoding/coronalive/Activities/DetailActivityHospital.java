package com.dicoding.coronalive.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.dicoding.coronalive.Model.Hospital;
import com.dicoding.coronalive.R;

import java.util.ArrayList;

public class DetailActivityHospital extends AppCompatActivity {

    public static final String EXTRA_HOSPITAL = "extra_hospital";
    ImageView imgDetail;
    TextView tvCallDetail, tvCallAmbulance, tvMessageDetail, tvLocationDetail;
    CardView cardLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hospital);

        cardLink = findViewById(R.id.cardLocation);
        imgDetail = findViewById(R.id.imgHostDetail);
        tvCallDetail = findViewById(R.id.tvCallDetail);
        tvCallAmbulance = findViewById(R.id.tvAmbulanceDetail);
        tvMessageDetail = findViewById(R.id.tvMessageDetail);
        tvLocationDetail = findViewById(R.id.tvLocDetail);

        final Hospital hospital = getIntent().getParcelableExtra(EXTRA_HOSPITAL);

        Glide.with(this)
                .load(hospital.getImageHosp()).into(imgDetail);
        tvCallDetail.setText(hospital.getTelphoneHosp());
        tvCallAmbulance.setText(hospital.getAmbulanceHosp());
        tvMessageDetail.setText(hospital.getMessageHosp());
        tvLocationDetail.setText(hospital.getAddresHosp());


        cardLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(hospital.getUrlHosp()));
                startActivity(i);
            }
        });

    }

}