//Practicando con clases

package com.mycompany.primerclase;

import java.util.Date;

public class Familia {
    
    protected String nombre;
    private String apellido;
    private int edad;
    private float altura;
    
    //CONSTRUCTOS -----
    public Familia() {
    }
    // CONSTRUCTOR CON PARAMETROS -----

    public Familia(String nombre, String apellido, int edad, float altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    
}
