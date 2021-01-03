package com.aoinc.day2class.Views;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.aoinc.day2class.Models.AppUser;
import com.aoinc.day2class.R;

public class MainActivity extends AppCompatActivity {

    private Button mainButton;

    private TextView nameTextView, userIDTextView, locationTextView;
    private final int REQUEST_CODE = 707;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView = findViewById(R.id.username);
        userIDTextView = findViewById(R.id.location);
        locationTextView = findViewById(R.id.id_item);

        mainButton = findViewById(R.id.main_button);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
//                startActivity(intent);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ( requestCode == REQUEST_CODE) {
            AppUser appUser = (AppUser) data.getSerializableExtra(DetailsActivity.DATA_TAG);
            updateInfo(appUser);
        }
    }

    private void updateInfo(AppUser appUser) {
        nameTextView.setText(appUser.getName());
        locationTextView.setText(appUser.getLocation());
        userIDTextView.setText(appUser.getUserID());
    }
}