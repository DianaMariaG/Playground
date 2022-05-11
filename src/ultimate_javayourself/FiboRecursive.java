package ultimate_javayourself;
/**
 * Scrieti intr-o clasa o metoda care primeste un parametru numeric n >= 0
 * si returneaza al n-lea element din sirul lui Fibonacci. Daca n este negativ metoda returneaza -1.
 */
public class FiboRecursive {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(n));

    }
    public static int fibo(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n ==1 || n == 2) {
            return 1;
        } else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}