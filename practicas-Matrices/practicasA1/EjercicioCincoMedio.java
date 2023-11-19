
package practicasA1;


public class EjercicioCincoMedio {
    public static void main(String[] args) {
        
        /*
        Ordenar un array: Implementa un algoritmo de 
        ordenación (como el algoritmo de burbuja o el de selección)
        para ordenar un array de números 
        en orden ascendente o descendente.
        */
        
        int[] numeros = {5,6,7,8,9,10,2,3,4,1};
        System.out.println("Matriz antes ");
        
         for (int numero : numeros) {
            System.out.print(numero + "");
        }
        
        ordenarMatriz(numeros);
        
        System.out.println("");
        for (int numero : numeros) {
            System.out.print(numero + "");
        }
        
        
    }
    
    public static void ordenarMatriz(int[]matriz){
        
        for (int i = 0; i < matriz.length-1 ; i++) {
            for (int j = i+1 ; j < matriz.length ; j++) {
                if(matriz[i] > matriz[j]){
                
                int aux = matriz[i];
                matriz[i] = matriz[j];
                matriz[j] = aux;   
                }
            }
        }
        
        
    }
}
