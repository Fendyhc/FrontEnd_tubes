package com.example.frontend_tubes.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class user_dashboard_Activity extends AppCompatActivity {

    public Button regisEvnt, apply;
    public ImageButton Cart, Tiket, Profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_dashboard);

        setAtribut();
        regisEvnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_dashboard_Activity.this, user_register_event_Activity.class);
                startActivity(intent);
            }
        });

        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_dashboard_Activity.this, user_daftar_transaksi_Activity.class);
                startActivity(intent);
            }
        });

        Tiket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_dashboard_Activity.this, user_tiket_saya_Activity.class);
                startActivity(intent);
            }
        });

        Profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_dashboard_Activity.this, user_profile_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut(){
        regisEvnt = findViewById(R.id.user_dashboard_RegisEvntBtn);
        apply = findViewById(R.id.user_dashboard_ApplyBtn);
        Cart = findViewById(R.id.user_dashboard_btnCart);
        Tiket = findViewById(R.id.user_dashboard_btnTicket);
        Profil = findViewById(R.id.user_dashboard_btnProfile);
    }
}
