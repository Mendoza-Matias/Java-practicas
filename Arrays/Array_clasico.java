//UN POCO DE ARRAYS EN JAVA ---------
package com.mycompany.array_clasico;
public class Array_clasico {

    public static void main(String[] args) {
        
        //DECLARANDO UN ARRAY
        int[] myArray = new int[10];
        
        //CARGANDO DATOS MANUALMENTE
        
        myArray[0] = 10;
        myArray[1] = 20;
        
        //Carguemos un array con un for
        int[] myArrayDos = new int[10];
        
        for(int i =0;i < myArrayDos.length;i++){
        
            int valor = myArrayDos[i] = i;
            
            System.err.println("El valor ingresado en el indice " + i + "es: " + valor);
        }
        
        
        //CREANDO UN ARRAY YA DECLARADO
        
        String[] nombres = {"Matias","Juan","Pedro","Jose","Roberto"};
        
        //RECORRIENDO UN ARRAY POR MEDIO DEL FOREACH
        for(String unNombre:nombres){
            System.out.println("Los nombres de mi array son " + unNombre);
        }
      
    }
}
