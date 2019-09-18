package com.example.frontend_tubes.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class admin_daftar_event_Activity extends AppCompatActivity {

    public ImageButton Home, User;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_daftar_event);

        setAtribut();
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (admin_daftar_event_Activity.this, admin_confirm_event_Activity.class);
                startActivity(intent);
            }
        });

        User.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin_daftar_event_Activity.this, admin_daftar_user_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut(){
        Home = findViewById(R.id.admin_daftar_event_btnHome);
        User = findViewById(R.id.admin_daftar_event_btnUser);
    }
}
