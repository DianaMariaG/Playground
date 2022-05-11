package lesson_four_strings;
// Return the number of characters in a string (2 methods)
/**
 * count = 0,1,2,3,4,5,6 => return 6
 * letters = "12clar"
 * letter = '1','2','c','l','a','r'
 */
public class NumberOfCharacters {
    public static void main(String[] args) {
        String words = "12clar";
        System.out.println(findStringLength(words));
        System.out.println(findCharsCount(words));
    }

    private static int findStringLength(String elements){
        return elements.length();
    }

    private static int findCharsCount(String elements){
        int count=0;
        char[] letters = elements.toCharArray();
        for(char letter : letters){
            count++;
        }
        return count;
    }
}
