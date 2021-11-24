package lesson_6;
import java.util.*;
/**
 * i = 0,1,2,3,4
 * j = 1,2,3,4,5,2,3,4,5,3,4,5,4,5,5
 * nums[i] = 1,-6,-20,4,1,-6,4,3,1,9,4,3,9,4
 * nums[j] = 4,-6,1,9,3,-20,-6,1,4,9,3,-6,1,9,3,4,1,3,4,9,3,4,4,9
 * nums[] = [-6,4,1,9,3,-20],[-20,4,1,9,3,-6],[-20,1,4,9,3,-6],[-20,-6,4,9,3,1],[-20,-6,3,9,4,1],[-20,-6,1,9,4,3],
 * [-20,-6,1,4,9,3],[-20,-6,1,3,9,4],[-20,-6,1,3,4,9]
 */

public class Sorting {
    public static void main(String[] args) {
        int[] nums = new int[]{1,4,-6,9,3,-20};
        //System.out.println(Arrays.toString(sortNumbers(nums)));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

    }
    private static int[] sortNumbers(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){ //compar doar ceea ce e dupa i
               if(nums[i] > nums[j]){ //pt ordine descrecatoare, compar folosind <
                   int aux = nums[i];
                   nums[i] = nums[j];
                   nums[j] = aux;
               }
            }
        }
        return nums;
    }
}
