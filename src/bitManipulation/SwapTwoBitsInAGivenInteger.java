package bitManipulation;

public class SwapTwoBitsInAGivenInteger {

    static int swapTwoBits(int n, int i, int j) {
        int ith = (n >> i) & 1;
        int jth = (n >> j) & 1;
        if (ith == jth) return n;
        int mask = (1 << i) | (1 << j);//uss position pe 0 aagya na...toh agr 0 hoga
        return n ^ mask;//toggle with xoring by 1
    }

    public static void main(String[] args) {
//        Let's suppose i and j be two positions...so to find ith and jth bit we
//        right shift n by i and n by j and do their(&) by 1...separately
//        we get ith and jth bit..
//        after this we xor ith and jth bit...if xor is 0 means bits are same else
    }
}
