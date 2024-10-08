import java.util.Scanner;
public class Siakad22 {

    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        int mhs = 10, lulus = 0, tidakLulus = 0, i;
        double nilai;

        i = 1;
        while (i <= mhs) {
            System.out.print("Masukkan nilai mahasiswa " + i + ": ");
            nilai = input22.nextDouble();
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
            i++;
        }
        System.out.println("Jumlah Mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah Mahasiswa yang tidak lulus: " + tidakLulus);
    }
}