package arraysBasicsClassFive;

import java.util.Scanner;

public class NumberStarPattern {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print("*" + " ");
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print("*" + " ");
            }
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
//        for (int j = 5; j >= 1; j--) {
//            System.out.print(j + " ");
//        }
    }
}
