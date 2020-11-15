/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan60_Akatsuki;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan member akatsuki
 */
public class Akatsuki {
    protected String pakaian;
    protected String tujuan;

    public Akatsuki(String pakaian, String tujuan) {
        this.pakaian = pakaian;
        this.tujuan = tujuan;
    }

    public String getpakaian() {
        return pakaian;
    }

    public String gettujuan() {
        return tujuan;
    }
}
