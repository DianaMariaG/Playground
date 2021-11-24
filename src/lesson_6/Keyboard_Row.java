package lesson_6;
import java.util.*;
/**
 * Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard
 * Input: words = ["Hello","Alaska","Dad","Peace"]
 * Output: ["Alaska","Dad"]
 */
public class Keyboard_Row {
    public static void main(String[] args) {
        String[] words = {"lkjj"};
        //System.out.println(wordsMadeOfSingleRowLetters(words));
        System.out.println(Arrays.toString(wordsMadeOfSingleRowLetters(words)));
    }

    private static String[] wordsMadeOfSingleRowLetters(String[] words) {
       List<String> list = new ArrayList<>();
        for(String word : words){
            if(first(word) || second(word) || third(word)){
                list.add(word);
            }
        }

        String[] result = (list.toArray(new String[list.size()]));
        return result;
    }



    private static boolean first(String word) {
        String result = "";
        String firstLine = "qwertyuiopQWERTYUIOP";

        for (char letter : word.toCharArray()) {
            if (!firstLine.contains("" +letter)) {
                return false;
            }
        }
        return true;
    }


    private static boolean second(String word) {
        String result = "";
        String secondLine = "asdfghjklASDFGHJKL";

        for (char letter : word.toCharArray()) {
            if (!secondLine.contains("" +letter)) {
                return false;
            }
        }
        return true;
    }

    private static boolean third(String word) {
        String result = "";
        String thirdLine = "zxcvbnmZXCVBNM";

        for (char letter : word.toCharArray()) {
            if (!thirdLine.contains("" +letter)) {
                return false;
            }
        }
        return true;
    }
}