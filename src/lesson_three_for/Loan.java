package lesson_three_for;
import java.util.Scanner;
/**
 * System.out.println("Introduce the amount of the loan: ");
 * introducere loanAmount = 1000
 * i = 0,1,2
 * loanAmount = 900,810,729
 */
public class Loan {
    public static void main(String[] args) {
        System.out.println(calcul());
    }

    private static int calcul(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the amount of the loan: ");
        int loanAmount = scanner.nextInt();
        int[] months = new int[]{1, 2, 3};

        for(int i=0; i<months.length; i++) {
            loanAmount = (loanAmount - (loanAmount * 10) / 100);
        }
        return loanAmount;
    }
}

