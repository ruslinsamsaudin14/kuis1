package com.example.kuis1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private keluargaadapter adapter;
    private ArrayList<keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        adapter = new keluargaadapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga("Giono", "Ayah", getDrawable(R.drawable.bapak_ibu)));
        keluargaArrayList.add(new keluarga("Sumilah", "Ibu", getDrawable(R.drawable.bapak_ibu)));
        keluargaArrayList.add(new keluarga("Hariyono, A.md", "Anak Ke-1", getDrawable(R.drawable.kakak1)));
        keluargaArrayList.add(new keluarga("Siska Dhany Anggia Kusuma, S.E.", "Istri Kakak 1", getDrawable(R.drawable.istrikakak1)));
        keluargaArrayList.add(new keluarga("Slamet Budiono", "Anak Ke-2", getDrawable(R.drawable.kakak2)));
        keluargaArrayList.add(new keluarga("Ruslin Samsaudin", "Anak Ke-3 ", getDrawable(R.drawable.aku)));
    }
}
