package lesson_three_for;
import java.util.*;
/**
 * Scrieti un program intr-o clasa numita TestTR5 care cere utilizatorului sa introduca o suma in RON si un
 * curs valutar EUR/RON. Apoi va afisa suma in EUR pe care o va primi clientul si eventualul rest in RON.
 * Restul rezulta din faptul ca se considera ca nu se lucreaza cu monede sub 1 EUR iar partea zecimala
 * a sumei convertita in EUR trebuie platita in RON, de asemenea fara subdiviziuni.
 *
 * Exemplu: daca utilizatorul introduce suma in RON: 1000 si cursul valutar: 4.55, ouptut-ul programului ar trebui sa fie:
 *
 * Suma in EUR: 219
 * Suma in RON: 3
 *
 * Deoarece 1000 RON in EUR = 219.78021978 iar partea zecimala (0.78021978) se inmulteste cu cursul (4.55)
 * de unde rezulta 3.54 RON din care pastram doar partea intreaga, deci 3
 */

/**
 * System.out.println("Introduce an amount of money in RON: ");
 * introducere inputInRon = 500
 * System.out.println("Introduce an exchange rate: ");
 * introducere exchangeRate = 4.7
 * sumInEur = 500/4.7 = 106.38
 * wholeEurSum = 106 => afisare
 * restInEur = 106.38 - 106 = 0.38
 * restInRon = 0.38 * 4.7 = 1.786
 * wholeRonRest = 1 => afisare
 */

public class MoneyExchangeWithRest {
    public static void main(String[] args) {
        exchangeWithRest();;

    }
    private static void exchangeWithRest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce an amount of money in RON: ");
        int inputInRon = scanner.nextInt();
        System.out.println("Introduce an exchange rate: ");
        double exchangeRate = scanner.nextDouble();

        double sumInEur = inputInRon /exchangeRate;
        int wholeEurSum = (int)sumInEur;
        double restInEur = sumInEur - wholeEurSum;

        double restInRon = restInEur*exchangeRate;
        int wholeRonRest = (int) restInRon;

        System.out.println("Sum in EUR: " + wholeEurSum);
        System.out.println("Rest in RON: " + wholeRonRest);
    }
}
