
package PracticaA1;

import java.util.ArrayList;
import java.util.Arrays;


public class EjercicioUno {
    public static void main(String[] args) {
        
        /*
        Escribe un programa en Java que 
        tome una lista de números enteros 
        como entrada y devuelva 
        la suma de los números 
        pares presentes en la lista.
        */
        
        
        ArrayList<Integer> numeros = new ArrayList<Integer>(Arrays.asList(10,20,80,13,17));
         
        System.out.println(sumaDePares(numeros));
    }
    
    public static int sumaDePares(ArrayList<Integer> numeros){
    
        int resultado = 0;
        
        for(Integer numero : numeros){
            if(numero % 2 == 0){
                resultado += numero;
            }
        }
        return resultado;
    }
}
