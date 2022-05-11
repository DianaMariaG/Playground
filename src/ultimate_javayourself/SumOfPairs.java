package ultimate_javayourself;

/**
 * i=0          arr[i]=1
 * j=0,1,2        arr[j]=1,2
 * k=0,1,2,3      arr[k]=2,3
 */
public class SumOfPairs {
    public static void main(String[] args) {
        int[]arr = new int[]{0, 1, 1, 2, 3};
        System.out.println(countSums(arr));
    }
    public static int countSums(int[] arr) {
        int count = 0;
        for (int i = 0; i< arr.length; i++) {
            for (int j = 0; j<arr.length;j++) {
                if (i != j) {
                    for (int k = j+1; k < arr.length; k++) {
                        if (k != i && arr[i] == arr[j] + arr[k]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
