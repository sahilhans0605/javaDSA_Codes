package recursionClassEight;

public class SumOfSquaresOfNNaturalNumbersUsingRecursion {
    static int sumOfSquares(int n) {
        if (n == 0) {
            return 0;
        }
        return n*n + sumOfSquares(n - 1);
    }

    public static void main(String[] args) {
        int ans = sumOfSquares(5);
        System.out.println(ans);
    }
}
