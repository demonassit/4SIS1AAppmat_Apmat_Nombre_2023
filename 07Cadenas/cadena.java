import java.util.*;

public class cadena {
    
    //como su nombre lo dice las funciones de cadena nos sirven para
    //poder manipular comparar disernir cadenas de texto

    Scanner entrada = new Scanner(System.in);

    //metodo de cadenas
    public void cadenas(){

        String s1 = "habia una vez un patito que decia miau miau, y queria un chocolatito";

        //imprimir
        System.out.println("El tamaño de la cadena es: " + s1.length() );

        //quiero saber si comienza con ???
        System.out.println("La cadena inicia V o F con la palabra Hola? :" 
        + s1.startsWith("Hola"));

        //quiero saber si finaliza con ???
        System.out.println("La cadena finaliza V o F con la palabra chocolatito? " 
        + s1.endsWith("chocolatito"));

        //ahora vamos a asignar una cadena mas a partir de una variable

        System.out.println("Ingresa una palabra: ");
        String s2 = entrada.nextLine();

        //vamos a obtener el indice(donde inicia) las subcadenas de la palabra

        System.out.println("Parte de una subcadena de s1 es: " + s1.indexOf("patito"));

        //expresiones regulares CURP, RFC, MATRICULA, CORREO

        //vamos a sustraer palabras
        System.out.println("Primera parte de s1 " + s1.substring(12));

        System.out.println("Segunda parte de s1 " + s1.substring(14, 20));

        //vamos a convertir una variable lo que sea en una cadena

        int valor = 24;

        //vamos a transformar de int a String

        String s3 = String.valueOf(valor);

        System.out.println("Asi es como se convierte un valor de : " 
        + valor + " en una cadena " + s3 );

        // si es un int 2 + 2 = 4 
        //si es una cadena 2 + 2 = 22

        //ahora alreves de una cadena a cualquier valor

        String s4 = "20";

        int numero = Integer.parseInt(s4);

        System.out.println("Asi es como se convierte una cadena de : " 
        + s4 + " en un un valor " + numero );

        int suma = valor + numero;

        System.out.println(suma);

        //ahora con dobles

        String s5 = "542.265";

        Double numero1 = Double.parseDouble(s5);

        System.out.println(numero1);

        numero1 = valor + numero1;

        System.out.println(numero1);

        //vamos a convertir otra forma un numero entero en una cadena

        Integer x = 5;

        System.out.println("El valor de " + x.toString() + " ahora es una cadena");

        System.out.println("Otra forma de transformarlo " 
        + Integer.toString(12) + " ahora es una cadena");
    }
}
