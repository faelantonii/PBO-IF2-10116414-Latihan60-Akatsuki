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
 * Deskripsi  : Program menampilkan akatsuki
 */
public class PBO_IF2_10116414_Akatsuki {
    public static void main(String[] args) {

        String pakaian = "Pakaian hitam beserta corak awan merah";
        String tujuan = "Menangkap Semua Jinchuriki";
        
        Member itachi = new Member("Itachi Uchiha", "Konohagakure", "Kunai", 
                        "Anbu Captain Missing Ninja", "Mangekyo Sharingan", 
                        "Kehabisan Chakra" ,"Suzaku(Merah darah)" , 
                        true, pakaian, tujuan);
        Member kisame = new Member("Kisame Hoshigaki", "Kirigakure", "Samehada", 
                        "S-Rank Missing Ninja", "Shark-o-mation", "Bunuh Diri",
                        " Nanju(Bintang Selatan)",  true, pakaian, tujuan); 
        Member deidara = new Member("Deidara", "Iwagakure", "Explosive Clay", 
                        "S-Rank Missing Ninja", "Explosive Release","Dibunuh oleh Sasuke Uchiha" , 
                        "Seiryū(Naga Biru/Hijau) ", true, pakaian, tujuan);
        Member sasori = new Member("Sasori", "Sunagakure", "Hiruko", 
                        "S-Rank Missing Ninja from Sunagakure's Puppet Brigade",
                        "Puppet Mastery","Dibunuh oleh Sakura Haruno","Gyokunyo(Virgo)",
                        true, pakaian, tujuan);
        Member kakuzu = new Member("Kakuzu", "Takigakure", "Benang hitam pada dalam tubuhnya",
                        "Zonbi Konbi", "Dapat menggunakan ke lima elemen", 
                        "Dibunuh oleh Naruto Uzumaki dengan bantuan Team 10 dan Kakashi Hatake ",
                        "Hokuto(Bintang Utara)", true, pakaian, tujuan);
        Member hidan = new Member("Hidan", "Yugakure", "Sabit besar bermata tiga",
                        "Zonbi Konbi", "Immortality ","Tidak diketahui atau disegel Shikamaru" ,
                        "Santai(Tiga Tingkatan)", true, pakaian, tujuan);
        Member orochimaru = new Member("Orochimaru", "Konohagakure", "Ular",
                        "Legendary Sannin", "Kekuatan Ular Putih","Dibunuh dan dihidupkan oleh Sasuke Uchiha", 
                        "Sora(Langit)", false, pakaian, tujuan);
         
        System.out.println("Profile Akatsuki");
        System.out.println("===============================");
     
        System.out.println("\nIdentitas : " + itachi.getpakaian());
        System.out.println("Tujuan : " + itachi.gettujuan());
        

        itachi.displayAnggota();
        kisame.displayAnggota();
        deidara.displayAnggota();
        sasori.displayAnggota();
        kakuzu.displayAnggota();
        hidan.displayAnggota();
        orochimaru.displayAnggota();
       
    }
}
