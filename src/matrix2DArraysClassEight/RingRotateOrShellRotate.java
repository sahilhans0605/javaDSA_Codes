package matrix2DArraysClassEight;

import java.util.Scanner;

public class RingRotateOrShellRotate {
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
        int s = scanner.nextInt();
        int r = scanner.nextInt();

        printRotatedShell(a, s, r, row, col);
//        Now we need to fill the shell again...same method as we extracted elements...copy paste

    }

    private static void printRotatedShell(int[][] a, int s, int r, int row, int col) {
        int minRow = s - 1;//top left coordinates
        int minCol = s - 1;//top left coordinates
        int maxRow = row - s;//bottom right coordinates
        int maxCol = col - s;//bottom right coordinates
        int arrSize = 2 * (maxRow - minRow) + 2 * (maxCol - minCol);//excluded 4 corners
        int arr[] = new int[arrSize];
        //now we will fill this array from shell
        int index = 0;//**********************************
        for (int i = minRow; i <= maxRow; i++) {
            arr[index] = a[i][minCol];
            index++;
        }

        for (int i = minCol + 1; i <= maxCol; i++) {
            arr[index] = a[maxRow][i];
            index++;

        }

        for (int i = maxRow - 1; i >= minRow; i--) {
            arr[index] = a[i][maxCol];
            index++;

        }

        for (int i = maxCol - 1; i >= minCol + 1; i--) {//minrow-1...because it is already counted initially
            arr[index] = a[minRow][i];
            index++;

        }

        rotate(arr, s, r);
        fillShell(a, s, arr);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillShell(int[][] a, int s, int[] arr) {
        int minRow = s - 1;//top left coordinates
        int minCol = s - 1;//top left coordinates
        int maxRow = a.length - s;//bottom right coordinates
        int maxCol = a[0].length - s;//bottom right coordinates
        //now we will fill this shell from array
        int index = 0;
        for (int i = minRow; i <= maxRow; i++) {
            a[i][minCol] = arr[index];
            index++;
        }

        for (int i = minCol + 1; i <= maxCol; i++) {
            a[maxRow][i] = arr[index];
            index++;

        }

        for (int i = maxRow - 1; i >= minRow; i--) {
            a[i][maxCol] = arr[index];
            index++;

        }

        for (int i = maxCol - 1; i >= minCol + 1; i--) {//minrow-1...because it is already counted initially
            a[minRow][i] = arr[index];
            index++;

        }
        return a;
    }


    private static void rotate(int[] arr, int s, int r) {
        r = r % arr.length;
        if (r < 0) {
            r = r + arr.length;
        }

        //first part...ka reverse

        int l1 = 0;
        int r1 = arr.length - r - 1;
        while (l1 < r1) {
            int swap = arr[l1];
            arr[l1] = arr[r1];
            arr[r1] = swap;
            l1++;
            r1--;
        }

//        Second part ka reverse
        int l2 = arr.length - r;
        int r2 = arr.length - 1;
        while (l2 < r2) {
            int swap = arr[l2];
            arr[l2] = arr[r2];
            arr[r2] = swap;
            l2++;
            r2--;
        }
//        Pure ka reverse ==>rotate
        int l3 = 0;
        int r3 = arr.length - 1;
        while (l3 < r3) {
            int swap = arr[l3];
            arr[l3] = arr[r3];
            arr[r3] = swap;
            l3++;
            r3--;
        }
    }
}
