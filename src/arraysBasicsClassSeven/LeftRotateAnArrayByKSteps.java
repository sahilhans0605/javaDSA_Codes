package arraysBasicsClassSeven;

public class LeftRotateAnArrayByKSteps {
//    Great ******************************************************
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int k = 3;
        int n = arr.length;
        int mod = k % n;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[(i + mod) % n] + " ");
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
