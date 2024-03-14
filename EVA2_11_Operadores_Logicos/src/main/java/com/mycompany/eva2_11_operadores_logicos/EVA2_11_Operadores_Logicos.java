/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_operadores_logicos;

/**
 *
 * @author irvingvalles
 */
public class EVA2_11_Operadores_Logicos {

    public static void main(String[] args) {
        boolean hayDinero, hayBuenClima;
        //Para hacer la carne asada se necesita:
        //Haya dinero y haya buen clima 
        hayDinero = false;
        hayBuenClima = false;
        System.out.println("1. No hay dinero y no hay buen clima");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("Se armo la carnita!!");
        else 
            System.out.println("Buevito!!");
        
        hayDinero = true;
        hayBuenClima = false;
        System.out.println("2. No hay dinero y no hay buen clima");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("Se armo la carnita!!");
        else 
            System.out.println("Buevito!!");
        hayDinero = false;
        hayBuenClima = true;
        System.out.println("3. hay dinero y no hay buen clima");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("Se armo la carnita!!");
        else 
            System.out.println("Buevito!!");
        
        hayDinero = true;
        hayBuenClima = true;
        System.out.println("4. hay dinero y hay buen clima");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("Se armo la carnita!!");
        else 
            System.out.println("Buevito!!");

        
    }  
        
        
    
}
