//Practicando con Clases , Herencia , Clases abstractas , metodos abstractos

package com.mycompany.primerclase;
public class PrimerClase {

public static void main(String[] args) {
        
   //Creando Padre (Utilizando el constructor sin parametros y cargando cada uno)
    Padre papa = new Padre(2,true,false,"Leo","Perez",40,1);
    
    //Creando un hijo utilizando Setters
    Hijo primerHijo = new Hijo();
    
    primerHijo.setNombre("Mateo");
    primerHijo.setApellido("Perez");
    primerHijo.setEdad(12);
    primerHijo.setAltura(1);
    
    //Creando una Hija
    Hija primerHija = new Hija("Lucia","Perez",15,2);
    
    //MOSTRANDO UN DATO DE PRIMER HIJO.
    
    System.out.println("El primer Hijo es " + primerHijo.getNombre());
    
    //MOSTRANDO UN DATO DE PRIMER HIJA.
    System.out.println("La edad de la Hija es " + primerHijo.getEdad());
    
    //UTILIZANDO EL METODO ABSTRACTO
    
    primerHijo.decirMiNombre();
    
    System.out.println("------NOMBRE ANTIGUO -------");
    primerHija.decirMiNombre();
    
    //CAMBIO EL VALOR DEL NOMBRE DEL HIJA CON EL SETTER
    
    primerHija.setNombre("Luciana");
    
    System.out.println("------NUEVO NOMBRE DE LA HIJA -------");
    
    primerHija.decirMiNombre();
        
  }
}
