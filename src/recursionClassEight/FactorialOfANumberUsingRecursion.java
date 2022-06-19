package recursionClassEight;


import java.util.Scanner;

public class FactorialOfANumberUsingRecursion {

    static int FactorialOfANumberUsingRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        return n * FactorialOfANumberUsingRecursion(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int ans = FactorialOfANumberUsingRecursion(n);
        System.out.println(ans);
    }
}