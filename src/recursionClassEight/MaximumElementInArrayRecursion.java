package recursionClassEight;

import java.util.Scanner;

public class MaximumElementInArrayRecursion {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(a, 0));
        System.out.println(minOfArray(a, 0));
    }

    private static int minOfArray(int[] a, int i) {
        if (i == a.length-1) {
            return a[i];
        }
        return Math.min(a[i], minOfArray(a, i + 1));
    }


    public static int maxOfArray(int[] a, int idx) {
        if (idx == a.length - 1) {
            return a[idx];//jab idx++ krte krte vha pahuchega..tb use vo element return krdo
        }
        return Math.max(a[idx], maxOfArray(a, idx + 1));

    }

}

