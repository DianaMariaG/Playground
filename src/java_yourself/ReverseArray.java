package java_yourself;
import java.util.Arrays;

/**
 * Scrieti intr-o clasa numita TestBA8 o metoda care primeste ca parametru un sir de numere si returneaza sirul respectiv inversat.
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[]sir = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(sir)));
    }

    public static int[] reverse(int[] sir) {
        int[] result = new int[sir.length];
        int j = 0;
        for(int i = sir.length-1; i >= 0; i--) {
           result[j] = sir[i];
           j++;
        }
        return result;
    }

}
