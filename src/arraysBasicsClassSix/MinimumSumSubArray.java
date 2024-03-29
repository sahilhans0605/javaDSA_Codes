package arraysBasicsClassSix;

public class MinimumSumSubArray {
    public static void main(String[] args) {
        int a[] = {3, 1, 2, 4};
        int currSum = 0;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {

            currSum += a[i];

            if (minSum > currSum) {
                minSum = currSum;
            }

            if (currSum > 0) {
                currSum = 0;
            }

        }
        System.out.print(minSum);
    }
}
