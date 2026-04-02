package edu.transport;

public class MainApp {
    public static void main(String[] args){
        double jarakTempuh = 120.0; // dalam km

        Kendaraan mobil = new Mobil("Toyota Avanza", 100.0);
        Kendaraan motor = new Motor("Honda Vario", 100.0);

        System.out.println("Nama Kendaraan: " + mobil.getNama());
        System.out.printf("Waktu Tempuh Mobil: %.2f jam\n", mobil.hitungWaktuTempuh(jarakTempuh));

        System.out.println();

        System.out.println("Nama Kendaraan: " + motor.getNama());
        System.out.printf("Waktu Tempuh Motor: %.2f jam\n", motor.hitungWaktuTempuh(jarakTempuh));
    }
}
