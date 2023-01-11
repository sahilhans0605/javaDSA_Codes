package sortingAlgorithm;

//It gives nlogn time complexity rather than n^2
// it is in memory sorting...it does not take extra space
//it's space complexity is O(N) due to recursion stack
//we choose a pivot element and try to put it on it's place
//BEST CASE O(Nlogn)
//Worst case O(N^2)--->When array is sorted
//n elements ke liye fir n-1 ke liye fir n-2 ke liye sum kra toh n(n+1)/2--->n^2
//Learn iterative approach also....
public class QuickSortAlgorithm {

    static int partition(int a[], int l, int h) {
        int i = l;
        int j = h;
        int pivot = a[l];
        while (i < j) {//means array has atleast two elements
            while (i < j && a[i] <= pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, l, j);
        return j;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void quickSort(int a[], int l, int h) {
        if (l < h) {//means array has atleast two elements
            int pivot = partition(a, l, h);//pivot ko uthake uski sahi position pe rkhte h use partitioning logic khte h
//            pivot ko sort krte h is partitioning function se
//            aur vo pivot ki sorted array mein sahi position return krdeta h
            quickSort(a, l, pivot - 1);
            quickSort(a, pivot + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] a = {9, 2, 4, 6, 1, 9};
        quickSort(a, 0, a.length - 1);
        for (int e : a) {
            System.out.println(e + " ");
        }
    }
}