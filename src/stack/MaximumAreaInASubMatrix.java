package stack;
//O(n*n)
import static stack.FindMaximumAreaInAHistogram.maximumAreaHistogramStack;

public class MaximumAreaInASubMatrix {

    static int maximumAreaSubMatrix(int a[][]) {
        int currRow[] = new int[a[0].length];
        int maxAns = maximumAreaHistogramStack(currRow);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 1) {
                    currRow[j]++;//incrementing column
                } else {
                    currRow[j] = 0;
                }
            }
            int currAns = maximumAreaHistogramStack(currRow);
            maxAns = Math.max(currAns, maxAns);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 1, 0, 1},
                {1, 1, 0, 1},
                {0, 0, 1, 1},
                {1, 1, 0, 0}};
        System.out.println(maximumAreaSubMatrix(a));
    }
}
