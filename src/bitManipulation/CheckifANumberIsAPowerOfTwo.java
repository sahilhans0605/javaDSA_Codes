package bitManipulation;

public class CheckifANumberIsAPowerOfTwo {
    static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;//so if n is 16...means n-1 will be (15)(01111)&(10000)(16)=0
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
    }
}