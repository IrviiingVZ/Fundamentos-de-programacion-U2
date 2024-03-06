/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_operadores;

/**
 *
 * @author irvingvalles
 */
public class EVA2_2_OPERADORES {

    public static void main(String[] args) {
       boolean A, B; 
       A = false;  
       B = false;
       boolean resu;
       //OPERADOR AND -> &&
       resu = A && B;
        System.out.println("Resu = " + resu); 
       A = true;  
       B = false;
       resu = A && B;
        System.out.println("Resu = " + resu); 
       A = true;  
       B = true;
       resu = A && B;
        System.out.println("Resu = " + resu);
        //operador or 
        A = false;
        B = false; 
        resu = A || B;
        System.out.println("Resu (or) = "+ resu);
        A = true;
        B = false; 
        resu = A || B;
        System.out.println("Resu (or) = "+ resu);
        //Negacion --> !
        A = false; 
        resu = !A;
        System.out.println("Resu (!) = " + resu);
        
        //Operadores aritmeticos: + - * / += -= *= /=
        //Operadores logicos: ==, &&, ||, !
        
        //LOGICA BOOLEANA (True, False 
       //AND, OR, NOT Y O NO 
    }
}
