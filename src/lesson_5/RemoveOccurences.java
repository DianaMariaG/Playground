package lesson_5;
import java.util.*;
// Given an integer array nums and an integer val, remove all occurrences of val in nums
/**
 * list = [], [1,2,3,4], [1,2,4]
 * val = 3
 * remove 3
 */
public class RemoveOccurences {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1,2,3,4};
        Integer val = 3;
        System.out.println(removeOccurences(nums, val));
    }

    private static List<Integer> removeOccurences(Integer[] nums, Integer val) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(nums));
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            int x = (Integer)itr.next();
            if(x == val) {
                itr.remove();
            }
        }
        return list;
    }
}
