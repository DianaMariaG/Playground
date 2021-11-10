package lesson_three_for;
// Compute the average of even numbers in an array - result type: double
/**
 * sum = 0,2,6,12
 * count = 0,1,2,3
 * number = 2,4,6,1,3
 * number%2 = 0,0,0,1,1
 * return sum/count (12/3 =4)
 */
public class EvenNbAverage {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,4,6,1,3};
        System.out.println(evenNumbersAverage(numbers));
    }

    private static double evenNumbersAverage(int[] numbers){
        int sum = 0;
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum = sum + number;
                count++;
            }
        }
        return sum/count;
    }
}
