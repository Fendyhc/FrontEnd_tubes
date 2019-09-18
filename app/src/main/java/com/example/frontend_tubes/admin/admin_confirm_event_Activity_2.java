package com.example.frontend_tubes.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class admin_confirm_event_Activity_2 extends AppCompatActivity {

    public Button Cancel, Confirm;
    public ImageView Back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_confirm_event_2);

        setAtribut();
        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin_confirm_event_Activity_2.this, admin_confirm_event_Activity.class);
                startActivity(intent);
            }
        });

        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin_confirm_event_Activity_2.this, admin_daftar_event_Activity.class);
                startActivity(intent);
            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin_confirm_event_Activity_2.this, admin_confirm_event_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut(){
        Cancel = findViewById(R.id.admin_confirm_event2_CancelBtn);
        Confirm = findViewById(R.id.admin_confirm_event2_ConfirmBtn);
        Back = findViewById(R.id.admin_confirm_event2_Back);
    }
}
