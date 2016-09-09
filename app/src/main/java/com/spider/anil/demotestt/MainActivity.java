package com.spider.anil.demotestt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Student> arrayList;

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.mylist);
        loadData();



    }

    private void loadData() {
        arrayList = new ArrayList<>();

        arrayList.add(new Student("Anil", "Tadipatri"));
        arrayList.add(new Student("Aswartha", "Jammalamadugu"));
        arrayList.add(new Student("Ashraff", "Rayachoti"));
        arrayList.add(new Student("Mohan", "Pileru"));
        arrayList.add(new Student("JaYachandra", "Srikalahasti"));
        listView.setAdapter(new MyCustomAdapter(MainActivity.this, arrayList));
    }


}
