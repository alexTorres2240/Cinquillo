package com.mycompany.cinquillo;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

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

    public ArrayList<Carta> getMano() {
        return this.mano;
    }
    
    public JPanel getPanelMano(){
        JPanel panel = new JPanel(new FlowLayout());
        for (int i=0; i<this.mano.size(); i++) {
            ImageIcon icono = new ImageIcon(this.mano.get(i).getIcono().getImage().getScaledInstance(54, 72, Image.SCALE_DEFAULT));
            JButton etiqueta = new JButton(icono);
            etiqueta.setPreferredSize(new Dimension(58, 74));
            panel.setBackground(new Color(53, 148, 100));
            panel.add(etiqueta);
        }
        return panel;
    }
   
}
