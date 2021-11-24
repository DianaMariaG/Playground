package matrix;

// Produsul elementelor de pe randurile impare ale matricii

public class OddRowsProduct {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{ {1,2,1}, {1,3,5}, {1,2,3} };
        System.out.println(getOddRowsProduct(matrix));
    }

    public static int getOddRowsProduct(int[][] matrix) {
        int product = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i % 2 == 0) {
                    product = product * matrix[i][j];
                }
            }
        }
        return product;
    }
}
