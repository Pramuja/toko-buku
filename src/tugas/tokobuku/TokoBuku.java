/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.tokobuku;

/**
 *
 * @author USER
 */
public class TokoBuku {
    public int id;
    public String nama;
    public static int harga;
    public String merk;
    
    //konstruktor
    public TokoBuku(int id_brg, String nama_brg, int harga_brg, String merk_brg)
    {
        this.id = id_brg;
        this.nama = nama_brg;
        this.harga = harga_brg;
        this.merk = merk_brg;
    }
    
    //method
    public void cetak()
    {
        System.out.println("ID Barang      : " + this.id);
        System.out.println("Nama Barang    : " + this.nama);
        System.out.println("Harga Barang   : " + this.harga);
        System.out.println("Merk Barang    : " + this.merk);
    }
}
