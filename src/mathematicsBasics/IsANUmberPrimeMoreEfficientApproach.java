package mathematicsBasics;

import java.util.Scanner;

//the time complexity of this approach seems to be root n but it is three times faster than root n
public class IsANUmberPrimeMoreEfficientApproach {
    static boolean isPrimeMoreEfficient(int n) {
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) {

            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(isPrimeMoreEfficient(n));
    }
}
