
package com.mycompany.integradoruno;


public class Videojuego {
    private String titulo;
    private String consola;
    private int cantidadDeJugadores;
    private String categoria;
    
    //Constructores

    public Videojuego() {
    }

    public Videojuego(String titulo, String consola, int cantidadDeJugadores, String categoria) {
        this.titulo = titulo;
        this.consola = consola;
        this.cantidadDeJugadores = cantidadDeJugadores;
        this.categoria = categoria;
    }
    
    //Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantidadDeJugadores() {
        return cantidadDeJugadores;
    }

    public void setCantidadDeJugadores(int cantidadDeJugadores) {
        this.cantidadDeJugadores = cantidadDeJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
