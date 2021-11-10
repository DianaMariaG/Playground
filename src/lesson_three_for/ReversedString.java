package lesson_three_for;
import java.util.*;
/**
 * Write a program to take a string as input and output its reverse.
 * The given code takes a string as input and converts it into a char array, which contains letters of the string as its elements.
 *
 * System.out.println("Type a phrase from the console: ");
 * introducere text "Azi e luni"
 * letters = "Azi"
 * result = "","i","iz","izA"
 * i = 'i','z','A'
 */


public class ReversedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a phrase from the console: ");
        String text = scanner.nextLine();
        System.out.println(reversedString(text));
    }

    private static String reversedString(String phrase) {
        char[] letters = phrase.toCharArray();
        String result = "";
        for (int i = letters.length - 1; i >= 0; i--) {
            result = result + letters[i];
        }
        return result;
    }
}

