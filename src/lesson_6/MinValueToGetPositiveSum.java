package lesson_6;
import java.util.*;
/**
 * Given an array of integers nums, you start with an initial positive value startValue.
 * In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
 * Return the minimum positive value of startValue such that the step by step sum is never less than 1.
 */
public class MinValueToGetPositiveSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,-2};
        System.out.println(findMinStartValue(nums));
    }

    private static int findMinStartValue(int[] nums){
        int startValue = 1; //pornim de la cea mai mica valoare posibila
        while(true){ //bucla se ruleaza pana returnez ceva
            int total = startValue; //pt ca am nevoie de startValue si la return, nu o pot modifica de tot
            boolean isValid = true;
            for (int num : nums){
                total += num;
                if(total < 1){
                    isValid = false;
                    break; //break iese din ultimul loop, care e for
                }
            }
            if(isValid){
                return startValue;
            } else {
                startValue++;
            }
        }
    }
}
