package matrix;

import java.util.Arrays;

public class MultiplyMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][] { {1,5}, {2,3}, {1,7} };
        int[][] matrix2 = new int[][] { {1,2,3}, {5,2,8} };
        System.out.println(Arrays.deepToString(multiplyMatrices(matrix1, matrix2)));

    }

    public static int multiplyMatricesCell(int[][] matrix1, int[][] matrix2, int row, int column) {
        int cell = 0;
        for (int i = 0; i < matrix2.length; i++) {
            cell = cell + matrix1[row][i] * matrix2[i][column]; //nr randuri matrix1 = nr coloane matrix2
        }
        return cell;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCell(matrix1, matrix2, row, col);
            }
        }
        return result;
    }
}
