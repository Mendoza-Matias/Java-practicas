package com.mycompany.integradordos;

//Clase Hija arbol
public class Arbol extends Planta {
    
    private String variedad;
    private float radioDeTronco;
    private String color;
    private String tipoDeHojas;

    //Constructor que hereda los atributos de Planta
    
    public Arbol() {
    }

    public Arbol(String variedad, float radioDeTronco, String color, String tipoDeHojas, String nombre, float alto, boolean tineHojas, String climaIdeal) {
        super(nombre, alto, tineHojas, climaIdeal);
        this.variedad = variedad;
        this.radioDeTronco = radioDeTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }
     
    //Getters y Setters
    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public float getRadioDeTronco() {
        return radioDeTronco;
    }

    public void setRadioDeTronco(float radioDeTronco) {
        this.radioDeTronco = radioDeTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    //Implemento el metodo de Planta a su propia manera
    @Override
    public void nombrePlanta() {
        System.out.println("Hola soy un arbol");
    }

    //Si cambio a esto a privado solo lo va poder ver Arbol
    //No se puede cambiar la visibilidad si en la clase madre es public
    
    //Protected sirve para que solo sus clases hijas lo puedan ver ---> Las demas no van a poder
}
