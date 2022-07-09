package bitManipulation;

public class BitwiseOperators {
    static public void main(String[] args) {
//        &,|,^,<<,>>--->works on 2 numbers
//        ~ nor works on one number
//        a b a|b a&b a^b
//        ~a

//        if MSB is 1 then negative number else +ve number
//        5>>1===5/2^1
//        5<<1===5*2^1
        int a=5;
        System.out.println(~a);
    }
}