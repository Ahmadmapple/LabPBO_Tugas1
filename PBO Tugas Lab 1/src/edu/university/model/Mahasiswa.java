package edu.university.model;

public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa(){
        this.setNim("NIM belum dimasukkan");
        this.setNama("Nama belum dimasukkan");
        this.setIpk(0);
    }
    public Mahasiswa(String nim, String nama, double ipk){
        this.setNim(nim);
        this.setNama(nama);
        this.setIpk(ipk);
    }

    public void getKategoriIPK(){
        if (getIpk() >= 3.5){
            System.out.println("Cumlaude");
        } else if (getIpk() >= 3.0 && getIpk() <= 3.49) {
            System.out.println("Sangat Memuaskan");
        } else if (getIpk() >= 2.5 && getIpk() <= 2.99) {
            System.out.println("Memuaskan");
        }
        else {
            System.out.println("Perlu Perbaikan");
        }
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
}
