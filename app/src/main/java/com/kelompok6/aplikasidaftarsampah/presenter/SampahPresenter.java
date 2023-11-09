package com.kelompok6.aplikasidaftarsampah.presenter;

import android.content.Context;

import com.kelompok6.aplikasidaftarsampah.model.ModelSampah;
import com.kelompok6.aplikasidaftarsampah.model.Sampah;

import java.util.List;

public class SampahPresenter implements SampahContract.Presenter{
    private SampahContract.View view;
    private ModelSampah modelSampah;
    public SampahPresenter(SampahContract.View view, Context context){
        this.view = view;
        this.modelSampah = new ModelSampah(context);
    }

    @Override
    public void getListSampah() {
        List<Sampah> listSampah = modelSampah.getListSampah();
        view.showListSampah(listSampah);
    }
}
