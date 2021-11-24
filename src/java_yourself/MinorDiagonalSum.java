package java_yourself;
/**
 * Scrieti o metoda care primeste ca parametru o matrice patratica si returneaza suma elementelor de pe diagonala secundara
 */
public class MinorDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{ {6,3,9}, {4,-8,2}, {4,7,1} };
        System.out.println(getSecondaryDiagonalSum(matrix));
    }
    public static int getSecondaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i + j == matrix[i].length - 1) {  //poate fi matrix.length sau matrix[i].length
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }
}
