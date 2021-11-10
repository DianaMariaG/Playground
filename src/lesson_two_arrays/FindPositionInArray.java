package lesson_two_arrays; //Return position of element x in arr; if appear multiple times, return last position; otherwise return -1
/**
 * x = -10
 * lastPos = -1,4 => return 4
 * i = 0,1,3
 * arrGen[i] = 5,9,-10
 */
public class FindPositionInArray {
    public static void main(String[] args) {
        int x = -10;
        int[] diana = new int[]{5,9,-10,11,55,24,153,5,-10};
        System.out.println(findPosition(x, diana));
    }

    public static int findPosition(int x, int[] arrGen) {
        int lastPos =-1;
        for (int i =0; i<arrGen.length; i++){
            if(arrGen[i]==x){
                lastPos = i+1;
            }
        }
        return lastPos;
    }
}
