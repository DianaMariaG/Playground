package lesson_5;
import java.util.*;
/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one. (use Map)
 * int[] nums = {1,3,4,2,3,2,1}; raspuns: 4
 *
 * num = 1,3,4,4,2,3,1
 * map = {1=1},{1=1, 3=1},{1=1, 3=1, 4=1},{1=1, 3=1, 4=2},{1=1, 2=1, 3=1, 4=2},{1=1, 2=1, 3=2, 4=2},{1=2, 2=1, 3=2, 4=2}
 * key = -1,2 => return 2
 * entry = 1=2, 2=1
 */

public class FindSingleElementMap {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,4,2,3,1};
        System.out.println(findSingleElementInArray(nums));
    }

    private static int findSingleElementInArray(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1); //de cate ori A APARUT in sir + aparitia de acum
            } else {
                map.put(num, 1);
            }
        }
        // pentru fiecare pereche : din setul de toate perechile
        int key = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry);

            if(entry.getValue() == 1){
                key = entry.getKey();
            }
        }
        return key;
    }
}
