
package PracticaA1;

import java.util.Scanner;


public class EjercicioDosFacil {
    public static void main(String[] args) {
        
        /*
        Pide al usuario que ingrese dos 
        números y muestra un mensaje indicando cuál es el mayor.
        */
        
        Scanner lector = new Scanner(System.in);
        int numUno , numDos;
        
        System.out.println("Ingresa un numero");
        numUno = lector.nextInt();
        System.out.println("Ingresa otro numero");
        numDos = lector.nextInt();
        System.out.println("El numero mayor es " + numeroMayor(numUno, numDos));
    }
    
    public static int numeroMayor(int numUno , int numDos){
        int resultado;
        /*(expresion)?valor_true:valor_false;*/
        return  resultado = (numUno > numDos) ? numUno : numDos;
    }
}
