package arraysBasicsClassFive;

public class LongestLengthOfConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1};
        int currSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (arr[i] == 0 || i == arr.length - 1) { // i = arr.length-1***
                if (currSum > maxSum) {
                    maxSum = currSum;
                    currSum = 0;//***
                } else {
                    currSum = 0;
                }
            }

        }
        System.out.println(maxSum);
    }
}
