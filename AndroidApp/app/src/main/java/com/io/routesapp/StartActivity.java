package com.io.routesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.io.routesapp.ui.login.LoginActivity;

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_start_page);
        Button login_button = findViewById(R.id.login_button);
        Button login_oauth_button = findViewById(R.id.login_oauth_button);
        Button sign_up_button = findViewById(R.id.create_account);
        final WebView webview = findViewById(R.id.login_oauth_webview);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        login_oauth_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.loadUrl("https://google.com");
            }
        });
    }
}