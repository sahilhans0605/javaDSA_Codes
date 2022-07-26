//https://youtu.be/wa1aD9Pd3-U
package mathematicsBasics;

import java.util.Scanner;
//Time complexity O(log5n)
public class TrailingZeroesInFactorial {

    public static void main(String[] args) {
//        number of 5's in multiplication
//        10!====>10 ke andar 5 aur 5 2trailing zeroes
//        15!---15,5,10
//        25--->5*5=25...so n/5 is not valid it breaks
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while (n > 0) {
            res += n / 5;
            n /= 5;
        }
        System.out.println(res);
    }
}
