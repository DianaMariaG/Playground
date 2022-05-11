package ultimate_javayourself;
/**
 * Scrieti intr-o clasa o metoda care primeste un ca parametru un sir de numere si
 * returneaza true daca nu exista elemente duplicate in sir si false in caz contrar.
 */
public class UnicElementsInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 98, 3, 4, 6};
        System.out.println(isUnique(arr));
    }
    public static boolean isUnique(int[] arr) {
       for (int i = 0; i <= arr.length-2; i++) {
           for (int j = i+1; j<= arr.length-1; j++) {
               if (arr[i] == arr[j]) {
                   return false;
               }
           }
       }
       return true;
    }
}
