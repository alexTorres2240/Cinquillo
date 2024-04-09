package com.mycompany.cinquillo;
import java.util.ArrayList;

public class Mesa {
    
    private ArrayList<Carta> escaleraBastos;
    private ArrayList<Carta> escaleraCopas;
    private ArrayList<Carta> escaleraEspadas;
    private ArrayList<Carta> escaleraOros;
    
    public Mesa(){
        this.escaleraBastos = new ArrayList<>();
        this.escaleraCopas = new ArrayList<>();
        this.escaleraEspadas = new ArrayList<>();
        this.escaleraOros = new ArrayList<>();
    }
    
    public ArrayList<Carta> getEscaleraBastos(){
        return this.escaleraBastos;
    }
    
    public ArrayList<Carta> getEscaleraCopas(){
        return this.escaleraCopas;
    }
    
    public ArrayList<Carta> getEscaleraEspadas(){
        return this.escaleraEspadas;
    }
    
    public ArrayList<Carta> getEscaleraOros(){
        return this.escaleraOros;
    }
    
}
