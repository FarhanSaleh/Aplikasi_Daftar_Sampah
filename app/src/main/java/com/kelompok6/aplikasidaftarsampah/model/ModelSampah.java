package com.kelompok6.aplikasidaftarsampah.model;

import android.content.Context;
import android.content.res.TypedArray;

import com.kelompok6.aplikasidaftarsampah.R;

import java.util.ArrayList;
import java.util.List;

public class ModelSampah {
    private static Context context;

    public ModelSampah(Context context) {
        this.context = context;
    }

    public List<Sampah> getListSampah(){
        List<Sampah> listSampah = new ArrayList<>();
        String[] namaSampah = context.getResources().getStringArray(R.array.data_namaS);
        String[] dataDeskripsi = context.getResources().getStringArray(R.array.data_deskripsi);
        TypedArray fotoSampah = context.getResources().obtainTypedArray(R.array.data_foto);

        for (int i = 0; i < namaSampah.length; i++){
            String nama = namaSampah[i];
            String deskripsi = dataDeskripsi[i];
            Integer foto = fotoSampah.getResourceId(i, -1);
            listSampah.add(new Sampah(nama, deskripsi, foto));
        }
        return listSampah;
    }
}
