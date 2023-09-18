//debe de tener una clase
//public class   class?

//variable   int num por defecto es publico   public int num
//libreria
import java.io.*;


class EntradaTexto{

    //debe de existir un metodo principal
    public static void main(String[] args) throws IOException {
        //debemos de crear una estructura basica
        //declaracion 
        char nombre;
        //mensaje para el usuario
        System.out.print("Por favor ingresa tu nombre:             ");
        //ln es para salto de linea

        //asignar que operacion o comportamiento le voy a otorgar a la variable
        //nombre = System.console().readLine();
        nombre = (char)System.in.read();

        //System es la clase del sistema
        //console()  es el metodo que puede obtener los datos de la consola
        //readLine() es el metodo que puede dar lectura a los datos introducidos en la consola

        System.out.print("Hola " + nombre + " Bienvenido a tronar wiii ");

    }

}