package lesson_three_for;
import java.util.*;
/**
 * introducere number = 4
 * introducere putere = 3
 * rez = 1,4,16,64 => return 64
 * i = 1,2,3
 */
public class RaiseToPower {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int number = console.nextInt();

        System.out.println("Introduceti puterea la care doriti sa ridicati numarul: ");
        int putere = console.nextInt();

        System.out.println(toPower(number, putere));
    }

    private static int toPower(int x, int power) {
        int rez = 1;
        for (int i = 1; i <= power; i++) {
            rez = rez*x;
        }
        return rez;
    }
}
