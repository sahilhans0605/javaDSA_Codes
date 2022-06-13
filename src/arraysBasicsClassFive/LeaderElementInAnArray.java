//the elements which do not have any larger elements on their right side
package arraysBasicsClassFive;

public class LeaderElementInAnArray {
    public static void main(String[] args) {
        int a[] = {2, 7, 6, 1, 4, 3, 8};
//        Now O(N^2)approach is that we will make 2 for loops and iterate on single element(i) each time
//        O(N) approach::::::::::::::------********
//        In this approach we will start traversing in array from backwards.....and point it
//        and check if it is greater than max we will mark that element as not leader...else we will store it in an array
        int max = Integer.MIN_VALUE;
        int b[] = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
                b[j++] = a[i];
            } else {
                continue;
            }
        }
//        k=j-1 as j was increased once after exiting the loop
        for (int k = j - 1; k >= 0; k--) {
            System.out.print(b[k] + " ");
        }
    }
}