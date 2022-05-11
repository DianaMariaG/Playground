package java_yourself;
import java.util.*;
public class NthSmallestNumber {
    public static void main(String[] args) {
        int[] sir = new int[]{3,6,2,9};
        System.out.println(nthSmallest(sir, 2));
    }

    public static int nthSmallest(int[] sir, int n) {
        Arrays.sort(sir);
        if (n <= sir.length) {
            return sir[n - 1];
        } else {
            return -1;
        }
    }
}
