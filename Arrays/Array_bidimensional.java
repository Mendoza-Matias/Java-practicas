
/*ARRAY BIDIMENSIONAL*/

package com.mycompany.array_bidimensional;
public class Array_bidimensional {
    public static void main(String[] args) {
        
        //CREAR UN ARRAY BIDIMESIONAL
        
        
        int [][] array = new int [4][4];
        
        //CARGANDO DATOS MANUALMENTE
        array[0][0] = 10;
        array[0][1] = 13;
        array[0][2] = 14;
        array[0][3] = 15;
        
        array[1][0] = 20;
        array[1][1] = 12;
        array[1][2] = 22;
        array[1][3] = 21;
        
        array[2][0] = 29;
        array[2][1] = 30;
        array[2][2] = 32;
        array[2][3] = 32;
        
        array[3][0] = 43;
        array[3][1] = 54;
        array[3][2] = 32;
        array[3][3] = 11;
        
        //RECORRER EL ARRAY
        
        for(int a =0;a< array.length ;a++){
        for(int b=0;b<array.length ;b++){
        
            System.out.println("Valores de el array "+a+" "+b+" "+ array[a][b]);
        }
        }
        
        
        int[][]arrayDos = new int[10][10];
        
        for(int c =0;c < arrayDos.length;c++){
        for(int d=0;d <arrayDos.length;d++){
        
            int resultado = arrayDos[c][d] = d;
             
            System.out.println("El resultado de mi array es " + c + d +" "+resultado);
            
        }
        }
    }
}
