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
public class Transaksi extends DataPembeli {
    public static int jumlah;
    
    //konstruktor
    public Transaksi(int id_brg, 
            String nama_brg, 
            int harga_brg, 
            String merk_brg,
            int id_pel,
            String nama_pel,
            String address,
            String no_tel,
            int jml)
    {
        super(id_brg, 
            nama_brg, 
            harga_brg, 
            merk_brg,
            id_pel,
            nama_pel,
            address,
            no_tel);
        this.jumlah = jml; 
    }
    // method
    public void Cetak()
    {
        super.Cetak();
        System.out.println("Jumlah Barang  : " + this.jumlah);
    }
    public static void main(String[] args)
    {
        System.out.println("Nama Kasir        : Atmanur");
        System.out.println("Tanggal Pembelian : 22/08/2018");
        System.out.println("==============================");
        System.out.println("Data Pembelian Barang ");
        System.out.println("==============================");
        Transaksi aa = new Transaksi(11,
                "Bulpoin",
                2000,
                "Snowman",
                45,
                "ZAZA",
                "Malang",
                "085655077271",
                9);
        aa.Cetak();
        System.out.println("Harga Total    : "+(harga * jumlah));
        System.out.println("==============================");
    }
}
