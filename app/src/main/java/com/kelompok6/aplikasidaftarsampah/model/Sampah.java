package com.kelompok6.aplikasidaftarsampah.model;

public class Sampah {
    private String nama;
    private String deskripsi;
    private Integer photo;
    public Sampah(String nama, String deskripsi, Integer photo){
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.photo = photo;
    }
    public String getNama() {
        return nama;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public Integer getPhoto() {
        return photo;
    }
}
