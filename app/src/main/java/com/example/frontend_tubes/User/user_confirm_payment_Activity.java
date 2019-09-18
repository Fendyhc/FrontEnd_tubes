package com.example.frontend_tubes.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class user_confirm_payment_Activity extends AppCompatActivity {

    public Button Bayar;
    public ImageButton Home, Cart, Tiket, Profil;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_confirm_payment);

        setAtribut();
        Bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_confirm_payment_Activity.this,user_confirm_payment_Acitivity_2.class);
                startActivity(intent);
            }
        });

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_confirm_payment_Activity.this, user_dashboard_Activity.class);
                startActivity(intent);
            }
        });

        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_confirm_payment_Activity.this, user_dashboard_Activity.class);
                startActivity(intent);
            }
        });

        Tiket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_confirm_payment_Activity.this, user_tiket_saya_Activity.class);
                startActivity(intent);
            }
        });

        Profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_confirm_payment_Activity.this, user_profile_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut(){
        Bayar = findViewById(R.id.user_confirm_payment_BayarBtn);
        Home = findViewById(R.id.user_confirm_payment_btnHome);
        Cart = findViewById(R.id.user_confirm_payment_btnCart);
        Tiket = findViewById(R.id.user_confirm_payment_btnTicket);
        Profil = findViewById(R.id.user_confirm_payment_btnProfile);
    }
}
