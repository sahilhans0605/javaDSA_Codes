package javaCollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimeFromArrayList {

    static void removePrimes(ArrayList<Integer> al) {
//        Catch...the catch in question is that when we will remove the element...the index will be moved forward and some elements will be left....so as to avoid this we will start loop from backside
        for (int i = al.size() - 1; i >= 0; i--) {
            if (isPrime(al.get(i))) {
                al.remove(i);
            }
        }
    }

    private static boolean isPrime(Integer integer) {
        for (int i = 2; i * i <= integer; i++) {
            if (integer % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        removePrimes(al);
        System.out.println(al);
    }
}
