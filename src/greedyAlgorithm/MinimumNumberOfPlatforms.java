package greedyAlgorithm;

import java.util.Arrays;

public class MinimumNumberOfPlatforms {
//    Minimum number of platforms= Maximum number of overlaps

    static int findPlatform(int arrival[], int departure[], int n) {

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int i = 0;
        int j = 0;
        int count = 0;
        int max = 0;
        while (i < n) {
            if (arrival[i] <= departure[j]) {//less than equal to
                count++;
                max = Math.max(max, count);
                i++;
            } else {
                count--;
                j++;
            }
        }
        return max;
    }

}
