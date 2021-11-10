package lesson_one;
/**
 * Given an array of integer, return their sum
 * arr=[2,5,1,9] => sum = 17
 * sum= 0,2,7,8,17 => return 17
 * i =  2,5,1,9
 */
public class SumArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,5,1,9};
        int[] arr2 = new int[]{10,4,3,2};
        int[] arr3 = new int[]{4,2,5,7};
        System.out.println(computeSum(arr1));
        System.out.println(computeSum(arr2));
        System.out.println(computeSum(arr3));

    }
    public static int computeSum(int[] diana){
        int sum = 0;
        for (int i : diana) {
            sum = sum + i;
        }
        return sum;
    }
}
