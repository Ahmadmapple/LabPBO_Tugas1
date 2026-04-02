package edu.university.main;

import edu.university.model.Mahasiswa;
import edu.university.staff.Dosen;
import edu.university.staff.Pegawai;
import edu.university.staff.StafAdministrasi;

public class MainApp {
    public static void main(String[] args) {

        //SOAL 1
        Mahasiswa maha1 = new Mahasiswa("241401001", "Michael", 3.2);
        Mahasiswa maha2 = new Mahasiswa("241401002", "Michelle", 4);
        Mahasiswa maha3 = new Mahasiswa();
        Mahasiswa maha4 = new Mahasiswa("241401002", "Martin", 2.3);

        Mahasiswa[] daftarMahasiswa = {maha1, maha2, maha3, maha4};
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("NIM: " + mhs.getNim());
            System.out.println("IPK: " + mhs.getIpk());
            mhs.getKategoriIPK();
            System.out.println();
        }

        //SOAL 2
        Pegawai dos1 = new Dosen("Budi", 300000, 24);
        Pegawai dos2 = new Dosen("Indra", 400000, 28);
        Pegawai dos3 = new Dosen("Joko", 500000, 32);
        Pegawai adm1 = new StafAdministrasi("Herry", 300000, 2);
        Pegawai adm2 = new StafAdministrasi("Rian", 200000, 2);
        Pegawai adm3 = new StafAdministrasi("Ismail", 250000, 3);

        Pegawai[] daftarPegawai = {dos1, dos2, dos3, adm1, adm2, adm3};
        for (Pegawai gawai : daftarPegawai) {
            System.out.println("Nama        : " + gawai.getNama());
            System.out.println("Gaji Pokok  : Rp " + gawai.getGajiPokok());

            if (gawai instanceof Dosen) {
                Dosen dosen = (Dosen) gawai;
                System.out.println("Jabatan     : Dosen");
                System.out.println("Beban SKS   : " + dosen.getJumlahSKS());
            } else if (gawai instanceof StafAdministrasi) {
                StafAdministrasi staf = (StafAdministrasi) gawai;
                System.out.println("Jabatan     : Staf Administrasi");
                System.out.println("Jam Lembur  : " + staf.getJamLembur());
            }

            System.out.println("Total Gaji  : Rp " + gawai.hitungGaji());
            System.out.println();
        }
    }
}
