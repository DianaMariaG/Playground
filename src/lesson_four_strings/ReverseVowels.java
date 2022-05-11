package lesson_four_strings;
// Given a string, return another string that contains only the vowels in reverse order
/**
 * result = "","o","oa"
 * letters = "astro"
 * i = 4,3,2,1,0
 * letters[i] = 'o','a'
 */
public class ReverseVowels {
    public static void main(String[] args) {
        String words = "astro";
        System.out.println(reverseVowels(words));
    }

    private static String reverseVowels(String words){
        String vowels = "aeiou";
        String result = "";
        char[] letters = words.toCharArray();
        for(int i=letters.length-1; i>=0; i--){
            if(vowels.contains("" + letters[i])){
                result = result + letters[i];
            }
        }
        return result;
    }
}
