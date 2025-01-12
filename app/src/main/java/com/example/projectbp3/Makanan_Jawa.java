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

public class Makanan_Jawa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan_jawa);

        // Inisialisasi RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // 2 kolom per baris

        // Data makanan
        List<ItemMakanan> daftarMakanan = new ArrayList<>();
        daftarMakanan.add(new ItemMakanan("Soto Betawi", "DKI Jakarta",
                getString(R.string.deskripsi_soto_betawi), R.drawable.soto_betawi));
        daftarMakanan.add(new ItemMakanan("Gudeg", "Yogyakarta",
                getString(R.string.deskripsi_gudeg), R.drawable.gudeg));
        daftarMakanan.add(new ItemMakanan("Batagor", "Bandung",
                getString(R.string.deskripsi_batagor), R.drawable.batagor));
        daftarMakanan.add(new ItemMakanan("Rawon", "Surabaya",
                getString(R.string.deskripsi_rawon), R.drawable.rawon));
        daftarMakanan.add(new ItemMakanan("Sate Maranggi", "Purwakarta",
                getString(R.string.deskripsi_sate_maranggi), R.drawable.sate_maranggi));
        daftarMakanan.add(new ItemMakanan("Bakso Malang", "Malang",
                getString(R.string.deskripsi_bakso_malang), R.drawable.bakso_malang));

        // Pasang Adapter ke RecyclerView
        AdapterMakanan adapter = new AdapterMakanan(this, daftarMakanan);
        recyclerView.setAdapter(adapter);

        // Setup tombol navigasi
        setupButtonNavigation();
        setupImageNavigation(); // Tambahkan navigasi untuk ImageView
    }

    /**
     * Metode untuk menangani tombol navigasi
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
        Button btnBali = findViewById(R.id.btnbali);
        btnBali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToActivity(Makanan_Bali.class);
            }
        });

        // Tombol kembali ke Beranda
        ImageView imageBack = findViewById(R.id.imageBack);
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToActivity(Beranda.class);
                finish(); // Akhiri aktivitas saat ini
            }
        });
    }

    /**
     * Metode untuk menangani navigasi dengan ImageView
     */
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
        Intent intent = new Intent(Makanan_Jawa.this, targetActivity);
        startActivity(intent);
    }
}
