package com.kelompok6.aplikasidaftarsampah.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.kelompok6.aplikasidaftarsampah.R;
import com.kelompok6.aplikasidaftarsampah.model.Sampah;

import java.util.ArrayList;

public class DetailSampahActivity extends AppCompatActivity {
    private ArrayList<Sampah> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sampah);

        Intent intent = getIntent();
        String namaSampah = intent.getStringExtra("nama_sampah");
        String deskripsiSampah = intent.getStringExtra("description_sampah");
        int photoSampah = intent.getIntExtra("photo_sampah", 0);

        ImageView imageView = findViewById(R.id.item_photo);
        TextView nameTextView = findViewById(R.id.item_name);
        TextView descTextView = findViewById(R.id.item_description);

        imageView.setImageResource(photoSampah);
        nameTextView.setText(namaSampah);
        descTextView.setText(deskripsiSampah);
    }
}