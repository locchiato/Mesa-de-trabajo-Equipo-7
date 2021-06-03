import java.util.Scanner;

public class Ejercicio2 {
    /*Ejercicio 2
    Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
            Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
            unNumeroC)
    Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
    el resultado.
    */

    public static void main(String[] args) {
        Integer[] numeros = obtenerNumeros(3);

        Integer maximo = maximoEntreTresNumeros(numeros[0], numeros[1], numeros[2]);

        System.out.println("El maximo es: " + maximo);
    }

    private static Integer[] obtenerNumeros(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numeros = new Integer[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese numero " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        return numeros;
    }

    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
            unNumeroC) {

        return Math.max(Math.max(unNumeroA, unNumeroB), unNumeroC);
    }
}
