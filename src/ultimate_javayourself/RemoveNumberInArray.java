package ultimate_javayourself;

import java.util.*;

/**
 * Scrieti intr-o clasa o metoda care primeste un ca parametru un sir de numere arr si
 * un numar intreg pos ce reprezinta o pozitie din sir si returneaza un sir de
 * dimensiune arr.length - 1 rezultat din eliminarea elementului de pe pozitia pos.
 * Daca pozitia este in afara sirului se va returna null
 */
public class RemoveNumberInArray {
    public static void main(String[] args) {
        int[]arr = new int[]{5, 8, 11, 3, 6};
        int[]arr2 = new int[]{1};
        System.out.println(Arrays.toString(removePosition(arr,2)));
    }
    public static int[] removePosition1(int[] arr, int pos) {
        if (pos >= arr.length) {
            return null;
        }
        int[] result = new int[arr.length-1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != pos) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    public static int[] removePosition(int[] arr, int pos) {
        if (pos >= arr.length) {
            return null;
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int element : arr) {
            list.add(element);
        }
        list.remove(list.get(pos));

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
