package com.example.ppark.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView listview = (ListView) findViewById(R.id.listview);

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
//
//        for (int i = 1; i <= 20; i++) {
//            adapter.add(i + "");
//        }
//
//        listview.setAdapter(adapter);

        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 1; i <= 100; i++) {
            arrayList.add(i + "");
        }

        CustomAdapter adapter = new CustomAdapter(this, arrayList);
        listview.setAdapter(adapter);
    }
}
