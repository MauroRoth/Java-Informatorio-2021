import java.util.*;
/* Consigna: Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
luego imprimir por pantalla el ranking */

public class L2Ejercicio1 {
    public static void main(String [] args) {
        // Entrada
        ArrayList<String> ciudades = new ArrayList<>();
        System.out.println("CIUDADES ARGENTINAS");
        System.out.println("Ingrese Ciudades Argentinas: \n(NO para terminar.)");

        Scanner scan = new Scanner (System.in);
        String ciudad;
        String bandera= "NO";
        int bandera2=1;
        do{
            System.out.print("Ingrese una Ciudad: ");
            ciudad = scan.nextLine();
            
            if(ciudad.equals(bandera)){
                bandera2=0;
            }
            else{
                ciudades.add(ciudad);
            }     
        }while(bandera2!=0);
        scan.close();

        // Salida
        System.out.println("\nRanking de Ciudades:");
        for(int i=0;i<ciudades.size(); i++){
            System.out.println("#"+(i+1)+" "+ciudades.get(i));
        }
                      
    }
}
        
