package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Beranda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_beranda);

        // Tombol untuk Makanan Jawa
        Button buttonMenuLainnya = findViewById(R.id.button_menu_lainnya);
        buttonMenuLainnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Beranda.this, Makanan_Jawa.class);
                startActivity(intent);
            }
        });

        // Tombol untuk Rendang
        Button buttonRendang = findViewById(R.id.buttonrendang);
        buttonRendang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetail("Rendang", getString(R.string.deskripsi_rendang), R.drawable.rendang);
            }
        });

        // Tombol untuk Bika Ambon
        Button buttonBikaAmbon = findViewById(R.id.buttonbikambon);
        buttonBikaAmbon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetail("Bika Ambon", getString(R.string.deskripsi_bika_ambon), R.drawable.bika_ambon);
            }
        });

        // Tombol untuk Lawar
        Button buttonLawar = findViewById(R.id.buttonlawar);
        buttonLawar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetail("Lawar", getString(R.string.deskripsi_lawar), R.drawable.lawar);
            }
        });

        // Tombol untuk Mie Aceh
        Button buttonMieAceh = findViewById(R.id.buttonmieaceh);
        buttonMieAceh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetail("Mie Aceh", getString(R.string.deskripsi_mie_aceh), R.drawable.mie_aceh);
            }
        });
    }

    /**
     * Navigasi ke halaman DetailMakanan dengan data yang sesuai.
     *
     * @param nama        Nama makanan
     * @param deskripsi   Deskripsi makanan
     * @param gambarResId Resource ID untuk gambar makanan
     */
    private void navigateToDetail(String nama, String deskripsi, int gambarResId) {
        Intent intent = new Intent(Beranda.this, DetailMakanan.class);
        intent.putExtra("nama_makanan", nama); // Sesuaikan nama parameter
        intent.putExtra("deskripsi_makanan", deskripsi); // Sesuaikan nama parameter
        intent.putExtra("gambar_makanan", gambarResId); // Sesuaikan nama parameter
        startActivity(intent);
    }
}
