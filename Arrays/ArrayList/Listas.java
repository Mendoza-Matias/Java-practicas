/*ARRAYLIST*/
package matias.arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class Listas {
    public static void main(String[]args){
    
    //Permite almacenar objetos
    ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
    
    
    listaEmpleados.add(new Empleado("Matias","Mendoza",20,1170001025));
    listaEmpleados.add(new Empleado("Karen","Gonzales",19,1123439205));
    
    listaEmpleados.set(1, new Empleado("Carolina","Mendoza",23,1128483948));
    
    System.out.println(listaEmpleados.size());
  
    //ITERATOR 
    
    Iterator<Empleado> iterador = listaEmpleados.iterator();
    
    //
        while (iterador.hasNext()) {
            
            System.out.println(iterador.next().toString());
            
        }
    
    //Tipo de dato empleado (Bucle forEach).
    /*for(Empleado e:listaEmpleados){
    
        System.out.println(e.toString());
    
    }*/
    }
}
