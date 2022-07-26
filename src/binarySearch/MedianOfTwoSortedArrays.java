package binarySearch;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int a1[] = {1, 3};
        int a2[] = {2};
        System.out.print(findMedianSortedArray(a1, a2));

    }

    private static double findMedianSortedArray(int[] a1, int[] a2) {
        int n1 = a1.length;
        int n2 = a2.length;
        if (n1 > n2) {
            return findMedianSortedArray(a2, a1);
        }
        int l = 0;
        int r = n1;
        while (l <= r) {
            int m1 = (l + r) / 2;//mid1
            int m2 = (n1 + n2 + 1) / 2 - m1;//m2 is index where second index is gonna break......
//            [0...m1-1]left of a1,[m1...n1-1]right of a1
//            [0...m2-1]left of a2,[m2...n2-1]right of a2

            /*m1==n1 if only one element exists*/
            int min1 = m1 == n1 ? Integer.MAX_VALUE : a1[m1];//1st array ka second part ka min
            int min2 = m2 == n2 ? Integer.MAX_VALUE : a2[m2];//2nd array ka second part ka min
            int max1 = m1 == 0 ? Integer.MAX_VALUE : a1[m1 - 1];//1st array ka first part ka max
            int max2 = m2 == 0 ? Integer.MAX_VALUE : a2[m2 - 1];//2st array ka first part ka max
            if (max1 <= min2 && max2 <= min1) {
                if ((n1 + n2) % 2 == 0) {
                    return ((double) Math.max(max1, max2) + (double) Math.min(min1, min2)) / 2;
                } else {
                    return (double) Math.max(max1, max2);
                }
            } else if (max2 > min1) {
                l = m1 + 1;
            } else {
                r = m1 - 1;
            }
        }
        return 0;//aise hi kuch bhi return krdiya because we believe ki median will always exist
    }
}