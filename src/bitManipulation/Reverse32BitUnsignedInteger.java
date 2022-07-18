package bitManipulation;

public class Reverse32BitUnsignedInteger {

    static int reverseUnsigned(int n) {
        int ans = 0;
        for (int i = 1; i < 32; i++) {
            if (isSetBit(i, n)) {
                ans = ans | (1 << 32 - i);
            }
        }
        return ans;
    }

    private static boolean isSetBit(int i, int n) {
        int mask = 1 << i - 1;
        if ((mask & n) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int n = 54;
        int ans = reverseUnsigned(n);
        System.out.println(ans);
    }
}