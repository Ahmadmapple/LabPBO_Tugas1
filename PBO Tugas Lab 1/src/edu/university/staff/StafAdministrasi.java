package edu.university.staff;

public class StafAdministrasi extends Pegawai {
    int jamLembur;

    public StafAdministrasi(String nama, int gajiPokok, int jamLembur){
        super(nama, gajiPokok);
        this.jamLembur = jamLembur;
    }

    public int getJamLembur() {
        return jamLembur;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (jamLembur * 50000);
    }
}