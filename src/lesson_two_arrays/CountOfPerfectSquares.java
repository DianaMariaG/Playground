package lesson_two_arrays; // Find the count of perfect squares smaller than x (1 <= x <= 100)
/**
 * count = 0,1,2 => return 2
 * y = 0,1,2,3,4,5,6,7,8
 */
public class CountOfPerfectSquares {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(countPS(x));
    }

    private static int countPS(int x) {
        int count = 0;
        int y = 0;
        while (y <= x) {
            if (isPerfectSquare(y)) {
                count++;
            }
            y++;
        }
        return count;
    }

    private static boolean isPerfectSquare(int x) {
        int y = 1;
        while (y <= x) {
            if (y*y == x) {
                return true;
            }
            y++;
        }
        return false;
    }
}
