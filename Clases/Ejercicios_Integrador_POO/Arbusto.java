//CREANDO LA CLASE ARBUSTO
package com.mycompany.integradordos;

public class Arbusto extends Planta {
    
    private float ancho;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorDeHojas;
    private boolean sePodaONo;

    public Arbusto(float ancho, boolean esDomestico, String variedadArbusto, String colorDeHojas, boolean sePodaONo, String nombre, float alto, boolean tineHojas, String climaIdeal) {
        super(nombre, alto, tineHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorDeHojas = colorDeHojas;
        this.sePodaONo = sePodaONo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorDeHojas() {
        return colorDeHojas;
    }

    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }
//COMPARTE EL METODO ABSTRACTO NOMBRE DE PLANTA 
    @Override
    public void nombrePlanta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    
}
