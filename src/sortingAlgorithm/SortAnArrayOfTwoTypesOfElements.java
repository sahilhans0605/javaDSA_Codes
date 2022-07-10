package sortingAlgorithm;

public class SortAnArrayOfTwoTypesOfElements {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1};
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            if (arr[low] == 1) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
            } else {
                low++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
