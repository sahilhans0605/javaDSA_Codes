package sortingAlgorithms2;

//pooch lete h interview mein
//merge sort ki time complexity har case mein nlogn hi aati h array sorted ho tb bhi nlogn hi aati h
//whereas quick sort mein n^2 ho jaati h worst case mein
public class MergeSortAlgorithm {

    public static void main(String[] args) {
        int a[] = {9, 2, 4, 7, 6, 5, 1, 3, 0, 0};
        int l = 0;
        int h = a.length - 1;
        mergeSort(a, l, h);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void mergeSort(int a[], int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(a, l, mid);//this will give us the sorted left part
            mergeSort(a, mid + 1, h);//this will give us the sorted right part
//            Jab hum merge sort lga rhe h toh array break ho ho ke mid se single element mein
//            phuch rha h and fir merge krne ke tym pe sorted array mein merge ho rha h
            merge(a, l, mid, h);
        }
    }

    static void merge(int[] a, int l, int mid, int h) {
        int b[] = new int[a.length];
        int i = l;
        int j = mid + 1;
        int k = l;
        while (i <= mid && j <= h) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
                k++;
            } else {
                b[k] = a[j];
                j++;
                k++;
            }
        }
        if (i > mid) {
            while (j <= h) {
                b[k] = a[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                b[k] = a[i];
                k++;
                i++;
            }
        }

        for (int e = l; e <= h; e++) {
            a[e] = b[e];
        }

    }
}
