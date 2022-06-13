package arraysBasicsClassFive;

public class MaximumSumSubarrayKadanes {
    public static void main(String[] args) {
//        kuch ni h kadanes mein...
//        kadanes maximum sum bta deta h...elements add krta h agr sum negative ho jaata h ya km hota h ..toh uss element ko hta dete h
//        alternative of kadanes is we can do it in O(N^2)
//        but from kadane's lets do it in O(N)/Theta(N)
        int a[] = {-6, -7, -4, -2, -1, -5, -4};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            currSum += a[i];
//            Not else if...kadanes ko change mt kr
            if (currSum > maxSum) {//agr array mein sirf -1 hua toh maximum sum -1 hi hoga..
                // vrna 0 ho jaata agr next statement ko upar rkhte toh
                maxSum = currSum;
            }
            if (currSum <= 0) {
                currSum = 0;

            }
        }
        System.out.println(maxSum);
    }
}
