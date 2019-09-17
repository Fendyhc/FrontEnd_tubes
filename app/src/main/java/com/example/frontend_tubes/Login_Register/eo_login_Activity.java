package com.example.frontend_tubes.Login_Register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend_tubes.R;
import com.example.frontend_tubes.User.user_dashboard_Activity;

import java.net.UnknownServiceException;

public class eo_login_Activity extends AppCompatActivity {

    public Button User,Login;
    public TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eo_login);

        setAtribut ();
        User.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eo_login_Activity.this,user_login_Activity.class);
                startActivity(intent);
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eo_login_Activity.this, user_dashboard_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void setAtribut (){
        User = findViewById(R.id.UserBtn);
        Login = findViewById(R.id.LoginBtn);
        signup = findViewById(R.id.SignUpTxt);
    }
}
