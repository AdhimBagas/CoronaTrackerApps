package com.dicoding.coronalive.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dicoding.coronalive.Activities.DetailActivityHospital;
import com.dicoding.coronalive.Model.Hospital;
import com.dicoding.coronalive.Model.Prevention;
import com.dicoding.coronalive.R;

import java.util.ArrayList;

public class HospitalAdapter extends RecyclerView.Adapter<HospitalAdapter.ListViewHolder> {

    private Context context;
    private ArrayList<Hospital> listHospital;

    public HospitalAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Hospital> getListHospital() {
        return listHospital;
    }

    public void setListHospital(ArrayList<Hospital> listHospital) {
        this.listHospital = listHospital;
    }

    @NonNull
    @Override
    public HospitalAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_hospital, parent,false);
        return new HospitalAdapter.ListViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull HospitalAdapter.ListViewHolder holder, final int position) {

        holder.tvNameHost.setText(getListHospital().get(position).getNameHosp());
        holder.tvAddressHost.setText(getListHospital().get(position).getAddresHosp());
        Glide.with(context)
                .load(getListHospital().get(position).getImageHosp())
                .into(holder.imgHost);

        holder.cardListHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailActivity = new Intent(context, DetailActivityHospital.class);
                detailActivity.putExtra(DetailActivityHospital.EXTRA_HOSPITAL, listHospital.get(position));
                context.startActivity(detailActivity);
            }
        });

    }

    @Override
    public int getItemCount() {
        return getListHospital().size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView tvNameHost, tvAddressHost;
        ImageView imgHost;
        CardView cardListHospital;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNameHost = itemView.findViewById(R.id.tv_nameHospital);
            tvAddressHost = itemView.findViewById(R.id.tv_addressHospital);
            imgHost = itemView.findViewById(R.id.imgHospital);
            cardListHospital = itemView.findViewById(R.id.list_item);

        }
    }
}
