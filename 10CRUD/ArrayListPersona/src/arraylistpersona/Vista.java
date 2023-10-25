/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistpersona;

/**
 *
 * @author demon
 */
import java.util.*;

public class Vista {
    
    //vamos a crear nuestro menu

    

        Scanner entrada = new Scanner(System.in);
        int opcion;
        //vamos a crear una inscancia de Persona y del controlador
        AccionesPersona control = new AccionesPersona();

       public void menu(){
        do{
        System.out.println("Bienvenido a la administracion del personal de la empresa Patito");
        System.out.println("Por favor elija la opcion deseada"
                + "\n 1.- Mostrar lista del personal"
                + "\n 2.- Registrar una nueva persona"
                + "\n 3.- Editar los datos de una persona"
                + "\n 4.- Borrar el registro de una persona"
                + "\n 5.- Salir");
        
        opcion = Integer.parseInt(entrada.nextLine());
        
        switch (opcion) {
            case 1:
                //aqui voy a mandar a llamar al metodo de mostrarPersonas
                //lo primero que necesito es el objeto capaz de almacenar a todas las personas
                ArrayList<Persona> listadePersonas = control.mostrarPersonas();
                //ahora necesito recorrer la lista
                for(Persona objeto : listadePersonas){
                    //imprimir sus datos
                    System.out.println("El id: " + objeto.getId()+ "\n"
                                        + "El nombre: " + objeto.getNombre()+ "\n"
                                        + "La edad es: " + objeto.getEdad() + "\n");
                }
                
                break;
            case 2:
                //aqui mando a llamar al metodo para registrar a la persona
                System.out.println("Ingresa el id de la persona: ");
                int idpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingresa el nombre de la persona: ");
                String nombrepersona = entrada.nextLine();
                System.out.println("Ingresa la edad de la persona: ");
                int edadpersona = Integer.parseInt(entrada.nextLine());
                
                //enviar esos datos al objeto
                Persona personaNueva = new Persona(idpersona, nombrepersona, edadpersona);
                
                //con el metodo agregarlos
                control.agregarPersona(personaNueva);
                break;
            case 3:
                //aqui primero busco por el id y luego la edito
                System.out.println("Ingrese el ID de la persona que desea actualizar sus datos");
                int id = entrada.nextInt();
                
                Persona personaSeleccione = control.buscarPersona(id);
                
                //muestrame los datos de esa persona
                System.out.println("La informacion de la persona es la siguiente: ");
                System.out.println("Id: " + personaSeleccione.getId()
                                   + "Nombre: " + personaSeleccione.getNombre()
                                   + "Edad: " + personaSeleccione.getEdad());
                
                //cuales son los cambios a realizar
                
                System.out.println("Ingrese el nuevo nombre del registro");
                String nuevonombre = entrada.nextLine();
                System.out.println("Ingrese la nueva edad del registro");
                int edadnueva = entrada.nextInt();
                
                //tengo que enviar esos nuevos datos
                
                personaSeleccione.setNombre(nuevonombre);
                personaSeleccione.setEdad(edadnueva);
                
                //ahora mandar a llamar a mi metodo actualizar
                control.actualizarPersona(personaSeleccione);
                
                break;
            case 4:
                //primero busco por el id y luego la borro
                System.out.println("Ingrese el ID de la persona que desea actualizar sus datos");
                int ideliminar = entrada.nextInt();
                
                
                //buscar primero no se nos olvide :3
                
                
                Persona personaEliminar = control.buscarPersona(ideliminar);
                
                control.eliminarPersona(personaEliminar);
                
                System.out.println("Registro eliminado exitosamente");
                
                break;
            default:
                System.out.println("Digite una opcion correcta");
        }
        }while(opcion !=5);
    }
}
