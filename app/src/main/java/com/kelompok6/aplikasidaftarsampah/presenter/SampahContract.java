package com.kelompok6.aplikasidaftarsampah.presenter;

import com.kelompok6.aplikasidaftarsampah.model.Sampah;

import java.util.List;

public interface SampahContract {
    interface View {
        void showListSampah(List<Sampah> listSampah);
    }
    interface Presenter{
        void getListSampah();
    }
}
