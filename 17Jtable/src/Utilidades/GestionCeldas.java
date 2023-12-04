/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author demon
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class GestionCeldas extends DefaultTableCellRenderer{
    
    /*
    Esta clase nos permite gestionar la tabla y los eventos que se van
    a realizar dentro de ella haciendo que sea un objeto
    personalizable cada celda
    */
    
    private String tipo = "text";
    
    //definir los tupos de datos por defecto
    private Font normal = new Font("Verdana", Font.PLAIN, 12);
    private Font bold = new Font("Verdana", Font.BOLD, 12);
    
    private JLabel label = new JLabel();
    
    //aqui van a agregar los iconos de busqueda
    private ImageIcon iconoGuardar = 
            new ImageIcon(getClass()
                    .getResource("/Recursos/ico_guardar.png"));
    private ImageIcon iconoBuscar = 
            new ImageIcon(getClass()
                    .getResource("/Recursos/ico_buscar.png"));
    
    public GestionCeldas(){
    
    }
    
    public GestionCeldas(String tipo){
        this.tipo = tipo;
    }
    
    //un metodo para que se encargue de manipular la tabla
    public Component getTableCellRendererComponent(JTable table, 
            Object value, boolean selected, boolean focused, 
            int row, int column){
        //definimos los colores
        Color colorFondo = null;
        Color colorFondoPorDefecto = new Color(192, 192, 192);
        Color colorFondoSeleccionado = new Color(140, 140, 140);
        
        //si la celda del evento esta seleccionada entonces adigno el color
        if(selected){
            this.setBackground(colorFondoPorDefecto);
        }else{
            //para las que no esten seleccionadas
            this.setBackground(Color.white);
        }
        
        /*
         Se definen los tipos de datos que contendran las celdas basado en
        la instancia y la ventana de la tabla al momento de construirla
        */
        
        if(tipo.equals("texto")){
            //si el tipo de texto define el color de fondo y la celda
            if(focused){
                colorFondo = colorFondoSeleccionado;
            }else{
                colorFondo = colorFondoPorDefecto;
            }
        
        
            this.setHorizontalAlignment(JLabel.LEFT);
            this.setText((String)value);
            this.setBackground((selected)? colorFondo : Color.WHITE);
            this.setFont(bold);

            return this;
        
        }
        
        //si el tipo es icono entonces valida cual icono es
        if(tipo.equals("icono")){
            if(String.valueOf(value).equals("PERFIL")){
                label.setIcon(iconoBuscar);
            }else if(String.valueOf(value).equals("EVENTO")){
                label.setIcon(iconoGuardar);
            }
            label.setHorizontalAlignment(JLabel.LEFT);
            label.setBorder(
                    javax.swing.BorderFactory.createBevelBorder(
                            javax.swing.border.BevelBorder.RAISED));
            return label;
        }
        
        //cuando sea un numero
        if(tipo.equals("numerico")){
            if(focused){
            
                colorFondo = colorFondoSeleccionado;
            
            }else{
                colorFondo = colorFondoPorDefecto;
            }
            this.setHorizontalAlignment(JLabel.CENTER);
            this.setText((String)value);
            this.setForeground((selected)? new Color(255,255,255):new Color(32,117,32));
            this.setBackground((selected)? colorFondo : Color.MAGENTA);

            return this;
        }
    return this;
    }
}
