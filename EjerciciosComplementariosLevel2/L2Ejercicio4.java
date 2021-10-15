import java.util.*;
/* Consigna: Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos. */
public class L2Ejercicio4 {

    public static void main(String [] args) {
        System.out.println("ALUMNOS SUBLISTAS");
        Scanner scan = new Scanner (System.in);
        ArrayList<String> alumnos = new ArrayList<>();

        int cantidadAlumnos = 12;
        int a, b, c, d;
        a=0*cantidadAlumnos/3;
        b=1*cantidadAlumnos/3;
        c=2*cantidadAlumnos/3;
        d=3*cantidadAlumnos/3;

        String alumno;
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Alumno"+(i+1)+": ");
            alumno = scan.nextLine();
            alumnos.add(alumno);
        }
        scan.close();
        System.out.print("Alumnos:" +alumnos+"\n");
        List <String> subAlumnos1 = alumnos.subList(a, b);
        List<String> subAlumnos2 = alumnos.subList(b, c);
        List<String> subAlumnos3 = alumnos.subList(c, d);
        System.out.println("Primer curso: " + "" + subAlumnos1);
        System.out.println("Segundo curso: " + "" + subAlumnos2);
        System.out.println("Tercer curso: " + "" + subAlumnos3);

    }

}    