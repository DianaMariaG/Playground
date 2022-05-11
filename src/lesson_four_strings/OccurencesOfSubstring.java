package lesson_four_strings;
//Check the number of occurrences of a string s1 in another string s2

/**
 * words = "ncabcouabcpmabchgab"
 * count = 0,1
 * i = 0,1,2,3,4
 * j = 0,0,0,1,2,0,0
 * phrase.charAt(i+j) = n,c,a,b,c,b,c
 * dependent.charAt(j) = a,a,a,b,c,a
 * checkSubstring = F,F,T,T,T,F
 */
public class OccurencesOfSubstring {
    public static void main(String[] args) {
        String words = "ncabcouabcpmabchgab";
        String dependent = "abc";
        System.out.println(countSubstringOccurences(words, dependent));

    }
    private static int countSubstringOccurences(String phrase, String dependent){
        int count = 0;
        boolean checkSubstring = false;
        for(int i = 0; i<phrase.length()-dependent.length(); i++){
            for(int j = 0; j<dependent.length(); j++){
                if(phrase.charAt(i+j) != dependent.charAt(j)) { //daca caracterul cu indicele (i+j)
                    checkSubstring = false;
                    break; //nu mai executa nimic din al 2-lea for (25-32)
                } else {
                    checkSubstring = true;
                }
            }
            if (checkSubstring){
                count++;
            }
        }
        return count;
    }
}
