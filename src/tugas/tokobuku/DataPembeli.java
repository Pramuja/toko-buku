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
public class DataPembeli extends TokoBuku {
    public int id_p;
    public String nama_p;
    public String alamat;
    public String no_telp;
    
    //konstruktor
    public DataPembeli(int id_brg, 
            String nama_brg, 
            int harga_brg, 
            String merk_brg,
            int id_pel,
            String nama_pel,
            String address,
            String no_tel)
    {
        super(id_brg, nama_brg, harga_brg, merk_brg);
        this.id_p = id_pel;
        this.nama_p = nama_pel;
        this.alamat = address;
        this.no_telp = no_tel;
    }
    
    //method
    public void Cetak()
    {
        super.cetak();
        System.out.println("ID Pelanggan   : " + this.id_p);
        System.out.println("Nama Pelanggan : " + this.nama_p);
        System.out.println("Alamat         : " + this.alamat);
        System.out.println("No. Telepon    : " + this.no_telp);
    }
}
