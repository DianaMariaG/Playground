package matrix;

// Suma elementelor de pe randurile pare dintr-o matrice

public class EvenRowsSum {
    public static void main(String[] args) {
        int matrix[][] = new int[][]{{4,6,3},{0,2,1},{6,8,5},{1,1,1}};
        System.out.println(getEvenRowsSum(matrix));
    }

    public static int getEvenRowsSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i % 2 != 0) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }
}
