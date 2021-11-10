package lesson_two_arrays; // Return the position of the maximum in an array
/**
 * posMax = 0
 * max = -infinit, 1
 * i=0
 * arrGen[i] = 1
 */
public class MaximumPositionInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,55,99,25,633,67};
        System.out.println(maximumPosition(arr));
    }

    private static int maximumPosition(int[] arrGen) {
        int posMax = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arrGen.length; i++){
            if (arrGen[i]>max) {
                max = arrGen[i];
                posMax = i+1;
            }
        }
        return posMax;
    }
}
