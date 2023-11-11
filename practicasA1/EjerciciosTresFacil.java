
package practicasA1;


public class EjerciciosTresFacil {
    public static void main(String[] args) {
        
        /*Contar elementos pares en un matriz: 
        Crea un programa que cuente 
        la cantidad de números pares en un array de enteros.*/
        
        int[] numeros = {1,2,5,6,9,10,12,14};
        
        System.out.println(contarNumerosPares(numeros));
    }
    
    public static int contarNumerosPares(int [] matriz){
    
        int cantPares = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i] % 2 == 0){
                cantPares++;
            }
        }
        return cantPares;
    }
}
