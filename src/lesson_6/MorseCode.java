package lesson_6;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.
 *
 * For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...".
 * We will call such a concatenation the transformation of a word.
 * Return the number of different transformations among all words we have.
 */
public class MorseCode {
    public static void main(String[] args) {
        String[] words = new String[]{"gin", "gig"};
        System.out.println(uniqueMorseRepresentations(words));

    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseAlphabet = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> seen = new HashSet<>();
        for(String word : words){
            StringBuilder code = new StringBuilder(); //1.modifica String-ul intern, fara a crea un nou Obiect; 2.pt concatenare String-uri
            for(char c : word.toCharArray()){
                code.append(morseAlphabet[c - 'a']); //fiecare caracter din cuvant se schimba cu litera morse
            }
            seen.add(code.toString());
        }
        return seen.size();
    }
}

