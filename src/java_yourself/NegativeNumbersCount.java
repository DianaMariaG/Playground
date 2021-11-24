package java_yourself;
/**
 * Scrieti intr-o clasa numita TestBA2 o metoda care primeste ca parametru un sir de numere intregi si returneaza
 * cate numere negative (mai mici decat 0) exista in sir.
 */
public class NegativeNumbersCount {
    public static void main(String[] args) {
        int[] sir = new int[]{-10,3,-6,-44,2,1};
        System.out.println(countNegatives(sir));

    }

    public static int countNegatives(int[] sir) {
        int count = 0;
        for(int numar : sir) {
            if(numar < 0) {
                count++;
            }
        }
        return count;
    }
}
