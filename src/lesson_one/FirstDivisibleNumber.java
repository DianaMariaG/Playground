package lesson_one;
//Find the first number divisible by x and y, greater or equal than a [a, infinit)
/**
 * a = 20,21,22,23,24,25,26,27,28,29,30 -> return 30
 * a%x = 2,0,1,2,0,1,2,0,1,2,0
 * a%y = 0,1,2,3,4,0,1,2,3,4,0
 */
public class FirstDivisibleNumber {
    public static void main(String[] args){
        int x = 3;
        int y =5;
        int a = 20;
        System.out.println(findFirstDivisor(x,y,a));
    }

    public static int findFirstDivisor(int x, int y, int a) {
        while (a%x != 0 || a%y != 0){
            a++;
        }
        return a;
    }
}
