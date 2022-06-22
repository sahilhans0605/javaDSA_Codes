package matrix2DArraysClassEight;
import java.util.Scanner;
public class ExitPointOfAMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] a = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int dir = 0;
        int i = 0;
        int j = 0;
        while (true) {
            dir = (dir + a[i][j]) % 4;
            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }
            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == a.length) {
                i--;
                break;
            } else if (j == a[0].length) {
                j--;
                break;
            }
        }
        System.out.println(i + "\n" + j);
    }
}