package bitManipulation;

public class SetBit {
    static void setIthBit(int N, int i) {
        int bitMask = 1 << i;
        int res = (N | bitMask);
        System.out.print(res);
    }

    public static void main(String[] args) {
        int N = 5;
        int i = 2;
        setIthBit(N, i);
    }
}
