package lesson_three_for;
import java.util.*;
// After each even number in an array insert its double and after each odd number insert its triple
/**
 * number =   5,2,8,7
 * number%2 = 1,0,0,1
 * list = [],[5,15],[5,15,2,4],[5,15,2,4,8,16],[5,15,2,4,8,16,7,21]
 */
public class DoublesAndTriples {
    public static void main(String[] args) {
        int[] numbers = new int[]{5,2,8,7};
        System.out.println(insertDoubleAndTriple(numbers));
    }

    private static List<Integer> insertDoubleAndTriple(int[] givenArray){
        List<Integer> result = new LinkedList<>();
        for(int number : givenArray){
            if(number%2 == 0){
                result.addAll(Arrays.asList(number, number*2));
            } else {
                result.addAll(Arrays.asList(number, number*3));
            }
        }
        return result;
    }
}
