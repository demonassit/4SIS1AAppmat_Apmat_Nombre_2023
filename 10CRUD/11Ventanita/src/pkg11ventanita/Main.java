/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11ventanita;

/**
 *
 * @author demon
 */
//vamos a ver el uso de interfaces
import javax.swing.*;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //para ocupar interfaces necesitamos primero un
        //frame
        JFrame ventana = new JFrame("Hola Mundo");
        
        //hay que definir el tamaño en px de largo y ancho
        
        ventana.setSize(370, 170);
        
        //hay que definir los botones de accion por defecto
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //necesito donde incorporar los componentes
        //los componentes son los botones, los cuadros de texto, etc
        
        JPanel panel = new JPanel();
        
        ventana.add(panel);
        
        //tengo que crear un metodo para ir cargando cada componente a ese panel
        agregarComponentes(panel);
        
        //tenemos que hacer visible la ventana, pq sino no se vera
        ventana.setVisible(true);
        
    }

    private static void agregarComponentes(JPanel panel) {
        //lo primero que tenemos que hacer es inicializar el panel
        panel.setLayout(null);
        
        //vamos agregar componentes al panel
        //quiero una etiqueta
        JLabel userlabel = new JLabel("Nombre de usuario");
        
        //ya que tenemos la etiqueta debemos definir sus propiedades
        //el tamaño, la orientacion, el tipo de letra, largo, ancho, etc
        userlabel.setBounds(10, 10, 120, 50);
        
        //lo agregamos al panel
        panel.add(userlabel);
        
        //campo de texto
        JTextField usertxt = new JTextField(20);
        //defino sus propiedades
        usertxt.setBounds(160, 20, 160, 25);
        //lo agrego
        panel.add(usertxt);
        
        //etiqueta de password
        JLabel userpass = new JLabel("Password");
        userpass.setBounds(10, 40, 80, 50);
        panel.add(userpass);
        
        
        //agregamos campo de password
        JTextField passtxt = new JTextField(20);
        passtxt.setBounds(160, 50, 160, 25);
        panel.add(passtxt);
        
        //agregamos los botones
        JButton loginbutton = new JButton("Iniciar Sesion");
        loginbutton.setBounds(10, 80, 120, 25);
        panel.add(loginbutton);
        
        JButton registrobutton = new JButton("Registrate");
        registrobutton.setBounds(180, 80, 120, 25);
        panel.add(registrobutton);
    }
    
    /*
    Tarea
    
    Deberan de integrar un metod para que la ventana quede 
    exactamente en el centro cuando se ejecuta el programa
    
    el password no debe de ser visible deben aparecer ******
    
    hace tiempo vimos operaciones con cadena donde yo puedo comparar
    dos cadenas
    
    deberan de crear un usuario ficticio con user y pass
    cuando se ingresen en los campos correspondientes y el usuario
    de clic en iniciar sesion, debera de enviar un mensaje que diga
    "Bienvenido", y si no es correcta la credencial que diga 
    "Usuario invalido"
    
    */
    
}
