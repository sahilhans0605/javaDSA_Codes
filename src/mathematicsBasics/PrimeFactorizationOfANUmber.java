package mathematicsBasics;
import java.util.Scanner;
public class PrimeFactorizationOfANUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 2;
        while (n > 1) {
            if (n % c == 0) {
                System.out.print(c + " ");
                n /= c;
            } else
                c++;
        }
    }
}