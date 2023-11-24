/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg16componentesatomicos;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author demon
 */
public class ComponenteAtomico extends JFrame implements ActionListener, ChangeListener {

    private Container contenedor;
    //declarar todos los componentes que vamos a utilizar
    JLabel labelTitulo;
    JLabel etiquetaLabel1;
    JLabel etiquetaboton;
    JLabel etiquetaToogleButton;
    JLabel etiquetaCheckbox;
    JLabel etiquetaRadioButton;
    JLabel etiquetaCombo;
    JLabel etiquetaSeparador;
    JLabel etiquetaSpinner;
    JLabel etiquetaDeslizador;
    JLabel etiquetaBarra;
    JButton boton;
    JCheckBox checkbox1, checkbox2;
    ButtonGroup grupoRadios;
    JRadioButton radio1, radio2;
    JToggleButton tooglebutton;
    JComboBox combo;
    JSeparator separadorVertical, separadorHorizontal;
    JSpinner spinner;
    JSlider deslizador;
    JProgressBar barra;
    
    public ComponenteAtomico(){
        //vamos a crear un meotodo para iniciar las propiedades de los componentes
        iniciarComponentes();
        //agregamos un titulo al contenedor
        setTitle("JFrame de Componentes Atomicos");
        //tamanio
        setSize(630, 250);
        //poner la venta al centro
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void iniciarComponentes() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        
        //definimos las propiedades de cada componente
        labelTitulo = new JLabel();
        labelTitulo.setText("Componentes Atomicos de Netbeans");
        labelTitulo.setFont(new java.awt.Font("Tahoma", 1,20));
        labelTitulo.setBounds(180, 5, 380, 40);
        
        etiquetaLabel1 = new JLabel();
        etiquetaLabel1.setText("Esto es una etiqueta");
        etiquetaLabel1.setBounds(20, 50, 280, 25);
        
        etiquetaboton = new JLabel();
        etiquetaboton.setText("Etiqueta Boton ");
        etiquetaboton.setBounds(20, 80, 80, 25);
        
        boton = new JButton();
        boton.setText("Este es el boton");
        boton.setBounds(80, 80, 80, 25);
        boton.addActionListener(this);
        
        etiquetaCheckbox = new JLabel();
        etiquetaCheckbox.setText("Etiqueta checkbox");
        etiquetaCheckbox.setBounds(20, 110, 80, 25);
        
        checkbox1 = new JCheckBox();
        checkbox1.setText("Cuadritos");
        checkbox1.setBounds(100, 110, 80, 25);
        
        checkbox2 = new JCheckBox();
        checkbox2.setText("Cuadritos 2");
        checkbox2.setBounds(180, 110, 80, 25);
        
        grupoRadios = new ButtonGroup();
        radio1 = new JRadioButton();
        radio1.setText("Radio button");
        radio1.setBounds(110, 140, 80, 25);
        
        radio2 = new JRadioButton();
        radio2.setText("Radio button2");
        radio2.setBounds(190, 140, 80, 25);
        
        //agrupo
        grupoRadios.add(radio1);
        grupoRadios.add(radio2);
        
        tooglebutton = new JToggleButton();
        tooglebutton.setText("Activar");
        tooglebutton.setBounds(120, 180, 80, 25);
        
        etiquetaCombo = new JLabel();
        etiquetaCombo.setText("Combobox");
        etiquetaCombo.setBounds(350, 50, 100, 25);
        
        //agregar las opciones del combo
        combo = new JComboBox();
        combo.addItem("Opciones");
        combo.addItem("Opcion1");
        combo.addItem("Opcion2");
        combo.addItem("Opcion3");
        combo.addItem("Opcion4");
        combo.setBounds(430, 50, 100, 25);
        //debo decirle donde iniciar el indice para la lista
        combo.setSelectedIndex(0);
        
        separadorVertical = new JSeparator();
        separadorVertical.setOrientation(
                javax.swing.SwingConstants.VERTICAL );
        separadorVertical.setBounds(300, 60, 10, 200);
        
        etiquetaSeparador = new JLabel();
        etiquetaSeparador.setText("Separador");
        etiquetaSeparador.setBounds(350, 80, 100, 25);
        
        separadorHorizontal = new JSeparator();
        separadorHorizontal.setBounds(430, 90, 100, 5);
        
        spinner = new JSpinner();
        spinner.setBounds(430, 110, 50, 25);
        spinner.addChangeListener(this);
        
        etiquetaDeslizador= new JLabel();
        etiquetaDeslizador.setText("Deslizador");
        etiquetaDeslizador.setBounds(350, 140, 100, 25);
        
        deslizador = new JSlider(
                JSlider.HORIZONTAL, 0, 100, 30);
        deslizador.setBounds(430, 140, 100, 30);
        deslizador.setPaintTicks(true);
        deslizador.setMajorTickSpacing(50);
        deslizador.setMinorTickSpacing(5);
        deslizador.setBorder(new TitledBorder("Puede ser lo que sea"));
        deslizador.setValue(0);
        deslizador.addChangeListener(this);
        
        etiquetaBarra = new JLabel();
        etiquetaBarra.setText("Barra de Progreso");
        etiquetaBarra.setBounds(350, 180, 100, 25);
        
        barra = new JProgressBar();
        barra.setBounds(450, 180, 110, 20);
        
        //agregar todo
        contenedor.add(labelTitulo);
        contenedor.add(etiquetaLabel1);
        contenedor.add(etiquetaboton);
        contenedor.add(etiquetaCheckbox);
        contenedor.add(checkbox1);
        contenedor.add(checkbox2);
        contenedor.add(etiquetaRadioButton);
        contenedor.add(radio1);
        contenedor.add(radio2);
        contenedor.add(etiquetaToogleButton);
        contenedor.add(tooglebutton);
        contenedor.add(etiquetaCombo);
        contenedor.add(separadorVertical);
        contenedor.add(etiquetaSeparador);
        contenedor.add(combo);
        contenedor.add(separadorHorizontal);
        contenedor.add(etiquetaSpinner);
        contenedor.add(spinner);
        contenedor.add(etiquetaDeslizador);
        contenedor.add(deslizador);
        contenedor.add(barra);
        contenedor.add(etiquetaBarra);
        contenedor.add(boton);
  
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
