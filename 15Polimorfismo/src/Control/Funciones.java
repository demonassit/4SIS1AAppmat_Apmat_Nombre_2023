/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author demon
 */

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Funciones {
    //vamos a crear una lista de personas para registrar
    ArrayList<Persona> listapersonas = new ArrayList();
    
    //variables
    String rep = "si";
    String nombre = "";
    int edad, num_empleado, bol;
    
    //aqui viene donde aplicamos el polimorfismo
    //ya que vamos a transformar una persona en
    Persona profesor = new Profesor();
    Persona alumno = new Alumno();
    
    public void menu(){
        while(true){
            while(rep.equalsIgnoreCase("si")){
                try{
                    String var = JOptionPane.showInputDialog(
                            "Ingresa la opcion deseada: \n"
                                    + "1.- Registrar nuevo Profesor\n"
                                    + "2.- Registrar nuevo Alumno\n"
                                    + "3.- Consultar Alumno\n");
                    
                    if(var == null){
                        System.exit(0);
                    }
                    
                    int opcion = Integer.parseInt(var);
                    
                    switch (opcion) {
                        case 1:
                            //metodo para solicitar datos
                            pedirDatosProfesor();
                            //se los asigna a un objeto profesor
                            profesor = new Profesor(num_empleado, nombre, edad);
                            //metodo para guardarlo
                            guardarProfesor();
                            
                            break;
                        case 2:
                            //metodo para solicitar datos
                            pedirDatosAlumno();
                            //se los asigna a un objeto profesor
                            alumno = new Alumno(bol, nombre, edad);
                            //metodo para guardarlo
                            guardarAlumno();
                            break;
                        case 3:
                            //metodo para leer el archivo de alumnos
                            leerAlumno();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    rep = JOptionPane.showInputDialog("Deseas Repetir?");
                }catch(Exception e){
                    System.out.println("Error :" + e.getMessage());
                }
            }
        }
    }

    private void pedirDatosProfesor() {
        num_empleado = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el numero de empleado del Profesor: "));
        nombre = JOptionPane.showInputDialog(
                "Ingresa el nombre del Profesor");
        edad = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa la edad del Profesor: "));
    }

    private void guardarProfesor() throws Exception{
        //vamos a crear un metodo para guardarlos
        listapersonas.add(profesor);
        guardar();
    }

    private void pedirDatosAlumno() {
        bol = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el numero de boleta del Alumno: "));
        nombre = JOptionPane.showInputDialog(
                "Ingresa el nombre del Alumno");
        edad = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa la edad del Alumno: "));
    }

    private void guardarAlumno() throws Exception{
        //vamos a crear un metodo para guardarlos
        listapersonas.add(alumno);
        guardar();
    }

    private void leerAlumno() throws Exception{
        /*
        Aqui es donde se debe de aplicar la serializacion para generar
        un archivo donde se pueda guardar los datos de la lista de personas
        para eso vamos a ocupar flujos para crear el archivo
        */
        FileInputStream archivo = new FileInputStream("archivo.dat");
        //ocupamos un buffer para los datos (objetos)
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        //vamos a transofromar los objetos de acuerdo a la entrada de datos
        listapersonas = (ArrayList)entrada.readObject();
        
        //ya que la pude leer tenemos que recorrerla
        for(int i = 0; i < listapersonas.size(); i++){
            //conforme vaya leyendo debemos asignar los datos
            Alumno obj = (Alumno)listapersonas.get(i); //identificador
            //desplegamos la informacion
            JOptionPane.showMessageDialog(null,
                    "\n "
                    + "Numero de alumnos registrados: " + (i+1) + "\n"
                    + "Boleta: " + obj.getBoleta() + "\n"
                    + "Nombre: " + obj.getNombre()+ "\n"
                    + "Edad: " + obj.getEdad()+ "\n"
                    + "Tipo de persona: " + obj.tipoPersona()+ "\n");
        }
    }

    private void guardar() throws Exception{
       //aqui vamos a crear el archivo que es el se graba con la informacion
       FileOutputStream archivo = new FileOutputStream("archivo.dat");
       ObjectOutputStream salida = new ObjectOutputStream(archivo);
       
       //vamos a escribir los datos
       salida.writeObject(listapersonas);
       salida.close();
    }
}
