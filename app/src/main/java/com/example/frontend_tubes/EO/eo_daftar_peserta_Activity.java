package com.example.frontend_tubes.EO;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class eo_daftar_peserta_Activity extends AppCompatActivity {

    public ImageButton Home, Profil;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eo_daftar_peserta);

        setAtribut();
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(eo_daftar_peserta_Activity.this, eo_daftar_confirm_Activity.class);
                startActivity(intent);
            }
        });

        Profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eo_daftar_peserta_Activity.this, eo_event_profile_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut(){
        Home = findViewById(R.id.eo_daftar_peserta_btnHome);
        Profil = findViewById(R.id.eo_daftar_peserta_btnProfil);
    }
}
