import java.util.*;
/* Consigna: Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
aparece una letra dada. */

public class L1Ejercicio9 {

    public static void main(String[] args){
        // Entrada.
        System.out.println("REPITENCIA DE UNA LETRA");
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = scan.nextLine();
        System.out.print("Introduce una letra: ");
        char caracter = scan.next().charAt(0);
        scan.close();
        
        // Proceso.
        char caracterMayus= Character.toUpperCase(caracter);
        String textoMayus= texto.toUpperCase();
        
        int numeroDeVeces=0;
        for (int i = 0; i < texto.length(); i++) {
            if(textoMayus.charAt(i)==caracterMayus){
                numeroDeVeces+=1;
            }
        }
        // Salida.
        System.out.println("Número de veces que la letra se repite: "+numeroDeVeces);     
    }
}
