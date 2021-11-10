package lesson_two_arrays; // Return the sum of odd numbers in an array
/**
 * sum = 0,1,6,13 => return 13
 * i = 0,1,2,3,4
 * arrGen[i] =   1,5,7,14,22
 * arrGen[i]%2 = 1,1,1, 0, 0
 */
public class SumOfOddNumbers {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,7,14,22};
        System.out.println(sumOfOdds(arr));
    }

    private static int sumOfOdds(int[] arrGen) {
        int sum =0;
        for(int i = 0; i< arrGen.length; i++){
            if(arrGen[i]%2 != 0){
                sum = sum + arrGen[i];
            }
        }
        return sum;
    }
}
