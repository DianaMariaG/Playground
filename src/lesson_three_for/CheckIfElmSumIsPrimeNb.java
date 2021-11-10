package lesson_three_for; //Check if the sum of an array elements is a prime number
/**
 * sum = 0,1,3,6,7 => return true
 * j = 1,2,3,1
 */
public class CheckIfElmSumIsPrimeNb {
    public static void main(String[] args) {
        int[] myArr = new int[]{1,2,3,1};
        System.out.println(isPrime(findSum(myArr)));
    }

    private static boolean isPrime(int x){
        int y=2;
        while(y<x/2){
            if(x%y == 0){
                return false;
            }else{
                y++;
            }
        }
        return true;
    }

    private static int findSum(int[] arrGen){
        int sum =0;
        for (int j : arrGen) {
            sum = sum + j;
        }
        return sum;
    }

}
