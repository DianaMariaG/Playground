/*Scrieti un program intr-o clasa numita TestTR4 care cere utilizatorului sa introduca o suma in EUR si un curs valutar EUR/RON
si afiseaza echivalentul in RON al sumei respective conform cursului specificat.
Exemplu: daca utilizatorul introduce suma in EUR: 101 si cursul valutar: 4.55, ouptut-ul programului ar trebui sa fie:
Suma in RON: 459.55
 */
/**
 * introducere EUR = 33
 * introducere curs = 5.2
 * afisare 171.6
 */
package lesson_three_for;

import java.util.Scanner;
public class ExchangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the amount of EUR: ");
        double EUR = scanner.nextDouble();
        System.out.println("Introduce the exchange rate: ");
        double curs = scanner.nextDouble();

        System.out.println(EUR*curs);
    }
}
