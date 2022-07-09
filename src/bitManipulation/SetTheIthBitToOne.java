package bitManipulation;

public class SetTheIthBitToOne {

    static int setIthBitToOne(int n, int i) {
        int mask = 1 << i;
        return (n | mask);

    }

    static public void main(String[] args) {
        System.out.println(setIthBitToOne(16, 2));
    }
}
