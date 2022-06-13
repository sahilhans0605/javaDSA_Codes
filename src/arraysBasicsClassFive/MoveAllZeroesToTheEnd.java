package arraysBasicsClassFive;

public class MoveAllZeroesToTheEnd {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int arr1[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr1[j++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[i];
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr1[k] + " ");
        }
    }
}
