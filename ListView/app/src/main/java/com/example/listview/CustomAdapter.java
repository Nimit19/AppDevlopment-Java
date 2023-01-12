package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<String> {
    private String[] arr;
    private Context context;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.arr = arr;
        this.context = context;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_layout,parent,false);
        TextView t = convertView.findViewById(R.id.textView3);
        t.setText(getItem(position));

//        // For All Value
//        convertView.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, "You Click: " + position, Toast.LENGTH_SHORT).show();
//            }
//        });

//        // For Specific Value
//        t.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, "You Click: " + position, Toast.LENGTH_SHORT).show();
//            }
//        });

        return convertView;
    }
}

