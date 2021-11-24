package matrix;

import java.util.Arrays;

/**
 * Primesti ca input o matrice cu numere pozitive si negative. Returneaza matricea inversa.
 *  * 2 -3
 *  * 4  5
 *  * -9 -1
 *  Output
 *  * -2 3
 *  * -4 -5
 *  *  9  1
 */
public class InvertedMatrix {
    public static void main(String[] args) {
        int[][]matrix = new int[][]{ {2,-3}, {4,5}, {-9,-1}};
        System.out.println(Arrays.deepToString(reverseTheMatrix(matrix)));
    }

    public static int[][] reverseTheMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[i][j]*(-1);
            }
        }
        return matrix;
    }
}
