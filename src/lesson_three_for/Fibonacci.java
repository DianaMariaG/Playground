package lesson_three_for;
import java.util.*;
// Return a list containing the first x elements of fibonacci sequence; x >=2; the first 2 elements of the list will be [1, 1]
/**
 * x = 10
 * j = 2,3,4,5,6,7,8,9
 * fiboList = [1,1],[1,1,2],[1,1,2,3],[1,1,2,3,5],[1,1,2,3,5,8],[1,1,2,3,5,8,13],[1,1,2,3,5,8,13,21],[1,1,2,3,5,8,13,21,34],[1,1,2,3,5,8,13,21,34,55]
 */
public class Fibonacci {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(firstXFibonacciNumbers(x));
    }

    private static List<Integer> firstXFibonacciNumbers(int x){
        List<Integer> fiboList = new LinkedList<>(); //LinkedList pastreaza ordinea elementelor din lista
        int j = 2;
        fiboList.addAll(Arrays.asList(1,1));
        while (j<x){
            fiboList.add(fiboList.get(j-1) + fiboList.get(j-2));
            j++;
        }
        return fiboList;
    }
}
