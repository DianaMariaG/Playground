package lesson_one;
/**
 * x=32
 * x%2 =0 -> return true for even number, and false for odd number
 * y=31
 * y%2 =1 -> return false for even number, and true for even number
 */
public class EvenNumber {
    public static void main(String [] args){
        int x = 32;
        int y = 31;
        System.out.println(isEven(x));
        System.out.println(isOdd(y));
    }

    public static boolean isEven(int x){
        return (x%2 ==0);
    }

    public static boolean isOdd(int y){
        return (y % 2 != 0);
    }
}

