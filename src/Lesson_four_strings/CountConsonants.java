package Lesson_four_strings;
// Return the number of consonant from a given string - do not declare all the consonants - the string has vowels, consonant and digits
/**
 * count = 0,1,2 => return 2
 * characters = "12 cdae"
 * character = '1','2',' ','c','d','a','e'
 */
public class CountConsonants {
    public static void main(String[] args){
        String elements = "12 cdae";
        System.out.println(computeConsonants(elements));
    }

    private static int computeConsonants(String elements){
        int count =0;
        String others = "aeiou123456789 ";
        char[] characters = elements.toCharArray();
        for(char character : characters){
            if(!others.contains("" + character)){
                count++;
            }
        }
        return count;
    }
}
