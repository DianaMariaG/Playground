package lesson_5;
import java.util.*;
// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2^x.
/**
 * rez = 2,4,8,16 => return true
 * i = 0,1,2
 */
public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOf2(16));
    }

    private static boolean isPowerOf2(int n){
        int rez =2;
        for(int i=0; i < n/2; i++){
           rez = rez*2;
           if(n == rez){
               return true;
           }
        }
        return false;
    }
}
