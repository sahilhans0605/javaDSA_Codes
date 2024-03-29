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
        int totalElements = row * col;
        int countOfElements = 0;
//        ...countofElements... total number of elements ke equal andar hi ho jaayega.....
//        toh count<= nhi krenge...< hi rkhna h
        while (countOfElements<totalElements) {
            for (int i = sc; i <= ec && countOfElements < totalElements; i++) {
                System.out.print(a[sr][i] + " ");
                countOfElements++;
            }
            sr++;

            for (int i = sr; i <= er && countOfElements < totalElements; i++) {
                System.out.print(a[i][ec] + " ");
                countOfElements++;
            }
            ec--;

            for (int i = ec; i >= sc && countOfElements < totalElements; i--) {
                System.out.print(a[er][i] + " ");
                countOfElements++;
            }
            er--;
            for (int i = er; i >= sr && countOfElements < totalElements; i--) {
                System.out.print(a[i][sc] + " ");
                countOfElements++;
            }
            sc++;
        }
    }
}