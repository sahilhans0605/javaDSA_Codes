package binarySearch;

public class FindSquareRootofAnInteger {
    public static void main(String[] args) {
        int n = 44;
        System.out.println(sqrt(n));
    }

    private static int sqrt(int n) {
        int ans = 1;
        int l = 1;
        int r = n;
//        l!=0 because 0 kisi ka hota hi nhi
        while (l <= r) {
            int mid = (l + r) / 2;
            int sq = mid * mid;
            if (sq == n) {
                return mid;
            } else if (sq > n) {
                r = mid - 1;
            } else {
                ans = mid;
                l = mid + 1;
            }
        }
        return ans;
    }
}
