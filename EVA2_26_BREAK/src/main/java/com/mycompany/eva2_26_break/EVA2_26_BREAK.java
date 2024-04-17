/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author irvingvalles
 */
public class EVA2_26_BREAK {

    public static void main(String[] args) {
        //Vamos a generar un acceso por usuario y contraseña 
        String usuario, pwd;
        
        String USUARIO = "Admin";
        String PASWORD = "Admin";
        
        Scanner captu = new Scanner(System.in);
        
        //Como es un control de acceso, debemos preguntar un 
        //numero indeterminado de veces, hasta que el usuario 
        //y contrasñea sean correctos
        while (true){
            System.out.println("Usuario:");
            usuario = captu.nextLine();
            System.out.println("Contraseña:");
            pwd = captu.nextLine();
            if(usuario.equals(USUARIO) && pwd.equals(PASWORD)  )//USUARIO CORRECTO
               break;
            else;
                break;
        }
        
        System.out.println("Bienvenido al sistema");
        System.out.println("Contraseña incorrecta");
    }
}
