package com.dicoding.coronalive.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.dicoding.coronalive.Adapters.SimptompsAdapter;
import com.dicoding.coronalive.Model.Prevention;
import com.dicoding.coronalive.Model.Simpstomp;
import com.dicoding.coronalive.Model.SimpstompData;
import com.dicoding.coronalive.R;

import java.util.ArrayList;

public class SimpstompsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Simpstomp> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpstomps);

        recyclerView = findViewById(R.id.rv_simpstomp);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(SimpstompData.getListDataSimps());

        showSimpston();
    }

    private void showSimpston() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        SimptompsAdapter listAdapter = new SimptompsAdapter(this);
        listAdapter.setListSimptom(list);
        recyclerView.setAdapter(listAdapter);
    }
}
