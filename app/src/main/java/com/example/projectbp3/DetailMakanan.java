package com.example.projectbp3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailMakanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        // Inisialisasi view
        ImageView imageView = findViewById(R.id.image_makanan);
        TextView namaMakanan = findViewById(R.id.nama_makanan);
        TextView deskripsiMakanan = findViewById(R.id.deskripsi_makanan);

        // Ambil data dari Intent
        String nama = getIntent().getStringExtra("nama_makanan");
        String deskripsi = getIntent().getStringExtra("deskripsi_makanan");
        int gambar = getIntent().getIntExtra("gambar_makanan", 0);

        // Set data ke view
        imageView.setImageResource(gambar);
        namaMakanan.setText(nama);
        deskripsiMakanan.setText(deskripsi);
    }
}
