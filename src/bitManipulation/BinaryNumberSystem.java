package bitManipulation;

public class BinaryNumberSystem {
    static public void main(String[] args) {
//        13 is 1101 in binary ...right most bit is LSB and left most is MSB
//        2^0...se multiply krenge jisko bhi
//        Integer 4 bytes...32 bits...0 is LSB and 31 is MSB

//        Subtraction of binary number
//        9+(-3)
//        2`s complement is additive inverse of binary number
//STEPS FOR 2s complement
//                1. Inverse all bits  0010101010(x)----->1101010101
//                2.Add(sum krdo use 1 se) 1------------>1101010110---->so this is -x
        System.out.println(~5);
    }
}
