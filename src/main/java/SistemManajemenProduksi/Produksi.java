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
    public Produk produk;
    public int jumlahProduksi;
    public String statusProduksi;
    public String tanggalProduksi;
    
// Constructor
    public Produksi (int idProduksi, Produk produkBaru, int jumlahProduksi, String namaProduk, String jenisProduk){

        this.idProduksi=idProduksi;
        this.produk= produk;
        this.jumlahProduksi=jumlahProduksi;
        this.statusProduksi=statusProduksi;
        this.tanggalProduksi=tanggalProduksi;
    }
    
//    Getter 
    
    public int getIdProduksi(){
        return idProduksi;
    }
    
    public Produk getProduk(){
        return produk;
    }
    
    public int getJumlahProduksi(){
        return jumlahProduksi;
    }
    
    public String getStatusProduksi(){
        return statusProduksi;
    }
    
    public String getTanggalProduksi(){
        return tanggalProduksi;
    }
    
    
//    Setter
    
    public void setJumlahProduksi(int jumlahProduksi){
        if(jumlahProduksi <0){
            System.out.println("Jumlah Produksi Tidak Boleh Kosong");
        }
        else {
            this.jumlahProduksi = jumlahProduksi;
        }
    }
    
    public void setTanggalProduksi(String tanggalProduksi){
        if(tanggalProduksi.isEmpty()){
            System.out.println("Tanggal Produksi Tidak Boleh Kosong");
        }
        else{
            this.tanggalProduksi = tanggalProduksi;
        }
    }
    
    public void setStatusProduksi (String statusProduksi){
        if(statusProduksi.isEmpty()){
            System.out.println("Status Produksi Tidak Boleh Kosong");
        }
        else {
            this.statusProduksi = statusProduksi;
        }
    }
      
}

