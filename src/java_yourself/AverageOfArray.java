package java_yourself;
/**
 * Scrieti intr-o clasa numita TestBA1 o metoda care primeste ca parametru un sir de int si returneaza media aritmetica
 * a tuturor elementelor din sir. Atentie, elementele din sir sunt intregi, dar rezultatul trebuie sa fie de tip double.
 */
public class AverageOfArray {
    public static void main(String[] args) {
        int[] sir = new int[]{4,2,3};
        System.out.println(avg(sir));

    }

    public static double avg(int[] sir) {
        double sum = 0;
        int count = 0;
        for(int numar : sir){
            sum = sum + numar;
            count++;
        }
        return sum/count;
    }
}
