package lesson_three_for; //Write a method that checks if a number is unique in an array
/**
 * x = 15
 * count = 0,1,2 => return false
 * j = 15,20,13,15
 */
public class UniqueNrInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{15,20,13,15};
        int x = 15;
        System.out.println(isUnique(arr, x));
    }

    private static boolean isUnique(int[] arrGen, int x){
        int count = 0;
        for (int j : arrGen) {
            if (j == x) {
                count++;
            }
        }
        return (count == 1);
    }
}
