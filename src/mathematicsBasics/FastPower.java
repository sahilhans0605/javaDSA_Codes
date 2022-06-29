package mathematicsBasics;

import java.util.Scanner;

public class FastPower {
    static int fastPower(int a, int b) {
        if (b == 0) {
            return 1;//a^0==1;
        }
        if (b % 2 == 0) {
            return fastPower(a, b / 2) * fastPower(a, b / 2);
        } else {
            return fastPower(a, b / 2) * fastPower(a, b / 2) * a;
        }
    }

    public static void main(String[] args) {

//        a^b/2*a^b/2..............recursion waala
//        b,b/2,b/2square,b/2cube...b/2powerk=1
//        n/2^k=1
//            O(log2n)...where n being b...log2b
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(fastPower(a, b));
    }
}
