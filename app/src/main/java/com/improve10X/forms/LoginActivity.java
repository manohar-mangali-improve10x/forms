package com.improve10X.forms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginBtn = findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(view -> {
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
        });
        Button signupBtn = findViewById(R.id.signup_btn);
        signupBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,SignupActivity.class );
            startActivity(intent);
        });

    }
}