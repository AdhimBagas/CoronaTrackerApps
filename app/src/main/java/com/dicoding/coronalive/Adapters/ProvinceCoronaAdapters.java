package com.dicoding.coronalive.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dicoding.coronalive.Model.ModelAttributesProvince;
import com.dicoding.coronalive.Model.ModelObjectProvince;
import com.dicoding.coronalive.R;

import java.util.List;

public class ProvinceCoronaAdapters extends RecyclerView.Adapter<ProvinceCoronaAdapters.ListViewHolder> {
    Context context;
    List<ModelObjectProvince> objectProvinces;

    public ProvinceCoronaAdapters(Context context, List<ModelObjectProvince> objectProvinces) {
        this.context = context;
        this.objectProvinces = objectProvinces;
    }

    @NonNull
    @Override
    public ProvinceCoronaAdapters.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemProv = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_province, parent, false);
       return new ProvinceCoronaAdapters.ListViewHolder(itemProv);
    }

    @Override
    public void onBindViewHolder(@NonNull ProvinceCoronaAdapters.ListViewHolder holder, int position) {

        ModelAttributesProvince attributesProvince = objectProvinces.get(position).getAttributesProvince();
        holder.tvProvince.setText(attributesProvince.getProvinsi());
        holder.tvPositif.setText(attributesProvince.getKasus_Posi());
        holder.tvSembuh.setText(attributesProvince.getKasus_Semb());
        holder.tvMeninggal.setText(attributesProvince.getKasus_Meni());
    }

    @Override
    public int getItemCount() {
        return objectProvinces.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView tvProvince, tvPositif, tvSembuh, tvMeninggal;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            tvProvince = itemView.findViewById(R.id.tvNameProv);
            tvPositif = itemView.findViewById(R.id.tvPositifProv);
            tvSembuh = itemView.findViewById(R.id.tvSembuhProv);
            tvMeninggal = itemView.findViewById(R.id.tvMeninggalProv);
        }
    }
}
