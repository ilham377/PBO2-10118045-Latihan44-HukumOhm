/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan44hukumohm;

/**
 *
 * @author
 * Nama     : Muhammad Ilham Apriyadi
 * Kelas    : if 2
 * NIM      : 10118045
 * Deskripsi Program : hukum ohm
 */
public class PBO10118045Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai baterai = new Baterai();
        Baterai baterai1 = new Baterai(3,12);
        
        System.out.println("Kuat Arus : "+baterai1.getKuatArus()+" Ampere");
        System.out.println("Hambatan : "+baterai1.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan : "+baterai1.hitungTegangan()+" volt");
        
        
        
    }
    
}
