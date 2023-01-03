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
//        String str4 = str1.concat("pqr").replace('H', 'V');//s1 will not be changed at all
//        String str5 = str1.concat("sahil").replace('H', 'V');
//        System.out.println(str1);
//        System.out.println(str4);
//        System.out.println(str5);
//        System.out.println(str1);
//        String name = "TonyStark";
//
//        System.out.println(name.substring(0, 4));
//        String str = "123";
//        int number = Integer.parseInt(str);
//        System.out.println(number);
//        int number1 = 123;
//        String str6 = Integer.toString(number1);
//        System.out.println(str6.length());
//
//
        if(new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
//Difference.................
        if (new String("Tony").equals(new String("Tony"))) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

    }
}