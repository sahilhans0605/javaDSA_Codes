package mathematicsBasics;

import java.util.Scanner;

public class PrintAllPrimesTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for (int i = low; i <= high; i++) {

            int flag = 0;
            if (i == 0 || i == 1) {// 1 and 0 are non prime numbers
                flag = 1;
            }
            for (int j = 2; j * j <= i; j++) {

                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);
            }
        }
    }
}
