package lesson_three_for;
// Return the position of min and max in an array
/**
 * min = +infinit,1,0
 * max = -infinit,1,4,8
 * minPos = 0,1,4
 * maxPos = 0,1,2,3
 * i = 0,1,2,3
 * number[i] = 1,4,8,0
 * list = [4,3]
 */
import java.util.*;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class MinAndMaxPositions {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,4,8,0};
        System.out.println(MinMaxPositions(numbers));
    }

    private static List<Integer> MinMaxPositions(int[] numbers){
        List<Integer> list = new ArrayList<>();
        int min = MAX_VALUE;
        int max = MIN_VALUE;
        int minPos = 0;
        int maxPos = 0;
        for(int i=0; i<numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
                minPos = i+1;
            }
            if(numbers[i] > max){
                max = numbers[i];
                maxPos = i+1;
            }
        }
        list.addAll(Arrays.asList(minPos, maxPos));
        return list;
    }
}
