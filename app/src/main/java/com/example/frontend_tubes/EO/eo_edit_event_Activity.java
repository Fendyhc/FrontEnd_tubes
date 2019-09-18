package com.example.frontend_tubes.EO;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class eo_edit_event_Activity extends AppCompatActivity {

    public Button Confirm,Cancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eo_edit_event);

        setAtribut();
        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eo_edit_event_Activity.this, eo_event_profile_Activity.class);
                startActivity(intent);
            }
        });

        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eo_edit_event_Activity.this, eo_event_profile_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut(){
        Confirm = findViewById(R.id.eo_edit_event_ConfirmBtn);
        Cancel = findViewById(R.id.eo_edit_event_CancelBtn);
    }
}
