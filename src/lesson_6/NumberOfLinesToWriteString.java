package lesson_6;

import java.util.Arrays;
import java.util.*;
import java.util.Map;

/**
 * You are given a string s of lowercase English letters and an array widths denoting how many pixels wide
 * each lowercase English letter is. Specifically, widths[0] is the width of 'a', widths[1] is the width of 'b', and so on.
 *
 * You are trying to write s across several lines, where each line is no longer than 100 pixels. Starting at the beginning of s,
 * write as many letters on the first line such that the total width does not exceed 100 pixels. Then, from where you stopped in s,
 * continue writing as many letters as you can on the second line. Continue this process until you have written all of s.
 *
 * Return an array result of length 2 where:
 * result[0] is the total number of lines.
 * result[1] is the width of the last line in pixels.
 */
public class NumberOfLinesToWriteString {
    public static void main(String[] args) {
        int[] widths = new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};

        String words3 = "bbbcccdddaaa";
        System.out.println(Arrays.toString(pixelsWidth(widths, words3)));

    }

    private static int[] pixelsWidth(int[] widths, String s) {
        Map<Character, Integer> map = new HashMap<>();
        //char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        char letter = 'a'; //97
        for(int i = 0; i < widths.length; i++) {
            map.put(letter, widths[i]);
            letter++;
        }
        int sum = 0;
        int lines = 1; //fiind reuzultat final, se initializeaza inainte de for
        // sum = 92,102,10
        // map.get(character) = 10
        // lines = 0,1
        for(char character : s.toCharArray()) {
            sum = sum + map.get(character);
            if (sum > 100) {
                lines++;
                sum = map.get(character);
            }
        }
        System.out.println(sum);

        int[] result = new int[2];
        result[0] = lines;
        result[1] = sum; //ultima suma
        return result;
    }
}

