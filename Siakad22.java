import java.util.Scanner;

public class Siakad22 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        int lulus = 0, tidakLulus = 0;
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai = input22.nextDouble();

            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah Mahasiswa yang tidak lulus: " + tidakLulus);
    }
}
