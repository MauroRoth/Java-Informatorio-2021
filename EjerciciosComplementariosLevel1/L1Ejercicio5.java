import java.util.Scanner;
/* Consigna: Se desea una aplicación que solicite 2 números enteros y 
realice la operación de multiplicación por sumas sucesivas (sin uso de librerías). */

public class L1Ejercicio5 {
    public static void main(String[] args) {
        // Entrada
        System.out.println("MULTIPLICACIÓN POR SUMAS SUCESIVAS: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Primer Factor Entero: ");
        int numero1 = scan.nextInt();
        System.out.print("Segundo Factor Entero: ");
        int numero2 = scan.nextInt();
        scan.close();
        
        // Proceso
        int multiplicacion=0;
        for (int i=1; i<=numero2; i++){
            multiplicacion+=numero1;
            }       
        
        // Salida
        System.out.println("RESULTADO: ");
        System.out.println(numero1 + " X "+numero2+" = "+multiplicacion);               
    }
}

