import java.util.Scanner;
/* Consigna: Se desea una aplicación que solicite 2 números enteros y realice 
la operación de potencia (sin uso de librerías). */

public class L1Ejercicio6 {
    public static void main(String[] args) {
        // Entrada
        System.out.println("POTENCIA NATURAL DE UN NUMERO");
        Scanner scan = new Scanner (System.in);
	    System.out.print("Base Natural: ");
	    int base = scan.nextInt();
	    System.out.print("Exponente Natural: ");
	    int exponente = scan.nextInt();
	    scan.close();

        // Proceso
        int potencia=1;
    
        for (int i=0; i<exponente; i++){
            potencia*=base;
        }      

        // Salida
        System.out.println("RESULTADO: ");
        System.out.println(base+"^"+exponente+"="+potencia);    
    }

}
    