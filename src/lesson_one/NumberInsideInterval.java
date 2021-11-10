package lesson_one;
// check if a number x is in [a, b] interval
/**
 * x = 0
 * x>=a false
 * x<=b true
 * false && true -> return false
 */
public class NumberInsideInterval {
    public static void main(String [] args){
        int x = 66;
        int a = 0;
        int b = 60;
        System.out.println(isInsideInterval(x,a,b));
    }

    private static boolean isInsideInterval(int x, int a, int b) {
        return (x >= a && x <= b);
    }
}
