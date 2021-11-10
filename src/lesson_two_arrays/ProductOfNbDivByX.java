package lesson_two_arrays; // Return the product of numbers divisible by x in an array
/**
 * x = 3
 * prod = 1,3,27 => return 27
 * i = 0,1,2,3,4,5
 * arrGen[i] =   1,2,3,4,5,9
 * arrGen[i]%x = 1,2,0,1,2,0
 */
public class ProductOfNbDivByX {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,9};
        int x = 3;
        System.out.println(prodOfDivNbs(arr, x));
    }

    private static int prodOfDivNbs(int[] arrGen, int x) {
        int prod = 1;
        for(int i = 0; i< arrGen.length; i++){
            if(arrGen[i]% x == 0){
                prod = prod * arrGen[i];
            }
        }
        return prod;
    }
}
