package arraysBasicsClassSix;

public class ElementsInMaximumSumSubarray {
    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int start = 0;
        int end = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            currSum += a[i];
            if (currSum > maxSum) {
                maxSum = currSum;
                end = i;
            }
            if (currSum < 0) {
                currSum = 0;
                start = i + 1;//start ko next element par le gye...kyoki iss element(i) tk sum 0 ho gya h
                end = 0;
            }
        }
//        System.out.println(start + " " + end);

        for (int k = start; k <= end; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
