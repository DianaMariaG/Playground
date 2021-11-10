package lesson_5;
import java.util.*;
// Write a method that returns the average of a list of integers.
/**
 * sum = 0,1,3,6
 * count = 0,1,2,3
 * number = 1,2,3
 * return 6/3 = 2.0
 */
public class ListAverage {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(1,2,3));
        System.out.println(computeAverage(list));
    }

    private static double computeAverage(List<Integer> numbers){
        double sum = 0;
        double count = 0;
        for(int number : numbers){
            sum = sum + number;
            count ++;
        }
        return (sum/count);
    }
}
