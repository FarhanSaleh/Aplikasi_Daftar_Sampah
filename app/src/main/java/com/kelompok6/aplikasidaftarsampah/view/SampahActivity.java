package com.kelompok6.aplikasidaftarsampah.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.kelompok6.aplikasidaftarsampah.R;
import com.kelompok6.aplikasidaftarsampah.model.Sampah;
import com.kelompok6.aplikasidaftarsampah.presenter.SampahContract;
import com.kelompok6.aplikasidaftarsampah.presenter.SampahPresenter;

import java.util.ArrayList;
import java.util.List;

public class SampahActivity extends AppCompatActivity implements SampahContract.View {
    private RecyclerView recyclerView;
    private SampahAdapter adapter;
    private SampahContract.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sampah);

        recyclerView = findViewById(R.id.rv_sampah);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        presenter = new SampahPresenter(this, this);
        presenter.getListSampah();
    }

    @Override
    public void showListSampah(List<Sampah> listSampah) {
        adapter = new SampahAdapter(listSampah);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickCallback(this::showSelectedSampah);
    }

    private void showSelectedSampah(Sampah sampah){
        Intent intent = new Intent(SampahActivity.this, DetailSampahActivity.class);

        intent.putExtra("nama_sampah", sampah.getNama());
        intent.putExtra("description_sampah", sampah.getDeskripsi());
        intent.putExtra("photo_sampah", sampah.getPhoto());

        startActivity(intent);
        Toast.makeText(this, "Kamu memilih " + sampah.getNama(), Toast.LENGTH_SHORT).show();
    }
}