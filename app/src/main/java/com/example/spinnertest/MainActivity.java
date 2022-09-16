package com.example.spinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.pages,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // When the given dropdown item is selected, show its contents in the
        // container view.
        switch (position) {
            case 0:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new HomeFragment()).commit();
                break;
            case 1:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new BlogFragment()).commit();
                break;
            case 2:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,new VolunteerFragment()).commit();
                break;
            case 3:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,new DonateFragment()).commit();
                break;
        }



    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}