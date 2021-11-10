package lesson_three_for;
// Compute the sum of a number digits
/**
 * x = 1234,123,12,1
 * sum = 0,4,7,9,10 => return 10
 * x%10 = 4,3,2,1
 */
public class SumOfDigits {
    public static void main(String[] args) {
        int x = 1234;
        System.out.println(computeDigitsSum(x));
    }

    private static int computeDigitsSum(int x){
        int sum = 0;
        while(x>0){
            sum = sum + x%10;
            x = x/10;
        }
        return sum;
    }
}
