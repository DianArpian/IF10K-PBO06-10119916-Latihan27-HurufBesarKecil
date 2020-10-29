/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripsi Program  : Huruf Besar Kecil
 */
public class PBO0610119916Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt;
        
        System.out.println();
        System.out.print("Masukkan Kalimat : ");
        txt = scan.nextLine();
        System.out.println("======Hasil Formatting======");
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
    }
    
    
}
