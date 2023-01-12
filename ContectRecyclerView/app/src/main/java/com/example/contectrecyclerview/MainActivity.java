package com.example.contectrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact C1 = new Contact(1,"Nimit M Patel","9104939358");
    Contact C2 = new Contact(1,"Nimit M Patel","9104939358");
    Contact C3 = new Contact(1,"Nimit M Patel","9104939358");
    Contact C4 = new Contact(1,"Nimit M Patel","9104939358");
    Contact C5 = new Contact(1,"Nimit M Patel","9104939358");
    Contact C6 = new Contact(1,"Nimit M Patel","9104939358");
    Contact C7 = new Contact(1,"Nimit M Patel","9104939358");
    Contact C8 = new Contact(1,"Nimit M Patel","9104939358");
    Contact C9 = new Contact(1,"Nimit M Patel","9104939358");
    Contact C10 = new Contact(1,"Nimit M Patel","9104939358");

    Contact[] contacts = {C1, C2, C3, C4, C5, C6, C7, C8, C9, C10};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this ));
        CustomAdapter c = new CustomAdapter(contacts);
        recyclerView.setAdapter(c);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}