/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_operadoreslogicos;

import java.util.Scanner;

/**
 *
 * @author irvingvalles
 */
public class EVA2_10_OperadoresLogicos {

    public static void main(String[] args) {
        double moneda; 
        int adivinar;
        Scanner captu = new Scanner(System.in);
        System.out.println("cara (0) o cruz (1)?");
        adivinar = captu.nextInt();
        
        moneda = Math.random();
        System.out.println("El valor de la moneda =" + moneda);
        
        //0.5 es la miraad del rango, > 0.5 Cara, menor es cruz
        if(moneda > 0.5 && adivinar == 0)
            System.out.println("Adivinaste, es cara!!");
        else
        
        if(moneda <= 0.5 && adivinar == 1)
            System.out.println("Adivinaste es moneda!!");
        else
            System.out.println("Perdiste!!");
        
    } 
}
