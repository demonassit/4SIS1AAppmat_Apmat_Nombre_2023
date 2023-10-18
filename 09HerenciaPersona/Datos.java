//datos es un controlador, su nombre lo dice es una clase
//que se encarga de poder controlar las entradas o salidas
//de los datos, es la que se encarga de la manipulacion

import javax.swing.JOptionPane;

public class Datos {

    //lo primero que necesitamos es una instancia de estudiante
    Estudiante obj[] = new Estudiante[10];

    int x = 0;

    //creamos el menu
    void menu(){
        String var = "si";
        String mensaje = "";

        while(var.equalsIgnoreCase("si")){
            int op = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa la opcion deseada: \n "
                + "1.- Dar de alta un nuevo estudiante.\n"
                + "2.- Mostrar los datos de los estudiantes\n"));

            switch(op){
                case 1:
                    //necesito un metodo para solicitar la informacion
                    pedirEstudiante();
                    break;
                case 2:
                    //necesito un metodo para mostrar la informacion
                    mostrarEstudiante();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
            mensaje = JOptionPane.showInputDialog("Deseas repetir");

        }
    }

    public void pedirEstudiante(){
        //solicito los datos
        int numbol = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingresa el numero de boleta del estudiante"));
        String nom = JOptionPane.showInputDialog(
                "Ingresa el nombre del estudiante");
        int edad = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingresa la edad del estudiante"));
        char gen = JOptionPane.showInputDialog(
                "Ingresa el genero del estudiante").charAt(0);

        //los agrego a mi arreglo
        //en este arreglo estoy guardando los datos del estudiante
        obj[x] = new Estudiante(numbol, nom, edad, gen);
        x++;
    }

    public void mostrarEstudiante(){
        //necesito usar el get para cada uno de los datos guardados en el arreglo
        for(int i = 0; i < x; i++){
            //visualizo
            JOptionPane.showMessageDialog(null, 
            "La boleta del estudiante es: " + obj[i].getnumBoleta() + "\n"
            + "El nombre del estudiante es: " + obj[i].getNombre() + "\n"
            + "La edad del estudiante es: " + obj[i].getEdad() + "\n"
            + "El genero del estudiante es: " + obj[i].getGenero() + "\n");
        }
    }












    
    
}
