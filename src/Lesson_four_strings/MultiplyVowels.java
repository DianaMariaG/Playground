package Lesson_four_strings;
// Given a string str and an integer x, multiply each vowel x times
/**
 * result = "","s","saaa","saaar","saaareee"
 * letters = "sare"
 * letter = 's','a','r','e'
 * j = 0,1,2,0,1,2
 */
public class MultiplyVowels {
    public static void main(String[] args) {
        String words = "sare";
        int factor = 3;
        System.out.println(multiplyEachVowel(words, factor));
    }

    private static String multiplyEachVowel(String words, int factor){
        String result = "";
        String vowels = "aeiou";
        char[] letters = words.toCharArray();
        for(char letter : letters){
            if(vowels.contains("" + letter)){
                int j = 0;
                do{
                    result = result + letter;
                    j++;
                } while (j < factor);
            } else {
                result = result + letter;
            }
        }
        return result;
    }
}
