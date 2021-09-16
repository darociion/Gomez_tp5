package gomez_tp5;

/**
 *
 * @author jon gomez
 */
public class Arreglo {
 
    public static void sumarLista(int arreglo[]){
        int sum = 0;
        
        for (int i : arreglo) {
            sum += i;
        }
      
        System.out.println("\nLa suma de todos lo valores contenidos en el arreglo es de: " + sum);
        System.out.println("El promedio es de: " + sum/arreglo.length);
    }
    
    public static int buscarMayor(int matriz[][]){
        int mayor = 0;
        
        for (int[] is : matriz) {
            for (int i : is) {
                if(i > mayor){
                    mayor=i;
                }
            }
        }
         
        return mayor;
    }
    
    public static int cuentaVocales(String s){
        int cantVocal = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                cantVocal++;
            }
        }
        
        return cantVocal;
    }
    
    public static int cuentaCaracter(String s, char c){
        int cantCaracter = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== c){
                cantCaracter++;
            }
        }
        
        return cantCaracter;
    }
    
}
