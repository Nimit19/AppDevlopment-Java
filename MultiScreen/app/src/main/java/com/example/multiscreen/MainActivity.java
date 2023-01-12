package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.time.Instant;


public class MainActivity extends AppCompatActivity {

    public EditText Name,Email,Number;
    public RadioGroup Gender;
//    private Instant YoYo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gender = findViewById(R.id.radioGroup2);
        Name = findViewById(R.id.editTextName);
        Email = findViewById(R.id.editTextTextEmailAddress);
        Number = findViewById(R.id.editTextPhone);
        Gender.clearCheck();

    }

    public void submitButton(View v){

        if(Name.length() == 0  || Email.length() == 0  || Number.length() == 0 || Gender.getCheckedRadioButtonId()==-1){
            Toast.makeText(this, "Please Enter All Details", Toast.LENGTH_SHORT).show();
            return;
        }

        String getName = Name.getText().toString();
        String getGender = ((RadioButton)findViewById(Gender.getCheckedRadioButtonId())).getText().toString();
        String getEmail = Email.getText().toString();
        String getNumber = Number.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("Name", getName);
        bundle.putString("Gender", getGender);
        bundle.putString("Email", getEmail);
        bundle.putString("Number", getNumber);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}