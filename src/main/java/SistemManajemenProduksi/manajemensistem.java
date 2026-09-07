package SistemManajemenProduksi;

import java.util.ArrayList;

public class manajemensistem {


    ArrayList<Produksi> daftarProduksi;

    public manajemensistem() {

        daftarProduksi = new ArrayList<>();
    }

//    Tambah Produksi
    public void tambahProduksi(Produksi produksi) {

        daftarProduksi.add(produksi);

        System.out.println(
                "Data produksi berhasil ditambahkan!"
        );
    }

//Tampilkan Produksi
    public void tampilkanProduksi() {

        if (daftarProduksi.isEmpty()) {

            System.out.println(
                    "Belum ada data produksi."
            );

        } else {

            System.out.println(
                    "DAFTAR DATA PRODUKSI"
            );

            for (Produksi produksi : daftarProduksi) {

                produksi.tampilkanProduksi();
            }
        }
    }

//    Update Produksi
    public void ubahProduksi(
            int idProduksi,
            String namaBaru,
            String jenisBaru,
            int jumlahBaru,
            String tanggalBaru,
            String statusBaru) {

        for (Produksi produksi : daftarProduksi) {

            if (produksi.idProduksi == idProduksi) {

                produksi.namaProduk = namaBaru;
                produksi.jenisProduk = jenisBaru;
                produksi.jumlahProduksi = jumlahBaru;
                produksi.tanggalProduksi = tanggalBaru;
                produksi.statusProduksi = statusBaru;

                System.out.println(
                        "Data berhasil diubah!"
                );

                return;
            }
        }

        System.out.println(
                "Data tidak ditemukan!"
        );
    }
//    Hapus Produksi
    public void hapusProduksi(int idProduksi) {

    for (Produksi produksi : daftarProduksi) {

        if (produksi.idProduksi == idProduksi) {

            daftarProduksi.remove(produksi);

            System.out.println(
                    "Data berhasil dihapus!"
            );

            return;
        }
    }

    System.out.println(
            "Data tidak ditemukan!"
    );
   }
}   

