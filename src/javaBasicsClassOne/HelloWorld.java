package javaBasicsClassOne;
//Package names in java are always in camelCase first word is always small and second small

public class HelloWorld {
    // only one public class exist as of same name
    public static void main(String[] args) {
        System.out.print("Hello World!");
        System.out.println();
        byte age = 34;
//        byte  stores whole number from -128 to 128 only....it is of 1 byte
//        float 6 to 7 decimal digits
//        double 15 decimal digits
        float rating = 3.45f;// we need to put f in java after literal as java understand all as double
        age = (byte) 250;
        char num = 'a';
        int number = 'a';//implicit type casting
        boolean isPassed = true;
//        System.out.println(num);
//        System.out.println(number);
//        System.out.println(age);
//        System.out.println(isPassed);
    }
}
