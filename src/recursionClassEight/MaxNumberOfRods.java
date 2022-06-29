package recursionClassEight;

public class MaxNumberOfRods {
// tree 3 mein divide ho rha h Time complexity 3^n
    static int maxRods(int N, int a, int b, int c) {
        if (N == 0) {
            return 0;
        }
        if (N < 0) {
            return -1;
        }
        int cutA = maxRods(N - a, a, b, c) + 1;
        int cutB = maxRods(N - b, a, b, c) + 1;
        int cutC = maxRods(N - c, a, b, c) + 1;
//        teeno cut mein se jo max cut mila use result mein daaldiya
        int res = Math.max(cutA, Math.max(cutB, cutC));
        if (res == -1) {
            return -1;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
