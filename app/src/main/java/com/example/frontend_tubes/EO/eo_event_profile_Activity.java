package com.example.frontend_tubes.EO;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class eo_event_profile_Activity extends AppCompatActivity {

    public Button Edit;
    public ImageButton Home, Peserta;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eo_event_profile);

        setAtribut();
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eo_event_profile_Activity.this, eo_daftar_confirm_Activity.class);
                startActivity(intent);
            }
        });

        Peserta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eo_event_profile_Activity.this, eo_daftar_peserta_Activity.class);
                startActivity(intent);
            }
        });

        Edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eo_event_profile_Activity.this, eo_edit_event_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut(){
        Home = findViewById(R.id.eo_event_profile_btnHome);
        Peserta = findViewById(R.id.eo_event_profile_btnPeserta);
        Edit = findViewById(R.id.eo_event_profile_EditBtn);
    }
}
