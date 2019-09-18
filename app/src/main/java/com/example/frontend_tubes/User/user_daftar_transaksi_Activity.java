package com.example.frontend_tubes.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class user_daftar_transaksi_Activity extends AppCompatActivity {

    public ImageButton Home, Tiket, Profil;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_daftar_transaksi);

        setAtribut();
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_daftar_transaksi_Activity.this, user_dashboard_Activity.class);
                startActivity(intent);
            }
        });

        Tiket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_daftar_transaksi_Activity.this, user_tiket_saya_Activity.class);
                startActivity(intent);
            }
        });

        Profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_daftar_transaksi_Activity.this, user_profile_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut(){
        Home = findViewById(R.id.user_daftar_transaksi_btnHome);
        Tiket = findViewById(R.id.user_daftar_transaksi_btnTicket);
        Profil = findViewById(R.id.user_daftar_transaksi_btnProfile);
    }
}
