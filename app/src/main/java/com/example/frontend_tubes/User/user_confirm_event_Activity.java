package com.example.frontend_tubes.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;

public class user_confirm_event_Activity extends AppCompatActivity {

    public Button Cancel, Confirm;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_confirm_event);

        setAtribut();
        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_confirm_event_Activity.this,user_register_event_Activity.class);
                startActivity(intent);
            }
        });
        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_confirm_event_Activity.this,user_dashboard_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut(){
        Cancel = findViewById(R.id.user_confirm_event_cancelBtn);
        Confirm = findViewById(R.id.user_confirm_event_confirmBtn);
    }
}
