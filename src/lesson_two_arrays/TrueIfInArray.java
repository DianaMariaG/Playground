package lesson_two_arrays; //Write a program that returns True if element x is in arr, False otherwise
/**
 * x = -10
 * j = 1,-10 => return true
 */
public class TrueIfInArray {
    public static void main(String[] args) {
        int[] diana = new int[]{1,-10,-5,3,7,20,-7};
        int x = -10;
        System.out.println(checkIfElementInArray(x,diana));
    }

    public static boolean checkIfElementInArray(int x, int[] arrGen) {
        for (int j : arrGen) {
            if (j == x) {
                return true;
            }
        }
        return false;
    }
}




