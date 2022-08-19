package arraysBasicsClassFive;

import java.util.Scanner;

//    1
//   232
//  34543
// 4567654
//567898765
public class PalindromePattern {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= count; j++) {
                System.out.print(j);
            }

            for (int j = count - 1; j >= i; j--) {
                System.out.print(j);
            }
            count += 2;
            System.out.println();
        }
    }
}
