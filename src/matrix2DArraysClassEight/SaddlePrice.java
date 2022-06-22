package matrix2DArraysClassEight;

import java.util.Scanner;

public class SaddlePrice {
    //question jitna easy lg rha tha tha nhi hila daala
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int smallestJInRow = 0;
            for (int j = 0; j < n; j++) {
                if (a[i][j] < smallestJInRow) {
                    smallestJInRow = j;
                }
            }
            boolean flag = true;
            for (int k = 0; k < n; k++) {
                if (a[i][smallestJInRow] < a[k][smallestJInRow]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(a[i][smallestJInRow]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}
