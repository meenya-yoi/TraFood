package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Makanan_Sumatra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan_sumatra);

        // Inisialisasi RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // 2 kolom per baris

        // Daftar makanan
        List<ItemMakanan> daftarMakanan = new ArrayList<>();
        daftarMakanan.add(new ItemMakanan("Rendang", "Minangkabau",
                getString(R.string.deskripsi_rendang), R.drawable.rendang));
        daftarMakanan.add(new ItemMakanan("Mie Aceh", "Aceh",
                getString(R.string.deskripsi_mie_aceh), R.drawable.mie_aceh));
        daftarMakanan.add(new ItemMakanan("Bika Ambon", "Medan",
                getString(R.string.deskripsi_bika_ambon), R.drawable.bika_ambon));
        daftarMakanan.add(new ItemMakanan("Pempek", "Palembang",
                getString(R.string.deskripsi_pempek), R.drawable.pempek));

        // Pasang Adapter
        AdapterMakanan adapter = new AdapterMakanan(this, daftarMakanan);
        recyclerView.setAdapter(adapter);

        // Inisialisasi tombol navigasi
        setupButtonNavigation();
        setupImageNavigation();
    }

    /**
     * Metode untuk menangani navigasi tombol dan ImageView
     */
    private void setupButtonNavigation() {
        // Tombol untuk membuka Makanan_Bali
        Button btnBali = findViewById(R.id.btnbali);
        btnBali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToActivity(Makanan_Bali.class);
            }
        });

        // Tombol untuk membuka Makanan_Jawa
        Button btnJawa = findViewById(R.id.btnjawa);
        btnJawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToActivity(Makanan_Jawa.class);
            }
        });

        // Tombol kembali ke Beranda
        ImageView imageBack = findViewById(R.id.imageBack);
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke Beranda
                Intent intent = new Intent(Makanan_Sumatra.this, Beranda.class);
                startActivity(intent);
                finish(); // Akhiri aktivitas saat ini
            }
        });
    }

    private void setupImageNavigation() {
        // Navigasi ke Beranda
        ImageView imageHome = findViewById(R.id.imageHome);
        imageHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToActivity(Beranda.class);
            }
        });

        // Navigasi ke About Us
        ImageView imageUser = findViewById(R.id.imageUser);
        imageUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToActivity(AboutUs.class);
            }
        });
    }

    /**
     * Metode untuk navigasi ke aktivitas lain
     * @param targetActivity Kelas aktivitas tujuan
     */
    private void navigateToActivity(Class<?> targetActivity) {
        Intent intent = new Intent(Makanan_Sumatra.this, targetActivity);
        startActivity(intent);
    }
}
