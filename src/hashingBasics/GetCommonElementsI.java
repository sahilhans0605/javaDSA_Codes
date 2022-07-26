package hashingBasics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GetCommonElementsI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            s1.add(a1[i]);
        }

        for (int i = 0; i < n2; i++) {
            s2.add(a2[i]);
        }

        for (int e : s2) {
            if (s1.contains(e)) {
                System.out.println(e);
                s1.remove(e);
            }
        }
    }
}
