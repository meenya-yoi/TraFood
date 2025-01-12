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

public class Makanan_Bali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan_bali);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // 2 kolom per baris

        List<ItemMakanan> daftarMakanan = new ArrayList<>();
        daftarMakanan.add(new ItemMakanan("Ayam Betutu", "Girianyar",
                getString(R.string.deskripsi_ayam_betutu), R.drawable.ayam_betutu));
        daftarMakanan.add(new ItemMakanan("Lawar", "Gianyar",
                getString(R.string.deskripsi_lawar), R.drawable.lawar));
        daftarMakanan.add(new ItemMakanan("Sate Lilit", "Kab Klungkung",
                getString(R.string.deskripsi_sate_lilit), R.drawable.sate_lilit));
        daftarMakanan.add(new ItemMakanan("Jaje Laklak", "Denpasar",
                getString(R.string.deskripsi_jaje_laklak), R.drawable.jaje_laklak));



        AdapterMakanan adapter = new AdapterMakanan(this, daftarMakanan);
        recyclerView.setAdapter(adapter);

        setupButtonNavigation();
        setupImageNavigation();
    }
    // Inisialisasi Tombol

    /**
     * Metode untuk menangani navigasi tombol
     */
    private void setupButtonNavigation() {
        // Tombol untuk membuka Makanan_Sumatra
        Button btnSumatra = findViewById(R.id.btnsumatra);
        btnSumatra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToActivity(Makanan_Sumatra.class);
            }
        });

        // Tombol untuk membuka Makanan_Bali
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
                Intent intent = new Intent(Makanan_Bali.this, Beranda.class);
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
        Intent intent = new Intent(Makanan_Bali.this, targetActivity);
        startActivity(intent);
    }
}
