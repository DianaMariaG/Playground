package lesson_5;
import java.util.*;
//Write a method that returns the sum of all EVEN Fibonacci numbers. Consider all Fibonacci numbers that are less than or equal to n.
/**
 * x = 6
 * sum = 0,2,10 => return 10
 * number =   1,1,2,3,5,8
 * number%2 = 1,1,0,1,1,0
 */
public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(computeEvenFiboNumbers(fibonacciFirstXNumbers(6)));

    }
    private static int computeEvenFiboNumbers(List<Integer> fiboList){
        int sum = 0;
        for (int number : fiboList){
            if(number%2 == 0){
                sum = sum + number;
            }
        }
        return sum;
    }

    private static List<Integer> fibonacciFirstXNumbers(int x){
        List<Integer> fiboList = new LinkedList<>();
        fiboList.add(1);
        fiboList.add(1);
        int i = 2;
        while(i<x){
            fiboList.add(fiboList.get(i-1) + fiboList.get(i-2));
            i++;
        }
        return fiboList;
    }
}
