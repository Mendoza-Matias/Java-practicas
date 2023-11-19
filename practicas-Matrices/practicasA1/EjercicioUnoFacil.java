package practicasA1;

public class EjercicioUnoFacil {

    public static void main(String[] args) {

        /*Suma de elementos en un array: 
        Escribe un programa que reciba un 
        array de enteros y calcule la 
        suma de todos los elementos en la matriz.*/
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int numSumado : sumaMatriz(numeros)) {
            System.out.print(numSumado + " ");
        }

    }

    public static int[] sumaMatriz(int[] numeros) {
        
        int[]numerosSumados = new int[numeros.length-1];
        
        int contador = 0;
        
        while( contador < numeros.length-1){
            numerosSumados[contador] = numeros[contador] + numeros[contador+1];
            contador++;
        }
        
        return numerosSumados;
    }

}
