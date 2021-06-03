import java.util.Scanner;

public class Ejercicio3 {
    /*
    Ejercicio 3
    Escribir una función:
    boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
    que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
    false, en caso de que coincidan. */

    public static void main(String[] args) {
        String[] cadenas = obtenerStrings(2);
        System.out.println("Ignorando mayusculas y minusculas...");
        System.out.print("Las cadenas de texto ingresadas son ");
        if(cadenasDeTextoDistintas(cadenas[0], cadenas[1])){
            System.out.println("distintas.");
        } else {
            System.out.println("identicas.");
        }
    }

    private static String[] obtenerStrings(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        String[] numeros = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese cadena " + (i+1) + ": ");
            numeros[i] = scanner.nextLine();
        }
        return numeros;
    }

    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) {
        return (unTextoA.toLowerCase()).compareTo(unTextoB.toLowerCase()) != 0;
    }

}
