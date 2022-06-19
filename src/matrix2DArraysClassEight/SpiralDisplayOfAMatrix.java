package matrix2DArraysClassEight;

import java.util.Scanner;

public class SpiralDisplayOfAMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 3;
        int col = 5;
        int[][] a = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int sr = 0;
        int er = row - 1;
        int sc = 0;
        int ec = col - 1;

        while (sr <= er && sc <= ec) {
            for (int i = sc; i <= ec; i++) {
                System.out.print(a[sr][i] + " ");
            }
            sr++;

            for (int i = sr; i <= er; i++) {
                System.out.print(a[i][ec] + " ");
            }
            ec--;

            if(sr<er){
                for (int i = ec; i >= sc; i--) {
                    System.out.print(a[er][i] + " ");
                }
                er--;
            }
            if(sc<ec){
                for (int i = er; i >= sr; i--) {
                    System.out.print(a[i][sc] + " ");
                }
                sc++;
            }
        }
    }
}