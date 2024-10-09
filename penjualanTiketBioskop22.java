import java.util.Scanner;
public class penjualanTiketBioskop22 {

    public static void main(String[] args) {
        Scanner input22= new Scanner(System.in);

        int tiket, hrgTiket, totalTiketTerjual;
        double totalPenjualan, diskon;

        System.out.print("Masukkan harga tiket bioskop: ");
        hrgTiket = input22.nextInt();         

        while (true) { 
            System.out.print("Masukkan jumlah tiket untuk melakukan pembelian(ketik 0 untuk selesai): ");
            tiket = input22.nextInt();

            if (tiket < 0) {
                System.out.print("Jumlah tiket tidak valid. Masukkan lagi jumlah tiket yang valid");
                continue;
            }
            if (tiket > 4) {
                diskon = 0.01; 
            } if ( tiket > 10){
                diskon = 0.15;
            }
        }
    }
}