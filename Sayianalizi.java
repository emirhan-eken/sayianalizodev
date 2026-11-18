/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sayianalizi;

import java.util.Scanner;

/**
 *
 * @author emirh
 */
public class Sayianalizi {

    public static void main(String[] args) {
        System.out.println("sayi analizine hosgeldin"
                + "durdurmak istediginde 0 gir");
        Scanner gir = new Scanner(System.in);
        int poz=0;
        int negatif=0;
        int tek=0;
        int cift=0;       
        int top=0;
        float ort=0;
        int sayii=1;
        
        
        while (sayii != 0) {
            System.out.println("sayi:");
 sayii=gir.nextInt();
            if ((sayii%2==0)) {
              cift=cift+1;
            } else {
                tek=tek+1;
            }
             if (sayii>0) {
                poz=poz+1;
            } else {
                 negatif++;
            }
             top=top+sayii;
            
            
            
     
        
           }
        System.out.println("pozitif sayi:" + poz
                + "negatif sayi:" + negatif
                + "tek sayi:" + tek
                + "cift sayi:" + cift
                + "toplam:" + top);
   
    
    
    
    
    
    
    
    
    }

}
