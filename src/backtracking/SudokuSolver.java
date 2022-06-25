package backtracking;

import java.util.Scanner;

public class SudokuSolver {
    public static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void solveSudoku(int[][] board, int i, int j) {

        if (i == board.length) {
            display(board);
            return;
        }

        int ni = 0;//next i
        int nj = 0;//next j
        if (j == board.length - 1) {
            ni = i + 1;
            nj = 0;
        } else {
            ni = i;
            nj = j + 1;
        }

        if (board[i][j] != 0) {
//            kuch non zero value padi h kuch nhi kr skte next i aur next j pe jao
            solveSudoku(board, ni, nj);
        } else {
            for (int possOption = 1; possOption <= 9; possOption++) {
                if (isSafe(board, i, j, possOption)) {
                    board[i][j] = possOption;
                    solveSudoku(board, ni, nj);
                    board[i][j] = 0;
                }
            }
        }
    }

    private static boolean isSafe(int[][] board, int r, int c, int possOption) {
//        checking in whole row...and in same column
        for (int i = 0; i < board.length; i++) {
            if (board[i][c] == possOption) {
                return false;
            }
        }
//        checking in whole column and same row
        for (int i = 0; i < board.length; i++) {
            if (board[r][i] == possOption) {
                return false;
            }
        }
//       checking in 3X3 matrix
        int subMati = (r / 3) * 3;//top left row corner of that particular submatrix
        int subMatj = (c / 3) * 3;//top left column corner of that particular submatrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[subMati + i][subMatj + j] == possOption) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        solveSudoku(arr, 0, 0);
    }
}