package Lesson_four_strings;
import java.util.*;
// Given a string str, 2 chars c1 and c2 and an integer x - insert after each c1 of str the char c2 for x times
/**
 * result = "","c","chzzz","chzzzi","chzzzihzzz","chzzzihzzzl","chzzzihzzzli","chzzzihzzzlim","chzzzihzzzlimb","chzzzihzzzlimba","chzzzihzzzlimbar"
 * letters = "chihlimbar"
 * letter = 'c','h','i','h','l','i','m','b','a','r'
 * j = 1,2,3,1,2,3
 */
public class InsertCharXTimes {
    public static void main(String[] args) {
        String words = "chihlimbar";
        char c1 = 'h';
        char c2 = 'z';
        int factor = 3;
        System.out.println(insertChar(words, c1, c2, factor));
    }

    private static String insertChar(String words, char c1, char c2, int factor){
        String result = "";
        char[] letters = words.toCharArray();
        for (char letter : letters){
            if(letter == c1){
                result = result + c1;
                int j = 1;
                do{
                    result = result + c2;
                    j++;
                } while (j <= factor);
            } else {
                result = result + letter;
            }
        }
        return result;
    }
}
