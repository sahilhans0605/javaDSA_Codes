package mathematicsBasics;

import java.util.Scanner;
// as number of digits in a number is log10n+1.....so time complexity is O(logn)/theta(logn)..loop ran number of diigits time
public class CheckPalindromeNumber {

    public static boolean checkPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (n > 0) {
            int ld = n % 10;
            rev = ld + rev * 10;
            n /= 10;
        }
        if (rev == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPalindrome(n));
    }
}
