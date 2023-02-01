package com.improve10X.forms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DashbordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);
        Button loginBtn = findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
        });
        Button signupBtn = findViewById(R.id.signup_btn);
        signupBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,SignupActivity.class);
            startActivity(intent);
        });
        Button mainBtn = findViewById(R.id.main_btn);
        mainBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });
        Button profileBtn = findViewById(R.id.profile_btn);
        profileBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,ProfileActivity.class);
            startActivity(intent);
        });
    }
}