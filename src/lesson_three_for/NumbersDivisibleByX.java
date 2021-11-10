package lesson_three_for; // Using for, write a method that returns all numbers divisible by x in an array
import java.util.*;
/**
 * x = 2
 * result = [],[2],[2,4],[2,4,0,0,0]
 * j = 0,1,2
 * number =   1,2,3,4,5
 * number%x = 1,0,1,0,1
 */
public class NumbersDivisibleByX {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int x = 2;
        System.out.println(findDivisibleNumbers(arr, x));
    }


    private static String findDivisibleNumbers(int[] arrGen, int x){
        int[] result = new int[arrGen.length];
        int j = 0;
        for (int number : arrGen) {
            if (number % x == 0) {
                result[j] = number;
                j++;
            }
        }
        return Arrays.toString(result);
    }
}
