package lesson_5;
import java.util.*;
// Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct. (use Map)
/**
 * num = 1,2,3
 * map = {}, {1=1},{1=1, 2=1},{1=1, 2=1, 3=1}
 * entry = 1=1, 2=1, 3=1 => return false
 */
public class OneOrMoreOccurencesMap {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(oneOrMoreOccurences(nums));
    }

    private static boolean oneOrMoreOccurences(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                return true;
            }
        }
        return false;
    }
}
