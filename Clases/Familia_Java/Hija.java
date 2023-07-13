package com.mycompany.primerclase;

//CLASE HIJA
public class Hija extends Hijos {

    public Hija() {
    }

    public Hija(String nombre, String apellido, int edad, float altura) {
        super(nombre, apellido, edad, altura);
    }
    
    @Override
    public void decirMiNombre() {
        String resultado = nombre;
        
        System.out.println("Mi nombre es " + resultado);
    }
    
}
