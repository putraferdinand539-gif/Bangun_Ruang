package bangunruang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KALKULATOR BANGUN RUANG (OOP) ===");

        // 1. Input untuk Kubus
        System.out.println("\n--- Masukkan Nilai Kubus ---");
        System.out.print("Panjang sisi kubus: ");
        double sisi = scanner.nextDouble();
        BangunRuang kubus = new Kubus(sisi);
        tampilkanHasil(kubus);

        // 2. Input untuk Balok
        System.out.println("\n--- Masukkan Nilai Balok ---");
        System.out.print("Panjang balok     : ");
        double p = scanner.nextDouble();
        System.out.print("Lebar balok       : ");
        double l = scanner.nextDouble();
        System.out.print("Tinggi balok      : ");
        double tBalok = scanner.nextDouble();
        BangunRuang balok = new Balok(p, l, tBalok);
        tampilkanHasil(balok);

        // 3. Input untuk Tabung
        System.out.println("\n--- Masukkan Nilai Tabung ---");
        System.out.print("Jari-jari tabung  : ");
        double r = scanner.nextDouble();
        System.out.print("Tinggi tabung     : ");
        double tTabung = scanner.nextDouble();
        BangunRuang tabung = new Tabung(r, tTabung);
        tampilkanHasil(tabung);

        scanner.close();
        System.out.println("\nSemua perhitungan selesai!");
    }

    public static void tampilkanHasil(BangunRuang b) {
        System.out.println("\nHasil " + b.getNama() + " :");
        System.out.printf("Volume          : %.2f\n", b.hitungVolume());
        System.out.printf("Luas Permukaan  : %.2f\n", b.hitungLuasPermukaan());
    }
}