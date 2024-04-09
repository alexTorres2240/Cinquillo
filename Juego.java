package com.mycompany.cinquillo;
import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private Baraja baraja;
    private Mesa mesa;
    
    public Juego(int cantidadJugadores){
        jugadores = new ArrayList<>();
        baraja = new Baraja();
        mesa = new Mesa();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<cantidadJugadores; i++){
            System.out.println("Ingresar nombre: ");
            String nombre = scanner.next();
            jugadores.add(new Jugador(nombre));
        }
        int index;
        switch (cantidadJugadores){
            case 2:
                for (int i=0; i<22; i++){
                    index = (int) (Math.random()*(baraja.getMazo().size()));
                    jugadores.get(0).getMano().add(baraja.getMazo().get(index));
                    baraja.getMazo().remove(index);
                    index = (int) (Math.random()*(baraja.getMazo().size()));
                    jugadores.get(1).getMano().add(baraja.getMazo().get(index));
                    baraja.getMazo().remove(index);
                }
                break;
            case 3:
                for (int i=0; i<16; i++){
                    index = (int) (Math.random()*(baraja.getMazo().size()));
                    jugadores.get(0).getMano().add(baraja.getMazo().get(index));
                    baraja.getMazo().remove(index);
                    if (i<15){
                        index = (int) (Math.random()*(baraja.getMazo().size()));
                        jugadores.get(1).getMano().add(baraja.getMazo().get(index));
                        baraja.getMazo().remove(index);
                    }
                    if (i<15){
                        index = (int) (Math.random()*(baraja.getMazo().size()));
                        jugadores.get(2).getMano().add(baraja.getMazo().get(index));
                        baraja.getMazo().remove(index);
                    }
                }
            case 4:
        }
    }
}
