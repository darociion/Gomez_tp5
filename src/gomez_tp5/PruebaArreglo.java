package gomez_tp5;

import static gomez_tp5.Arreglo.*;

/**
 *
 * @author jon gomez
 */
public class PruebaArreglo {

    public static void main(String[] args) {
        
        int lista[] = {1,2,3,4,5};
        sumarLista(lista);
        
        int matriz[][] = {{1,2,3},{4,5},{6,7},{8},{9,10,11,12}};
        System.out.println("\nEl entero mas grande encontrado en la matriz es: " + buscarMayor(matriz));
        
        System.out.println("\nLa cantidad de vocales es: " + cuentaVocales("Probando este metodo"));
        
        System.out.println("\nLa cantidad de veces que se repite el caracter en la cadena es: " + cuentaCaracter("Probando este metodo",'d'));
    }
    
}
