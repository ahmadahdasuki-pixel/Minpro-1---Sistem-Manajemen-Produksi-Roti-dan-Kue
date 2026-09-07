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
    private int idProduk;
    private String namaProduk;
    private String jenisProduk;
    private double hargaProduk;
    
// Constructor
    public Produk (int idProduk, String namaProduk, String jenisProduk, double hargaProduk){
    this.idProduk = idProduk;
    this.namaProduk = namaProduk;
    this.jenisProduk = jenisProduk;
    this.hargaProduk = hargaProduk;
    }
    
    
//Getter 
    
    public int getIdProduk(){
        return idProduk;
        
    }
    
    public String getNamaProduk(){
        return namaProduk;
    }
    
    public String getJenisProduk(){
        return jenisProduk;
    }
    
    public double getHargaProduk(){
        return hargaProduk;
    }
    
//    Setter
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public void setJenisProduk(String jenisProduk){
        this.jenisProduk = jenisProduk;
    }
    
    public void setHargaProduk(double hargaProduk){
        if (hargaProduk <0){
            System.out.println ("Harga Tidak Boleh di Bawah 0 ataupun Negatif");
        }
        
        else{
            this.hargaProduk = hargaProduk;
        }
    }

}
