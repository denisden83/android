package com.example.money;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.money.items.Item;
import com.example.money.items.ItemsAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ItemsAdapter itemsAdapter = new ItemsAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv_items);
        recyclerView.setAdapter(itemsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));

        generateData();

        findViewById(R.id.welcome_sign).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(getApplicationContext(), AddItemActivity.class);
                startActivity(newActivity);
            }
        });
    }

    private void generateData() {
        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("Salary", "10000$"));
        itemList.add(new Item("Taxes", "2000$"));
        itemList.add(new Item("PS4", "1500$"));
        itemList.add(new Item("Food", "3500$"));

        itemsAdapter.setData(itemList);
    }
}