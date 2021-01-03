package com.aoinc.day2class.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.aoinc.day2class.Models.AppUser;
import com.aoinc.day2class.R;

public class DetailsActivity extends AppCompatActivity {
    private EditText personName;
    private EditText personLocation;
    private EditText personID;

    private Button savePerson;
    
    public static final String DATA_TAG = "data_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        personName = findViewById(R.id.person_name_detail);
        personLocation = findViewById(R.id.person_location);
        personID = findViewById(R.id.person_id);

        savePerson = findViewById(R.id.save_person);
        savePerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = personName.getText().toString();
                String location = personLocation.getText().toString();
                String id = personID.getText().toString();
                AppUser user = new AppUser(name, location, id);

                Intent intent = new Intent();
                intent.putExtra(DATA_TAG, user);

                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}