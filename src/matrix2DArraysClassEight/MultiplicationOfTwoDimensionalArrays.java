package matrix2DArraysClassEight;

import java.util.Scanner;

public class MultiplicationOfTwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows for first array: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of cols for first array: ");
        int cols = sc.nextInt();
        System.out.print("Enter number of rows for second array: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of cols for second array: ");
        int cols2 = sc.nextInt();
        int[][] first = new int[rows][cols];
        int[][] second = new int[rows2][cols2];
        int[][] finalMatrix = new int[10][10];
        if (cols != rows2) {
            System.out.print("\nThese two arrays can't be multiplied as number of columns of first array are not equal to number of rows of second array\n");
            return;
        } else {
            System.out.print("Enter Elements for first 2D array : ");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    first[i][j] = sc.nextInt();
                }
            }
            System.out.print("Enter Elements for second 2D array : ");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    second[i][j] = sc.nextInt();
                }
            }


            for (int i = 0; i < rows; i++) {//p q r s se p,s ka matrix bnta h toh p,s bahr waale loops..
//                ab multiply krna h toh cols1 aur rows2 same hote h inka hi matrix bnega..
                for (int j = 0; j < cols2; j++) {
                    finalMatrix[i][j] = 0;
                    for (int k = 0; k < cols; k++) {
                        finalMatrix[i][j] = finalMatrix[i][j] + first[i][k] * second[k][j];
                    }
                }
            }

            System.out.println("\nMultiplication of first and second matrix Entered is: \n");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.print(finalMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
