package edu.university.staff;

public class Dosen extends Pegawai {
    int jumlahSKS;

    public Dosen(String nama, int gajiPokok, int jumlahSKS){
        super(nama, gajiPokok);
        this.jumlahSKS = jumlahSKS;
    }

    public int getJumlahSKS() {
        return jumlahSKS;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (jumlahSKS * 150000);
    }
}
