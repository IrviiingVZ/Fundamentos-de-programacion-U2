/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_25_break_continue;

/**
 *
 * @author irvingvalles
 */
public class EVA2_25_BREAK_CONTINUE {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int mod = i % 2;
            if(mod != 0) //Queremos que los casos que sean oares 
                continue; //Cuando se ejecuta, interrumpe la iteracion actual 
                
            System.out.println("i"); 
        }
        System.out.println("break: >>>>>");
        for (int i = 0; i < 100; i++) {
            System.out.println("i");
                if (i == 50)
                    break; //Cuando se ejecuta, detiene por completo el ciclo 
            }
            
        }
    }

