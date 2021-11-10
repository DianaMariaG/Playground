package lesson_one;
/**
 * max = 0,33 -> return 33
 * x=33
 * y=3
 * x>y true
 */
public class FindMaximum {
    public static void main(String [] args){
        int x = 33;
        int y = 4;
        System.out.println(findMax(x,y));
    }

    public static int findMax(int x, int y) {
        return (Math.max(x,y));
//        int max = 0;
//        if (x>y) {
//            max = x;
//        }
//            else {
//                max = y;
//            }
//        return max;
    }
}
