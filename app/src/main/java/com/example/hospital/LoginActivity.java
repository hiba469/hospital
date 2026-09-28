package com.example.hospital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private Button CreateButton;
    private Button loginButton;
    private Spinner roleSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);

        CreateButton = findViewById(R.id.CreateButton);
        loginButton = findViewById(R.id.loginButton);
        roleSpinner = findViewById(R.id.list_view_role);

        CreateButton.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, CreateActivity.class);
            startActivity(intent);
        });

        loginButton.setOnClickListener(v -> {

            if (roleSpinner.getSelectedItemPosition() == 0) {
                Toast.makeText(LoginActivity.this,
                        "Select your role",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            String role = roleSpinner.getSelectedItem().toString();

            Toast.makeText(LoginActivity.this,
                    "Selected role: " + role,
                    Toast.LENGTH_SHORT).show();
        });
    }
}