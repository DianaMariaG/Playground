package lesson_one; //Find the sum of even numbers in interval [a, b]
/**
 * sum=0,2,6,12,20,30 => return 30
 * a =   1,2,3,4,5,6,7,8,9,10
 * a%2 = 1,0,1,0,1,0,1,0,1,0
 */
public class SumOfEvenNumbers {
    public static void main(String[] args){
        int a = 1;
        int b = 10;
        System.out.println(sumOfEvenNumbers(a,b));
    }

    public static int sumOfEvenNumbers(int a, int b) {
        int sum = 0;
        while (a<=b){
            if (a%2 == 0){
                sum = sum + a;
            }
            a++;
        }
        return sum;
    }
}
