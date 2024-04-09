package com.mycompany.cinquillo;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;
import java.awt.Image;

public class Baraja {
     
    ArrayList<Carta> cartas;
    
    public Baraja(){
        cartas = new ArrayList<>();
    }
    
    public void generarCartas(){
        for (int i=1; i<5; i++){
            for (int j=1; j<11; j++){
                switch (i){
                    case 1:
                        cartas.add(new Carta("bastos", j));
                        break;
                    case 2:
                        cartas.add(new Carta("copas", j));
                        break;
                    case 3:
                        cartas.add(new Carta("espadas", j));
                        break;
                    case 4:
                        cartas.add(new Carta("oros", j));
                        break;
                }
            }
        }
    }
    
    public static void main(String[] args){
        Baraja mazo = new Baraja();
        mazo.generarCartas();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la carta que desea imprimir: ");
        int carta = scanner.nextInt();
        JFrame ventana = new JFrame("Imagen de la carta");
        ventana.setSize(110, 146);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel etiqueta = new JLabel(new ImageIcon(mazo.cartas.get(carta-1).getIcono().getImage().getScaledInstance(108, 144, Image.SCALE_DEFAULT)));
        ventana.add(etiqueta);
        ventana.setVisible(true);
    }
}
