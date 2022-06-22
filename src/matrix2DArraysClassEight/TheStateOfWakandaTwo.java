package matrix2DArraysClassEight;

import java.util.Scanner;

public class TheStateOfWakandaTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int i = 0;
        int j = 0;

        for (int k = 0; k < n; k++) {
            while (j <= n - 1) {
                System.out.println(a[i][j]);
                i++;
                j++;
            }
            i = 0;
            j = k + 1;

        }
    }
}
