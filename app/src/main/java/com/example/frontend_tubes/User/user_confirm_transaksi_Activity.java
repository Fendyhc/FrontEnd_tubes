package com.example.frontend_tubes.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class user_confirm_transaksi_Activity extends AppCompatActivity {

    public Button Confirm;
    public ImageButton Home, Cart, Tiket, Profil;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_confim_transaksi);

        setAtribut();
        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_confirm_transaksi_Activity.this,user_daftar_transaksi_Activity.class);
                startActivity(intent);
            }
        });

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_confirm_transaksi_Activity.this, user_dashboard_Activity.class);
                startActivity(intent);
            }
        });

        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_confirm_transaksi_Activity.this, user_daftar_transaksi_Activity.class);
                startActivity(intent);
            }
        });

        Tiket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_confirm_transaksi_Activity.this, user_tiket_saya_Activity.class);
                startActivity(intent);
            }
        });

        Profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_confirm_transaksi_Activity.this, user_profile_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut(){
        Confirm = findViewById(R.id.user_confirm_transaksi_ConfirmBtn);
        Home = findViewById(R.id.user_confirm_transaksi_btnHome);
        Cart = findViewById(R.id.user_confirm_transaksi_btnCart);
        Tiket = findViewById(R.id.user_confirm_transaksi_btnTicket);
        Profil = findViewById(R.id.user_confirm_transaksi_btnProfile);
    }
}
