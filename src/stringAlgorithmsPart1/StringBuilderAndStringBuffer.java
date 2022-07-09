package stringAlgorithmsPart1;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
//        To make strings mutable...means so as to work on same string not create a new string always
//        String builder::::Not thread safe...allthread works at same time,FASTER
//        String buffer::::Thread safe...Threads work one by one,SLOWER
//        we will use String builder because we are going to work on one thread only
//        Also string is thread safe

        StringBuilder s = new StringBuilder("Hello");
        s.append("Hi");
        s.replace(0, 3, "chintu");//end index not included
        s.reverse();
        System.out.println(s);//this shows String builders are mutable

    }
}
