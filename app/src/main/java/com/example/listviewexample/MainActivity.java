package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.*;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String Countries[];
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.ListviewOut);
        Countries = getResources().getStringArray(R.array.Countries);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Countries);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Country_name= parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"your selected "+Country_name,Toast.LENGTH_LONG).show();

            }
        });
    }
}