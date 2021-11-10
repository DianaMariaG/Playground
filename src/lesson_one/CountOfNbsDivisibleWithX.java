package lesson_one;
// Find the count of the numbers divisible with x in [a, b]. Assume x, a, b > 0
/**
 * x = 5;
 * count = 0,1,2,3 -> return 3
 * a =   2,3,4,5,6,7,8,9,10,11,12,13,14,15
 * a%x = 2,3,4,0,1,2,3,4,0, 1, 2, 3, 4, 0
 */
public class CountOfNbsDivisibleWithX {
    public static void main(String[] args){
        int number = 5;
        int start = 2;
        int end = 15;
        System.out.println(countOfNbsDivisibleWithX(number, start, end));
    }

    public static int countOfNbsDivisibleWithX(int x, int a, int b) {
        int count =0;
        while(a<= b){
            if(a%x == 0){
                count ++;
            }
            a++;
        }
        return count;
    }
}
