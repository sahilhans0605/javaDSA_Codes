package bitManipulation;

public class UnsetTheIthBit {
    //    unset the ith bit means set ith bit to 0
    static int unsetTheIthBit(int n, int i) {
        int mask = 1 << i;
        mask = (~mask);//bss mask mein uss position pe 1 laake negate krdiya
        return n & mask;
    }

    public static void main(String[] args) {
        System.out.println(unsetTheIthBit(7, 2));
    }
}