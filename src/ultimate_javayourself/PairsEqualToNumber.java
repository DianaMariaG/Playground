package ultimate_javayourself;
//Scrieti intr-o clasa numita TestEA9 o metoda care primeste ca parametri
 //un sir de numere intregi unice si un numar n si returneaza cate perechi
 //de cate doua numere din sir au suma egala cu n.
public class PairsEqualToNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 7};
        int n = 10;
        System.out.println(countPairs(arr, n));
    }

    public static int countPairs(int[] arr, int n) {
        int count = 0;
            for (int i = 0; i <= arr.length-2; i++) {
                for (int j = i+1; j <= arr.length-1; j++) {
                    if (arr[i] + (arr[j]) == n) {
                        count++;
                    }
                }
            }
        return count;
    }
}

