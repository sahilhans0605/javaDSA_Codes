package mathematicsBasics;

import java.util.Arrays;
import java.util.Scanner;
//BRUTE FORCE**************O(n*rootn)....refer below for sieve of eratosthenesO(nloglogn)
//
//public class SieveOfEratosthenes {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int low = sc.nextInt();
//        int high = sc.nextInt();
//        for (int i = low; i <= high; i++) {
//
//            int flag = 0;
//            if (i == 0 || i == 1) {// 1 and 0 are non prime numbers
//                flag = 1;
//            }
//            for (int j = 2; j * j <= i; j++) {
//
//                if (i % j == 0) {
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0) {
//                System.out.println(i);
//            }
//        }
//
//    }
//}

//print prime numbers till n(O(n(loglogn))//important
//Firstly assume all prime...so if 2 is prime...then mark all it's factors as non prime
//then go to 3...3 is prime...mark all multiples of 3 as non prime i.e false
//4 is already non prime
//5 is prime mark all it's factor non prime
//SO MAKE A BOOLEAN ARRAY AND MAKE ALL TRUE(PRIME FIRSTLY)

public class SieveOfEratosthenes {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime[] = new boolean[n + 1];//make array of n+1...because 25 ko bhi non prime mark krna padega
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    if (j % i == 0) {
                        isPrime[j] = false;
                    }
                }
            }
        }
        for (int i = 2; i <= n; i++) {//because we have considered length of isPrime array as n+1...so as to include n
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}