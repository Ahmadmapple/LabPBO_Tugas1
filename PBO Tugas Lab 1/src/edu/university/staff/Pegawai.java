package edu.university.staff;

public class Pegawai {
    protected String nama;
    protected int gajiPokok;

    public Pegawai(String nama, int gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public double hitungGaji(){
        return gajiPokok;
    }
}
