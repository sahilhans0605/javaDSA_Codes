package matrix2DArraysClassEight;

import java.util.Scanner;

public class TheStateOfWakanda1ORWaveTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int a[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int sc = 0;
        int sr = 0;
        int ec = col - 1;
        int er = row - 1;
        while (sc < ec) {
            for (int i = sr; i <= er; i++) {
                System.out.println(a[i][sc]);
            }
            sc++;
            for (int i = er; i >= sr; i--) {
                System.out.println(a[i][sc]);
            }
            sc++;

        }

    }
}
