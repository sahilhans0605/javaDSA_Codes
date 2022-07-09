package bitManipulation;

import java.util.Scanner;

//xor both integers and count number of set bits
public class NumberOfBitsToChangeOneNumberToAnother {
    static int numberOfBits(int a, int b) {
        int count = 0;
        int res = a ^ b;
        while (res > 0) {
            res = res & (res - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        System.out.print(numberOfBits(a, b));
    }
}
