package Lesson_four_strings;
// Create a method that returns the number of vowels in a string str
/**
 * count = 0,1,2 => return 2
 * letters = "ana "
 * letter = 'a','n','a',' '
 */
public class CountVowels {
    public static void main(String[] args) {
        String words = "ana ";
        System.out.println(countVowels(words));
    }

    private static int countVowels(String words){
        int count = 0;
        String vowels ="aeiou";
        char[] letters = words.toCharArray();
        for(char letter : letters){
            if(vowels.contains("" + letter)){
                count++;
            }
        }
        return count;
    }
}
