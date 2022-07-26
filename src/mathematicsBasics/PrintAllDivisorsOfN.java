package mathematicsBasics;

import java.util.Scanner;

public class PrintAllDivisorsOfN {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i * i <= n; i++) {
//            if (n % i == 0) {
//                System.out.println(i);
//                if (n / i != i) {
//                    System.out.println(n / i);
//                }
//            }
//        }
//        To print them in sorted order
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        for (; i * i <= n; i++) {//root n tk chalao loop
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        i--;
        for (; i >= 1; i--) {
            if (n % i == 0) {
                if (n / i != i) {
                    System.out.println(n / i);
                }
            }
        }
    }
}
