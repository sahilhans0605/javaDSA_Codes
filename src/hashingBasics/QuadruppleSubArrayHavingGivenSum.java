package hashingBasics;

import java.util.HashMap;
import java.util.Map;

public class QuadruppleSubArrayHavingGivenSum {

    static class Pair {
        int i;
        int j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    static void fourSum(int a[], int sum) {
        Map<Integer, Pair> map = new HashMap<>();
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                map.put(a[i] + a[j], new Pair(i, j));
            }
        }
        for (Map.Entry<Integer, Pair> entry : map.entrySet()) {
            int firstSum = entry.getKey();
            Pair firstPair = entry.getValue();
            int secondSum = sum - firstSum;
            if (map.containsKey(secondSum)) {
                Pair secondPair = map.get(secondSum);
                if (firstPair.i != secondPair.i && firstPair.i != secondPair.j
                        && firstPair.j != secondPair.i && firstPair.j != secondPair.j) {
                    System.out.println(firstPair.i + " " + firstPair.j + " " + secondPair.i + " " + secondPair.j);
                }
            } else {
                System.out.println("Not found");
            }

        }
    }


    public static void main(String[] args) {
//        simple approach...we will be making an array b in which we will be putting the sum of each element with another
//        and the array will be of length Nc2...n*(n-1)/2
//        now it has become two sum we can use 2 pointers...and find 2 sum
//        O(n^2)
        int a[] = {1, 2, 1, 0, 1};
        int sum = 5;
        fourSum(a, sum);
    }

}
