import java.util.Scanner;
/* Consigna: Realizar un programa que solicite por consola 2 números enteros. 
Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo 
(resto de la división) de ambos números. */

public class L1Ejercicio2 {
    public static void main(String[] args) {
        // Entrada
        System.out.println("OPERACIONES");
        Scanner scan = new Scanner(System.in);
        System.out.println("\nINGRESE NUMEROS ENTEROS: ");
        System.out.print("Primer Entero: ");
        int num1 = scan.nextInt();
        System.out.print("Segundo Entero: ");
        int num2 = scan.nextInt();
        scan.close();
        
        // Proceso, manejo de la excepcion aritmetica y salida.
        int suma=0, resta=0, multiplicacion=0, divisionEntera=0, modulo=0;
        System.out.println("\n RESULTADOS: ");
        suma=num1+num2;
        System.out.println("Suma " + suma);
        resta=num1-num2;
        System.out.println("Resta " + resta);
        multiplicacion=num1*num2;
        System.out.println("Multiplicacion " + multiplicacion);

        try {
            divisionEntera=num1/num2;
            System.out.println("División Entera: " + divisionEntera);
            modulo=num1%num2;
            System.out.println("Módulo:  " + modulo);
        } catch (Exception e) {
            // Salida en el caso de excepcion division por cero.
            System.out.println("No es posible la división entre cero!!!");
            System.out.println("No es posible calcular el módulo!!!");
        }       
    }  
}