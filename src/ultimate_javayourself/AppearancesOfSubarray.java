package ultimate_javayourself;

public class AppearancesOfSubarray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 2, 1, 2, 1, 1, 1};
        int[] b = new int[]{1};
        System.out.println(countAppearances(a,b));
    }

    // a = 1, 1, 2, 1, 2, 1, 1, 1  i=0,
    // b = 1                       j=0
    public static int countAppearances(int[] a, int[] b){
       int count = 0;
       int i = 0;
       int j = 0;
       if (b.length == 1) {
           while (i < a.length) {
               if (a[i] == b[j]){
                   count++;
               }
               i++;
           }
       }
       while (i < a.length && j < b.length) {
           if (j == b.length-1 && a[i] == b[j]) {
               count++;
               j = 0;
           }
           if (a[i] == b[j]) {
               i++;
               j++;
           } else {
               i = i - j + 1; //increment i
               j = 0;
           }
       }
       return count;
    }
}
