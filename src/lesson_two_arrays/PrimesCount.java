package lesson_two_arrays; //Return the count of prime numbers in an array
/**
 * count = 0,1,2,3
 * i = 0,1,2,3,4
 * arrGen[i] = 7,33,14,17,3
 */
public class PrimesCount {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 33, 14, 17,3};
        System.out.println(primesCount(arr));
    }

    private static int primesCount(int[] arrGen) {
        int count = 0;
        for(int i =0; i< arrGen.length; i++) {
            if (checkPrime(arrGen[i])){
                count++;
            }
        }
        return count;
    }

    private static boolean checkPrime(int x){
        int y = 2;
        while(y<=x/2){
            if(x%y == 0){
                return false;
            }
            else {
                y++;
            }
        }
        return true;
    }
}
