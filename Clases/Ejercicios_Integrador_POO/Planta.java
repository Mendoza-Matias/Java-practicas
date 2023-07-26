/*EJERCICIO INTEGRADOR CREANDO CLASES ABSTRACTAS Y METODOS ABSTRACTOS*/
package com.mycompany.integradordos;

//Clase planta (Madre)

public abstract class Planta {
    
    private String nombre;
    private float alto;
    private boolean tineHojas;
    private String climaIdeal;

    public Planta() {
    }

    public Planta(String nombre, float alto, boolean tineHojas, String climaIdeal) {
        this.nombre = nombre;
        this.alto = alto;
        this.tineHojas = tineHojas;
        this.climaIdeal = climaIdeal;
    }
    
    //Metodos Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public boolean isTineHojas() {
        return tineHojas;
    }

    public void setTineHojas(boolean tineHojas) {
        this.tineHojas = tineHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    
    //Metodo abstracto
    public abstract void nombrePlanta(); 
    
    //Todos lo comparten entre si pero a su forma
}
