package hashingBasics;

import java.util.HashSet;

public class PairWithGivenSumInAnUnsortedArray {

    static class Pair {
        int a;
        int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    static Pair pairWithGivenSum(int a[], int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int e : a) {
            if (set.contains(sum - e)) {
                return new Pair(e, sum - e);
            } else {
                set.add(e);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 1, 3, 2};
        int sum = 8;
        Pair pair = pairWithGivenSum(a, sum);
        if (pair != null) {
            System.out.print(pair.a + " " + pair.b);// but if we want to return the pair,we can make a new class and return it's pair
        }else{
            System.out.println("pair does not exist");
        }
    }
}
