package com.example.frontend_tubes.Login_Register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.frontend_tubes.R;

public class user_login_Activity extends AppCompatActivity {

    public Button EO, Login;
    public TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);

        setAtribut ();
        EO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_login_Activity.this,eo_login_Activity.class);
                startActivity(intent);
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_login_Activity.this,.);
                startActivity(intent);
            }
        });
    }

    public void setAtribut (){
        EO = findViewById(R.id.EOBtn);
        Login = findViewById(R.id.LoginBtn);
        signup = findViewById(R.id.SignUpTxt);
    }
}
