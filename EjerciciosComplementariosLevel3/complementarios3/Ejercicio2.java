package complementarios3;
import java.util.Collection;
import java.util.List;
import java.util.stream.*;
import java.lang.Math;

public class Ejercicio2{
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        Stream<Integer> cuadrados = numeros.stream()
        .map(numero -> (int)Math.pow(numero, 2));
        System.out.println(cuadrados.collect(Collectors.toList()));
        

    }
}

        