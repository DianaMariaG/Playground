package lesson_one; //Find smallest common divisor of 2 numbers a and b
/**
 * x = 2,3,4,5 => return 5
 * a%x = 1,0,3,0
 * b%x = 0,2,0,0
 */
public class SmallestDivisor {
    public static void main(String[] args) {
        int a = 15;
        int b =20;
        System.out.println(findSmallestDivisor(a,b));
    }

    public static int findSmallestDivisor(int a, int b) {
        int x = 2;
        while (x<=a){
            if (a%x ==0 && b%x ==0){
                return x;
            }
            else {
                x++;
            }
        }
        return -1;
    }
}
