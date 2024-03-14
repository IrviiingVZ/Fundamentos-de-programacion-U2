/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_servicios_sociales;

import java.util.Scanner;

/**
 *
 * @author irvingvalles
 */
public class EVA2_12_SERVICIOS_SOCIALES {

    public static void main(String[] args) {
        int creditos, semestre;
        Scanner captu = new Scanner(System.in);
        System.out.println("Que semestre cursas?");
        semestre = captu.nextInt();
        System.out.println("Cuantos creditos llevas ?");
        creditos = captu.nextInt();
        //INDICAR SI SE PUEDE O NO REAÑIZAT EL SERVICIO SOCIAL
        //IR EN 6TO SEMESTRE O SUPERIOR (semestre >= 6)
        //TENER AL MENOS 150 CREDITOS (creditos >= 150)
        if((semestre >= 6) && (creditos >= 150))
            System.out.println("Puedes reaizar el servicio social");
        else 
            System.out.println("no puedes realizar el servicio social");
    }
}
