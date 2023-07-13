
//JUGANDO CON ARRAYS
package com.mycompany.jugandoconarray;

import java.util.Scanner;
//INGRESA 10 NOMBRES EN EL ARRAY:
public class JugandoConArray {

    public static void main(String[] args) {
        
        String [] nombres = new String[10];
        
        for(int i =0;i<nombres.length;i++){
            
            int contador = (i+1);
            
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("Ingresa un nombre");
            
            String nombre = teclado.nextLine();
            
            nombres[i] = nombre;
            
            System.out.println(contador);
        }
        
        
        for(int a =0 ; a<nombres.length;a++){
        
            int indice = (a + 1);
            System.out.println("Los nombres Ingresados son " + indice +" " + nombres[a]);
        }
    }
}
