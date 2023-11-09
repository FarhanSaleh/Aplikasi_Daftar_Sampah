package com.kelompok6.aplikasidaftarsampah.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kelompok6.aplikasidaftarsampah.R;
import com.kelompok6.aplikasidaftarsampah.model.Sampah;

import java.util.Date;
import java.util.List;

public class SampahAdapter extends RecyclerView.Adapter<SampahAdapter.SampahViewHolder> {
    private List<Sampah> listSampah;

    public SampahAdapter(List<Sampah> listSampah){
        this.listSampah = listSampah;
    }

    @Override
    public SampahViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sampah, parent, false);
        return new SampahViewHolder(view);
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }
    @Override
    public void onBindViewHolder(final SampahViewHolder holder, int position) {
        Sampah sampah = listSampah.get(position);
        holder.namaSampah.setText(sampah.getNama());
        holder.deskripsiSampah.setText(sampah.getDeskripsi());
        holder.fotoSampah.setImageResource(sampah.getPhoto());
        holder.itemView.setOnClickListener(v -> onItemClickCallback.onItemClicked(listSampah.get(holder.getAdapterPosition())));
    }

    public interface OnItemClickCallback{
        void onItemClicked(Sampah data);
    }
    @Override
    public int getItemCount() {
        return listSampah.size();
    }

    public class SampahViewHolder extends RecyclerView.ViewHolder {
        TextView namaSampah;
        TextView deskripsiSampah;
        ImageView fotoSampah;

        public SampahViewHolder(View itemView){
            //ini xml untuk activity main
            super(itemView);
            namaSampah = itemView.findViewById(R.id.namaSampah);
            deskripsiSampah = itemView.findViewById(R.id.deskripsiSampah);
            fotoSampah = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
