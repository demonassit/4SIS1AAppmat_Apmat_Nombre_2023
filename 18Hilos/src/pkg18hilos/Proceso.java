/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18hilos;

/**
 *
 * @author demon
 */
public class Proceso  extends Thread{
    
    /*
    Los hilos nos permiten ejecutar procesos de forma independiente
    esto que quiere decir, todas las computadoras realizar procesos
    en un formato lineal, pero cada procesador cuenta con un numero
    de hilos, lo que les permite poder realizar mas tareas
    "de forma simultanea" o "en paralelo", esto que quiere decir
    entre mas numero de hilos tenga un procesador, mas actividades
    o procesos puede realizar
    
    Cada hilo puede tener sus propias operaciones
    Cada hilo puede mandar a llamar a mas hilos
    
    */
    
    public Proceso(){
    
    }
    
    public Proceso(String nombreHilo){
        super(nombreHilo);
    }
    
    //correr el hilo
    int num_int;
    
    //existe un metodo reservado para ejecutar a un hilo
    public void run(){
        for(int i = 0; i <= num_int; i++){
            System.out.println(" + " + this.getName());
        }
        System.out.println("");
    }
    
    public void valorDecondicion(int valor){
        this.num_int = valor;
    }
}
