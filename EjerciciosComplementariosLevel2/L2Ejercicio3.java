import java.util.*;
/* Consigna: Crear una lista que contenga como elementos la numeración de cartas de una
baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList
(en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar)
el arrayList y volver a imprimir. Ayuda: ArrayList implementa la interface 
Collection, existe algún método que me permita hacer la operación sort (mezclar)
aleatoriamente? Idem para el reverso. */

public class L2Ejercicio3 {
	public static void main(String[] args) {
		System.out.println("CARTAS FRANCESAS");
        List<Integer> baraja = new ArrayList<>();
		int j = 13;
		for (int i = 0; i <j; i++) {
			/*System.out.println(i+1);*/
			baraja.add(i+1);
						}
	System.out.println("Baraja francesa en orden creciente "+baraja);
	Collections.reverse(baraja);
	System.out.println("Baraja francesa en orden decreciente "+baraja);
	Collections.shuffle(baraja);
	System.out.println("Baraja francesa mezclada "+baraja);
	}
}
