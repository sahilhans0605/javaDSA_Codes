package recursionClassEight;

import java.util.Scanner;

public class AllIndicesOfNumber {

    static int allIndices(int[] a, int[] indexArray, int x, int i, int fsf) {
        if (i == a.length) {
            if(fsf!=0){
                return fsf;
            }else{
                return -1;
            }
        }
        if (a[i] == x) {
            indexArray[fsf++] = i;
            return allIndices(a, indexArray, x, i + 1, fsf);
        } else {
            return allIndices(a, indexArray, x, i + 1, fsf);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int isf = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int indesArray[] = new int[a.length];
        int fsf = 0;
        fsf = allIndices(a, indesArray, x, 0, fsf);
        for (int i = 0; i < fsf; i++) {
            System.out.println(indesArray[i]+" ");
        }
    }
}
