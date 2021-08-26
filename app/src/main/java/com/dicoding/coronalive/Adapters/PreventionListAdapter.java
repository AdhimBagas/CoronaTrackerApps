package com.dicoding.coronalive.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dicoding.coronalive.Model.Prevention;
import com.dicoding.coronalive.R;

import java.util.ArrayList;

public class PreventionListAdapter extends RecyclerView.Adapter<PreventionListAdapter.ListViewHolder> {

    private Context context;
    private ArrayList<Prevention> listPrevention;

    public PreventionListAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Prevention> getListPrevention() {
        return listPrevention;
    }

    public void setListPrevention(ArrayList<Prevention> listPrevention) {
        this.listPrevention = listPrevention;
    }

    @NonNull
    @Override
    public PreventionListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_prevention, parent,false);
        return new ListViewHolder(itemList);

    }

    @Override
    public void onBindViewHolder(@NonNull PreventionListAdapter.ListViewHolder holder, int position) {

        holder.tvName.setText(getListPrevention().get(position).getName());
        holder.tvDescription.setText(getListPrevention().get(position).getDescription());
        Glide.with(context)
                .load(getListPrevention().get(position).getPhoto())
                .into(holder.imgPrevention);
    }

    @Override
    public int getItemCount() {
        return getListPrevention().size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPrevention;
        TextView tvName, tvDescription;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPrevention = itemView.findViewById(R.id.imgHospital);
            tvName = itemView.findViewById(R.id.tv_nameHospital);
            tvDescription = itemView.findViewById(R.id.tv_addressHospital);
        }
    }
}
