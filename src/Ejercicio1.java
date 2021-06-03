import java.util.Scanner;

public class Ejercicio1 {

    /*
    Ejercicio 1
    Hacer una función que dado un número indica si es un número primo o no. Un número
    primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
    ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir
    por 1 y por 17.
    Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
    función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
    obtenida en el ejercicio desarrollado en la clase asincrónica.
    boolean esDivisible(int n, int divisor)
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        Integer numero = scanner.nextInt();
        esPrimo(numero);
    }

    public static void esPrimo(Integer numero){
        boolean esPrimo = true;
        for(int i = 2; i <= (numero/2); i++)
            if (esDivisible(numero, i)) {
                esPrimo = false;
                break;
            }
        System.out.print("El número ingresado " + (esPrimo ? "" : "no ") + "es primo.");
    }

    public static boolean esDivisible(int n, int divisor) {
        return n % divisor == 0;
    }

}