/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.io.Serializable;

/**
 *
 * @author demon
 * para poder aplicar el polimorfismo es necesario tener
 * una clase de tipo abstracta, entendamos que una clase
 * abstracta es aquella que podemos instanciar de forma tal
 * que sus elementos son abstractos
 * 
 * el definir abstracto es que puede cambiar de forma
 * es acorde a la prenspectiva de su comportamiento
 * por ejemplo
 * 
 * Persona es un molde que se puede convertir en 
 * 
 * Alumno
 * Docente
 * Trabajador
 * Gerente
 * Empleado
 * Director
 * 
 * O como Barbie
 * 
 * 
 */
public abstract class Persona implements Serializable {
    
    private String nombre;
    private int edad;
    
    public Persona(){
    
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //el metodo abstracto que nos ayuda  adefinir el tipo de persona
    abstract String tipoPersona();
    
}
