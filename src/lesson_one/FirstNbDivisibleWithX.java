package lesson_one;
// Find first number divisible with x in [a, b] or return -1 if none exists. Assume x, a, b > 0
/**
 * a =   2,3,4,5 -> return 5
 * a%x = 2,3,4,0
 */
public class FirstNbDivisibleWithX {
    public static void main(String[] args){
        int a = 2;
        int b = 13;
        int x = 5;
        System.out.println(firstDivisibleNb(x,a,b));
    }

    public static int firstDivisibleNb(int x, int a, int b) {
        while (a<=b){
            if (a%x ==0){
                return a;
            }
            else{
                a++;
            }
        }
        return -1;
    }
}
