package permutations;

import java.util.Collections;
import java.util.List;

public class MinMaxSumOfN_1Integers {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        int maxSum = 0;
        int minSum = 0;
        int n = arr.size();

        for (int i=0, j=n-1; i < n-1; i++, j--) {
            //all elements except leftmost will be added
            maxSum += arr.get(j);
            //all elements except rightmost will ve added
            minSum += arr.get(i);
        }
        System.out.println(minSum + " " + maxSum);
    }
}
