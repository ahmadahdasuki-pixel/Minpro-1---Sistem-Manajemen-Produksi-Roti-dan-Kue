package SistemManajemenProduksi;

import java.util.Scanner;
import SistemManajemenProduksi.Produk;
import SistemManajemenProduksi.Produksi;
import SistemManajemenProduksi.manajemensistem;

public class Minpro1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        manajemensistem manajemen = new manajemensistem(scanner);

        boolean berjalan = true;

        while (berjalan) {

            System.out.println("======================================");
            System.out.println("   SISTEM MANAJEMEN PRODUKSI");
            System.out.println("        ROTI DAN KUE");
            System.out.println("======================================");
            System.out.println("1. Tambah Data Produksi");
            System.out.println("2. Tampilkan Data Produksi");
            System.out.println("3. Update Data Produksi");
            System.out.println("4. Hapus Data Produksi");
            System.out.println("5. Keluar");
            System.out.println("======================================");

            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {

                case 1:
                    manajemen.tambahProduksi();
                    break;

                case 2:
                    manajemen.tampilkanProduksi();
                    break;

                case 3:
                    manajemen.updateProduksi();
                    break;

                case 4:
                    manajemen.hapusProduksi();
                    break;

                case 5:
                    berjalan = false;
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}