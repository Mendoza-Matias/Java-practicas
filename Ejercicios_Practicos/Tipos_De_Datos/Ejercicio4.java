/*Ejercicio 4
Realiza un conversor de pesos a dolares. La cantidad en pesos que se quiere
convertir deberá estar almacenada en una variable.*/


package matias.tiposdedatos;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[]args){
    
        
    int valorEnPesos;
    int valorDolar = 510;
    
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Ingresa el valor en pesos que quieras pasar a dolares");
    
        valorEnPesos = teclado.nextInt();
        
        int conversion = (valorEnPesos*valorDolar);
        
        System.out.println("El valor en dolares es : " + conversion);
    }
    
}
