import java.util.List;
import java.util.stream.Collectors;
import java.lang.Math;
/* Dada una lista que contiene números enteros, se deberá generar otra lista que
contendrá el resultado de aplicar la operación de potencia a 2. */
public class L3Ejercicio2 {
    public static void main(String [] args){
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        List<Integer> potencia2 = numeros.stream()
            .map(n -> (int)Math.pow(n,2)).collect(Collectors.toList());
        System.out.println(potencia2);
    }
}
