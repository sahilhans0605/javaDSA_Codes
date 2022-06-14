package arraysBasicsClassSeven;

public class SplitArraysInThreeEqualSumSubArrays {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 0, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 3 != 0) {
            System.out.println("Nope");
        }
        sum /= 3;
        int temp = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
            if (temp == sum) {
                count++;
                temp = 0;
            }
        }
        if (count >= 3) {
            System.out.println("Yep");
        } else {
            System.out.println("Nope");
        }
    }
}
