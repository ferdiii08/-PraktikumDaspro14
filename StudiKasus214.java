import java.util.Scanner;
public class StudiKasus214 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine().trim();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = sc.nextInt();

        boolean berhakDana = false;
        String alasan = "";

        // Pemilihan bersarang (Nested IF)
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Peringkat juara : ");
            int peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    berhakDana = true;
                    alasan = "Memenuhi kriteria juara dan dokumen lengkap.";
                } else {
                    alasan = "Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                alasan = "Peringkat juara tidak memenuhi syarat untuk menerima dana penghargaan.";
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPKM = sc.nextInt();

            if (statusPKM == 1) {
                if (jumlahDokumen == 4) {
                    berhakDana = true;
                    alasan = "Lolos pendanaan PKM dan dokumen lengkap.";
                } else {
                    alasan = "Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                alasan = "PKM tidak lolos pendanaan.";
            }

        } else {
            alasan = "Jenis kegiatan tidak memperoleh dana penghargaan.";
        }
        // Output 
        if (berhakDana) {
            System.out.println("Menerima dana penghargaan: (" + alasan + ")");
        } else {
            System.out.println(": " + alasan);
        }
        sc.close();
    }
}