/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author demon
 */

import javax.swing.table.DefaultTableModel;


public class ModeloTabla extends DefaultTableModel{
    
    String[] titulos;
    Object[][] datos;
    
    public ModeloTabla(){
    
    }
    
    //el primer constructor sera para cuando se agreguen los datos con un titulo
    public ModeloTabla(Object[][] datos, String[] titulos){
        super();
        this.titulos = titulos;
        this.datos = datos;
        setDataVector(datos, titulos);
    }
    
    
    public ModeloTabla(String[] titulos, Object[][] datos){
        super();
        this.titulos = titulos;
        this.datos = datos;
        setDataVector(datos, titulos);
    }
    
    //definir si una celda puede ser o no editada
    public boolean isCellEditable(int row, int column){
        if(column != Utilidades.PERFIL && column != Utilidades.EVENTO &&
               column != Utilidades.NOTA1 && column != Utilidades.NOTA2
                && column != Utilidades.NOTA3){
            return false;
        }else{
            return true;
        }
    }
    
}
