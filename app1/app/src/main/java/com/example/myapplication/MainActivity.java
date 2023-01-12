package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        Toast.makeText(this, "Welcome to my First App", Toast.LENGTH_SHORT).show();

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String s = editText.getText().toString();
//                int bytes = Integer.parseInt(s);
//                double bits = bytes * 8;
//                textView1.setText(bytes + " Bytes = " + bits + " Bits" );
//            }
//        });
    }

    public void calculate(View view){
        String s = editText.getText().toString();
        int bytes = Integer.parseInt(s);
        double bits = bytes * 8;
        textView1.setText(bytes + " Bytes = " + bits + " Bits" );
    }
}