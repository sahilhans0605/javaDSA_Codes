package mathematicsBasics;

import java.util.Scanner;

public class DisplayDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int p = 1;
        while (n != 0) {
            p *= 10;
            n /= 10;
        }
        p /= 10;//because ek kam power lenge toh hi break hoga
        while (p != 0) {// yha pe n!=0 isliye nhi kiya because....agar end mein 1234560..dediya toh n=0 phle hi ho jaayega aur last waala 0 print nhi hoga
            System.out.println(m / p);
            m = m % p;
            p /= 10;
        }
    }
}
