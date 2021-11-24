package matrix;

import java.util.Arrays;

/**
 * 1 2 3 7     0 si 3
 * 5 8 6 3     1 si 2
 * 9 11 5 1    2 si 1
 * 5 9 2 2     3 si 0
 *
 * 1. Suma elementelor de pe randurile pare dintr-o matrice
 * 2. Produsul elementelor de pe randurile impare ale matricii (fac metode cu parametru)
 *
 * 3. Creeaza o matrice de N(nr linii) x M(nr coloane) cu primele N x M elemente din sirul lui Fibonacci (input: N si M, iar output: matricea)
 * N = 2 si M = 3
 * 1 1 2
 * 3 5 8
 *
 * 4. Primesti ca input o matrice cu numere pozitive si negative. Returneaza matricea inversa.
 * 2 -3
 * 4  5
 * -9 -1
 * Output
 * -2 3
 * -4 -5
 *  9  1
 *
 * 5. Primesti 2 matrici cu N linii si M coloane. Returneaza o matrice care reprezinta suma.
 *
 * 6. Inmultirea a 2 matrice.
 *
 */
public class MatrixExamples {
    public static void main(String[] args) {
        int[][] matrix = new int[4][]; //prima [] e pt randuri, a 2-a e pt coloane; pot da lungime doar pt randuri
        int[] row1 = new int[]{1,2,3,7};
        int[] row2 = new int[]{5,8,6,3};
        int[] row3 = new int[]{9,11,5,1};
        int[] row4 = new int[]{5,9,2,2};

        matrix[0] = row1;
        matrix[1] = row2;
        matrix[2] = row3;
        matrix[3] = row4;

        for (int i = 0; i < matrix.length; i++) { //for pentru randuri; returneaza 1,2,3
            for (int j = 0; j < matrix[i].length; j++) { //for pentru coloane; returneaza 1, apoi 2, apoi 3, apoi trece pe randul 2

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int mainSum = 0;
        int minorSum = 0;
        for (int i = 0; i < matrix.length; i++) { //cate randuri sunt
            for (int j = 0; j < matrix[i].length; j++) { //cate coloane sunt
                if (i == j) {
                    mainSum = mainSum + matrix[i][j];
                }
                if (i + j == matrix.length - 1) {
                    minorSum = minorSum + matrix[i][j];
                }
            }
        }
        System.out.println("sum pe diagonala mare: " + mainSum);
        System.out.println("sum pe diagonala mica: " + minorSum);
    }
}
