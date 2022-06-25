package recursionClassEight;

import java.util.Scanner;

public class JosephusProblem {
    public static int solution(int n, int k) {
        if (n == 1) {
            return 0;//because we automatically assign zero to next number by using formula...means x=0 return krdiya
        }
        int x = solution(n - 1, k);
        int y = (x + k) % n;
        return y;//return our number which we converted in form of x
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(solution(n, k));
    }
}
