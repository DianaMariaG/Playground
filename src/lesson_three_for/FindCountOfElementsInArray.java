package lesson_three_for; //Return the number of elements in an array (without using length)
/**
 * count = 0,1,2,3,4 => return 4
 * i = 0,1,2,3
 */
public class FindCountOfElementsInArray {
    public static void main(String[] args) {
        int[] myArr = new int[]{1,5,8,-4};
        System.out.println(returnElementsCount(myArr));
        System.out.println(return2(myArr));
    }

    private static int returnElementsCount(int[] arrGen){
        int count =0;
        for(int i=0; i<arrGen.length; i++){
            count++;
        }
        return count;
    }
                                                    //SAU
    private static int return2(int[] arrGen){
        return arrGen.length;
    }
}
