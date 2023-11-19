package PracticaA1;

import java.util.Scanner;

public class EjercicioCuatroMedio {

    public static void main(String[] args) {

        /*
        Solicita al usuario que ingrese dos 
        números y un operador (+, -, *, /).
        Realiza la operación correspondiente
        y muestra el resultado.

         */
        int numUno, numDos;
        char operador;
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Ingresa un numero");
        numUno = lector.nextInt();
        System.out.println("Ingresa otro numero");
        numDos = lector.nextInt();
        System.out.println("Que operacion quieres realizar");
        System.out.println("Suma : + // Resta : - // Division : / Multiplicacion : * ");
        operador = lector.next().charAt(0);
        System.out.println(calculadora(numUno, numDos, operador));
    }

    public static int calculadora(int numUno, int numDos, char operador) {

        int resultado = 0;

        switch (operador) {
            case '+':
                resultado = numUno + numDos;
                break;
            case '-':
                resultado = numUno - numDos;
                break;
            case '/':
                resultado = numUno / numDos;
                break;
            case '*':
                resultado = numUno * numDos;
                break;
            default:
                System.out.println("No haz elegido una operacion correcta");
                ;
        }
            return resultado;
    }
}
