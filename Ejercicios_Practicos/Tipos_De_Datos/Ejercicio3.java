/*Ejercicio 3
Crea las variables nombre, direccion y telefono y asígnales los valores correspondientes.
Muestra los valores de esas variables por pantalla de tal forma que el
resultado del programa sea el mismo que en el ejercicio 2.*/


package matias.tiposdedatos;
public class Ejercicio3 {
    public static void main(String[]args){
    
    String nombre,direccion;
    int telefono;
    
    nombre="Mendoza Matias Ezequiel";
    direccion="Fray justo santa Maria de oro";
    telefono=1170001025;
    
        System.out.print(
                "Mi nombre es " + nombre + " " + 
                "Mi telefono es: " + telefono + " " + 
                "Vivo en ; " + direccion 
                           
        
        );
    
    }
}
