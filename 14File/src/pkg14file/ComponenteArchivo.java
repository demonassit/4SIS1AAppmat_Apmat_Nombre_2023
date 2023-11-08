/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14file;

/**
 *
 * @author demon
 */
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.*;

import javax.swing.*;

//vamos a crear una clase que nos permita cargar un archivo desde una ventana
public class ComponenteArchivo extends JFrame implements ActionListener{
    
    //las variables
    private Container contenedor;
    JLabel labeltitulo;
    JTextArea areatexto;
    JButton botonabrir;
    JButton botonguardar;
    JScrollPane scrollpane;
    JFileChooser filechooser;
    String texto;
    
    public ComponenteArchivo(){
    
        contenedor = getContentPane();
        contenedor.setLayout(null);
        
        //hacemos una instancia del objeto de archivos
        filechooser = new JFileChooser();
        
        labeltitulo = new JLabel();
        labeltitulo.setText("Componente de JFileChooser");
        labeltitulo.setBounds(110, 290, 180, 25);
        
        areatexto = new JTextArea();
        //ajustamos el texto dentro del textarea
        areatexto.setLineWrap(true);
        //para que no queden las palabras incompletas y se haga automatico el salto de linea
        areatexto.setWrapStyleWord(true);
        
        //vamos agregar el scroll
        scrollpane = new JScrollPane();
        scrollpane.setBounds(20, 50, 350, 270);
        scrollpane.setViewportView(areatexto);
        
        botonabrir = new JButton();
        botonabrir.setText("Abrir");
        botonabrir.setBounds(100, 330, 80, 25);
        botonabrir.addActionListener(this);
        
        botonguardar = new JButton();
        botonguardar.setText("Guardar");
        botonguardar.setBounds(220, 330, 80, 25);
        botonguardar.addActionListener(this);
        
        //hay que agregarlos en el contenedor
        contenedor.add(labeltitulo);
        contenedor.add(scrollpane);
        contenedor.add(botonabrir);
        contenedor.add(botonguardar);
        
        //que sea vea 
        setTitle("Ventana de JFileChooser");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonabrir){
            try{
                String archivo = abrirArchivo();
                
            }catch (Exception ex){
                System.out.println("Error " + ex.getMessage());
                System.out.println("Fuente " + ex.getStackTrace());
            }
        }
        if(e.getSource() == botonguardar){
            guardarArchivo();
        }
    }

    private String abrirArchivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void guardarArchivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
