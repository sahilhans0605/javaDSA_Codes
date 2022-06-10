package arraysBasicsClassFive;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int flag = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Array is unsorted");
        } else {
            System.out.println("Array is sorted");
        }
    }
}
