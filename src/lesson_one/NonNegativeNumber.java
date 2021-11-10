package lesson_one;
/**
 * x = 0 return true
 * y = -5 return false
 */
public class NonNegativeNumber {
    public static void main(String [] args){
        int x = 0;
        int y = -5;
        System.out.println(isNotNegative(x));
        System.out.println(isNotNegative2(y));
    }

    private static boolean isNotNegative(int x) {
        return (x >= 0);
    }

    private static boolean isNotNegative2(int y) {
        return (!(y < 0));
    }
}

