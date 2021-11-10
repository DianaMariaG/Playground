package lesson_one;
// Find the count of negative numbers in interval [a, b]
/**
 * count = 0,1,2,3,4,5 -> return 5
 * a = -5,-4,-3,-2,-1,0,1,2,3,4
 */
public class NegativeNbsCountInInterval {
    public static void main(String[] args){
        int a = -5;
        int b = 4;
        System.out.println(NegNbCount(a,b));
    }

    public static int NegNbCount(int a, int b) {
        int count = 0;
        while (a<=b){
            if (a<0){
                count++;
            }
            a++;
        }
        return count;
    }
}
