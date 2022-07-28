package recursionClassEight;

public class FibonacciSeriesTillNumberN {
    static void FibonacciSeriesN(int n, int i, int j) {//stack height n-2 from function and
        if (n == 0) {
            return;
        }
        int third = i + j;
        System.out.print(third + " ");
        FibonacciSeriesN(n - 1, j, third);//ek term print krwadi h toh ab n-1 terms bachi h print krwane ko

    }

    public static void main(String[] args) {
        int n = 20;//stack height 1 from main--->Total height = (n-2)+1==n-1
        System.out.print("0" + " " + "1" + " ");
        FibonacciSeriesN(n - 2, 0, 1);//n==2...because first two terms will be printed automatically....by main function
    }
}