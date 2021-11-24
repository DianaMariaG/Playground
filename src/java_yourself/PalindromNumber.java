package java_yourself;

/**
 * Scrieti intr-o clasa o metoda care primeste ca parametru un numar pozitiv intreg n si returneaza true daca
 * numarul respectiv este palindrom si false in caz contrar. Un numar este palindrom daca citit de la dreapta la
 * stanga este egal cu el insusi (Ex: 121, 959, 22322, 11, ...)
 */
public class PalindromNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1213));

    }
    public static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
