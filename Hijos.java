
package com.mycompany.primerclase;

public abstract class Hijos extends Familia {
    
    
    public Hijos() {
    }

    //CONSTRUCTOS HEREDADO DE HIJOS
    public Hijos(String nombre, String apellido, int edad, float altura) {
        super(nombre, apellido, edad, altura);
    }

    //METODO ABSTRACTO
    public abstract void decirMiNombre();
    
}
