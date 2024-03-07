/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_e3_if;

import java.util.Scanner;

/**
 *
 * @author irvingvalles
 */
public class EVA2_E3_IF {

    public static void main(String[] args) {
    double califa;
    Scanner captu = new Scanner (System.in);
            System.out.println("Introduzca la calificacion");
    califa = captu.nextDouble();
        if(califa >= 70){//esta seccion --> true
    //las llves son opcionales, solo cuanto tenemos masde una instruccion
            System.out.println("Aprobaste!!!");
        }else{ //La evaluacin false es opcional 
            System.out.println("Suerte a la proxima");
        
        }
        //Aqui continua el programa 
        
    }
}
