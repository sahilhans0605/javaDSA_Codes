package greedyAlgorithm;

public class WineSellingAndBuyingProblem {
    public static void main(String[] args) {
        int b = 0;
        int s = 0;
        int a[] = {5, -4, 1, -3, 1};
        int n = a.length - 1;
        int ans = 0;
        while (b < n && s < n) {
            while (a[b] <= 0) {
                b++;
                if (b == n) {
                    System.out.println(ans);
                    return;
                }
            }
            while (a[s] <= 0) {
                s++;
                if (s == n) {
                    System.out.println(ans);
                    return;
                }
            }

            if (Math.abs(a[b]) > Math.abs(a[s])) {
                ans += Math.abs(b - s) * Math.abs(a[s]);
                a[b] += a[s];
                a[s] = 0;
            } else {
                ans += Math.abs(b - s) * a[b];
                a[s] += a[b];
                a[b] = 0;
            }
        }
        System.out.println(ans);
        return;
    }
}
