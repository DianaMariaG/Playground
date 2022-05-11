package lesson_four_strings;
// Check if a given string is a palindrome
/**
 * letters = "abcba"
 * i = 0,1,2
 * letters[i] = 'a','b','c'
 * letters[letters.length-1-i] = 'a','b','c'  => return true
 */
public class PalindromeString {
    public static void main(String[] args) {
        String words = "abcba";
        System.out.println((isPalindrome(words)));
    }

    private static boolean isPalindrome(String words){
        char[] letters = words.toCharArray();
        for(int i = 0; i<=letters.length/2; i++){   //merge si i < letters.length
            if(letters[i] != letters[letters.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
