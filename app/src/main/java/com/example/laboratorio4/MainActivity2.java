package com.example.laboratorio4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private RecyclerView recyclerView;
    //private int[] images = {R.drawable.goku, R.drawable.helicoptero, R.drawable.pucp};
    private RecyclerAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private DatabaseReference databaseReference;
    private List<Upload> Uploads;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            recyclerView = findViewById(R.id.recyclerView);
            layoutManager = new GridLayoutManager(this,2);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(layoutManager);

            Uploads = new ArrayList<>();
            databaseReference = FirebaseDatabase.getInstance().getReference("Uploads");
            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                        Upload upload = postSnapshot.getValue(Upload.class);
                        Uploads.add(upload);



                    }
                    adapter = new RecyclerAdapter(MainActivity2.this,);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                    Toast.makeText(MainActivity2.this,databaseError.getMessage(),Toast.LENGTH_SHORT).show();
                }
            });



            recyclerView.setAdapter(adapter);

    }
}