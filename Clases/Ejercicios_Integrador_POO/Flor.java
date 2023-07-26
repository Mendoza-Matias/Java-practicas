//Creando la CLASE FLOR
package com.mycompany.integradordos;

public class Flor extends Planta {
    
    private String colorDePetalos;
    private int cantidadPromedioDePetalos;
    private String colorDePistilo;
    private String colorDeLosPetalos;
    private String variedadDeFlor;
    private String estacionQueFlorece;

    public Flor(String colorDePetalos, int cantidadPromedioDePetalos, String colorDePistilo, String colorDeLosPetalos, String variedadDeFlor, String estacionQueFlorece, String nombre, float alto, boolean tineHojas, String climaIdeal) {
        super(nombre, alto, tineHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
        this.colorDePistilo = colorDePistilo;
        this.colorDeLosPetalos = colorDeLosPetalos;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public int getCantidadPromedioDePetalos() {
        return cantidadPromedioDePetalos;
    }

    public void setCantidadPromedioDePetalos(int cantidadPromedioDePetalos) {
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
    }

    public String getColorDePistilo() {
        return colorDePistilo;
    }

    public void setColorDePistilo(String colorDePistilo) {
        this.colorDePistilo = colorDePistilo;
    }

    public String getColorDeLosPetalos() {
        return colorDeLosPetalos;
    }

    public void setColorDeLosPetalos(String colorDeLosPetalos) {
        this.colorDeLosPetalos = colorDeLosPetalos;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }

    //Implemento el metodo nombre planta que viene de la clase madre 
    @Override
    public void nombrePlanta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
