import java.util.Scanner;

public class CadenaInvertida {
    
    //obejto para la entrada detos
    Scanner entrada = new Scanner(System.in);

    public void cadenaInvertidaPalabras(){
        String cadena = "";

        System.out.println("Ingresa la oracion que deseas invertir: ");

        cadena = entrada.nextLine();

        //el chiste es poder invertir la cadena que ingresa el usuario

        String invertida = "";

        //habia una vez un patito
        //con un ciclo for

        for(int i = cadena.length()-1; i >= 0; i--){
            //obtengo los caracteres de la cadena
            char car = cadena.charAt(i);
            //lo concateno
            invertida += car;
        }
        
        System.out.println("Cadena invertida es : " + invertida);
    }

}
