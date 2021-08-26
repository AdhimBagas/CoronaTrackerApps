package com.dicoding.coronalive.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dicoding.coronalive.Model.Prevention;
import com.dicoding.coronalive.Model.Simpstomp;
import com.dicoding.coronalive.R;

import java.util.ArrayList;

public class SimptompsAdapter extends RecyclerView.Adapter<SimptompsAdapter.ListViewHolder> {

    private Context context;
    private ArrayList<Simpstomp> listSimptom;

    public SimptompsAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Simpstomp> getListSimptom() {
        return listSimptom;
    }

    public void setListSimptom(ArrayList<Simpstomp> listSimptom) {
        this.listSimptom = listSimptom;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_simpstomps, parent,false);
        return new SimptompsAdapter.ListViewHolder(itemList);
    }


    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

        holder.tvNameSimps.setText(getListSimptom().get(position).getName());
        holder.tvDescSimps.setText(getListSimptom().get(position).getDescription());
        Glide.with(context)
                .load(getListSimptom().get(position).getPhoto())
                .into(holder.imgSimptoms);

    }

    @Override
    public int getItemCount() {
        return getListSimptom().size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgSimptoms;
        TextView tvNameSimps, tvDescSimps;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);


            imgSimptoms = itemView.findViewById(R.id.imgSimps);
            tvNameSimps = itemView.findViewById(R.id.tv_nameSimps);
            tvDescSimps = itemView.findViewById(R.id.tv_detailSimps);
        }
    }
}
