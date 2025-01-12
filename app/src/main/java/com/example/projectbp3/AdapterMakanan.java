package com.example.projectbp3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterMakanan extends RecyclerView.Adapter<AdapterMakanan.ViewHolder> {

    private Context context;
    private List<ItemMakanan> listMakanan;

    public AdapterMakanan(Context context, List<ItemMakanan> listMakanan) {
        this.context = context;
        this.listMakanan = listMakanan;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_makanan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemMakanan item = listMakanan.get(position);

        holder.gambarMakanan.setImageResource(item.getGambarMakanan());
        holder.namaMakanan.setText(item.getNamaMakanan());
        holder.asalMakanan.setText(item.getAsalMakanan());

        holder.buttonSelengkapnya.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailMakanan.class);
            intent.putExtra("nama_makanan", item.getNamaMakanan());
            intent.putExtra("deskripsi_makanan", item.getDeskripsiMakanan());
            intent.putExtra("gambar_makanan", item.getGambarMakanan());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView gambarMakanan;
        TextView namaMakanan, asalMakanan;
        Button buttonSelengkapnya;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambarMakanan = itemView.findViewById(R.id.gambar_makanan);
            namaMakanan = itemView.findViewById(R.id.nama_makanan);
            asalMakanan = itemView.findViewById(R.id.asal_makanan);
            buttonSelengkapnya = itemView.findViewById(R.id.button_selengkapnya);
        }
    }
}