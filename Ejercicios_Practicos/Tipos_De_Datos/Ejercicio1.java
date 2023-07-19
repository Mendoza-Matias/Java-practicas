/*Ejercicio 1
Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.*/

package matias.tiposdedatos;
public class Ejercicio1 {
    
public static void main(String[]args){

    int x;
    int y;
    
    x=144;
    y=999;
    
    //Declaron las operaciones
    int suma;
    int resta;
    double division;
    int multiplicacion;
    
    suma = (x+y);
    resta = (x-y);
    division = (double) x / (double) y;
    multiplicacion = (x*y);
    
    System.out.println("------ OPERACIONES MATEMATICAS ---------");
    System.out.println("El resultado de la suma entre x e y es " + suma);
    System.out.println("El resultado de la resta entre x e y es " + resta);
    System.out.println("El resutado de la division entre x e y es " + division);
    System.out.println("El resultado de la multiplicación entre x e y es " + multiplicacion);
    


}
}
