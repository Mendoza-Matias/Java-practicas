package practicasA1;

public class EjercicioCuatroMedio {

    public static void main(String[] args) {

        /*Eliminar duplicados en un array: Escribe un programa que tome una matriz
        y elimine los elementos duplicados.*/
        
        int[] numeros = {1, 2, 3, 5, 6, 6, 6, 7, 8, 9, 10, 10};

        //Paso 1 ordenar la matriz
        ordenarMatriz(numeros);

        for (int numOrdenado : eliminarDuplicados(numeros)) {
            System.out.print(numOrdenado + " ");
        }
    }

    public static void ordenarMatriz(int[] matriz) {

        int aux = 0;
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz.length - 1; j++) {

                if (matriz[j] > matriz[j + 1]) {
                    aux = matriz[j];
                    /*Guardo el primer elemento*/
                    matriz[j] = matriz[j + 1];
                    /*Le asigno el valor que esta en el segundo indice*/
                    matriz[j + 1] = aux;
                    /*Y en la siguiente celda le asigno el valor almacenado*/
                }

            }
        }
    }

    public static int[] eliminarDuplicados(int[] matriz) {

        int[] matrizSinDuplicados = new int[matriz.length];
        int contador = 0;

        for (int i = 0; i < matriz.length - 1; i++) {

            if (matriz[i] != matriz[i + 1]) {
                /*Comparo si el primer elemento es distinto al segundo*/
                matrizSinDuplicados[contador] = matriz[i];
                /*Si lo es le asigno el valor en el indice y el valor en esa posicion*/
                contador++;
            }
        }

        matrizSinDuplicados[contador] = matriz[matriz.length - 1];
        contador++;

        /*Matriz con nuevo tamaño*/
        int[] matrizTerminada = new int[contador];

        for (int i = 0; i < matrizTerminada.length; i++) {
            matrizTerminada[i] = matrizSinDuplicados[i];
        }

        return matrizTerminada;
    }
}
