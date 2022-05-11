package ultimate_javayourself;

import java.util.*;
import java.util.function.Function;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 7, 7, 7};
        //  System.out.println(Arrays.toString(removeDuplicates(arr)));
        System.out.println(Arrays.toString(arr(arr)));
        System.out.println(Arrays.toString(sameArr(arr)));
        System.out.println(Arrays.toString(usingStream(arr)));
        System.out.println(Arrays.toString(usingSet(arr)));
    }

    private static int[] usingSet(int[] arr) {
        Set<Integer> numbers = new TreeSet<>();
        for (int elem : arr) {
            numbers.add(elem);
        }
        return numbers.stream()
                .mapToInt(f->f)
                .toArray();
    }

    private static int[] usingStream(int[] arr) {
        return Arrays.stream(arr)
                .distinct()
                .toArray();
    }

    public static int[] arr(int[] arr) {
        int[] result = new int[arr.length];
        int resultPos = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                result[resultPos++] = arr[i];
            }
        }
        result[resultPos] = arr[arr.length - 1];
        return Arrays.copyOf(result, resultPos + 1);
    }

    public static int[] sameArr(int[] arr) {
       int resultPos = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[resultPos++] = arr[i];
            }
        }
        arr[resultPos] = arr[arr.length - 1];
        return Arrays.copyOf(arr, resultPos + 1);
    }

    public static int[] removeDuplicates1(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int element : arr) {
            set.add(element);
        }
        int[] result = new int[set.size()];
        List<Integer> pleaseHelp = set.stream().toList();
        for (int i = 0; i < pleaseHelp.size(); i++) {
            result[i] = pleaseHelp.get(i);
        }
        return result;
    }

}
