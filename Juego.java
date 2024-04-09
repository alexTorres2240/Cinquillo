package com.mycompany.cinquillo;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private Baraja baraja;
    private Mesa mesa;
    
    public Juego(int cantidadJugadores){
        jugadores = new ArrayList<>();
        baraja = new Baraja();
        mesa = new Mesa();
        baraja.generarCartas();
        for (int i=0; i<cantidadJugadores; i++){
            jugadores.add(new Jugador("Jugador "+(i+1)));
        }
    }
    
    public void repartirCartas(){
        int index;
        switch (this.jugadores.size()){
            case 2:
                for (int i=0; i<20; i++){
                    index = (int) (Math.random()*(baraja.getMazo().size()));
                    jugadores.get(0).getMano().add(baraja.getMazo().get(index));
                    baraja.getMazo().remove(index);
                    index = (int) (Math.random()*(baraja.getMazo().size()));
                    jugadores.get(1).getMano().add(baraja.getMazo().get(index));
                    baraja.getMazo().remove(index);
                }
                break;
            case 3:
                for (int i=0; i<14; i++){
                    index = (int) (Math.random()*(baraja.getMazo().size()));
                    jugadores.get(0).getMano().add(baraja.getMazo().get(index));
                    baraja.getMazo().remove(index);
                    if (i<13){
                        index = (int) (Math.random()*(baraja.getMazo().size()));
                        jugadores.get(1).getMano().add(baraja.getMazo().get(index));
                        baraja.getMazo().remove(index);
                    }
                    if (i<13){
                        index = (int) (Math.random()*(baraja.getMazo().size()));
                        jugadores.get(2).getMano().add(baraja.getMazo().get(index));
                        baraja.getMazo().remove(index);
                    }
                }
                break;
            case 4:
                for (int i=0; i<10; i++){
                    index = (int) (Math.random()*(baraja.getMazo().size()));
                    jugadores.get(0).getMano().add(baraja.getMazo().get(index));
                    baraja.getMazo().remove(index);
                    index = (int) (Math.random()*(baraja.getMazo().size()));
                    jugadores.get(1).getMano().add(baraja.getMazo().get(index));
                    baraja.getMazo().remove(index);
                    index = (int) (Math.random()*(baraja.getMazo().size()));
                    jugadores.get(2).getMano().add(baraja.getMazo().get(index));
                    baraja.getMazo().remove(index);
                    index = (int) (Math.random()*(baraja.getMazo().size()));
                    jugadores.get(3).getMano().add(baraja.getMazo().get(index));
                    baraja.getMazo().remove(index);
                }
                break;
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cantidad de jugadores: ");
        int cantidad = scanner.nextInt();
        Juego juego = new Juego(cantidad);
        juego.repartirCartas();
        for (int i=0; i<cantidad; i++){
            juego.jugadores.get(i).mostrarMano();
        }
    }
}
