package bitManipulation;

//Time complexity O(logn)
//Number of digits in a decimal number is log10n+1...example log10 100--->2+1==3;...10 base because decimal numbers
//for binary number base is 2 number of digits is log2N+1...
//example if number is 16 log 2 16----4+1--->5
public class CountNumberOfSetBits {
    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    static int countSetBitsOptimised(int n) {
        int count = 0;
        while (n > 0) {
            n = (n & n - 1);//n-1 se ek ek bit 0 hoti jaayegi
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(50));
        System.out.println(countSetBitsOptimised(50));
    }
}