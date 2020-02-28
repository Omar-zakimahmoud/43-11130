package com.example.milestone1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = findViewById(R.id.listview);


        ArrayList<String> list = new ArrayList<>();


        list.add("Android");
        list.add("iPhone");
        list.add("Windows");
        list.add("Blackberry");
        list.add("Linux");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    Intent myintent = new Intent(view.getContext(), DeviceDetailActivityAndroid.class);
                    startActivityForResult(myintent,0);
                }

                if(position==1) {
                    Intent myintent = new Intent(view.getContext(), DeviceDetailActivityiPhone.class);
                    startActivityForResult(myintent,1);
                }

                if(position==2) {
                    Intent myintent = new Intent(view.getContext(), DeviceDetailActivityWindows.class);
                    startActivityForResult(myintent,2);
                }
                if(position==3) {
                    Intent myintent = new Intent(view.getContext(), DeviceDetailBB.class);
                    startActivityForResult(myintent,3);
                }
                if(position==4) {
                    Intent myintent = new Intent(view.getContext(), DeviceDetailActivityLinux.class);
                    startActivityForResult(myintent,4);
                }


            }
        });


    }


}



