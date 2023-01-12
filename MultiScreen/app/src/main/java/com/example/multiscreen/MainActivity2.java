package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    public TextView Name,Email,Number,Gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();

        Name = findViewById(R.id.textView4);
        Name.setText(bundle.getString("Name"));

        Gender = findViewById(R.id.textView8);
        Gender.setText(bundle.getString("Gender"));

        Email = findViewById(R.id.textView10);
        Email.setText(bundle.getString("Email"));

        Number = findViewById(R.id.textView12);
        Number.setText(bundle.getString("Number"));

    }
}