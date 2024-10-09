import java.util.Scanner;

public class Tiket {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        int hrgTiket = 50000;
        int totalTiketTerjual = 0;
        int totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli (atau 0 untuk mengakhiri): ");
            int jmlTiket = input22.nextInt();

            if (jmlTiket == 0) {
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan ulang.");
                continue;
            }
            int hargaPerPembelian = hrgTiket * jmlTiket;
            if (jmlTiket > 10) {
                hargaPerPembelian *= 0.85; 
            } else if (jmlTiket > 4) {
                hargaPerPembelian *= 0.90;
            }

            totalTiketTerjual += jmlTiket;
            totalPenjualan += hargaPerPembelian;

            System.out.println("Harga untuk " + jmlTiket + " tiket adalah: Rp " + hargaPerPembelian);
        }

        System.out.println("Total tiket terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);
    }
}
