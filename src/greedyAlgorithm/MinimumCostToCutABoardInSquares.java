package greedyAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class MinimumCostToCutABoardInSquares {
    public static int minimumCost(int x[], int y[], int m, int n) {
        Arrays.sort(x);
        Arrays.sort(y);
        int i = m - 1;
        int j = n - 1;

        int horizontal = 1;
        int vertical = 1;

        int ans = 0;

        while (i >= 0 && j >= 0) {
            if (x[i] >= y[j]) {
                ans += x[i] * horizontal;//phle bade cuts lga liye taaki baad mein jyaada number of boards pe na lgane pade
                vertical++;
                i--;
            } else {
                ans += y[j] * vertical;
                horizontal++;
                j--;
            }
        }
        while (i >= 0) {
            ans += x[i] * horizontal;
            i--;
        }
        while (j >= 0) {
            ans += y[i] * vertical;
            j--;
        }
        return ans;
    }
}
