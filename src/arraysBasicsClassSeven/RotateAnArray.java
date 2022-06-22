package arraysBasicsClassSeven;

import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        k = k % n;
        if (k < 0) {
            k = k + n;
        }

//        p1 + p2 // p1 ka reverse + p2 ka reverse fir iss pure ka reverse...ans aagya
//        Implementing this....
//part 1
        int i = 0;
        int j = n - k - 1;
        while (i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        //part 2

        i = n - k;
        j = n - 1;
        while (i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        //part 3

        i = 0;
        j = n - 1;
        while (i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        for (int d = 0; d < n; d++) {
            System.out.print(a[d] + " ");
        }

    }
}
