package recursionClassEight;

public class ReverseAnArrayUsingRecursion {

    static void reverseArray(int a[], int start, int end) {
        if (start >= end) {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i] + " ");
            }
            return;
        }
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;

        reverseArray(a, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        reverseArray(a, 0, a.length - 1);
    }
}
