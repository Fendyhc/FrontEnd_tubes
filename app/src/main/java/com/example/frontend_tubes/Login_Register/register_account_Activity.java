package com.example.frontend_tubes.Login_Register;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

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
        Login = findViewById(R.id.register_LoginTxt);
        Daftar = findViewById(R.id.register_RegisBtn);
    }

    public void openDialog() {
        EmailDialog emailDialog = new EmailDialog();
        emailDialog.show(getSupportFragmentManager(),"Email Dialog");
    }
}
