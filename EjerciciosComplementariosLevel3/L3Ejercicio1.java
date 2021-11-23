import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
/* Dada una lista que contiene valores de tipo String, se deberá filtrar todos los
valores que NO sean null o vacío (""). */
public class L3Ejercicio1 {
    public static void main(String [] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        List <String> palabrasSi = palabras.stream()
            .filter(p -> p != null & p != "").collect(Collectors.toList());
        System.out.println(palabrasSi);
    }
}