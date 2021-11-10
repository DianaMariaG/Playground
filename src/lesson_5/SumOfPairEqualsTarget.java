package lesson_5;
import java.util.*;
/**
 * Write a method that checks if there is at least one pair of numbers whose sum equals target. (use Map)
 * Exemple: arr=[1, 3, 4,2,7] and target=11 result is true because the pair (4,7) sums to 11.
 * i=0,1,2
 * numbers[i] = 1,3,4
 * j=1,2,3,4, 1,2,3,4, 1,2,3,4
 * numbers[j]= 3,4,2,7, 3,4,2,7, 3,4,2,7
 * sum = 4,5,3,8, 6,7,5,10, 7,8,6,11
 *
 *
 */
public class SumOfPairEqualsTarget {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,3,4,2,7};
        //System.out.println(pairEqualTarget(numbers, 11));
        //System.out.println(pairEqualTargetSet(numbers, 11));
        System.out.println(pairEqualTargetMap(numbers, 11));
    }

    private static boolean pairEqualTarget(int[] numbers, int target){
        for(int i =0; i<numbers.length; i++){
            for(int j=1; j<numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    /** {1,3,4,2,7} target = 11
     * i = 0
     * numbers[i] = 1
     * set = [1]
     * secondElement = 1
     */
    private static boolean pairEqualTargetSet(int[] numbers, int target){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            int secondElement = target - numbers[i];
            if(set.contains(secondElement)){
                return true;
            }
            set.add(numbers[i]);

        }
        return false;
    }

    private static boolean pairEqualTargetMap(int[] numbers, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            int secondElement = target - numbers[i];
            if(map.containsKey(secondElement)){
                return true;
            }
            map.put(numbers[i], 1); //nu conteaza ce e a 2-a valoare aici, trb doar sa existe in map
            System.out.println(map);
        }
        return false;
    }
}
