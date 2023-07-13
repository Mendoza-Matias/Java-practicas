package com.mycompany.primerclase;

// PADRE EXTIENDE SE FAMILIA

import java.util.Date;

public class Padre extends Familia {
   
    //ATRIBUTOS PROPIOS DE LA CLASE
    private int cantidadDeHijos;
    private boolean tieneTrabajo;
    private boolean estaCasado;

    public Padre() {
    }

    public Padre(int cantidadDeHijos, boolean tieneTrabajo, boolean estaCasado, String nombre, String apellido, int edad, float altura) {
        super(nombre, apellido, edad, altura);
        this.cantidadDeHijos = cantidadDeHijos;
        this.tieneTrabajo = tieneTrabajo;
        this.estaCasado = estaCasado;
    }
    
    
    //GETTER AND SETTERS
    public int getCantidadDeHijos() {
        return cantidadDeHijos;
    }

    public void setCantidadDeHijos(int cantidadDeHijos) {
        this.cantidadDeHijos = cantidadDeHijos;
    }

    public boolean isTieneTrabajo() {
        return tieneTrabajo;
    }

    public void setTieneTrabajo(boolean tieneTrabajo) {
        this.tieneTrabajo = tieneTrabajo;
    }

    public boolean isEstaCasado() {
        return estaCasado;
    }

    public void setEstaCasado(boolean estaCasado) {
        this.estaCasado = estaCasado;
    }
    
}
