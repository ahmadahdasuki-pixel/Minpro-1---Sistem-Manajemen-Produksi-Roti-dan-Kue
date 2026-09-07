/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemenProduksi;

/**
 *
 * @author Ahmad Ahdasuki
 */

// Atribut Produksi
public class Produksi {
    public int idProduksi;
    public String namaProduk;
    public String jenisProduk;
    public int jumlahProduksi;
    public String statusProduksi;
    public String tanggalProduksi;
    
// Constructor
    public Produksi (int idProduksi, String namaProduk, String jenisProduk, int jumlahProduksi, String statusProduksi, String tanggalProduksi){

        this.idProduksi=idProduksi;
        this.namaProduk= namaProduk;
        this.jenisProduk= jenisProduk;
        this.jumlahProduksi=jumlahProduksi;
        this.statusProduksi=statusProduksi;
        this.tanggalProduksi=tanggalProduksi;
    }
    
//  Method untuk menampilkan info produksi
    public void tampilkanProduksi() {

        System.out.println("----------------------------------------");

        System.out.println("ID Produksi     : " + idProduksi);
        System.out.println("Nama Produk     : " + namaProduk);
        System.out.println("Jenis Produk    : " + jenisProduk);
        System.out.println("Jumlah Produksi : " + jumlahProduksi);
        System.out.println("Tanggal Produksi: " + tanggalProduksi);
        System.out.println("Status Produksi : " + statusProduksi);

    }
  
}

