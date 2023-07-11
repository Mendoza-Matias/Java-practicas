//Subclase que extiende de Hijos

package com.mycompany.primerclase;

//CLASE HIJO
public class Hijo extends Hijos {
    
    public Hijo() {
    }

    public Hijo(String nombre, String apellido, int edad, float altura) {
        super(nombre, apellido, edad, altura);
    }
    
    //Metodo abstracto heredado de Hijos.

    @Override
    public void decirMiNombre() {
       String resultado = nombre;
       
        System.out.println("Mi nombre es " + resultado);
    }

}
