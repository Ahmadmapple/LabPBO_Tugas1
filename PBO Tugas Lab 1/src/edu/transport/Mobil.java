package edu.transport;

public class Mobil extends Kendaraan {
    public Mobil(String nama, double kecepatanMaks) {
        super(nama, kecepatanMaks);
    }

    @Override
    public double hitungWaktuTempuh(double jarak) {
        double kecepatanEfektif = 0.8 * kecepatanMaks;
        return jarak / kecepatanEfektif;
    }
}