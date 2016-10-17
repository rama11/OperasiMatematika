/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasimatematika;

import java.util.Scanner;


/**
 *
 * @author Rama
 */
public class OperasiMatematika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int angka1,angka2;
        
        Scanner masuk1 = new Scanner (System.in);
                
        Scanner masuk2 = new Scanner (System.in);
        
        System.out.println("========== Masukkan Angka ==========");
        System.out.println("Angka pertama : ");
        angka1 = masuk1.nextInt(); 
        System.out.println("Angka kedua : ");
        angka2 = masuk2.nextInt(); 
        System.out.println("\n");
        
        System.out.println("Masukan pertama adalah " + angka1);
        System.out.println("Masukan kedua adalah " + angka2);
    }
    
}
