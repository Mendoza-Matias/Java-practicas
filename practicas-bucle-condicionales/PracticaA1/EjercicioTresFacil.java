package PracticaA1;

import java.util.Scanner;

public class EjercicioTresFacil {

    public static void main(String[] args) {

        int dia;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa un numero del 1 al 7");
        dia = lector.nextInt();
        diaDeLaSemana(dia);
    }

    public static void diaDeLaSemana(int numero) {
        switch (numero) {
            case 1:
                System.out.println("Odio los Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Aguanta soldado es Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Oh si es Viernes");
                break;
            case 6:
                System.out.println("Dale que es Sabado");
                break;
            case 7:
                System.out.println("Se termina el tiempo es Domingo");
                break;
            default:
                System.out.println("No haz ingresado un dia valido");
        }
    }
}
