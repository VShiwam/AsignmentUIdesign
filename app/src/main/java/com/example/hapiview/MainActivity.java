package com.example.hapiview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>itemList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     initData();
     initRecycerView();

    }

    private void initData() {
        itemList= new ArrayList<>();

        itemList.add(new ModelClass(R.drawable.images,"car"));
        itemList.add(new ModelClass(R.drawable.download,"swift"));
        itemList.add(new ModelClass(R.drawable.images,"baleno"));
        itemList.add(new ModelClass(R.drawable.download,"audi"));
        itemList.add(new ModelClass(R.drawable.images,"800"));
        itemList.add(new ModelClass(R.drawable.download,"bmw"));
        itemList.add(new ModelClass(R.drawable.images,"tata"));
    }

    private void initRecycerView() {

        recyclerView=findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(itemList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


}