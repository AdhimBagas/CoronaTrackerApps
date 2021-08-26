package com.dicoding.coronalive.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dicoding.coronalive.Adapters.PreventionListAdapter;
import com.dicoding.coronalive.Model.Prevention;
import com.dicoding.coronalive.Model.PreventionData;
import com.dicoding.coronalive.R;

import java.util.ArrayList;

public class ListPrevention extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Prevention> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_prevention);

        recyclerView = findViewById(R.id.rv_prevention);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(PreventionData.getLisData());
        
        showPrevention();
    }

    private void showPrevention() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PreventionListAdapter listAdapter = new PreventionListAdapter(this);
        listAdapter.setListPrevention(list);
        recyclerView.setAdapter(listAdapter);
    }

}

