package lesson_three_for; //Return the list of an array doubles
import java.util.*;
/**
 * result =[],[2],[2,4],[2,4,6],[2,4,6,10]
 * j = 0,1,2,3
 * number = 1,2,3,5
 *
 * resultList = [],[2],[2,4],[2,4,6],[2,4,6,10]
 * number = 1,2,3,5
 */

public class ComputeDoublesInArray {
    public static void main(String[] args) {
        int[] myArr = new int[]{1,2,3,5};
        //System.out.println(returnDoubles(myArr));
        System.out.println(returnListDoubles(myArr));
    }

    private static String returnDoubles(int[] arrGen){
        int[] result = new int[arrGen.length];
        int j=0;
        for (int number : arrGen) {
            result[j] = 2 * number;
            j++;
        }
        return Arrays.toString(result);
    }

    private static List<Integer> returnListDoubles(int[] arrGen){
        List<Integer> resultList = new ArrayList<>();
        for (int number : arrGen) {
            resultList.add(2 * number);
        }
        return resultList;
    }
}
