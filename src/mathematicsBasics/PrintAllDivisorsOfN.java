package mathematicsBasics;

public class PrintAllDivisorsOfN {
    public static void main(String[] args) {
        int n = 25;
        //FOR 25 5 WILL BE PRINTED TWICE SO WE APPLY CONDITION N/I==I...THEN DON'T PRINT
//        for (int i = 1; i * i <= n; i++) {
//            if (n % i == 0) {
//                System.out.println(i);
//                if (n / i != i) {
//                    System.out.println(n / i);
//                }
//            }
//        }

//        But they were not sorted...to print them in sorted order...we use this technique
        int i = 1;
        for (; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0) {
                if (n / i != i)
                    System.out.println(n / i);
            }
        }
    }
}
