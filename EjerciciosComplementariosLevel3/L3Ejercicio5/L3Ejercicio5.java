package L3Ejercicio5;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class L3Ejercicio5 {
    public static void main(String [] args) {
        List<Alumno> alumnos = List.of(
            new Alumno("Homero", "Simpson",LocalDate.now().minusYears(30)),
            new Alumno("Bart", "Simpson", LocalDate.of(2021, 2, 10)),
            new Alumno("Lisa", "Simpson", LocalDate.of(1956, 5, 12)),
            new Alumno("Maggie", "Simpson", LocalDate.of(2001, 11, 23)),
            new Alumno("Marge", "Bouvier", LocalDate.of(1954, 2, 5)),
            new Alumno("Marvin", "Monroe", LocalDate.of(1945, 10, 21)));
        Map<String, Integer> alumMap = alumnos.stream()
            .collect(Collectors
            .toMap(p->keyMapper(p.getApellido(),p.getNombre()), 
                    p->valueMapper(p.getFechaDeNacimiento())));
        System.out.println(alumMap);
    }

    public static String keyMapper(String apellido, String nombre) {
        String text=apellido+" "+nombre;
        return text;
    }
    
    public static int valueMapper(LocalDate fechaDeNac) {
        Calendar ahora = Calendar.getInstance();
        int edad = ahora.getWeekYear() - fechaDeNac.getYear() -1;
        int mes = ahora.get(Calendar.MONTH) + 1 - fechaDeNac.getMonthValue();
        int dia = ahora.get(Calendar.DAY_OF_MONTH) - fechaDeNac.getDayOfMonth();

        if (mes==0) {if (dia==0 || dia>0){edad+=1;}}
        if (mes>0) {edad+=1;}
      
        return edad;
        }    
}
