package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Inisialisasi button
        Button btnLogin = findViewById(R.id.btnLogin);

        // Set onClickListener untuk button Daftar
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke BerandaActivity
                Intent intent = new Intent(Login.this, Beranda.class);
                startActivity(intent);
            }
        });

        // Inisialisasi TextView untuk tombol Masuk
        TextView daftarTextView = findViewById(R.id.daftar);

        // Set onClickListener untuk TextView Masuk
        daftarTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke LoginActivity
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });
    }
}