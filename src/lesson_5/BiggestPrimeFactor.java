package lesson_5;
import java.util.*;
// Write a method that calculates the biggest prime factor of a given number. The prime factors of 455 are 5, 7 and 13.
public class BiggestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
        System.out.println(findBiggestPrimeFactor(10));
    }
    private static int findBiggestPrimeFactor(int number) {
        int max = Integer.MIN_VALUE;
        int j = 2;
            while (j < number) {
                if (isPrime(j)) {
                    if (number % j == 0) {
                        max = j;
                    }
                }
                j++;
            }
        return max;
    }

    public static boolean isPrime(int x){
        int j = 2;
        while(j <= x/2){
            if(x % j == 0){
                return false;
            }
            j++;
        }
        return true;
    }
}
