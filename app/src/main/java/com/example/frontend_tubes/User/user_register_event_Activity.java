package com.example.frontend_tubes.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class user_register_event_Activity extends AppCompatActivity {

    public ImageView Back;
    public Button Register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_register_event);

        setAtribut();
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_register_event_Activity.this, user_dashboard_Activity.class);
                startActivity(intent);
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_register_event_Activity.this, user_confirm_event_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut(){
        Back = findViewById(R.id.user_register_event_Back);
        Register = findViewById(R.id.user_register_event_RegisBtn);
    }
}
