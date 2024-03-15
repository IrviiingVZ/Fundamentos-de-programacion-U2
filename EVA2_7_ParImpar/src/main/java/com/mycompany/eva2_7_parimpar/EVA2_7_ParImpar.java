/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_parimpar;

import java.util.Scanner;

/**
 *
 * @author irvingvalles
 */
public class EVA2_7_ParImpar {

    public static void main(String[] args) {
        int num, divi, resi; 
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce un numero entero");
        num = captu.nextInt();
        
        divi = num/2;
        System.out.println("Division entera de " + num + " /2 = " + divi);
        
        resi = num % 2;
        System.out.println("El residuo de " + num + " %2 = " + resi);
         //DETERMINAR NUMERO IMPAR O IMPAR
         
         if (resi ==1)
             System.out.println(num + " Es impar"); //VERDADERO
         else 
             System.out.println( num + " es par "); //FALSO 
        
    }
}
