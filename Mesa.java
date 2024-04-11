package com.mycompany.cinquillo;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

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
    
    public void llenarMesa(){
        for (int i=1; i<11; i++){
            this.escaleraBastos.add(new Carta("bastos", i));
            this.escaleraBastos.get(i-1).setVisible(false);
            this.escaleraCopas.add(new Carta("copas", i));
            this.escaleraCopas.get(i-1).setVisible(false);
            this.escaleraEspadas.add(new Carta("espadas", i));
            this.escaleraEspadas.get(i-1).setVisible(false);
            this.escaleraOros.add(new Carta("oros", i));
            this.escaleraOros.get(i-1).setVisible(false);
            
        }
    }
    
    public void jugarCarta(Carta carta){
        switch (carta.getFigura()){
            case "bastos":
                this.escaleraBastos.get(carta.getValor()-1).setVisible(true);
                break;
            case "copas":
                this.escaleraCopas.get(carta.getValor()-1).setVisible(true);
                break;
            case "espadas":
                this.escaleraEspadas.get(carta.getValor()-1).setVisible(true);
                break;
            case "oros":
                this.escaleraOros.get(carta.getValor()-1).setVisible(true);
                break;
        }
    }
    
    public JPanel getPanelBastos(){
        JPanel panel = new JPanel();
        panel.setVisible(false);
        for (int i=0; i<this.escaleraBastos.size(); i++){
            ImageIcon icono = new ImageIcon(this.escaleraBastos.get(i).getIcono().getImage().getScaledInstance(36, 48, Image.SCALE_DEFAULT));
            JLabel etiqueta = new JLabel(icono);
            etiqueta.setPreferredSize(new Dimension(36, 48));
            panel.setBackground(new Color(53, 148, 100));
            etiqueta.setBounds(100, 100, 36, 48);
            etiqueta.setVisible(true);
            panel.add(etiqueta);
        }
        panel.setVisible(true);
        return panel;
    }
    
    public JPanel getPanelCopas(){
        JPanel panel = new JPanel();
        panel.setVisible(false);
        for (int i=0; i<this.escaleraCopas.size(); i++){
            ImageIcon icono = new ImageIcon(this.escaleraCopas.get(i).getIcono().getImage().getScaledInstance(36, 48, Image.SCALE_DEFAULT));
            JLabel etiqueta = new JLabel(icono);
            etiqueta.setPreferredSize(new Dimension(36, 48));
            panel.setBackground(new Color(53, 148, 100));
            etiqueta.setBounds(100, 100, 36, 48);
            etiqueta.setVisible(true);
            panel.add(etiqueta);
        }
        panel.setVisible(true);
        return panel;
    }
    
    public JPanel getPanelEspadas(){
        JPanel panel = new JPanel();
        panel.setVisible(false);
        for (int i=0; i<this.escaleraEspadas.size(); i++){
            ImageIcon icono = new ImageIcon(this.escaleraEspadas.get(i).getIcono().getImage().getScaledInstance(36, 48, Image.SCALE_DEFAULT));
            JLabel etiqueta = new JLabel(icono);
            etiqueta.setPreferredSize(new Dimension(36, 48));
            panel.setBackground(new Color(53, 148, 100));
            etiqueta.setBounds(100, 100, 36, 48);
            etiqueta.setVisible(true);
            panel.add(etiqueta);
        }
        panel.setVisible(true);
        return panel;
    }
    
    public JPanel getPanelOros(){
        JPanel panel = new JPanel();
        panel.setVisible(false);
        for (int i=0; i<this.escaleraOros.size(); i++){
            ImageIcon icono = new ImageIcon(this.escaleraOros.get(i).getIcono().getImage().getScaledInstance(36, 48, Image.SCALE_DEFAULT));
            JLabel etiqueta = new JLabel(icono);
            etiqueta.setPreferredSize(new Dimension(36, 48));
            panel.setBackground(new Color(53, 148, 100));
            etiqueta.setBounds(100, 100, 36, 48);
            etiqueta.setVisible(true);
            panel.add(etiqueta);
        }
        panel.setVisible(true);
        return panel;
    }
    
}
