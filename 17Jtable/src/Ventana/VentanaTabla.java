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
import Utilidades.GestionCeldas;
import Utilidades.GestionEncabezadoTabla;
import Utilidades.ModeloTabla;
import Utilidades.Utilidades;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;


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
        //imaginar como es que serian los elementos de la misma
        
        listapersonas = consultarListaPersonas();
        
        ArrayList<String> titulolista = new ArrayList<>();
        
        titulolista.add("Documento");
        titulolista.add("Nombre");
        titulolista.add("Direccion");
        titulolista.add("Telefono");
        titulolista.add("Profesion");
        titulolista.add("Edad");
        titulolista.add("Nota1");
        titulolista.add("Nota2");
        titulolista.add("Nota3");
        titulolista.add("Promedio");
        titulolista.add("");
        titulolista.add("");
        
        //se deben asignar las columnas al arreglo apra enviar al momento
        //de construir la tabla
        
        String titulos[] = new String[titulolista.size()];
        for(int i = 0; i < titulos.length; i++){
            titulos[i] = titulolista.get(i);
        }
        
        //obtenemos los datos de la lsita y los guardamos en la
        //matriz
        Object[][] data = obtenerMatrizDatos(titulolista);
        construirTabla(titulos, data);

        
    }
    
    
    private ArrayList<Persona> consultarListaPersonas() {
        //precarga de datos
        ArrayList<Persona> lista = new ArrayList<>();
        
        lista.add(new Persona("1234", "Juanito Perez Montecinos", 
                "Vive por ahi", "1234567890",
                "Inge", 20, 6, 7, 8, (6+7+8)/30));
        lista.add(new Persona("56789", "Diana Perez Montecinos", 
                "Vive por ahi", "1234567890",
                "Merca", 22, 8, 7, 8, (8+7+8)/30));
        
        return lista;
    }

    private Object[][] obtenerMatrizDatos(ArrayList<String> tituloslista) {
        //esta matriz debe de ser dinamica pues corresponde a todos los usuarios
        String informacion[][] = 
                new String[listapersonas.size()][tituloslista.size()];
        
        //vamos a llenar la matriz
        for(int x = 0; x < informacion.length; x++){
            informacion[x][Utilidades.DOCUMENTO] = 
                    listapersonas.get(x).getDocumento() + " ";
            informacion[x][Utilidades.NOMBRE] = 
                    listapersonas.get(x).getNombre()+ " ";
            informacion[x][Utilidades.DIRECCION] = 
                    listapersonas.get(x).getDireccion()+ " ";
            informacion[x][Utilidades.TELEFONO] = 
                    listapersonas.get(x).getTelefono()+ " ";
            informacion[x][Utilidades.PROFESION] = 
                    listapersonas.get(x).getProfesion()+ " ";
            informacion[x][Utilidades.EDAD] = 
                    listapersonas.get(x).getEdad()+ " ";
            informacion[x][Utilidades.NOTA1] = 
                    listapersonas.get(x).getNota1()+ " ";
            informacion[x][Utilidades.NOTA2] = 
                    listapersonas.get(x).getNota2()+ " ";
            informacion[x][Utilidades.NOTA3] = 
                    listapersonas.get(x).getNota3()+ " ";
            informacion[x][Utilidades.PROMEDIO] = 
                    listapersonas.get(x).getPromedio()+ " ";
            //los ultimos son para los eventos
            informacion[x][Utilidades.PERFIL] = "PERFIL";
            informacion[x][Utilidades.EVENTO] = "EVENTO";
        }
        return informacion;
    }
    
    private void construirTabla(String[] titulos, Object[][] data) {
        modelo = new ModeloTabla(data, titulos);
        
        //le asigno el modelo a la tabla
        
        tablaPersonas.setModel(modelo);
        
        filasTabla = tablaPersonas.getRowCount();
        columnasTabla = tablaPersonas.getColumnCount();
        
        //le asigno el tipo de datoq ue tendran las celdas
        //de cada columan definida
        
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.EDAD).setCellRenderer(
                        new GestionCeldas("numerico"));
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOTA1).setCellRenderer(
                        new GestionCeldas("numerico"));
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOTA2).setCellRenderer(
                        new GestionCeldas("numerico"));
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOTA3).setCellRenderer(
                        new GestionCeldas("numerico"));
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.PROMEDIO).setCellRenderer(
                        new GestionCeldas("numerico"));
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.PERFIL).setCellRenderer(
                        new GestionCeldas("icono"));
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.EVENTO).setCellRenderer(
                        new GestionCeldas("icono"));
        
        //debemos recorrer el resto y asignar los datos
    
        for(int i = 0; i < titulos.length-7; i++){
            System.out.println(i);
            tablaPersonas.getColumnModel().getColumn(
                    i).setCellRenderer(
                            new GestionCeldas("texto"));
        }
        
        //formato
        tablaPersonas.getTableHeader().setReorderingAllowed(false);
        tablaPersonas.setRowHeight(25);//tamanio de la celda
        tablaPersonas.setGridColor(new java.awt.Color(0,0,0));
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.DOCUMENTO).setPreferredWidth(
                        130);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOMBRE).setPreferredWidth(
                        380);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.DIRECCION).setPreferredWidth(
                        400);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.TELEFONO).setPreferredWidth(
                        130);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.PROFESION).setPreferredWidth(
                        280);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.EDAD).setPreferredWidth(
                        100);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOTA1).setPreferredWidth(
                        100);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOTA2).setPreferredWidth(
                        100);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOTA3).setPreferredWidth(
                        100);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.PROMEDIO).setPreferredWidth(
                        100);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.PERFIL).setPreferredWidth(
                        50);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.EVENTO).setPreferredWidth(
                        50);
        
        //encabezado
        JTableHeader jtableheader = tablaPersonas.getTableHeader();
        jtableheader.setDefaultRenderer(new GestionEncabezadoTabla());
        tablaPersonas.setTableHeader(jtableheader);
        
        //le agrego el scroll
        scrollPaneTable.setViewportView(tablaPersonas);
        
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
