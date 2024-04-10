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
        JPanel panelPrincipal = new JPanel(null);
        JPanel panelSecundario;
        JFrame ventanaJuego = new JFrame("Juego");
        panelPrincipal.setBackground(new Color(53, 148, 100));
        for (int i=0; i<cantidad; i++){
            panelSecundario = juego.jugadores.get(i).getPanelMano();
            if (juego.jugadores.size() == 2){
                switch (i){
                    case 0:
                        panelSecundario.setBounds(100, 620, 1160, 80);
                        panelPrincipal.add(panelSecundario);
                        break;
                    case 1:
                        panelSecundario.setBounds(100, 0, 1160, 80);
                        panelPrincipal.add(panelSecundario);
                        break;
                }
            }else if(juego.jugadores.size() == 3){
                switch (i){
                    case 0:
                        panelSecundario.setBounds(450, 520, 464, 160);
                        panelPrincipal.add(panelSecundario);
                        break;
                    case 1:
                        panelSecundario.setBounds(50, 0, 464, 160);
                        panelPrincipal.add(panelSecundario);
                        break;
                    case 2:
                        panelSecundario.setBounds(825, 0, 464, 160);
                        panelPrincipal.add(panelSecundario);
                        break;
                }
            }else{
                switch (i){
                    case 0:
                        panelSecundario.setBounds(475, 520, 320, 160);
                        panelPrincipal.add(panelSecundario);
                        break;
                    case 1:
                        panelSecundario.setBounds(25, 260, 320, 160);
                        panelPrincipal.add(panelSecundario);
                        break;
                    case 2:
                        panelSecundario.setBounds(475, 0, 320, 160);
                        panelPrincipal.add(panelSecundario);
                        break;
                    case 3:
                        panelSecundario.setBounds(1025, 260, 320, 160);
                        panelPrincipal.add(panelSecundario);
                        break;
                }
            }
        }
        ventanaJuego.getContentPane().add(panelPrincipal);
        ventanaJuego.pack();
        ventanaJuego.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventanaJuego.setLocationRelativeTo(null);
        ventanaJuego.setVisible(true);
        ventanaJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
