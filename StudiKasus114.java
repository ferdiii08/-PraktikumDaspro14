import java.util.Scanner;

public class StudiKasus114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel sesuai flowchart
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon = 0, totalBayar;
        int kembalian, kurang;

        // Input dari pengguna
        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = scanner.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = scanner.nextInt();

        // Proses perhitungan total harga dan diskon
        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }

        totalBayar = totalHarga - diskon;

        // Output rincian biaya
        System.out.println("Total harga : Rp " + totalHarga);
        System.out.println("Diskon : Rp " + diskon);
        System.out.println("Total bayar : Rp " + totalBayar);

        // Pengecekan pembayaran (kembalian atau kurang)
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        scanner.close();
    }
}