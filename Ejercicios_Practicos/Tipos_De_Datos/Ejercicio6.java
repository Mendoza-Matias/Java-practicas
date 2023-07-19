/*Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA y con IVA ). La base imponible estará almacenada en una
variable.*/

package matias.tiposdedatos;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[]args){
    
    double iva = 1.21;
    double[] precioProducto = new double[10];
    
    Scanner valores = new Scanner(System.in);
    double precio;
    
    double suma = 0;    
    
    for(int i =0;i<precioProducto.length;i++){
    
        System.out.println("Ingresa el precio de 10 productos ");
        System.out.println("Producto ingresado N°" + (i + 1));
        
        precioProducto[i] = precio = valores.nextDouble();
       
        suma += precioProducto[i];
    }
        
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la suma de los productos con IVA es " + (suma*iva));
        System.out.println("El resultado de la suma sin Iva es " + (suma/iva));
    
    
    }
}
