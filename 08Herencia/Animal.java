
//vamos a crear una tiendita de mascotas de adopcion

public class Animal {

    /*
     * Principio de encapsulamiento 
     * es poder restringir el acceso a los datos, vamos a poder agrupar en una clase
     * el acceso a los diferentes atributos y metodos u objetos de la clase, para que no
     * puedan ser modificados desde otro lugar
     */

    //definir las variables
    private String nombre, raza, tipo_alimento;
    private int edad;

    //se debe de crear el constructor, el constructor nos sirve para poder declarar
    //la existencia de una clase, para poder inicializar las variables, para crear
    //instancias de una clase

    public Animal(){
        //este es un constructor por defecto
    }

    //cuando existe una construccion del objeto, de acuerdo a las necesidades
    //por parte usuario es necesario utilizar la sobrecarga de los metodos
    //en este caso la sobrecarga del constructor

    //metodo para registrar la mascota
    //los parametros del registro
    public Animal(String nom, String raza, String tipo_alimento, int edad){
        //pero como son privados los atributos, debemos de tener una forma de acceso
        //la palabra reservada this, nos sirve para poder acceder a los atributos
        //privados
        this.nombre = nom;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
    }

    //para poder modificar los valores de la asignacion, es necesario utilizar 
    //los metodos getter and setter
    //get --- obtener --- recibir
    //set --- asignar --- enviar

    //metodos get y set por cada variable
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getTipo_Alimento(){
        return tipo_alimento;
    }

    public void setTipo_Alimento(String tipo_alimento){
        this.tipo_alimento = tipo_alimento;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    
}
