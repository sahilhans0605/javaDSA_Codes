package bitManipulation;

public class TwoNonRepeatingElementsInAnArray {
    //example : a[]={36,50,24,56,36,24,42,50};
//    So if we do XOR of all of these output will be 42^56
//    also 42^56 == output of xoring array
//    in 42^56 there will be a one, one is surely originated when 1 bit is 0 and another bit is 1
//    and these two bits are surely one in 42 and another in 56
//    so we will separate the numbers with 0 and 1 on that position(right most set bit)

    static void twoNonRepeatingElements(int a[]) {
        int xXORy = 0;
        for (int e : a) {
            xXORy = xXORy ^ e;
        }
        int rightMostSetBitMask = xXORy & -xXORy;
        int zeroBit = 0;
        int oneBit = 0;
        for (int e : a) {
            if ((rightMostSetBitMask & e) == 0) {
                zeroBit ^= e;
            } else {
                oneBit ^= e;
            }
        }

        if (zeroBit < oneBit) {
            System.out.println(zeroBit);
            System.out.println(oneBit);
        } else {
            System.out.println(oneBit);
            System.out.println(zeroBit);
        }

    }

    public static void main(String[] args) {
        int[] a = {36, 50, 24, 56, 36, 24, 42, 50};
        twoNonRepeatingElements(a);

//        System.out.println(5 & -5);
    }
}
