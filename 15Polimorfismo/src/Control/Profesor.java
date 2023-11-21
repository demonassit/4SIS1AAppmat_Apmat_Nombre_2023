/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author demon
 */
public class Profesor extends Persona{
    
    private int num_empleado;
    
    public Profesor(){
    
    }
    
    public Profesor(int num_empleado){
        this.num_empleado = num_empleado;
    }
    
    public Profesor(int num_empleado, String nombre, int edad){
        super(nombre, edad);
        this.num_empleado = num_empleado;
    }
    
    

    @Override
    String tipoPersona() {
        return ("Profesor");
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }
    
}
