package lesson_two_arrays; // Check if a number x is a perfect square (1 <= x <= 100)
/**
 * y =   1,2
 * x/y = 4,2 => return 2
 */
public class CheckPerfectSquare {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(isPerfectSquare(x));
    }

    private static boolean isPerfectSquare(int x) {
        int y = 1;
        while(y<= x/2){
            if (x/y == y){
                return true;
            }
            y++;
        }
        return false;
    }
}
