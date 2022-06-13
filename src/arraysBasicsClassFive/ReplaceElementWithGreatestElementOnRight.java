//O(n^2) approach
package arraysBasicsClassFive;

public class ReplaceElementWithGreatestElementOnRight {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//----------------------------O(N^2)-----------------------------------------------
////        loop1:......label
//        for (int i = 0; i < a.length; i++) {
//            int max = Integer.MIN_VALUE;
//            for (int k = i + 1; k < a.length; k++) {
//                if (a[k] > max) {
//                    max = a[k];
////                    continue loop1;....label (loop ko continue kr skte h)
//                }
//            }
//            if (i == a.length - 1) {
//                a[i] = 0;
//                break;
//            } else {
//                a[i] = max;
//            }
//
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
// ----------------------------O(N)---------------------------Very good way....
        int max = Integer.MIN_VALUE;
        int b[] = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > max) {
//                System.out.println(a[i]);
                max = a[i];
                b[j++] = max;
            } else {
//                System.out.println(a[i]+" else");
                b[j++] = max;
            }
        }
        for (int k = j - 1; k >= 0; k--) {
            System.out.print(b[k] + " ");
        }
    }
}
