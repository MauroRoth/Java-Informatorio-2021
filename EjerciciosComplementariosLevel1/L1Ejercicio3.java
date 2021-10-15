import java.util.Scanner;
/*Consigna: Confeccionar un programa que dado un número entero como dato 
de entrada imprima la secuencia de números (incrementos de 1) de la siguiente forma: */

public class L1Ejercicio3 {
    public static void main(String[] args) {
        // Entrada.
        System.out.println("SERIE ESCALERA NUMEROS");
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un Número Entero: ");
        int numero = scan.nextInt();
        scan.close();
        
        // Proceso y Salida.
        System.out.println("\n Salida: ");
        for (int i=1; i<=numero; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }                
    }
}
