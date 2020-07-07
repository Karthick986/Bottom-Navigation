package com.android.bottoomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_notify);
        bottomNavigationView.setSelectedItemId(R.id.bot_notify);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.bot_home:
                        startActivity(new Intent(NotificationActivity.this, MainActivity.class));
                        overridePendingTransition(0, 0);
                        // finish();
                        break;
                    case R.id.bot_notify:
                        break;
                    case R.id.bot_settings:
                        startActivity(new Intent(NotificationActivity.this, SettingsActivity.class));
                        overridePendingTransition(0, 0);
                        //finish();
                        break;
                }
                return false;
            }
        });
    }
}
