package SistemManajemenProduksi;

import java.util.Scanner;

public class Minpro1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        manajemensistem manajemen = new manajemensistem();

        int pilihan;

        do {

            System.out.println();
            System.out.println("======================================");
            System.out.println(" SISTEM MANAJEMEN PRODUKSI ROTI & KUE");
            System.out.println("======================================");
            System.out.println("1. Tambah Data Produksi");
            System.out.println("2. Tampilkan Data Produksi");
            System.out.println("3. Ubah Data Produksi");
            System.out.println("4. Hapus Data Produksi");
            System.out.println("5. Keluar");
            System.out.println("======================================");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.println();
                    System.out.println("TAMBAH DATA PRODUKSI");

                    System.out.print("ID Produksi: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama Produk: ");
                    String nama = input.nextLine();

                    System.out.print("Jenis Produk: ");
                    String jenis = input.nextLine();

                    System.out.print("Jumlah Produksi: ");
                    int jumlah = input.nextInt();
                    input.nextLine();

                    System.out.print("Tanggal Produksi: ");
                    String tanggal = input.nextLine();

                    System.out.print("Status Produksi: ");
                    String status = input.nextLine();

                    Produksi produksiBaru = new Produksi(
                            id,
                            nama,
                            jenis,
                            jumlah,
                            tanggal,
                            status
                    );

                    manajemen.tambahProduksi(produksiBaru);

                    break;


                case 2:

                    System.out.println();
                    System.out.println("DATA PRODUKSI");

                    manajemen.tampilkanProduksi();

                    break;


                case 3:

                    System.out.println();
                    System.out.println("UBAH DATA PRODUKSI");

                    System.out.print("Masukkan ID Produksi yang ingin diubah: ");
                    int idUbah = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama Produk Baru: ");
                    String namaBaru = input.nextLine();

                    System.out.print("Jenis Produk Baru: ");
                    String jenisBaru = input.nextLine();

                    System.out.print("Jumlah Produksi Baru: ");
                    int jumlahBaru = input.nextInt();
                    input.nextLine();

                    System.out.print("Tanggal Produksi Baru: ");
                    String tanggalBaru = input.nextLine();

                    System.out.print("Status Produksi Baru: ");
                    String statusBaru = input.nextLine();

                    manajemen.ubahProduksi(
                            idUbah,
                            namaBaru,
                            jenisBaru,
                            jumlahBaru,
                            tanggalBaru,
                            statusBaru
                    );

                    break;


                case 4:

                    System.out.println();
                    System.out.println("HAPUS DATA PRODUKSI");

                    System.out.print("Masukkan ID Produksi yang ingin dihapus: ");
                    int idHapus = input.nextInt();

                    manajemen. hapusProduksi(idHapus);

                    break;


                case 5:

                    System.out.println();
                    System.out.println("Program selesai.");
                    break;


                default:

                    System.out.println();
                    System.out.println("Menu tidak tersedia.");

            }

        } while (pilihan != 5);

        input.close();
    }
}