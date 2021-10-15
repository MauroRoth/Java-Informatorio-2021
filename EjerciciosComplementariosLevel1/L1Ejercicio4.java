import java.util.Scanner;
/*Consigna: Realizar un programa que calcule el factorial de un número.*/

public class L1Ejercicio4 {
    public static void main(String[] args) {
        // Entrada.
        Scanner scan = new Scanner(System.in);
        System.out.print("FACTORIAL DE UN NUMERO\nNumero Entero (<10): ");
        int numero = scan.nextInt();
        scan.close();

        // Proceso: Cálculo del Factorial (forma iterativa).
        int factorial=1; 

        for (int i=1; i<=numero; i++){
            factorial*=i;
            }
        
        // Salida.
        System.out.println("Factorial de "+numero+" es "+factorial);               
    }
}
