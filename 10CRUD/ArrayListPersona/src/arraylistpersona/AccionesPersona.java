/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistpersona;

/**
 *
 * @author demon
 */
import java.util.ArrayList;

public class AccionesPersona {

    /*
     * Acciones persona es una clase de tipo controlador, el controlador es
     * una clase que se encarga de las acciones u operaciones que debe tener
     * el objeto que se ha creado, por lo regular siempre esta asociado a
     * las operaciones basicas
     * consultar      consult
     * registrar      register
     * actualizar     update
     * eliminar       delete
     * CRUD
     * 
     * ahora cuando pensamos en las acciones de una persona, es necesario
     * guardar todos los datos de forma dinamica, porque constantemente
     * van a estar generando nuevos registros, para ello necesitamos utilizar
     * un tipo de objeto especial llamado
     * 
     * ArrayList, es un arreglo dinamico de objetos, a comparacion de los otros arreglos
     * un arreglo solo puede contener un tipo de dato por ejemplo
     * int edad[10]  char letras[20] double precio[2]
     * 
     * ArrayList al ser dinamico puede cambiar su tamaño, se puede adaptar a diferentes
     * tipos de dato, porque lo que guarda son objetos
     * 
     */

     //declaramos un objeto de persona tipo arraylist

     public ArrayList<Persona> listapersonas = new ArrayList<Persona>();

     //vamos a crear un metodo para guardar el registro de una persona
     public void agregarPersona(Persona p){
        //voy a ocupar a mi listapersona para agregarlo
        listapersonas.add(p);
     }

     //buscar una persona por su id
     public Persona buscarPersona(int id){
        //neceisto una persona para saber si la encontre y otra para buscarla
        Persona encontrada = new Persona();

        //necesito recorrer el arraylist de personas donde estan registradas
        for(Persona p : listapersonas){
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("No existe el registro de esa persona");
            }
        }
        return encontrada;
     }

     //actualizar los datos de una persona
     public void actualizarPersona(Persona actualizada){
        //como se hace el proceso de actualizar
        //1 debo de buscar a la persona que quiero actualizar
        //2 ya que lo encontre debo de cambiar los datos (borrar el anterior dato)
        //3 actualizar los datos de la nueva persona

        Persona actualizar = buscarPersona(actualizada.getId());

        //cambio los datos
        listapersonas.remove(actualizar);

        //actualizo
        listapersonas.add(actualizar);
     }

     //necesito eliminar el registro de una persona
     public void eliminarPersona(Persona eliminada){
        listapersonas.remove(eliminada);
     }

     //quiero mostrar la lista completa de personas
     public ArrayList<Persona> mostrarPersonas(){
        return listapersonas;
     }

}
