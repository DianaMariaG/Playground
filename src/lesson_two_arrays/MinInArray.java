package lesson_two_arrays; //Write a program that finds the min value in an array
/**
 * min = +infinit,-5,-20 => return -20
 * i = 0,1,2,3,4,5
 * arrGen[i] = -5,1,2,3,4,-20
 */
public class MinInArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{-5,1,2,3,4,-20};
        System.out.println(findMin(arr1));
    }

    public static int findMin(int[] arrGen) {
        int min = Integer.MAX_VALUE;
        for (int i =0; i< arrGen.length; i++){
            if(arrGen[i]< min){
                min = arrGen[i];
            }
        }
        return min;
    }
}




