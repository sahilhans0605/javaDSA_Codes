package mathematicsBasics;

import java.util.Scanner;

public class PrintDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while (n > 0) {
            count++;
            n /= 10;
        }
        int p = count - 1;
        int div = (int) Math.pow(10, p);
        while (div > 0) {
            System.out.println(temp / div);
            temp = (int) (temp % div);
            div /= 10;
        }
    }
}
