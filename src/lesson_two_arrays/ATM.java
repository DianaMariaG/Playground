package lesson_two_arrays;
import java.util.Scanner; //ATM Application
// userPIN = 1997, wantedMoney = 500
/**
 * System.out.println("Please introduce your PIN:");
 * introducere userPIN = 1997
 * userPIN = staticPIN => System.out.println("Your PIN is correct!")
 * System.out.println("Please type the wanted amount of money");
 * introducere wantedMoney = 500
 * wantedMoney <= availableMoney
 * remainingMoney = availableMoney - wantedMoney
 * System.out.println("You can withdraw the money! ");
 * System.out.println("The remaining amount of money is: 99500  RON");
 */
public class ATM{
    public static void main(String[] args){
        final int STATIC_PIN = 1997;
        final int AVAILABLE_MONEY = 100000;
        if (checkPIN(STATIC_PIN)){
            checkFunds(AVAILABLE_MONEY);
        }
    }

    private static boolean checkPIN(int staticPIN){
        System.out.println("Please introduce your PIN:");

        Scanner console = new Scanner(System.in);
        int userPIN = console.nextInt();

        if(userPIN == staticPIN){
            System.out.println("Your PIN is correct!");
            return true;
        }
        else{
            System.out.println("Your PIN is incorrect!");
            return false;
        }

    }

    private static void checkFunds(int availableMoney){

        System.out.println("Please type the wanted amount of money");

        Scanner console = new Scanner(System.in);
        int wantedMoney = console.nextInt();

        if(wantedMoney <= availableMoney){
            int remainingMoney = availableMoney - wantedMoney;
            withdrawFunds(remainingMoney);
        }
        else{
            insufficientFunds(availableMoney);
        }
    }

    private static void withdrawFunds(int remainingMoney){
        System.out.println("You can withdraw the money! ");
        System.out.println("The remaining amount of money is: " + remainingMoney+ " RON");
    }

    private static void insufficientFunds(int availableMoney){
        System.out.println("You have insufficient funds! ");
        System.out.println("You can withdraw only: " + availableMoney + " RON");

    }
}








