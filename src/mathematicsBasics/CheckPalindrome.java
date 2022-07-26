package mathematicsBasics;

import java.util.Scanner;
//Time complexity O(logn)... where n being the number of digits
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if (rev == temp) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
