package recursionClassEight;

import java.util.Scanner;

public class JosephusProblem {
    public static int solution(int n, int k) {
        if (n == 1) {
            return 0;//n==1 one person left so return 0
        }
        return (solution(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(solution(n, k));
    }
}