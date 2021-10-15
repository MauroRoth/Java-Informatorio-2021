import java.util.Scanner;
/* Consigna: Realizar un programa que dado un String de entrada en minúsculas lo
convierta por completo a mayúsculas. Sin uso de métodos o librerías que
realicen toUppercase(). */

public class L1Ejercicio7 {
    public static void main(String [] args) {
        // Entrada
        System.out.println("CONVIERTE MINÚSCULAS EN MAYÚSCULAS");
        Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese una palabra en minuscula: ");
        String palabra = scan.nextLine();
        scan.close();
        
        // Proceso
        String palabraConvertida="";
        char caracteres='a';
        for (int i = 0; i < palabra.length(); i++){
            if ('a' <= palabra.charAt(i) && palabra.charAt(i) <= 'z'){
            caracteres= (char)(palabra.charAt(i)-32);
            }
            else{
                caracteres= (char)(palabra.charAt(i));
            }
            palabraConvertida+=caracteres;
        }
        
        // Salida
        System.out.println(palabraConvertida);
        
    }
        
}
