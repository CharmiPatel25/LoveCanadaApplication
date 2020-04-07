package com.example.lovecanadaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.lovecanadaapplication.Model.CanadaAttraction;

public class PlaceDetails extends AppCompatActivity {
    CanadaAttraction details;
    private TextView txtName, txtAddress, txtCity, txtProvience, txtLink, txtDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);
        txtName = findViewById(R.id.txtName);
        txtAddress = findViewById(R.id.txtAddress);
        txtCity = findViewById(R.id.txtCity);
        txtProvience = findViewById(R.id.txtProvience);
        txtLink = findViewById(R.id.txtLink);
        txtDetails = findViewById(R.id.txtDesc);
        if (getIntent().getExtras() != null) {
            details = (CanadaAttraction) getIntent().getSerializableExtra("PlaceDetails");
            txtName.setText(details.getPlaceName().toString());
            txtAddress.setText(details.getAddress().toString());
            txtCity.setText(details.getCity().toString());
            txtProvience.setText(details.getProvince().toString());
            txtLink.setText(details.getLink().toString());
            txtDetails.setText(details.getDescription().toString());
        }
    }
}
