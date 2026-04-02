package edu.smartdevice;

public class MainApp {
    public static void main(String[] args) {
        SmartWatch myWatch = new SmartWatch();

        System.out.println("Status Awal Baterai: " + myWatch.getBatteryLevel() + "%");
        myWatch.chargeBattery(45);
        myWatch.chargeBattery(70);

        System.out.println();
        myWatch.connectWifi("Wifi_Kantor");

        System.out.println();
        System.out.println("Level Baterai : " + myWatch.getBatteryLevel() + "%");
        System.out.println("Status Koneksi: " + (myWatch.isConnected() ? "Tersambung" : "Terputus"));

        if (myWatch.isConnected()) {
            System.out.println("SSID Terhubung : " + myWatch.getSsid());
        }
    }
}
