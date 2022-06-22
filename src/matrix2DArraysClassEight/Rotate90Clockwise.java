package matrix2DArraysClassEight;
//
//[1,2,3]
//[4,5,6]
//[7,8,9]
//
//90 degree rotate
//
//[7,4,1]
//[8,5,2]
//[9,6,3]
//Transpose and reverse will do the job of rotating

public class Rotate90Clockwise {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("Before Rotating\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //Swapping/Transposing
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        System.out.print("After Transposing\n");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
//        Reversing all rows
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][a.length - j - 1];
                a[i][a.length - j - 1] = temp;
            }
        }

        System.out.print("After Reversing: \n");
        System.out.print("Rotated Matrix :  \n");


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
}
