package com.mycompany.cinquillo;
import java.util.ArrayList;

public class Jugador {
    
    private String nombre;
    private int puntos;
    private ArrayList<Carta> mano;
    
    public Jugador(String nombre){
        this.nombre = nombre;
        this.puntos = 0;
        this.mano = new ArrayList<>();
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int puntos(){
        return this.puntos;
    }
    
    public ArrayList<Carta> getMano(){
        return this.mano;
    }
}
