package mathematicsBasics;

import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        k = k % count;//firstly decrease k and then add count
        if (k < 0) {
            k = k + count;
        }
        System.out.println(k);
//        int div = 1;
//        int mul = 1;
//        for (int i = 1; i <= count; i++) {
//            if (i <= k) {
//                div *= 10;
//            } else {
//                mul *= 10;
//            }
//        }
//        int quot = n / div;
//        int rem = n % div;
//        int rotatedNum = rem * mul + quot;
//        System.out.println(rotatedNum);
    }
}