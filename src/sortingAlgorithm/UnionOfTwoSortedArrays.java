package sortingAlgorithm;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        int[] b = {1, 1, 3, 5, 5, 5};

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            while (i < a.length - 1 && a[i] == a[i + 1]) {
                i++;
            }

            while (j < b.length - 1 && b[j] == b[j + 1]) {
                j++;
            }

            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;

            }

        }

        while(i<a.length){
            if(i<a.length-1 && a[i]==a[i+1]){
                i++;
            }else{
                System.out.print(a[i]+" ");
                i++;
            }
        }

        while(j<b.length){
            if(j<b.length-1 && b[j]==b[j+1]){
                j++;
            }else{
                System.out.print(b[j]+" ");
                j++;
            }
        }

    }
}