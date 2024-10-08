import java.util.Scanner;
public class KafeDoWhile22 {

    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        int kopi,teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;

        do { 
            System.out.print("Masukkan nama pelanggan ( ketik 'batal' untuk keluar): ");
            namaPelanggan = input22.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = input22.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = input22.nextInt();
            System.out.print("Jumlah roti: ");
            roti = input22.nextInt();
            totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            input22.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
    }
}