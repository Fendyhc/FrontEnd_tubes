package com.example.frontend_tubes.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class user_profile_Activity extends AppCompatActivity {

    public Button Edit;
    public ImageButton Home, Cart, Tiket;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);

        setAtribut();
        Edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_profile_Activity.this, user_edit_profile_Activity.class);
                startActivity(intent);
            }
        });

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_profile_Activity.this, user_dashboard_Activity.class);
                startActivity(intent);
            }
        });

        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_profile_Activity.this, user_daftar_transaksi_Activity.class);
                startActivity(intent);
            }
        });

        Tiket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_profile_Activity.this, user_tiket_saya_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut() {
        Edit = findViewById(R.id.user_profile_EditBtn);
        Home = findViewById(R.id.user_profile_btnHome);
        Cart = findViewById(R.id.user_profile_btnCart);
        Tiket = findViewById(R.id.user_profile_btnTicket);
    }
}
