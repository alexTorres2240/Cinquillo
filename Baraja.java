package com.mycompany.cinquillo;

import java.util.ArrayList;

public class Baraja {
    
    // Atributo que almacena las cartas de la baraja
    private ArrayList<Carta> mazo;
    
    // Constructor de la clase Baraja
    public Baraja(){
        mazo = new ArrayList<>(); // Se inicializa el ArrayList de cartas
    }
    
    // Método para generar las cartas de la baraja
    public void generarCartas(){
        // Ciclo para recorrer los palos de la baraja (1 a 4)
        for (int i=1; i<5; i++){
            // Ciclo para recorrer los valores de las cartas (1 a 10)
            for (int j=1; j<11; j++){
                // Se utiliza un switch para determinar el palo de la carta
                switch (i){
                    case 1:
                        // Se añade una nueva carta de bastos al mazo
                        mazo.add(new Carta("bastos", j));
                        break;
                    case 2:
                        // Se añade una nueva carta de copas al mazo
                        mazo.add(new Carta("copas", j));
                        break;
                    case 3:
                        // Se añade una nueva carta de espadas al mazo
                        mazo.add(new Carta("espadas", j));
                        break;
                    case 4:
                        // Se añade una nueva carta de oros al mazo
                        mazo.add(new Carta("oros", j));
                        break;
                }
            }
        }
    }
    
    // Método para obtener el mazo de cartas
    public ArrayList<Carta> getMazo(){
        return this.mazo; // Se devuelve el ArrayList que contiene las cartas
    }
    
}
