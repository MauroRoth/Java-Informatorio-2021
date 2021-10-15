/* Consigna: Dados 2 ArrayList que contienen horas-trabajadas (array1)
 y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado.
 Se debe generar otra lista que contenga los totales y luego imprimir el total
  final a cobrar. 
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]
Los arrays son iguales y corresponden a los días trabajados de una semana Lun-Vie.*/

import java.util.*;

public class L2Ejercicio5 {
       public static void main(String[] args) {
            System.out.println("SUELDO=HS TRBAJADAS X VALOR HORA");
           ArrayList<Integer> horasTrab = new ArrayList<>();
           horasTrab.add(6);
           horasTrab.add(7);
           horasTrab.add(8);
           horasTrab.add(4);
           horasTrab.add(5);
   
           ArrayList<Integer> valorHora = new ArrayList<>();
           valorHora.add(350);
           valorHora.add(345);
           valorHora.add(550);
           valorHora.add(600);
           valorHora.add(320);
   
           ArrayList<Integer> totales = new ArrayList<>();
           int total=0;
   
           for (int i = 0; i < horasTrab.size(); i++) {
               int tot=horasTrab.get(i)*valorHora.get(i);
               totales.add(tot);
               total+=totales.get(i);
                                                         }
           System.out.println("Totales="+totales);
           System.out.println("TOTAL="+total);
   
       }
 }