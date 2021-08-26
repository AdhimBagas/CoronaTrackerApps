package com.dicoding.coronalive.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.dicoding.coronalive.Adapters.HospitalAdapter;
import com.dicoding.coronalive.Model.Hospital;
import com.dicoding.coronalive.Model.HospitalData;
import com.dicoding.coronalive.Model.Prevention;
import com.dicoding.coronalive.Model.PreventionData;
import com.dicoding.coronalive.R;

import java.util.ArrayList;

public class HospitalActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Hospital> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        recyclerView = findViewById(R.id.rv_hospital);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(HospitalData.getListDataHost());

        showPrevention();

    }

    private void showPrevention() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        HospitalAdapter hospitalAdapter = new HospitalAdapter(this);
        hospitalAdapter.setListHospital(list);
        recyclerView.setAdapter(hospitalAdapter);
    }
}
