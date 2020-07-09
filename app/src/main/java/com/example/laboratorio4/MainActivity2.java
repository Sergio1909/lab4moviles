package com.example.laboratorio4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] images = {R.drawable.goku, R.drawable.helicoptero, R.drawable.pucp};
    private RecyclerAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            recyclerView = findViewById(R.id.recyclerView);
            layoutManager = new GridLayoutManager(this,2);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(layoutManager);
            adapter = new RecyclerAdapter(images);
            recyclerView.setAdapter(adapter);

    }
}