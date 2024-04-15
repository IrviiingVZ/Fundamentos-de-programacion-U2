/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_23_adivina;

import java.util.Scanner;

/**
 *
 * @author irvingvalles
 */
public class EVA2_23_ADIVINA {

    public static void main(String[] args) {
        int nume = 5;//Numero que tiene que adiinar (entre 1 y 10)
        int valor = 0; //valor para almacenar lo que cature el usuario 
        
        Scanner captu = new Scanner(System.in);
        
        do {            
            System.out.println("¿cuale es el numero (entre 1 y 10)");
            valor = captu.nextInt();
        } while (nume != valor);
        System.out.println("Adivinaste!!");
    }
}
