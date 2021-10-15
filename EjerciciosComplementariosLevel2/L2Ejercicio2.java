import java.util.*;
/* Consigna: Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero
al principio de la lista y otro al final. Por último, iterar e imprimir los
elementos de la lista y el tamaño de la misma (antes y después de agregar a 
en la primera y última posición).*/

public class L2Ejercicio2 {
	public static void main(String[] args) {
        // Entrada.
		List<Integer> numeros = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
        System.out.println("INGRESO DE NUEVOS NUMEROS EN UNA LISTA");
        System.out.println("Ingrese 5 Números:");
            // Primeros 5 números.
		int j = 5;
		int numero = 0;
		for (int i = 0; i <j; i++) {
			System.out.print("Número" + (i+1)+": ");
			numero = scan.nextInt();
			numeros.add(numero);		
		}
            // Tamaño incial de la lista y salida.
		System.out.println(numeros);
		int largoInicial = numeros.size();
        System.out.println("Largo inicial de la lista: " + "" + largoInicial);
            // Nuevos ingresos.
		System.out.print("Ingrese numero al incio: ");
		int pinicial = scan.nextInt();
		numeros.add(0, pinicial);
		System.out.print("Ingrese numero al final: ");
		int pfinal = scan.nextInt();
		numeros.add(pfinal);
            // Tamaño final de la lista y salida.
        System.out.println(numeros);
		int largoFinal = numeros.size();
        System.out.println("Largo final de la lista: " + "" + largoFinal);

		scan.close();
	}	
}


