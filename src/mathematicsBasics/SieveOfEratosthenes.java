package mathematicsBasics;

import java.util.Arrays;

//print prime numbers till n(O(n(loglogn))
//Firstly assume all prime...so if 2 is prime...then mark all it's factors as non prime
//then go to 3...3 is prime...mark all multiples of 3 as non prime i.e false
//4 is already non prime
//5 is prime mark all it's factor non prime
//SO MAKE A BOOLEAN ARRAY AND MAKE ALL TRUE(PRIME FIRSTLY)
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 30;
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i/* or--------------- j = i * i  ------------ */; j <= n; j += i) {//j ke multiples mein aage badhna h
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
