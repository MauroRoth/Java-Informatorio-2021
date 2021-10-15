import java.util.Scanner;
/* Consigna: Solicitar por consola el nombre del usuario e imprimir 
por pantalla el siguiente mensaje “HOLA {USUARIO}!!!” */

public class L1Ejercicio1 {
    public static void main(String[] args) {
        // Entrada
        System.out.println("SALUDO");
        System.out.print("Usuario: ");
        Scanner scan = new Scanner(System.in);
        String nombreUsuario = scan.nextLine();
        scan.close();
        // Salida
        System.out.println("Hola " + nombreUsuario);
    }
    
}