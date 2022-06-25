package backtracking;

import java.util.Scanner;

public class NqueensProblem {

    private static boolean queenIsSafe(int[][] chess, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == 1) {
                return false;
            }
        }
// aage ki trf diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
//piche ki trf diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {

        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }

        for (int col = 0; col < chess.length; col++) {
            if (queenIsSafe(chess, row, col)) {
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);//har ek row mein ek ek queen
                chess[row][col] = 0;//agr return kr gya toh uss place ko 0 krdo because saare combinations print krne h
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chess[][] = new int[n][n];
        printNQueens(chess, "", 0);
    }


}
