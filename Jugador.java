package com.mycompany.cinquillo;

import java.awt.FlowLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

public class Jugador {
    
    // Atributos de la clase Jugador
    private String nombre;
    private int puntos;
    private ArrayList<Carta> mano;
    
    // Constructor de la clase Jugador
    public Jugador(String nombre){
        // Inicialización de los atributos del jugador
        this.nombre = nombre;
        this.puntos = 0;
        this.mano = new ArrayList<>();
    }
    
    // Métodos para establecer el nombre y los puntos del jugador
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
    
    // Métodos para obtener el nombre y los puntos del jugador
    public String getNombre(){
        return this.nombre;
    }
    
    public int puntos(){
        return this.puntos;
    }

    // Método para obtener la mano del jugador
    public ArrayList<Carta> getMano() {
        return this.mano;
    }
    
    // Método para buscar una carta en la mano del jugador
    public boolean buscarCarta(Carta carta){
        boolean bandera = false;
        for (int i=0; i<this.mano.size(); i++) {
            if (this.mano.get(i).getRuta().equals("imagenes/" + carta.getFigura() + carta.getValor() + ".jpg")){
                bandera = true;
            }
        }
        return bandera;
    }
    
    // Método para jugar una carta de la mano del jugador
    public void jugarCarta(int carta){
        this.mano.get(carta-1).setVisible(false);
    }
    
    // Método para validar si el jugador ha ganado
    public boolean validarVictoria(){
        boolean bandera = true;
        for (int i=0; i<this.mano.size(); i++){
            if (this.mano.get(i).getVisible()){
                bandera = false;
            }
        }
        return bandera;
    }
    
    // Método para obtener un panel gráfico que represente la mano del jugador
    public JPanel getPanelMano(){
        JPanel panel = new JPanel(new FlowLayout());
        // Se recorre la mano del jugador para crear etiquetas de las cartas
        for (int i=0; i<this.mano.size(); i++) {
            // Se crea una etiqueta con la imagen de la carta
            ImageIcon icono = new ImageIcon(this.mano.get(i).getIcono().getImage().getScaledInstance(54, 72, Image.SCALE_DEFAULT));
            JLabel etiqueta = new JLabel(icono);
            JPanel etiquetaPanel = new JPanel(new BorderLayout());
            // Se agrega un índice numérico a cada carta para identificarla
            JLabel etiquetaIndice = new JLabel(String.valueOf(i+1));
            etiquetaIndice.setHorizontalAlignment(JLabel.CENTER);
            etiquetaIndice.setForeground(Color.BLACK);
            etiquetaIndice.setFont(new Font("Arial", Font.BOLD, 14));
            etiquetaPanel.add(etiqueta, BorderLayout.CENTER);
            etiquetaPanel.add(etiquetaIndice, BorderLayout.NORTH);
            etiqueta.setPreferredSize(new Dimension(58, 74));
            panel.setBackground(new Color(53, 148, 100));
            // Se añade la etiqueta al panel
            panel.add(etiquetaPanel);
        }
        return panel; // Se devuelve el panel que representa la mano del jugador
    }
   
}
