package bitManipulation;

public class FindTheIthBit {
//n(5)--->000000101
//    mask==> 00100...left shifted i times(2 here)
//mask & n->  00100--->ans 1
    static int findIthBit(int n, int i) {
        int mask = 1 << i;
        int result = n & mask;
        if (result == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
//        Firstly we need to make a mask
//    So we make a mask ith bit pe 1 baaki sabpe 0....isko and krdenge original number se

        System.out.print(findIthBit(5, 2));
    }

}
