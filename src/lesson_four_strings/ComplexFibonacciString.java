package lesson_four_strings;
import java.util.*;
/**
 * Generate a string following the fibonacci sequence with first x numbers
 * x = 6
 * 1,1, 2, 3, 5, 8 …
 * “11223335555588888888”
 */
/**
 * result = "","1","11","112","1122","11223","112233","1122333","11223335","112233355","1122333555","11223335555","112233355555"
 * number = 1,1,2,3,5
 * j = 1,1,1,2,1,2,3,1,2,3,4,5
 */
public class ComplexFibonacciString {
    public static void main(String[] args) {
        System.out.println(getFiboString(fibonacciFirstXNumbers(9)));
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

    private static String getFiboString(List<Integer> fiboList){
        String result = "";
        for(int number : fiboList){
            int j = 1;
            do{
                result = result + number;
                j++;
            } while(j<=number);
        }
        return result;
    }
}
