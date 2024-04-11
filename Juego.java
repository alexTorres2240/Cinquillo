package com.mycompany.cinquillo;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private ArrayList<JPanel> panelesSecundarios;
    private Baraja baraja;
    private Mesa mesa;
    private JPanel panelPrincipal;
    public JFrame ventana = new JFrame("Juego");
    
    public Juego(int cantidadJugadores){
        jugadores = new ArrayList<>();
        baraja = new Baraja();
        mesa = new Mesa();
        baraja.generarCartas();
        for (int i=0; i<cantidadJugadores; i++){
            jugadores.add(new Jugador("Jugador "+(i+1)));
        }
        panelPrincipal = new JPanel(null);
        panelPrincipal.setBackground(new Color(53, 148, 100));
    }
    
    public JPanel getPanelPrincipal(){
        return this.panelPrincipal;
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
    
    public void actualizarPanel(){
        this.panelPrincipal.removeAll();
        JPanel panelSecundario = new JPanel();
        switch (this.jugadores.size()){
            case 2:
                for (int i=0; i<this.jugadores.size(); i++){
                    panelSecundario = this.jugadores.get(i).getPanelMano();
                    switch (i){
                        case 0:
                            panelSecundario.setBounds(50, 605, 1260, 95);
                            break;
                        case 1:
                            panelSecundario.setBounds(50, 0, 1260, 95);
                            break;
                    }
                    this.panelPrincipal.add(panelSecundario);
                }
                break;
            case 3:
                for (int i=0; i<this.jugadores.size(); i++){
                    panelSecundario = this.jugadores.get(i).getPanelMano();
                    switch (i){
                        case 0:
                            panelSecundario.setBounds(450, 488, 464, 192);
                            break;
                        case 1:
                            panelSecundario.setBounds(50, 0, 464, 192);
                            break;
                        case 2:
                            panelSecundario.setBounds(850, 0, 464, 192);
                            break;
                    }
                    this.panelPrincipal.add(panelSecundario);
                }
                break;
            case 4:
                for (int i=0; i<this.jugadores.size(); i++){
                    panelSecundario = this.jugadores.get(i).getPanelMano();
                    switch (i){
                        case 0:
                            panelSecundario.setBounds(525, 488, 320, 192);
                            break;
                        case 1:
                            panelSecundario.setBounds(25, 228, 320, 192);
                            break;
                        case 2:
                            panelSecundario.setBounds(525, 0, 320, 192);
                            break;
                        case 3:
                            panelSecundario.setBounds(1025, 228, 320, 192);
                            break;
                    }
                    this.panelPrincipal.add(panelSecundario);
                }
                break;
        }
        
        
        JPanel panelOros = mesa.getPanelOros();
        panelOros.setBounds(320, 385, 740, 240);
        this.panelPrincipal.add(panelOros);
        
        JPanel panelEspadas = mesa.getPanelEspadas();
        panelEspadas.setBounds(320, 335, 740, 240);
        this.panelPrincipal.add(panelEspadas);
        
        JPanel panelCopas = mesa.getPanelCopas();
        panelCopas.setBounds(320, 285, 740, 240);
        this.panelPrincipal.add(panelCopas);
        
        JPanel panelBastos = mesa.getPanelBastos();
        panelBastos.setBounds(320, 235, 740, 240);
        this.panelPrincipal.add(panelBastos);
        
        this.panelPrincipal.revalidate();
        this.panelPrincipal.repaint();
    }
    
    public void actualizarVentana (){
        this.ventana.getContentPane().removeAll();
        this.ventana.getContentPane().add(this.panelPrincipal);
        this.ventana.revalidate();
        this.ventana.repaint();
        this.ventana.pack();
        this.ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
        this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        Carta cartaJugada = new Carta("espadas", 5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cantidad de jugadores: ");
        int cantidad = scanner.nextInt();
        Juego juego = new Juego(cantidad);
        juego.repartirCartas();
        juego.mesa.llenarMesa();
        juego.mesa.jugarCarta(cartaJugada);
        juego.actualizarPanel();
        juego.actualizarVentana();
        cartaJugada = new Carta("oros", 5);
        juego.jugadores.get(0).jugarCarta(5);
        juego.mesa.jugarCarta(cartaJugada);
        juego.actualizarPanel();
        juego.actualizarVentana();
    }
    
}
