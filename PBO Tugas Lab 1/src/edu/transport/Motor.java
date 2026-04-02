package edu.transport;

public class Motor extends Kendaraan {
        public Motor(String nama, double kecepatanMaks) {
            super(nama, kecepatanMaks);
        }

        @Override
        public double hitungWaktuTempuh(double jarak){
            double kecepatanEfektif = 0.9 * kecepatanMaks;
            return jarak / kecepatanEfektif;
        }
}
