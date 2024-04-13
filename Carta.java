package com.mycompany.cinquillo;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;
import java.awt.Image;

public class Carta {
    
    // Atributos de la clase Carta
    private String figura; // La figura de la carta (por ejemplo, "corazón", "diamante", etc.)
    private int valor; // El valor numérico de la carta (por ejemplo, 1 para el As, 2 para el 2, etc.)
    private String ruta; // La ruta de la imagen asociada a la carta
    private boolean visible; // Indica si la carta está visible o no
    private ImageIcon icono; // La representación gráfica de la carta como un ImageIcon
    
    // Constructor de la clase Carta
    public Carta(String figura, int valor){
        this.figura = figura;
        this.valor = valor;
        // Se construye la ruta de la imagen a partir de la figura y el valor de la carta
        this.ruta = "imagenes/" + figura + valor + ".jpg";
        this.visible = true; // Por defecto, la carta se muestra
        this.icono = new ImageIcon(ruta); // Se crea un ImageIcon basado en la ruta de la imagen
    }
    
    // Método para obtener la ruta de la imagen
    public String getRuta(){
        return this.ruta;
    }
    
    // Método para establecer la figura de la carta
    public void setFigura(String figura){
        this.figura = figura;
        // Si la carta está visible, se actualiza la ruta de la imagen
        if (this.visible == true){
            this.ruta = "imagenes/" + figura + valor + ".jpg";
        }else{
            // Si la carta está oculta, se utiliza una imagen volteada
            this.ruta = "imagenes/volteada.jpg";
        }
        this.icono = new ImageIcon(ruta); // Se actualiza el ImageIcon
    }
    
    // Método para obtener la figura de la carta
    public String getFigura(){
        return this.figura;
    }
    
    // Método para establecer el valor de la carta
    public void setValor(int valor){
        this.valor = valor;
        // Si la carta está visible, se actualiza la ruta de la imagen
        if (this.visible == true){
            this.ruta = "imagenes/" + figura + valor + ".jpg";
        }else{
            // Si la carta está oculta, se utiliza una imagen volteada
            this.ruta = "imagenes/volteada.jpg";
        }
        this.icono = new ImageIcon(ruta); // Se actualiza el ImageIcon
    }
    
    // Método para obtener el valor de la carta
    public int getValor(){
        return this.valor;
    }
    
    // Método para establecer la visibilidad de la carta
    public void setVisible(boolean visible){
        this.visible = visible;
        // Se actualiza la ruta de la imagen según la visibilidad de la carta
        if (this.visible == true){
            this.ruta = "imagenes/" + figura + valor + ".jpg";
        }else{
            // Si la carta está oculta, se utiliza una imagen volteada
            this.ruta = "imagenes/volteada.jpg";
        }
        this.icono = new ImageIcon(ruta); // Se actualiza el ImageIcon
    }
    
    // Método para obtener la visibilidad de la carta
    public boolean getVisible(){
        return this.visible;
    }
    
    // Método para obtener el ImageIcon de la carta
    public ImageIcon getIcono(){
        return this.icono;
    }
    
    // Método main para probar la clase Carta
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la figura: ");
        String figura = scanner.next();
        System.out.println("Ingrese el valor: ");
        int valor = scanner.nextInt();
        // Se crea una instancia de Carta con la figura y el valor ingresados
        Carta carta = new Carta(figura, valor);
        // Se crea una ventana para mostrar la imagen de la carta
        JFrame ventana = new JFrame("Imagen de la carta");
        ventana.setSize(110, 146);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Se crea un JLabel con el ImageIcon de la carta, escalado para ajustarse al tamaño de la ventana
        JLabel etiqueta = new JLabel(new ImageIcon(carta.getIcono().getImage().getScaledInstance(108, 144, Image.SCALE_DEFAULT)));
        ventana.add(etiqueta); // Se agrega el JLabel a la ventana
        ventana.setVisible(true); // Se muestra la ventana
    }
}
