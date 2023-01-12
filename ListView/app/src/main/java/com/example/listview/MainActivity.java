package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    String[] arr = {"Nimit M Patel","Nick","Ruchir","Ankit","Shiv","Nimit M Patel","Nick","Ruchir","Ankit","Shiv"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

//        // Built in Adapter
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
//        listView.setAdapter(ad);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "You Click: " + i, Toast.LENGTH_SHORT).show();
//            }
//        });

        // Custom Adapter
        CustomAdapter ad1 = new CustomAdapter(this, R.layout.custom_layout,arr);
        listView.setAdapter(ad1);

    }
}