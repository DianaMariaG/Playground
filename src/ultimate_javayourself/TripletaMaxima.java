package ultimate_javayourself;
/**
 * Scrieti intr-o clasa o metoda care primeste un ca parametru un sir de numere si gaseste
 * tripleta de numere consecutive din acest sir a caror suma este maxima si o returneaza.
 * Daca sirul contine mai putin de 4 numere metoda returneaza suma lor.
 */
public class TripletaMaxima {
    public static void main(String[] args) {
        int[]arr = new int[]{3,8,5,9};
        System.out.println(getMaxTriple(arr));
    }

    public static int getMaxTriple (int[] arr) {
        int max = Integer.MIN_VALUE;
        if (arr.length <=3) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++){
                sum = sum + arr[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        for (int i = 0; i <= arr.length-3; i++) {
            int j = i+1;
            int q = i+2;
            int sum = arr[i] + arr[j] + arr[q];
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
