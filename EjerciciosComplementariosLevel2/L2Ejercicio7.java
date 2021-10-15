import java.util.Scanner;
/* Consigna: Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”. */

public class L2Ejercicio7 {
    public static void main(String [] args){
        // Entrada
        System.out.println("FIZZ BUZZ FUNCTION");
        Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese Primer Valor: ");
        int primerValor = scan.nextInt();
        System.out.print("Ingrese Segundo Valor: ");
        int segundoValor = scan.nextInt();
        scan.close();
        // Proceso y Saldida: un método y una función.
        System.out.println("Salida: ");
        muestraArray(fBFunction(primerValor,segundoValor));
    }
    // Método que imprime los elemento del array.
    public static void muestraArray(String[] a){
        System.out.print("[");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print('"'+a[i]+'"'+',');
        } 
        int i = a.length-1;
        System.out.print('"'+a[i]+'"'+']');   
    }
    // Función solicitada en consigna.
    public static String[] fBFunction(int a, int b){
        int n=0;
        if (a>b){
            n=1;
        }
        else{
            for(int i=a;i<b;i++){
                n+=1;
            }
        }

        String [] secuencia= new String[n];
        if (a>b){
            secuencia[0]="Error: a > b";
        }
        else{
            int j=0;
            for(int i=a; i<b; i++){               
                if (i%2==0){
                    secuencia[j]="Fizz";
                }
                if (i%3==0){
                    secuencia[j]="Buzz";
                }
                if(i%2==0 && i%3==0){
                    secuencia[j]="FizzBuzz";
                }
                if(i%2!=0 && i%3!=0){
                    secuencia[j]=String.valueOf(i);
                }
                j++;
            }    
        }
        return secuencia;
    }
}
