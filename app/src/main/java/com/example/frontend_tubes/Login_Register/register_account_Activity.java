package com.example.frontend_tubes.Login_Register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.EmailDialog;
import com.example.frontend_tubes.R;

public class register_account_Activity extends AppCompatActivity {

    public Button Daftar;
    public TextView Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_acc);

        setAtribut();
        Daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDialog();
                Intent intent = new Intent(register_account_Activity.this, user_login_Activity.class);
                startActivity(intent);
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register_account_Activity.this, user_login_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut (){
        Login = findViewById(R.id.LoginTxt);
        Daftar = findViewById(R.id.RegisBtn);
    }

    public void openDialog() {
        EmailDialog emailDialog = new EmailDialog();
        emailDialog.show(getSupportFragmentManager(),"Email Dialog");
    }
}
