import java.util.Scanner;
/* Consigna: Crear una aplicación que solicite de entrada los datos de una persona
y los muestre en un formato determinado. */
public class L1Ejercicio8 {
    public static void main(String [] args) {
        // Entrada.
        System.out.println("DATOS DE PERSONA");
        Scanner scan = new Scanner (System.in);
        System.out.print("Nombre y Apellido: ");
        String nombreYApellido = scan.nextLine();
        System.out.print("Edad: ");
        String edad = scan.nextLine();
        System.out.print("Direccion: ");
        String direccion = scan.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = scan.nextLine();
        scan.close();

        // Salida
        System.out.println("\nSalida:\n");
        System.out.println(ciudad + " - "+ direccion + " - " + nombreYApellido +" - "+ edad);
    }
}
