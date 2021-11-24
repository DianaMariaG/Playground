package lesson_one; //Check if a number is prime
/**
 * y =   2,3,4,5,6,7,8
 * x%y = 1,2,3,4,5,6,7 -> return true
 */
public class Prime {
    public static void main(String[] args) {
        int x = 17;
        System.out.println(checkPrime(0));
    }

    public static boolean checkPrime(int x) {
        int y = 2;
        if (x > 1) {
            while (y < x / 2) {
                if (x % y == 0) {
                    return false;
                } else {
                    y++;
                }
            }
        } else {
            return false; //daca x e 1 sau 0, rezultatul trebuie sa fie false
        }
        return true;
    }
}
