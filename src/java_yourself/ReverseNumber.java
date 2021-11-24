package java_yourself;
/**
 * Scrieti o metoda care primeste ca parametru un numar pozitiv intreg n si returneaza numarul respectiv inversat.
 * Daca numarul inversat incepe cu 0 se vor taia zerourile pana la prima cifra diferita de 0. Daca numarul inversat e 0 metoda returneaza 0.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(new Integer (012)));
    }

    public static int reverse(Integer n) {
        int reversed = 0;
        while(n>0) {
           reversed = (reversed + n%10) * 10;
           n = n/10;
       }
        return reversed/10;
    }
}
