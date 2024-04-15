package com.example.practika6;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int OVERLAY_PERMISSION_REQUEST_CODE = 1234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showBannerButton = findViewById(R.id.notification_buttn);
        showBannerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBannerService();
            }
        });
    }

    private void startBannerService() {
        Intent intent = new Intent(this, BannerService.class);
        startService(intent);
    }
}

