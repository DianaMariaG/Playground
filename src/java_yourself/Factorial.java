package java_yourself;
/**
 * Scrieti intr-o clasa numita TestBA3 o metoda care primeste ca parametru un numar si returneaza factorialul lui (n!).
 * Factorialul unui numar n este produsul tuturor numerelor de la 1 pana la n. (n! = 1 x 2 x 3 x .... x n)
 * Factorialul lui 0 este 1, deci pentru n = 0 metoda trebuie sa returneze 1
 */
public class Factorial {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(factorial(0));

    }

    public static int factorial(int n) {
        int factorial = 1;
        int aux = 1;
        if (n != 0) {
            while (aux <= n) {
                factorial = factorial * aux;
                aux++;
            }
        }
        return factorial;
    }
}

