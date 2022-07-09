package stringAlgorithmsPart1;

public class HowStringsAreCreatedJava {
    public static void main(String[] args) {
//        Values hello and cat will be stored in heap in string pool area
//        ****str1 and str3 variables stored in stack will point to same "Hello"...new "Hello" will not be created
//        But if we want "Hello" to be created again and again we use string creation by using new keyword

        String str1 = "Hello";
        String str3 = "Hello";
        String str2 = new String("Hello");

        System.out.println(str1 == str2);//they are pointing to different hello
        System.out.println(str1 == str3);//they are pointing to same hello

//      BUT IF WE WANT TO CHECK THEIR VALUES ,WE USE .equals();
        System.out.println(str1.equals(str2));

//        Strings are immutable in java*******************means a string once created can't be changed
        String str4 = str1.concat("pqr").replace('H', 'V');//s1 will not be changed at all
        System.out.println(str1);
        System.out.println(str4);
    }
}