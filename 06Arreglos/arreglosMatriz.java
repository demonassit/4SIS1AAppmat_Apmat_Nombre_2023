import java.util.*;

public class arreglosMatriz {

    public static void main(String[] args){
        /*
        vamos a realizar un arreglo unidimensional y correrlo para ver que hay 
        en cada elemento 
        
         

        //como se define un arreglo
        int arreglo[] = new int[10];
        //estoy definiendo un arreglo de enteros de tamaño 10

        int valor;

        Scanner entrada = new Scanner(System.in);

        //vamos a recorrerlo con un bucle, debido a que conocemos el num de elementos

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingresa el valor de la posicion del arreglo : ");
            arreglo[i] = entrada.nextInt();
        }

        //para saber que almacenamos
        for(int j = 0; j < arreglo.length; j++){
            System.out.println("El valor almacenado es : " + arreglo[j] + " valor ");
            
        }
        */
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        //primero tenemos que ingresar los valores de la matriz
        for(int i = 0; i < matriz.length; i++){
            //filas
            System.out.println(i);
            for(int j = 0; j < matriz.length; j++){
                //columnas
                System.out.println(j);
                System.out.println("Ingresa el valor de la fila : " + i
                + "ingresa el valor de la columna : " + j);
                matriz[i][j] = entrada.nextInt();
            }
        }

        //vamos a sumar y promediar 
        float sumarFilas = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                //sumo las filas
                sumarFilas += matriz[i][j];
                //imprimo el reultado con formato
                System.out.println(String.format("%d", matriz[i][j]));
            }
            //existen diferentes tipos de formato
            //%d es int   %s es string  %c es char   %f es float
            System.out.println(String.format("\n La suma de las filas %f, El promedio de la fila %.2f", sumarFilas, sumarFilas/matriz.length));
        }


    }
    
}
