package matrix;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Creeaza o matrice de N(nr linii) x M(nr coloane) cu primele N x M elemente din sirul lui Fibonacci (input: N si M, iar output: matricea)
 *  * N = 2 si M = 3
 *  * 1 1 2
 *  * 3 5 8
 */
public class FiboMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getFiboMatrix(3,2)));
    }

    public static int[][] getFiboMatrix(int N, int M) {
        List <Integer> fiboList = new LinkedList<>();
        fiboList = firstXFibonacciNumbers(N*M);
        int q = 0;
        int[][]matrix = new int[N][M];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = fiboList.get(q);
                q++;
            }
        }
        return matrix;
    }

    public static List<Integer> firstXFibonacciNumbers(int x) {
        List<Integer> fiboList = new LinkedList<>(); //LinkedList pastreaza ordinea elementelor din lista
        int j = 2;
        fiboList.addAll(Arrays.asList(1, 1));
        while (j < x) {
            fiboList.add(fiboList.get(j - 1) + fiboList.get(j - 2));
            j++;
        }
        return fiboList;
    }
}
