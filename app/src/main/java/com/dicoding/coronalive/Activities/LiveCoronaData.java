package com.dicoding.coronalive.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.dicoding.coronalive.API.ApiClientCorona;
import com.dicoding.coronalive.API.ApiClientNews;
import com.dicoding.coronalive.Model.ModelDataIndonesia;
import com.dicoding.coronalive.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LiveCoronaData extends AppCompatActivity {

    TextView tSembuh, tPositif, tMeninggal, tvDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_corona_data);

        tSembuh = findViewById(R.id.tvSembuh);
        tPositif = findViewById(R.id.tvPositif);
        tMeninggal = findViewById(R.id.tvMeninggal);

        tvDetail = findViewById(R.id.tvDetailsProv);
        tvDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiveCoronaData.this, ProvinceCoronaData.class);
                startActivity(intent);
            }
        });

        LoadJsonIndonesia();

}

    private void LoadJsonIndonesia() {

        Call<List<ModelDataIndonesia>> call;
        call = ApiClientCorona.apiInterface().getData();
        call.enqueue(new Callback<List<ModelDataIndonesia>>() {
            @Override
            public void onResponse(Call<List<ModelDataIndonesia>> call, Response<List<ModelDataIndonesia>> response) {
                tPositif.setText(response.body().get(0).getPositif());
                tSembuh.setText(response.body().get(0).getSembuh());
                tMeninggal.setText(response.body().get(0).getMeninggal());
            }

            @Override
            public void onFailure(Call<List<ModelDataIndonesia>> call, Throwable t) {
                Toast.makeText(LiveCoronaData.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    }
