//---- PRIMER EJERCICIO INTEGRADOR ------

package com.mycompany.integradoruno;

import java.util.ArrayList;
import java.util.List;

public class IntegradorUno {

    public static void main(String[] args) {
        
        //Creo mi arrayList primero 
        List <Videojuego> listaVideojuegos = new ArrayList<Videojuego>();
        
        //Objetos
        Videojuego vid1 = new Videojuego();
        Videojuego vid2 = new Videojuego();
       
      //Utilizo los setters   
        vid1.setTitulo("Mortal Kombat");
        vid1.setCantidadDeJugadores(02);
        vid1.setCategoria("Arcade");
        vid1.setConsola("Play Station");
        
        //Tambien se puede usar el otra forma por medio del constructor con paramentros
        
        vid2.setTitulo("God of War");
        vid2.setCantidadDeJugadores(01);
        vid2.setCategoria("Aventura");
        vid2.setConsola("Play Station");
        
      
       
    //Guardo mis videojuegos
        listaVideojuegos.add(vid1);
        listaVideojuegos.add(vid2);
       
    //Recorro mi Array.
       
         for (Videojuego unJuego : listaVideojuegos){
       //Devuelvo los datos de mi array mediante los getters
           System.out.println("Los videojuegos de la lista son " + unJuego.getTitulo() +" "+ unJuego.getCantidadDeJugadores() +" "+ unJuego.getCategoria() +" "+ unJuego.getConsola());
     }
    
    //Cambio los valores titulo cant de jugadores
    
    vid1.setTitulo("Street fighter");
    vid1.setCantidadDeJugadores(4);
    
    vid2.setTitulo("Call of duty");
    vid2.setCantidadDeJugadores(2);
    vid2.setCategoria("Accción");
    
    //Recorrer de nuevo el arrayList ForEach
    
    for(Videojuego nuevoJuego : listaVideojuegos){
        System.out.println("Nuevos juegos cargados " + " " + nuevoJuego.getTitulo()+ " " + nuevoJuego.getCategoria() + " " + nuevoJuego.getConsola() + " " + nuevoJuego.getCantidadDeJugadores());
    }
    //Para no hacer todos los get podria utilizar el metodo toString
    }
}

