package lesson_one; //Find the product of odd numbers in interval [a, b]
/**
 * product = 1,1,3,15,105 -> return 105
 * a =   1,2,3,4,5,6,7
 * a%2 = 1,0,1,0,1,0,1
 */
public class ProductOfOddNumbers {
    public static void main(String[] args) {
        int a =1;
        int b = 7;
        System.out.println(productOdd(a,b));
    }

    public static int productOdd(int a, int b) {
        int product = 1;
        while (a<=b){
            if (a%2 != 0){
                product = product * a;
            }
            a++;
        }
        return product;
    }
}
