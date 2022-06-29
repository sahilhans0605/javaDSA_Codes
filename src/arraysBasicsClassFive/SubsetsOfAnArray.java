package arraysBasicsClassFive;

import java.util.Scanner;

public class SubsetsOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int subsetLength = (int) Math.pow(2, n);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < subsetLength; i++) {//0---2^3---->0-8 waala binary to decimal waale ko
            String set = "";
            int temp = i;
            for (int j = a.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp /= 2;
                if (r == 0) {
                    set = "-\t" + set;//jo element nya aa rha h use aage add kro
                } else {
                    set = a[j] + "\t" + set;
//                    a[j] ki jo string bn gyi h use aage add krdo...That's why a[j]+set and not set +a[j]
                }
            }
            System.out.println(set);
        }
    }
}