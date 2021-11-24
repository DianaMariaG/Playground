package matrix;

import java.util.Arrays;

/**
 * Primesti 2 matrici cu N linii si M coloane. Returneaza o matrice care reprezinta suma.
 */
public class SumOf2Matrices {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{ {1,2}, {3,4}, {2,8} };
        int[][] matrix2 = new int[][]{ {5,7}, {5,5}, {7,9} };
        System.out.println(Arrays.deepToString(sumOfMatrices(matrix1, matrix2, 4, 2)));

    }

    public static int[][] sumOfMatrices(int[][] matrix1, int[][] matrix2, int N, int M) {
        int[][] result = new int[N][M];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
