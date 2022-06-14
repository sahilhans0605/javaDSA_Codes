package arraysBasicsClassSeven;

public class LeftRotateAnArrayBy1Step {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int a = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = a;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
