
package practicasA1;


public class EjercicioDosFacil {
    public static void main(String[] args) {
        /*Encontrar el número máximo en una matriz : Escribe un programa que encuentre el número más grande en una matriz 
        de enteros y lo muestre por pantalla.*/
        
        
        int [] numeros = {1,2,60043,4,6,7,8,100,230,4331,3542323,88000};
        
        System.out.println(encontrarElMaximo(numeros));
    }
    
    public static int encontrarElMaximo(int[]matriz){
        
        int numMaximo = 0;
        int contador = 0;
        
        while(contador < matriz.length-1){
            if(matriz[contador] > matriz[contador+1]){
                numMaximo = matriz[contador];
            }
            contador++;
        }
         return numMaximo; 
    }
  
}
