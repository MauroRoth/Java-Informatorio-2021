package complementarios3;
import java.util.Collection;
import java.util.List;
import java.util.stream.*;
import java.lang.Math;

public class Ejercicio4{
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        List<Integer> factorial = numeros.stream()
        .filter(numero->numero<2)
        .map(numero->numero=1)
        .collect(Collectors.toList());
        System.out.println(factorial);
        

    }
}