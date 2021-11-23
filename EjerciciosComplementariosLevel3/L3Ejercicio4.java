import java.util.List;
import java.util.stream.Collectors;
/* Se dispone de una lista de Integer, de la cual queremos obtener otra lista
aplicando la operación de factorial pero no se desean valores repetidos. */
public class L3Ejercicio4 {
    public static void main (String [] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        List<Integer> factorialList = numeros.stream()
        .map(L3Ejercicio4::factorial)
        .distinct()
        .collect(Collectors.toList());
    System.out.println(factorialList);
    }
    public static int factorial(int numero) {
        int fact = 1;
        if(numero==0){
            return 1;
        }
        else{
            for( int i = 1; i <= numero; i++ ) {
                fact *= i;
            } 
            return fact; 
        }
    }
}
