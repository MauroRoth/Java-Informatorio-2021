import java.util.*;
/* Consigna: A partir de una lista de empleados cargados en un HashSet, 
calcular el sueldo de cada uno y y almacenarlos en un Map */

public class L2Ejercicio6 {

    public static void main(String[] args)  {
        // Entrada
        System.out.println("USO DE SET Y MAP");
        Set<String> empleados = new HashSet<>();
        
        empleados.add("Roth Mauro, 30430511, 2, 300");
        empleados.add("Dino Barto, 30522666, 6, 600");
        empleados.add("Tatiana Mija, 14315699, 5, 1200");
        empleados.add("Jose Lopez, 9365899, 1, 305000");
        
        // Proceso
        Map<String, Integer> haberes = new HashMap<String, Integer>();
        
        for(String empleado : empleados){
            String[] partes= empleado.split(", ");
            int horasTrab= Integer.parseInt(partes[2]);
            int valorHora = Integer.parseInt(partes[3]);
            int sueldo= horasTrab*valorHora;
            haberes.put(partes[1], sueldo);
        }
        // Salida
        System.out.println("Map Clave(DNI)=Valor(Sueldo): "+haberes);
    }
}

        