package lesson_5;
import java.util.*;
//Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
public class SumOfCommonMultiples {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(findSumOfCommonMultiples(n));
        System.out.println(leastCommonMultiple(2,4));
    }

    private static int leastCommonMultiple(int x, int y){
        int commonDivisor = 1;
        for(int i=1; i<=x && i<=y; i++){
            if(x%i == 0 && y%i == 0){
                commonDivisor = i;
            }
        }
        int commonMultiple = (x*y)/commonDivisor;
        return commonMultiple;
    }

    private static int findSumOfCommonMultiples(int n){
        int sum = 0;
        int j = 0;
        while(j<=n){
            if(j%3 == 0 && j%5 == 0){
                sum = sum +j;
            }
            j++;
        }
        return sum;
    }
}
