package recursionClassEight;

//Recursion makes a 'stack'--->hence space complexity is O(N)
public class SumOfNNaturalNumbersUsingRecursion {
    static int sumNTo1(int N) {
        if (N == 0) {
            return 0;
        }
        return sumNTo1(N - 1) + N;//5+sum(5-1)--5+10
//        4+sum(4-1)4+6
//        3+sum(3-1)3+3
//        2+sum(1)2+1
//        1+sum(0)--->1+0

    }

    static void sum1toN(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sum1toN(i + 1, n, sum);
        System.out.println("Hi! "+i);
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = sumNTo1(n);
        sum1toN(1, n, 0);
//        System.out.println(ans);
    }


}
