package com.dicoding.coronalive.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.dicoding.coronalive.API.ApiClientCorona;
import com.dicoding.coronalive.Adapters.ProvinceCoronaAdapters;
import com.dicoding.coronalive.Model.ModelObjectProvince;
import com.dicoding.coronalive.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProvinceCoronaData extends AppCompatActivity {

    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_province_corona_data);

        list = findViewById(R.id.rvProvinceData);
        list.setLayoutManager(new LinearLayoutManager(this));
        LoadDataProvince();
    }

    private void LoadDataProvince() {
        Call <List<ModelObjectProvince>> call;
        call = ApiClientCorona.apiInterface().getProvince();
        call.enqueue(new Callback<List<ModelObjectProvince>>() {
            @Override
            public void onResponse(Call<List<ModelObjectProvince>> call, Response<List<ModelObjectProvince>> response) {
                list.setAdapter(new ProvinceCoronaAdapters(ProvinceCoronaData.this, response.body()));

            }

            @Override
            public void onFailure(Call<List<ModelObjectProvince>> call, Throwable t) {
                Toast.makeText(ProvinceCoronaData.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
