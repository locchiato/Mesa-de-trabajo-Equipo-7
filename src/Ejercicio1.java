import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        Integer numero = scanner.nextInt();
        System.out.println(numeroPrimo(numero));
    }

    public static String numeroPrimo(Integer numero){
        for(Integer i = 2; i <= (numero/2); i++)
            if(esDivisible(numero, i))
                return "No es primo";
        return "Es primo";
    }

    public static boolean esDivisible(int n, int divisor) {
        return n % divisor == 0;
    }

}