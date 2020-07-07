package com.android.bottoomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Set;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_settings);
        bottomNavigationView.setSelectedItemId(R.id.bot_settings);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.bot_home:
                        startActivity(new Intent(SettingsActivity.this, MainActivity.class));
                        overridePendingTransition(0, 0);
                        // finish();
                        break;
                    case R.id.bot_notify:
                        startActivity(new Intent(SettingsActivity.this, NotificationActivity.class));
                        overridePendingTransition(0, 0);
                        //finish();
                        break;
                    case R.id.bot_settings:
                        break;
                }
                return false;
            }
        });
    }
}
