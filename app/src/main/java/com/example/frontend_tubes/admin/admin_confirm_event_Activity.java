package com.example.frontend_tubes.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class admin_confirm_event_Activity extends AppCompatActivity {

    public ImageButton Event, User;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_confirm_event);

        setAtribut();
        Event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin_confirm_event_Activity.this, admin_daftar_event_Activity.class);
                startActivity(intent);
            }
        });

        User.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin_confirm_event_Activity.this, admin_daftar_user_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut(){
        Event = findViewById(R.id.admin_confirm_event_btnEvent);
        User = findViewById(R.id.admin_confirm_event_btnUser);
    }
}
