/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana;

/**
 *
 * @author demon
 */

import Persona.Persona;
import Utilidades.ModeloTabla;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;


public class VentanaTabla extends JFrame implements MouseListener{

    //definir las variables
    private JPanel contentPanel;
    private JScrollPane scrollPaneTable;
    private JTable tablaPersonas;
    ArrayList<Persona> listapersonas;
    ModeloTabla modelo;
    private int filasTabla;
    private int columnasTabla;
    
    //constructor
    public VentanaTabla(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1120, 450);
        iniciarComponentes();
        setLocationRelativeTo(null);
        construirTabla();
    }
    
    private void iniciarComponentes() {
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(
                5,5,5,5));
        setContentPane(contentPanel);
        contentPanel.setLayout(new BorderLayout(0,0));
        
        JLabel lbltablapersonas = new JLabel("Tabla Personas");
        lbltablapersonas.setFont(
                new Font("Verdana", Font.BOLD, 25));
        contentPanel.add(lbltablapersonas, BorderLayout.NORTH);
        
        scrollPaneTable = new JScrollPane();
        contentPanel.add(scrollPaneTable);
        
        tablaPersonas = new JTable();
        tablaPersonas.setBackground(Color.WHITE);
        tablaPersonas.setBorder(
                new BevelBorder(
                        BevelBorder.RAISED, null, null, null, null));
        tablaPersonas.addMouseListener(this);
        tablaPersonas.setOpaque(false);
        scrollPaneTable.setViewportView(tablaPersonas);
        
    }

    private void construirTabla() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
