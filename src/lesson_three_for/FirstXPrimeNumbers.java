package lesson_three_for;
// Generate an array with the first x prime numbers
/**
 * primeList = [],[2],[2,3],[2,3,5],[2,3,5,7],[2,3,5,7,11]
 * x = 5
 * q = 1,2,3,4,5
 * number = 2,3,4,5,6,7,8,9,10,11
 */
import java.util.*;

public class FirstXPrimeNumbers {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(firstPrimeNumbers(x));
    }

    private static boolean isPrime(int nr){
        int j = 2;
        while(j<nr){
            if(nr%j == 0){
                return false;
            }
            j++;
        }
        return true;
    }

    private static List<Integer> firstPrimeNumbers(int x){
        List<Integer> primeList = new LinkedList<>();
        int q = 1;
        int number = 2;
        while(q<=x){
            if(isPrime(number)){
                primeList.add(number);
                q++;
            }
            number++;
        }
        return primeList;
    }
}
