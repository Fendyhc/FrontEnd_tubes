package com.example.frontend_tubes.EO;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class eo_daftar_confirm_Activity extends AppCompatActivity {

    public ImageButton Peserta, Profil;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eo_daftar_confirm);

        setAtribut();
        Peserta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eo_daftar_confirm_Activity.this, eo_daftar_peserta_Activity.class);
                startActivity(intent);
            }
        });

        Profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eo_daftar_confirm_Activity.this, eo_event_profile_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut(){
        Peserta = findViewById(R.id.eo_daftar_confirm_btnPeserta);
        Profil = findViewById(R.id.eo_daftar_confirm_btnProfil);
    }
}
