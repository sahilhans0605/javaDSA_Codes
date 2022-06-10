package arraysBasicsClassFive;

public class ReplaceElementWithGreatestElementOnRight {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < a.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int k = i + 1; k < a.length; k++) {
                if (a[k] > max) {
                    max = a[k];
                }
            }
            if (i == a.length - 1) {
                a[i] = 0;
                break;
            } else {
                a[i] = max;
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
