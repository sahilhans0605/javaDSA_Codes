package javaBasicsClassOne;

public class Operators {
    public static void main(String[] args) {
        int a = 34;
        int b = 12;

//        arithmetic + , - , * , / , %
//        assignment = , += , -= (b=b+a,b=b-a,b=b*a,b=b/a)
//        relational > , < , >= , <= , == ,!=
//        unary a++ , a-- , ++a , --a
//        bitwise a = a>>b(Right shift)......divide by 2^b
//        a=a<<b (Left shift).....multiply by 2^b
        boolean c = a > b;
        c = a == b;
        System.out.println(c);
        System.out.println(a / b);
    }
}
