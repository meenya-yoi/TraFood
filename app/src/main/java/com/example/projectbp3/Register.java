package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Inisialisasi button
        Button btnRegister = findViewById(R.id.btnRegister);

        // Set onClickListener untuk button Daftar
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke BerandaActivity
                Intent intent = new Intent(Register.this, Beranda.class);
                startActivity(intent);
            }
        });

        // Inisialisasi TextView untuk tombol Masuk
        TextView masukTextView = findViewById(R.id.masuk);

        // Set onClickListener untuk TextView Masuk
        masukTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke LoginActivity
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }
        });
    }
}
