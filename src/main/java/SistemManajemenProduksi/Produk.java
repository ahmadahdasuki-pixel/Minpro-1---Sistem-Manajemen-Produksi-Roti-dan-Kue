/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemenProduksi;

/**
 *
 * @author Ahmad Ahdasuki
 */

//Atribut Produk
public class Produk {
    public int idProduk;
    public String namaProduk;
    public String jenisProduk;
    public double hargaProduk;
    
// Constructor
    public Produk (int idProduk, String namaProduk, String jenisProduk, double hargaProduk){
    this.idProduk = idProduk;
    this.namaProduk = namaProduk;
    this.jenisProduk = jenisProduk;
    this.hargaProduk = hargaProduk;
    }
    
// Method Buat menampilkan Produk
    
    public void tampilkanProduk() {

        System.out.println("ID Produk    : " + idProduk);
        System.out.println("Nama Produk  : " + namaProduk);
        System.out.println("Jenis Produk : " + jenisProduk);
        System.out.println("Harga Produk       : Rp" + hargaProduk);
    }
}
