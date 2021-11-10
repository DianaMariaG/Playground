package lesson_one;
/**
 * min = 0,-14 -> return -14
 * x = -2
 * y = -14
 * x<y false
 *
 *  For array of numbers:
 * min = +infinit, -6,-12 -> return -12
 * i = 0,1,2,3,4
 * arr[i] = -6,55,-12,0,6
 */
public class FindMinimum {
    public static void main(String [] args) {

        int x = -2;
        int y = -14;
        System.out.println(findMin(x,y));

        int[] arr1 = new int[]{-6, 55, -12, 0, 6};
        System.out.println(findMin(arr1));
    }

    public static int findMin(int x, int y){
        int min = 0;
        if (x<y) {
            min = x;
        }
        else {
            min = y;
        }
        return min;
    }
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
//            if (arr[i]<min) {
//                min = arr[i];
//            }
            min = findMin(arr[i], min);
        }
        return min;
    }
}
