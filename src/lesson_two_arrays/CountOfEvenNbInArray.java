package lesson_two_arrays; // Return the count of even numbers in an array
/**
 * count = 0,1,2,3 => return 3
 * i = 0,1,2,3,4,5
 * arr[i]%2 =1,0,1,0,1,0
 */
public class CountOfEvenNbInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(countEvenNumbers(arr));
    }

    private static int countEvenNumbers(int[] arr) {
        int count = 0;
        for(int i =0; i< arr.length; i++){
            if(arr[i]%2 == 0){
                count++;
            }
        }
        return count;
    }
}
