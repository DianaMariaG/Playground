package lesson_two_arrays; //Return the position of the first number divisible by x in an array
/**
 * x = 4
 * i = 0,1,2 => return 3
 * arrGen[i] =   1,2,8
 * arrGen[i]%x = 1,2,0
 */
public class PositionOfFirstNbDivisibleWithX {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,8,3,7,3,66,23};
        int x = 4;
        System.out.println(positionOfFirst(arr, x));
    }

    private static int positionOfFirst(int[] arrGen, int x){
        for(int i=0; i< arrGen.length; i++){
            if(arrGen[i]%x == 0){
                return i+1;
            }
        }
        return -1;
    }
}
