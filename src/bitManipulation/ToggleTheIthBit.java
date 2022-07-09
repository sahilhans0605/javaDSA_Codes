package bitManipulation;

public class ToggleTheIthBit {
    //    if we xor any number with 1 number toggles
//    if we xor any number with 0 number remains same
    static int toggleTheBit(int n, int i) {
        int mask = 1 << i;
        return n ^ mask;
    }

    public static void main(String[] args) {
        System.out.print(toggleTheBit(5, 1));
        //5---->000101--->after toggling becomes...000111--->=7

    }
}
