package SistemManajemenProduksi;

import java.util.ArrayList;
import java.util.Scanner;


public class manajemensistem {


    private ArrayList<Produksi> daftarProduksi;
    private Scanner scanner;

    public manajemensistem(Scanner scanner) {

        daftarProduksi = new ArrayList<>();
        this.scanner = scanner;
    }

//    Tambah Produksi
    public void tambahProduksi() {

        System.out.print("ID Produksi: ");
        int idProduksi = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ID Produk: ");
        int idProduk = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama Produk: ");
        String namaProduk = scanner.nextLine();

        System.out.print("Jenis Produk: ");
        String jenisProduk = scanner.nextLine();

        System.out.print("Harga Produk: ");
        double hargaProduk = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Jumlah Produksi: ");
        int jumlahProduksi = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tanggal Produksi: ");
        String tanggalProduksi = scanner.nextLine();

        System.out.print("Status Produksi: ");
        String statusProduksi = scanner.nextLine();

        Produk produkBaru = new Produk(
                idProduk,
                namaProduk,
                jenisProduk,
                hargaProduk
        );

        Produksi produksiBaru = new Produksi(
                idProduksi,
                produkBaru,
                jumlahProduksi,
                tanggalProduksi,
                statusProduksi
        );

        daftarProduksi.add(produksiBaru);

        System.out.println(">> Data produksi berhasil ditambahkan!");
    }

//Tampilkan Produksi
 public void tampilkanProduksi() {

        if (daftarProduksi.isEmpty()) {

            System.out.println(">> Belum ada data produksi.");

        } else {

            for (int i = 0; i < daftarProduksi.size(); i++) {

                Produksi p = daftarProduksi.get(i);

                System.out.println();
                System.out.println("===== DATA PRODUKSI =====");

                System.out.println(
                        "ID Produksi     : "
                        + p.getIdProduksi()
                );

                System.out.println(
                        "ID Produk       : "
                        + p.getProduk().getIdProduk()
                );

                System.out.println(
                        "Nama Produk     : "
                        + p.getProduk().getNamaProduk()
                );

                System.out.println(
                        "Jenis Produk    : "
                        + p.getProduk().getJenisProduk()
                );

                System.out.println(
                        "Harga Produk    : Rp"
                        + p.getProduk().getHargaProduk()
                );

                System.out.println(
                        "Jumlah Produksi : "
                        + p.getJumlahProduksi()
                );

                System.out.println(
                        "Tanggal Produksi: "
                        + p.getTanggalProduksi()
                );

                System.out.println(
                        "Status Produksi : "
                        + p.getStatusProduksi()
                );
            }
        }
    }
    
    
//    Update Produksi
    public void updateProduksi(){

        System.out.print("Masukkan ID Produksi: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();

        for (Produksi p : daftarProduksi) {

            if (p.getIdProduksi() == idTarget) {
                System.out.print("Nama Produk Baru: ");
                String namaBaru = scanner.nextLine();

                System.out.print("Jenis Produk Baru: ");
                String jenisBaru = scanner.nextLine();

                System.out.print("Harga Produk Baru: ");
                double hargaBaru = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Jumlah Produksi Baru: ");
                int jumlahBaru = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Tanggal Produksi Baru: ");
                String tanggalBaru = scanner.nextLine();

                System.out.print("Status Produksi Baru: ");
                String statusBaru = scanner.nextLine();

                p.getProduk().setNamaProduk(namaBaru);
                p.getProduk().setJenisProduk(jenisBaru);
                p.getProduk().setHargaProduk(hargaBaru);

                p.setJumlahProduksi(jumlahBaru);
                p.setTanggalProduksi(tanggalBaru);
                p.setStatusProduksi(statusBaru);

                System.out.println(
                        ">> Data produksi berhasil diperbarui!"
                );

                return;
            }
        }
    }

//    Hapus Produksi
    public void hapusProduksi(){

        System.out.print("Masukkan ID Produksi: ");
        int idTarget = scanner.nextInt();

        for (int i = 0; i < daftarProduksi.size(); i++) {
            if (daftarProduksi.get(i).getIdProduksi() == idTarget) {
                daftarProduksi.remove(i);
                System.out.println("Data produksi berhasil dihapus!");
                return;
            }
        }

    System.out.println("Data produksi tidak ditemukan!");
    
    }
    
}
    
    

