package lesson_one;
// Find the biggest number divisible by x and not divisible by y in interval (a, b)
// a,b > 0
//[1, 10]
//x = 3
//y = 2
/**
 * max = 1,3,9 -> return 9
 * a =   1,2,3,4,5,6,7,8,9,10
 * a%x = 1,2,0,1,2,0,1,2,0,1
 * a%y = 1,0,1,0,1,0,1,0,1,0
 */
public class BiggestNbDivisible {
    public static void main(String[] args){
        int x = 3;
        int y = 2;
        int a = 1;
        int b = 10;
        System.out.println(biggestDivisor(x,y,a,b));
    }

    public static int biggestDivisor(int x, int y, int a, int b) {
        int max = 0;
        while (a<=b){
            if (a%x ==0 && a%y != 0){
                max = a;
            }
            a++;
        }
        return max;
    }
}
