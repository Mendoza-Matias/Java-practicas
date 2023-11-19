
package PracticaA1;

import java.util.Scanner;


public class EjercicioUnoFacil {
    /*
    Solicita al usuario ingresar un 
    número e imprime si es positivo, negativo o cero.
    */
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        int numero;
        
        
        System.out.println("Ingresa un numero");
        numero = lector.nextInt();
        
        if(numero > 0){
            System.out.println("El numero ingresado es positivo " + numero);
        }else if(numero < 0){
            System.out.println("El numero es negativo " + numero);
        }else{
            System.out.println("El numero es cero " + numero);
        }
        
    }
}
