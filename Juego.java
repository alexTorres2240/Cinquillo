package com.mycompany.cinquillo;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

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
            jugadores.add(new Jugador("Jugador "+i));
        }
        int index;
        switch (cantidadJugadores){
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
        Juego juego = new Juego(4);
        JFrame jugador1 = new JFrame ("Jugador 1");
        JFrame jugador2 = new JFrame ("Jugador 2");
        JFrame jugador3 = new JFrame ("Jugador 3");
        JFrame jugador4 = new JFrame ("Jugador 4");
        JPanel panel1 = new JPanel(new FlowLayout());
        JPanel panel2 = new JPanel(new FlowLayout());
        JPanel panel3 = new JPanel(new FlowLayout());
        JPanel panel4 = new JPanel(new FlowLayout());
        for (int i = 0; i <= 9; i++) {
            ImageIcon icono = new ImageIcon(juego.jugadores.get(0).getMano().get(i).getIcono().getImage().getScaledInstance(54, 72, Image.SCALE_DEFAULT));
            JLabel etiqueta = new JLabel(icono);
            panel1.add(etiqueta);
        }
        jugador1.getContentPane().add(panel1);
        jugador1.pack();
        jugador1.setVisible(true);
        for (int i = 0; i <= 9; i++) {
            ImageIcon icono = new ImageIcon(juego.jugadores.get(1).getMano().get(i).getIcono().getImage().getScaledInstance(54, 72, Image.SCALE_DEFAULT));
            JLabel etiqueta = new JLabel(icono);
            panel2.add(etiqueta);   
        }
        jugador2.getContentPane().add(panel2);
        jugador2.pack();
        jugador2.setVisible(true);
        for (int i = 0; i <= 9; i++) {
            ImageIcon icono = new ImageIcon(juego.jugadores.get(2).getMano().get(i).getIcono().getImage().getScaledInstance(54, 72, Image.SCALE_DEFAULT));
            JLabel etiqueta = new JLabel(icono);
            panel3.add(etiqueta);
        }
        jugador3.getContentPane().add(panel3);
        jugador3.pack();
        jugador3.setVisible(true);
        for (int i = 0; i <= 9; i++) {
            ImageIcon icono = new ImageIcon(juego.jugadores.get(3).getMano().get(i).getIcono().getImage().getScaledInstance(54, 72, Image.SCALE_DEFAULT));
            JLabel etiqueta = new JLabel(icono);
            panel4.add(etiqueta);
        }
        jugador4.getContentPane().add(panel4);
        jugador4.pack();
        jugador4.setVisible(true);
    }
}

