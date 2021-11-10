package lesson_three_for; //Return the list of perfect squares in an array
import java.util.Arrays;
/**
 * result =[],[1],[1,0],[1,0,4],[1,0,4,9],[1,0,4,9,0,0,0]
 * j = 0,1,2,3,4
 * number = 1,0,2,4,5,9,22
 */
public class FindPerfectSquaresInArray {
    public static void main(String[] args) {
        int[] myArr = new int[]{1,0,2,4,5,9,22};
        System.out.println(listPerfSqu(myArr));
    }

    private static String listPerfSqu(int[] arrGen){
        int[] result = new int[arrGen.length];
        int j =0;
        for (int number : arrGen) {
            if (isPerfSqu(number)) {
                result[j] = number;
                j++;
            }
        }
        return Arrays.toString(result);
    }

    private static boolean isPerfSqu(int x) {
        int y = 0;
        while (y <= x) {
            if (y*y == x) {
                return true;
            }
            y++;
        }
        return false;
    }
}
