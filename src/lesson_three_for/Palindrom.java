package lesson_three_for;
// Check if an array has a palindrom structure
//palindrom - the elements are the same from start to end and end to start
/**
 * i = 0,1,3
 * numbers[i] = 1,2,3
 * numbers[numbers.length-1] = 1,2,3
 * return true
 */
public class Palindrom {
    public static void main(String[] args) {
        int[] palindrom = new int[]{1,2,3,2,1};
        System.out.println(isPalindrom(palindrom));
    }

    private static boolean isPalindrom(int[] numbers){
        for(int i=0; i<=numbers.length/2; i++){
            if(numbers[i] != numbers[numbers.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
