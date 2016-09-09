package com.spider.anil.demotestt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    List<Student> arrayList;

    MyRecAdapter myRecAdapter;
    @BindView(R.id.mylist)
    RecyclerView mylist;
    //ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        loadData();


    }

    private void loadData() {
        arrayList = new ArrayList<>();

        arrayList.add(new Student("Anil", "Tadipatri"));
        arrayList.add(new Student("Aswartha", "Jammalamadugu"));
        arrayList.add(new Student("Ashraff", "Rayachoti"));
        arrayList.add(new Student("Mohan", "Pileru"));
        arrayList.add(new Student("JaYachandra", "Srikalahasti"));
        mylist.setLayoutManager(new LinearLayoutManager(this));
        myRecAdapter = new MyRecAdapter(this, arrayList);
        mylist.setAdapter(myRecAdapter);

        //  myRecAdapter.notifyDataSetChanged();


        //  listView.setAdapter(new MyCustomAdapter(MainActivity.this, arrayList));
    }


}
