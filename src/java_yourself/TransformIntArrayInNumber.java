package java_yourself;
import java.util.*;
/**
 * Scrieti intr-o clasa o metoda care primeste ca parametru un sir de cifre intre 0 si 9 si returneaza numarul format din ele.
 * Daca sirul e gol metoda va returna -1. Daca sirul are vreun element care nu apartine intervalului 0..9 metoda va returna -2.
 */
public class TransformIntArrayInNumber {
    public static void main(String[] args) {
        int[] sir = new int[]{0,0,1,2,0,0};
        System.out.println(arrayToNumber2(sir));
        System.out.println(arrayToNumber(sir));
    }

    public static int arrayToNumber2(int[] sir) {
        String number = "";
        for (int element : sir) {
            if (element >= 0 && element <= 9) {
                number = number + element;
            } else {
                return -2;
            }
        }
        if(sir.length > 0) {
            return Integer.parseInt(number);
        } else {
            return -1;
        }
    }
    public static int arrayToNumber(int[] sir) {
        int number = 0;
        for (int element : sir) {
            if (element >= 0 && element <= 9) {
                number = number + element;
                number = number * 10;
            } else {
                return -2;
            }
        }
        if(sir.length > 0) {
            return number/10;
        } else {
            return -1;
        }
    }
}
