/*
Vamos a crear un programa mediante el cual debamos tener un menu 
de seleccion para elegir alguna de las 14 opciones siguientes:
1.- Bono o descuento por edad
2.- Convertir numeros decimales a binarios
3.- Convertir Temperaturas
4.- Numero de positivos y negativos
5.- Tiendita
6.- Area y Perimetro
7.- Tabla
8.- Factorial
9.- Dibujitos
10.- Figura Hueca
11.- Patron
12.- Diamante
13.- Calculadora
14.- Salir
 */

//declarar son las librerias que vamos a ocupar
//se debe estructurar el tipo de dato acorde a su entrada
//si es entero obtenerlo como entero, si char obtenerlo como caracter, 
import java.util.Scanner;

class EstructurasControl{
    //si declaramos aqui las variables son globales

    //metodo principal
    public static void main(String[] args){
        //el manejo de objetos, nos ayuda a poder instancear, (mandando a llamar al objeto)
        //para hacer una instancia, es necesario 1.- Identificar el tipo objeto
        //2.- nombrar al objeto
        //3.- Crear al objeto
        Scanner entrada = new Scanner(System.in);
        //crear una instancia del objeto de la entrada por defecto de la computadora
        //vamos a identificar con Scanner el tipo de dato que se esta instanceando
        //entrada es el objeto que va a poder identificar si es int, double, flot, etc

        //es declarar a las variables que se van a utilizar en el programa
        //las variables son de dos tipos globales y locales
        //si la declaro dentro de un metodo es local

        int opcion, numbinario, total, cantidadproducto, num1;
        float precio, resultado, compra=0;
        String nombreproducto;
        String binario = "";
        char letra;

        do{
            //aqui va el menu del programa
            System.out.println("Bienvenido al programa :3 ");
            System.out.println("Elije alguna opcion deseada: ");
            System.out.println("1.- Descuento por edad ");
            System.out.println("2.- Convertir numero decimal a binario "); //mio
            System.out.println("3.- Convertir Temperaturas ");
            System.out.println("4.- Numeros Positivos y Negativos ");
            System.out.println("5.- Tiendita ");//mio
            System.out.println("6.- Area y Perimetro ");
            System.out.println("7.- Tabla "); //mio
            System.out.println("8.- Factorial ");
            System.out.println("9.- Dibujito "); //mio
            System.out.println("10.- Figura Hueca ");
            System.out.println("11.- Patrones de Codigo ");
            System.out.println("12.- Diamante ");
            System.out.println("13.- Calculadora ");
            System.out.println("14.- Salir ");

            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                    break;
                case 2:
                    //decimal a binario
                    System.out.println("Ingresa un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    //primero tengo que saber que sea positivo?
                    if(numbinario > 0){
                        //se cuantas veces el numero se va a dividir entre 2?
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario = "0" + binario;
                            }else{
                                binario = "1" + binario;
                            }
                            numbinario = (int)numbinario/2;
                        }
                        
                    }else if(numbinario == 0 ){
                        binario = "0" + binario;
                    }else{
                        binario = "No se puede convertir un numero negativo, solo positivos";
                    }
                    System.out.println("El numero binario es: " + binario);
                    break;
                case 3: 
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Bienvenido a la tiendita Kawaii");
                    System.out.println("Por favor ingrese el numero de productos que desea comprar?");
                    total = entrada.nextInt();

                    for(int i = 1; i <= total; i++){
                        System.out.println("Ingrese el nombre del producto: ");
                        nombreproducto = entrada.next();
                        System.out.println("Ingrese el precio: ");
                        precio = entrada.nextFloat();
                        System.out.println("Ingrese la cantidad del producto: ");
                        cantidadproducto = entrada.nextInt();
                        // operacion
                        resultado = precio * cantidadproducto;
                        compra = compra + resultado; // compra += resultado;
                        
                    }
                    System.out.println("El total de la compra es: " + compra);
                    compra = 0;
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                default:
                    System.out.println("Elija una opcion valida por fis");
                    break;
            }



            //aqui adentro de preguntar
            System.out.println("Deseas repetir el programa?, escribe s para si");
            //vamos a leer el primer caracter de la entrada por defecto de la computadora
            letra = entrada.next().charAt(0);

        }while(letra == 's' || letra == 'S');
    }
}