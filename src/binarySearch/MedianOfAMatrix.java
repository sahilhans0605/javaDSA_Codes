package binarySearch;

//https://www.youtube.com/watch?v=79S7C6pvl2E&ab_channel=bhaicodekaro
public class MedianOfAMatrix {

    static int medianOfMatrix(int a[][]) {
        int m = a.length;//row count
        int n = a[0].length;//column count
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            min = Math.min(a[i][0], min);
            max = Math.max(a[i][a[0].length - 1], max);
        }
        int l = min;
        int h = max;
        int ans = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            int count = 0;
            for (int i = 0; i < m; i++) {//har ek row mein elements less than mid count kiye
                count += countNumberOfElementsLessThanMid(a[i], mid);//row pass ki h function mein
            }

            if (count <= (n * m) / 2) {            //n*m/2 is median
                l = mid + 1;
                ans = mid;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }

    private static int countNumberOfElementsLessThanMid(int[] rowArray, int value) {
        int low = 0;
        int high = rowArray.length - 1;
        int len = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (rowArray[mid] < value) {
                len = mid + 1;//mid isliye because rows sorted hai and mid+1 isliye because l=0 se start hua hai
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int m[][] = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        System.out.println(medianOfMatrix(m));
    }
}
